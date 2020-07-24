package helpers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BMS_Utilities {

	static Properties list = new Properties();
	private static Logger log=LogManager.getLogger(BMS_Utilities.class.getName());
	
	public static int generateRandomInt(){
	    Random random = new Random();
	    return random.nextInt(10000);
	}
	
	public static String orderNumberfromExcel(String TestCaseName)
	{
		String TestDataExcelPath= System.getProperty("user.dir")+"//TestData//TestData.xlsx";
		String orderNumber=null;
		try {
			dataDrivenFromExcel ExcelObj = new dataDrivenFromExcel(TestDataExcelPath);
			orderNumber = ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "OrderNumber");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return orderNumber;
		
	}
	public static ArrayList<HashMap<String, Object>> OrderDataExpected (String TestCaseName, String PDD) throws Exception
	
	{
		String TestDataExcelPath= System.getProperty("user.dir")+"//TestData//TestData.xlsx";
		dataDrivenFromExcel ExcelObj = new dataDrivenFromExcel(TestDataExcelPath);
		ArrayList<HashMap <String, Object>> ExpectedData = new ArrayList<HashMap <String, Object>>();
		HashMap<String, Object> OrderData = new HashMap <String, Object>();
		Date rd=new SimpleDateFormat("MM/dd/yyyy").parse(ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "requestDate"));
		SimpleDateFormat RequestDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String RequestDate = RequestDateFormat.format(rd);
		OrderData.put("professionalDesignation", ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ProfessionalDesignation"));
		OrderData.put("lastName", ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "LastName"));
		OrderData.put("zipCode", ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipZipCode")+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipZipCode4"));
		OrderData.put("reference9", ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CPROFID"));
		OrderData.put("street3", ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipAddress3"));
		OrderData.put("city", ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipCity"));
		OrderData.put("imageData", ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SRFImage"));
		OrderData.put("firstName", ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "FirstName"));
		OrderData.put("customersPractitionerId", ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "MDMID"));
		OrderData.put("signatureFlag", "0");
		OrderData.put("requestDate", RequestDate+" 00:00:00.0");
		OrderData.put("street1", ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipAddress1"));
		OrderData.put("street2", ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipAddress2"));
		OrderData.put("state", ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipState"));
		OrderData.put("customerOrderNo", ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "OrderNumber"));
		OrderData.put("reference7", PDD);
		ExpectedData.add(OrderData);
		return ExpectedData;
	}
	
	public static Boolean validateDBOrderData(String orderNumber, String TestCaseName, String PDD)
	{
		String Query = "Select OrderHeader.customerOrderNo, practitioner.lastName, Practitioner.firstName, Practitioner.professionalDesignation,  practitioner.customersPractitionerId, OrderHeader.reference7, OrderHeader.reference9, OrderHeader.signatureFlag, OrderHeader.requestDate, Address.street1, Address.street2, Address.street3, Address.city, Address.state, Address.zipCode, Image.imageData from (((OrderHeader INNER JOIN practitioner ON  OrderHeader.practitionerId=Practitioner.id) INNER JOIN Address ON Address.id=OrderHeader.shipToAddressId) INNER JOIN Image ON Image.customerOrderNo=OrderHeader.customerOrderNo) where OrderHeader.customerOrderNo='"+orderNumber+"';";
		ArrayList<HashMap <String, Object>> ActualData = new ArrayList<HashMap <String, Object>>();
		ArrayList<HashMap <String, Object>> ExpectedData = new ArrayList<HashMap <String, Object>>();
		Boolean result = false;
		try {
			ExpectedData = BMS_Utilities.OrderDataExpected(TestCaseName, PDD);
			ActualData=databaseConn.DatabaseResult(Query);
			if(ActualData.equals(ExpectedData)) {
				result= true;
			}
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("\n" + orderNumber + "Database Result : "+ ActualData);
		return result;
		
		}	
	
	public static String getResultMessage(String TestCaseName) throws Exception
	{
		String TestDataExcelPath= System.getProperty("user.dir")+"//TestData//TestData.xlsx";
		dataDrivenFromExcel ExcelObj = new dataDrivenFromExcel(TestDataExcelPath);
		return ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "resultMessage");
	}
}