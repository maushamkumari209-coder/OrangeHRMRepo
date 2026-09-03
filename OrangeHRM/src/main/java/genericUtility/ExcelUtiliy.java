package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtiliy {
	
	public String getExcelData(String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis =new FileInputStream("C:\\Users\\Admin\\eclipse\\eclipse\\NinzaHRM\\src\\test\\TestData1.xlsx");
	
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sh=wb.getSheet(sheetName);
		
		Row r=sh.getRow(rowNum);
		
		Cell c=r.getCell(cellNum);
		
		String data =c.toString();
		
		wb.close();
		
		return data;
        
	}
}
