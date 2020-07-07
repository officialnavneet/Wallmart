package library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	
private static XSSFWorkbook wb;
private static XSSFSheet sheet1;
private static XSSFCell cell;
private static XSSFRow row;


	public static void  ExcelData (String Path , String  SheetName) throws Exception  {
		try {
			FileInputStream ExcelData = new FileInputStream(Path);
			wb = new XSSFWorkbook(ExcelData);
			sheet1= wb.getSheet(SheetName);
		} catch (Exception e) {
		throw(e);
		}
	}
	
	
	public static String GetData (int row, int column) {
		try {
			cell=sheet1.getRow(row).getCell(column);
			String CellData= cell.getStringCellValue();
			return CellData;
		} catch (Exception e) {
		return "";
		}
	}
	
	
}