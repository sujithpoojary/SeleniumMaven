package genericlib;


import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author sujith
 *
 */
public class ExecelFile implements AutoConstant{
	/**
	 * To Read the data from excel file
	 * @param sheetname
	 * @param rownum
	 * @param colnum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws InvalidFormatException
	 * @throws IOException
	 */
	public String getExcelData(String sheetname, int rownum, int colnum) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
	
		FileInputStream f=new FileInputStream(excelPath);
	Workbook wb=WorkbookFactory.create(f);
	return wb.getSheet(sheetname).getRow(rownum).getCell(colnum).getStringCellValue();
	
	
	}
}
