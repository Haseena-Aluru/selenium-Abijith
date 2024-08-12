package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String getStringDataFromExcel(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException
	{
		 FileInputStream fis= new FileInputStream("./src/test/resources/testscriptData.xlsx");
		 Workbook workbook= WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();
	}
	
	
		
		public double getStringDataFromExcel1(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException
		{
			 FileInputStream fis= new FileInputStream("./src/test/resources/testscriptData.xlsx");
			 Workbook workbook= WorkbookFactory.create(fis);
			return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getNumericCellValue();
		}
		
		
		public boolean getStringDataFromExcel11(String sheetName,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException
		{
			 FileInputStream fis= new FileInputStream("./src/test/resources/testscriptData.xlsx");
			 Workbook workbook= WorkbookFactory.create(fis);
			return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();
			

			

		
		
		
		
		
		 
		
		
	}
}
