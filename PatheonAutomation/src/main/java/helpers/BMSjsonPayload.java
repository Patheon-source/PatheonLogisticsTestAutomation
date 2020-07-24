package helpers;

public class BMSjsonPayload {
	
	public static String PlaceOrderPostDataJson(String TestCaseName) throws Exception
	{
		String TestDataExcelPath= System.getProperty("user.dir")+"//TestData//TestData.xlsx";
		dataDrivenFromExcel ExcelObj = new dataDrivenFromExcel(TestDataExcelPath);
       String jsn="{\r\n" + 
       		"	\"Username\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Username")+"\",\r\n" + 
       		"	\"Password\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Password")+"\",\r\n" + 
       		"	\"OrderNumber\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "OrderNumber")+"\",\r\n" + 
       		"	\"LastName\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "LastName")+"\",\r\n" + 
       		"	\"FirstName\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "FirstName")+"\",\r\n" + 
       		"	\"ProfessionalDesignation\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ProfessionalDesignation")+"\",\r\n" + 
       		"	\"MDMID\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "MDMID")+"\",\r\n" + 
       		"	\"CPROFID\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CPROFID")+"\",\r\n" + 
       		"	\"SignaturePresent\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SignaturePresent")+"\",\r\n" + 
       		"	\"RequestDate\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "requestDate")+"\",\r\n" + 
       		"	\"ShipAddress1\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipAddress1")+"\",\r\n" + 
       		"	\"ShipAddress2\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipAddress2")+"\",\r\n" + 
       		"	\"ShipAddress3\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipAddress3")+"\",\r\n" + 
       		"	\"ShipCity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipCity")+"\",\r\n" + 
       		"	\"ShipState\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipState")+"\",\r\n" + 
       		"	\"ShipZipCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipZipCode")+"\",\r\n" + 
       		"	\"ShipZipCode4\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipZipCode4")+"\",\r\n" + 
       		"	\"DEALicense\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "DEALicense")+"\",\r\n" + 
       		"	\"SLN\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SLN")+"\",\r\n" + 
       		"	\"SRFImage\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SRFImage")+"\",\r\n" + 
       		"	\"MondayDelivery\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "MondayDelivery")+"\",\r\n" + 
       		"	\"TuesdayDelivery\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "TuesdayDelivery")+"\",\r\n" + 
       		"	\"WednesdayDelivery\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "WednesdayDelivery")+"\",\r\n" + 
       		"	\"ThursdayDelivery\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ThursdayDelivery")+"\",\r\n" + 
       		"	\"FridayDelivery\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "FridayDelivery")+"\",\r\n" + 
       		"	\"SaturdayDelivery\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SaturdayDelivery")+"\",\r\n" + 
       		"	\"SundayDelivery\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SundayDelivery")+"\",\r\n" + 
       		"	\"Products\": [\r\n" + 
       		"	                        {\r\n" + 
       		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
       		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
       		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
       		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
       		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
       		"                             }\r\n" + 
       		"	]\r\n" + 
       		"}";
		

		return jsn;
	}
	
	public static String PlaceOrderWithMultipleProductsInvalid(String TestCaseName) throws Exception
	{
		String TestDataExcelPath= System.getProperty("user.dir")+"//TestData//TestData.xlsx";
		dataDrivenFromExcel ExcelObj = new dataDrivenFromExcel(TestDataExcelPath);
       String jsn="{\r\n" + 
       		"	\"Username\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Username")+"\",\r\n" + 
       		"	\"Password\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Password")+"\",\r\n" + 
       		"	\"OrderNumber\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "OrderNumber")+"\",\r\n" + 
       		"	\"LastName\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "LastName")+"\",\r\n" + 
       		"	\"FirstName\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "FirstName")+"\",\r\n" + 
       		"	\"ProfessionalDesignation\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ProfessionalDesignation")+"\",\r\n" + 
       		"	\"MDMID\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "MDMID")+"\",\r\n" + 
       		"	\"CPROFID\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CPROFID")+"\",\r\n" + 
       		"	\"SignaturePresent\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SignaturePresent")+"\",\r\n" + 
       		"	\"RequestDate\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "requestDate")+"\",\r\n" + 
       		"	\"ShipAddress1\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipAddress1")+"\",\r\n" + 
       		"	\"ShipAddress2\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipAddress2")+"\",\r\n" + 
       		"	\"ShipAddress3\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipAddress3")+"\",\r\n" + 
       		"	\"ShipCity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipCity")+"\",\r\n" + 
       		"	\"ShipState\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipState")+"\",\r\n" + 
       		"	\"ShipZipCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipZipCode")+"\",\r\n" + 
       		"	\"ShipZipCode4\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipZipCode4")+"\",\r\n" + 
       		"	\"DEALicense\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "DEALicense")+"\",\r\n" + 
       		"	\"SLN\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SLN")+"\",\r\n" + 
       		"	\"SRFImage\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SRFImage")+"\",\r\n" + 
       		"	\"Products\": [\r\n" + 
       		"	                        {\r\n" + 
       		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
       		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
       		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
       		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
       		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
       		"                             },\r\n" + 
       		"	                        {\r\n" + 
       		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode2")+"\",\r\n" + 
       		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode2")+"\",\r\n" + 
       		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode2")+"\",\r\n" + 
       		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code2")+"\",\r\n" + 
       		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity2")+"\"\r\n" + 
       		"                             },\r\n" + 
       		"	                        {\r\n" + 
       		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode3")+"\",\r\n" + 
       		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode3")+"\",\r\n" + 
       		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode3")+"\",\r\n" + 
       		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code3")+"\",\r\n" + 
       		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity3")+"\"\r\n" + 
       		"                             }\r\n" + 
       		"	]\r\n" + 
       		"}";
		

		return jsn;
	}
	
	public static String PlaceOrderWithoutValidProduct(String TestCaseName) throws Exception
	{
		String TestDataExcelPath= System.getProperty("user.dir")+"//TestData//TestData.xlsx";
		dataDrivenFromExcel ExcelObj = new dataDrivenFromExcel(TestDataExcelPath);
       String jsn="{\r\n" + 
       		"	\"Username\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Username")+"\",\r\n" + 
       		"	\"Password\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Password")+"\",\r\n" + 
       		"	\"OrderNumber\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "OrderNumber")+"\",\r\n" + 
       		"	\"LastName\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "LastName")+"\",\r\n" + 
       		"	\"FirstName\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "FirstName")+"\",\r\n" + 
       		"	\"ProfessionalDesignation\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ProfessionalDesignation")+"\",\r\n" + 
       		"	\"MDMID\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "MDMID")+"\",\r\n" + 
       		"	\"CPROFID\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CPROFID")+"\",\r\n" + 
       		"	\"SignaturePresent\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SignaturePresent")+"\",\r\n" + 
       		"	\"RequestDate\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "requestDate")+"\",\r\n" + 
       		"	\"ShipAddress1\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipAddress1")+"\",\r\n" + 
       		"	\"ShipAddress2\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipAddress2")+"\",\r\n" + 
       		"	\"ShipAddress3\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipAddress3")+"\",\r\n" + 
       		"	\"ShipCity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipCity")+"\",\r\n" + 
       		"	\"ShipState\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipState")+"\",\r\n" + 
       		"	\"ShipZipCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipZipCode")+"\",\r\n" + 
       		"	\"ShipZipCode4\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipZipCode4")+"\",\r\n" + 
       		"	\"DEALicense\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "DEALicense")+"\",\r\n" + 
       		"	\"SLN\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SLN")+"\",\r\n" + 
       		"	\"SRFImage\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SRFImage")+"\",\r\n" + 
       		"	\"Products\": [\r\n" +
       		"	]\r\n" + 
       		"}";
		

		return jsn;
	}
	
	public static String PlaceOrderSuccessPostDataJson(String TestCaseName) throws Exception
	{
		String TestDataExcelPath= System.getProperty("user.dir")+"//TestData//TestData.xlsx";
		dataDrivenFromExcel ExcelObj = new dataDrivenFromExcel(TestDataExcelPath);
		String orderNum = "TA" + Utilities.generateRandomInt();
		System.out.println(orderNum);
		ExcelObj.setCellValue("BMS_OrderAPI", TestCaseName, "OrderNumber", orderNum);
		String jsn="{\r\n" + 
       		"	\"Username\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Username")+"\",\r\n" + 
       		"	\"Password\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Password")+"\",\r\n" + 
       		"	\"OrderNumber\": \"" +orderNum+"\",\r\n" + 
       		"	\"LastName\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "LastName")+"\",\r\n" + 
       		"	\"FirstName\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "FirstName")+"\",\r\n" + 
       		"	\"ProfessionalDesignation\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ProfessionalDesignation")+"\",\r\n" + 
       		"	\"MDMID\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "MDMID")+"\",\r\n" + 
       		"	\"CPROFID\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CPROFID")+"\",\r\n" + 
       		"	\"SignaturePresent\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SignaturePresent")+"\",\r\n" + 
       		"	\"RequestDate\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "requestDate")+"\",\r\n" + 
       		"	\"ShipAddress1\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipAddress1")+"\",\r\n" + 
       		"	\"ShipAddress2\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipAddress2")+"\",\r\n" + 
       		"	\"ShipAddress3\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipAddress3")+"\",\r\n" + 
       		"	\"ShipCity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipCity")+"\",\r\n" + 
       		"	\"ShipState\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipState")+"\",\r\n" + 
       		"	\"ShipZipCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipZipCode")+"\",\r\n" + 
       		"	\"ShipZipCode4\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipZipCode4")+"\",\r\n" + 
       		"	\"DEALicense\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "DEALicense")+"\",\r\n" + 
       		"	\"SLN\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SLN")+"\",\r\n" + 
       		"	\"SRFImage\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SRFImage")+"\",\r\n" + 
       		"	\"MondayDelivery\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "MondayDelivery")+"\",\r\n" + 
       		"	\"TuesdayDelivery\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "TuesdayDelivery")+"\",\r\n" + 
       		"	\"WednesdayDelivery\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "WednesdayDelivery")+"\",\r\n" + 
       		"	\"ThursdayDelivery\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ThursdayDelivery")+"\",\r\n" + 
       		"	\"FridayDelivery\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "FridayDelivery")+"\",\r\n" + 
       		"	\"SaturdayDelivery\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SaturdayDelivery")+"\",\r\n" + 
       		"	\"SundayDelivery\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SundayDelivery")+"\",\r\n" + 
       		"	\"Products\": [\r\n" + 
       		"	                        {\r\n" + 
       		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
       		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
       		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
       		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
       		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
       		"                             }\r\n" + 
       		"	]\r\n" + 
       	   	
		"}";
		return jsn;
		
	}
	
	public static String PlaceOrderSuccesssourceCodeJson(String TestCaseName ) throws Exception
	{
		String TestDataExcelPath= System.getProperty("user.dir")+"//TestData//TestData.xlsx";
		dataDrivenFromExcel ExcelObj = new dataDrivenFromExcel(TestDataExcelPath);
		String orderNum = "TA" + Utilities.generateRandomInt();
		System.out.println(orderNum);
		ExcelObj.setCellValue("BMS_OrderAPI", TestCaseName, "OrderNumber", orderNum);
		String jsn="{\r\n" + 
       		"	\"Username\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Username")+"\",\r\n" + 
       		"	\"Password\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Password")+"\",\r\n" + 
       		"	\"OrderNumber\": \"" +orderNum+"\",\r\n" + 
       		"	\"LastName\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "LastName")+"\",\r\n" + 
       		"	\"FirstName\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "FirstName")+"\",\r\n" + 
       		"	\"ProfessionalDesignation\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ProfessionalDesignation")+"\",\r\n" + 
       		"	\"MDMID\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "MDMID")+"\",\r\n" + 
       		"	\"CPROFID\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CPROFID")+"\",\r\n" + 
       		"	\"SignaturePresent\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SignaturePresent")+"\",\r\n" + 
       		"	\"RequestDate\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "requestDate")+"\",\r\n" + 
       		"	\"ShipAddress1\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipAddress1")+"\",\r\n" + 
       		"	\"ShipAddress2\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipAddress2")+"\",\r\n" + 
       		"	\"ShipAddress3\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipAddress3")+"\",\r\n" + 
       		"	\"ShipCity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipCity")+"\",\r\n" + 
       		"	\"ShipState\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipState")+"\",\r\n" + 
       		"	\"ShipZipCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipZipCode")+"\",\r\n" + 
       		"	\"ShipZipCode4\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipZipCode4")+"\",\r\n" + 
       		"	\"DEALicense\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "DEALicense")+"\",\r\n" + 
       		"	\"SLN\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SLN")+"\",\r\n" + 
       		"	\"SRFImage\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SRFImage")+"\",\r\n" + 
       		"	\"Products\": [\r\n" + 
       		"	                        {\r\n" + 
       		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
			"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
       		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
       		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
       		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
       		"                             }\r\n" + 
       		"	]\r\n" + 
       		"}";
		
		
		return jsn;
		
	}
	
	public static String PlaceOrderWithMultipleProductsPostDataJson(String TestCaseName) throws Exception
	{
		String TestDataExcelPath= System.getProperty("user.dir")+"//TestData//TestData.xlsx";
		dataDrivenFromExcel ExcelObj = new dataDrivenFromExcel(TestDataExcelPath);
		String orderNum = "TA" + Utilities.generateRandomInt();
		System.out.println(orderNum);
		ExcelObj.setCellValue("BMS_OrderAPI", TestCaseName, "OrderNumber", orderNum);
		String jsn="{\r\n" + 
       		"	\"Username\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Username")+"\",\r\n" + 
       		"	\"Password\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Password")+"\",\r\n" + 
       		"	\"OrderNumber\": \"" +orderNum+"\",\r\n" + 
       		"	\"LastName\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "LastName")+"\",\r\n" + 
       		"	\"FirstName\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "FirstName")+"\",\r\n" + 
       		"	\"ProfessionalDesignation\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ProfessionalDesignation")+"\",\r\n" + 
       		"	\"MDMID\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "MDMID")+"\",\r\n" + 
       		"	\"CPROFID\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CPROFID")+"\",\r\n" + 
       		"	\"SignaturePresent\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SignaturePresent")+"\",\r\n" + 
       		"	\"RequestDate\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "requestDate")+"\",\r\n" + 
       		"	\"ShipAddress1\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipAddress1")+"\",\r\n" + 
       		"	\"ShipAddress2\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipAddress2")+"\",\r\n" + 
       		"	\"ShipAddress3\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipAddress3")+"\",\r\n" + 
       		"	\"ShipCity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipCity")+"\",\r\n" + 
       		"	\"ShipState\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipState")+"\",\r\n" + 
       		"	\"ShipZipCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipZipCode")+"\",\r\n" + 
       		"	\"ShipZipCode4\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipZipCode4")+"\",\r\n" + 
       		"	\"DEALicense\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "DEALicense")+"\",\r\n" + 
       		"	\"SLN\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SLN")+"\",\r\n" + 
       		"	\"SRFImage\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SRFImage")+"\",\r\n" + 
       		"	\"MondayDelivery\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "MondayDelivery")+"\",\r\n" + 
       		"	\"TuesdayDelivery\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "TuesdayDelivery")+"\",\r\n" + 
       		"	\"WednesdayDelivery\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "WednesdayDelivery")+"\",\r\n" + 
       		"	\"ThursdayDelivery\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ThursdayDelivery")+"\",\r\n" + 
       		"	\"FridayDelivery\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "FridayDelivery")+"\",\r\n" + 
       		"	\"SaturdayDelivery\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SaturdayDelivery")+"\",\r\n" + 
       		"	\"SundayDelivery\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SundayDelivery")+"\",\r\n" + 
       		"	\"Products\": [\r\n" + 
       		"	                        {\r\n" + 
       		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
       		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
       		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
       		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
       		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
       		"                             },\r\n" + 
       		"	                        {\r\n" + 
       		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode2")+"\",\r\n" + 
       		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode2")+"\",\r\n" + 
       		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode2")+"\",\r\n" + 
       		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code2")+"\",\r\n" + 
       		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity2")+"\"\r\n" + 
       		"                             },\r\n" + 
       		"	                        {\r\n" + 
       		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode3")+"\",\r\n" + 
       		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode3")+"\",\r\n" + 
       		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode3")+"\",\r\n" + 
       		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code3")+"\",\r\n" + 
       		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity3")+"\"\r\n" + 
       		"                             }\r\n" + 
       		"	]\r\n" + 
       		"}";
		
		
		return jsn;
		
	}
	
	
	public static String PlaceOrderWithMaxProductLineItems(String TestCaseName) throws Exception
	{
		String TestDataExcelPath= System.getProperty("user.dir")+"//TestData//TestData.xlsx";
		dataDrivenFromExcel ExcelObj = new dataDrivenFromExcel(TestDataExcelPath);
       String jsn="{\r\n" + 
       		"	\"Username\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Username")+"\",\r\n" + 
       		"	\"Password\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Password")+"\",\r\n" + 
       		"	\"OrderNumber\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "OrderNumber")+"\",\r\n" + 
       		"	\"LastName\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "LastName")+"\",\r\n" + 
       		"	\"FirstName\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "FirstName")+"\",\r\n" + 
       		"	\"ProfessionalDesignation\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ProfessionalDesignation")+"\",\r\n" + 
       		"	\"MDMID\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "MDMID")+"\",\r\n" + 
       		"	\"CPROFID\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CPROFID")+"\",\r\n" + 
       		"	\"SignaturePresent\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SignaturePresent")+"\",\r\n" + 
       		"	\"RequestDate\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "requestDate")+"\",\r\n" + 
       		"	\"ShipAddress1\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipAddress1")+"\",\r\n" + 
       		"	\"ShipAddress2\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipAddress2")+"\",\r\n" + 
       		"	\"ShipAddress3\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipAddress3")+"\",\r\n" + 
       		"	\"ShipCity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipCity")+"\",\r\n" + 
       		"	\"ShipState\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipState")+"\",\r\n" + 
       		"	\"ShipZipCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipZipCode")+"\",\r\n" + 
       		"	\"ShipZipCode4\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "ShipZipCode4")+"\",\r\n" + 
       		"	\"DEALicense\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "DEALicense")+"\",\r\n" + 
       		"	\"SLN\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SLN")+"\",\r\n" + 
       		"	\"SRFImage\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SRFImage")+"\",\r\n" + 
       		"	\"Products\": [\r\n" + 
       		"	                        {\r\n" + 
       		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
       		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
       		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
       		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
       		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
       		"                             },\r\n" + 
       		"{\r\n" + 
           		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
           		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
           		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
           		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
           		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
           		"                             },\r\n" +
           		"{\r\n" + 
           		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
           		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
           		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
           		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
           		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
           		"                             },\r\n" +
           		"{\r\n" + 
           		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
           		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
           		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
           		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
           		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
           		"                             },\r\n" +
           		"{\r\n" + 
           		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
           		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
           		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
           		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
           		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
           		"                             },\r\n" +
           		"{\r\n" + 
           		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
           		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
           		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
           		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
           		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
           		"                             },\r\n" +
           		"{\r\n" + 
           		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
           		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
           		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
           		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
           		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
           		"                             },\r\n" +
           		"{\r\n" + 
           		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
           		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
           		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
           		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
           		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
           		"                             },\r\n" +
           		"{\r\n" + 
           		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
           		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
           		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
           		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
           		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
           		"                             },\r\n" +
           		"{\r\n" + 
           		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
           		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
           		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
           		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
           		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
           		"                             },\r\n" +
           		"{\r\n" + 
           		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
           		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
           		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
           		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
           		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
           		"                             },\r\n" +
           		"{\r\n" + 
           		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
           		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
           		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
           		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
           		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
           		"                             },\r\n" +
           		"{\r\n" + 
           		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
           		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
           		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
           		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
           		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
           		"                             },\r\n" +
           		"{\r\n" + 
           		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
           		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
           		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
           		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
           		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
           		"                             },\r\n" +
           		"{\r\n" + 
           		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
           		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
           		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
           		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
           		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
           		"                             },\r\n" +
           		"{\r\n" + 
           		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
           		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
           		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
           		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
           		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
           		"                             },\r\n" +
           		"{\r\n" + 
           		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
           		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
           		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
           		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
           		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
           		"                             },\r\n" +
           		"{\r\n" + 
           		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
           		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
           		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
           		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
           		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
           		"                             },\r\n" +
           		"{\r\n" + 
           		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
           		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
           		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
           		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
           		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
           		"                             },\r\n" +
           		"{\r\n" + 
           		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
           		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
           		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
           		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
           		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
           		"                             },\r\n" +
           		"{\r\n" + 
           		"                                           \"CampaignCode\":\"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "CampaignCode1")+"\",\r\n" + 
           		"                                           \"SourceCode\": \""+ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "SourceCode1")+"\",\r\n" + 
           		"                                           \"KitCode\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "KitCode1")+"\",\r\n" + 
           		"                                           \"Code\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Code1")+"\",\r\n" + 
           		"                                           \"Quantity\": \"" +ExcelObj.getCellData("BMS_OrderAPI", TestCaseName, "Quantity1")+"\"\r\n" + 
           		"                             }\r\n" +
           		
       		"	]\r\n" + 
       		"}";
		return jsn;
	}
}
 