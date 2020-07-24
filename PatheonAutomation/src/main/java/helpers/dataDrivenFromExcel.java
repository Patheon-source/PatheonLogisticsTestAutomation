package helpers;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
 
@SuppressWarnings("deprecation")
public class dataDrivenFromExcel
{
    public FileInputStream fis = null;
    public XSSFWorkbook workbook = null;
    public XSSFSheet sheet = null;
    public XSSFRow row = null;
    public XSSFCell cell = null;
    private CellStyle generalStyle;
 
    public dataDrivenFromExcel(String xlFilePath) throws Exception
    {
        fis = new FileInputStream(xlFilePath);
        workbook = new XSSFWorkbook(fis);
        fis.close();
    }
    
    public int getRowIndexUsingTestCaseName(String sheetName, String TestCaseName)
    {
		
    	int rowNum = -1;
        sheet = workbook.getSheet(sheetName);
        Iterator<Row>  rows= sheet.iterator();
		Row firstrow= rows.next();
		Iterator<Cell> ce=firstrow.cellIterator();
		int k=0;
		int coloumn = 0;
		int l=1;
		while(ce.hasNext())
		{
			Cell value=ce.next();
			
			if(value.getStringCellValue().equalsIgnoreCase("TestCaseName"))
			{
				coloumn=k;
				
			}
			
			k++;
		}

	
		while(rows.hasNext())
		{
			
			Row r=rows.next();
			if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(TestCaseName))
			{
				
				rowNum=l;
			}
			l++;
		}
        return rowNum;
    	
    }
 
    public int getColIndexUsingFieldName(String sheetName, String fieldName)
    {
    	sheet = workbook.getSheet(sheetName);
    	int colNum = -1;
    	XSSFRow row = sheet.getRow(0);        
        for(int i = 0; i < row.getLastCellNum(); i++)
        {
            if(row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(fieldName))
            	colNum = i;
        }
        
        return colNum;
    	
    }
    
    
    public String getCellData(String sheetName, String TestCaseName, String fieldName)
    {
        try
        {
        	 int rowIndex = getRowIndexUsingTestCaseName(sheetName, TestCaseName);
        	 int colIndex = getColIndexUsingFieldName(sheetName, fieldName);
        	 row = sheet.getRow(rowIndex);
             cell = row.getCell(colIndex);

            if(cell.getCellTypeEnum() == CellType.STRING)
                return cell.getStringCellValue();
            else if(cell.getCellTypeEnum() == CellType.NUMERIC || cell.getCellTypeEnum() == CellType.FORMULA)
            {
                String cellValue = String.valueOf(cell.getNumericCellValue());
                String[] number = cellValue.split( "[.]" );
                if(number.length>1 && number[1].equalsIgnoreCase("0")){
                cellValue=number[0];                                
                } 
                if(HSSFDateUtil.isCellDateFormatted(cell))
                {
                    DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
                    Date date = cell.getDateCellValue();
                    cellValue = df.format(date);
                }
                return cellValue;
            }else if(cell.getCellTypeEnum() == CellType.BLANK)
                return "";
            else
                return String.valueOf(cell.getBooleanCellValue());
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return "row "+TestCaseName+" or column "+fieldName +" does not exist  in Excel";
        }
    }
    
    public void setCellValue(String sheetName, String TestCaseName, String fieldName, String value) throws FileNotFoundException, IOException
    {
    	sheet = workbook.getSheet(sheetName);
    	int rowIndex = getRowIndexUsingTestCaseName(sheetName, TestCaseName);
    	int colIndex = getColIndexUsingFieldName(sheetName, fieldName);   
    	XSSFRow row = sheet.getRow(rowIndex);
    	XSSFCell cell = row.getCell(colIndex);
    	if(cell==null)
    	{
    		row.createCell(colIndex);
    		cell=row.getCell(colIndex);
    		cell.setCellType(CellType.STRING);
     	}
    	cell.setCellValue(value);
    	cell.setCellStyle(generalStyle);
    	try (FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"//TestData//TestData.xlsx")) {
            workbook.write(fos);
        }
    	}   
}