package abcd;

import java.io.File;

public class Testrun {

	public static void main(String[] args) {
	

		
				
				

		
		 /* FileInputStream navi=new FileInputStream("‪C:/Users/User/Desktop/Wallmarttest.xlsx");
		  XSSFWorkbook wb=new  XSSFWorkbook(navi);
		  XSSFSheet Sheet1=wb.getSheetAt(0);
		  String data0=Sheet1.getRow(2).getCell(0).getStringCellValue();
		  System.out.println( "Data from excel is "+data0); */
		File file=new File("‪‪Book2.xlsx");
				String a=file.getAbsolutePath();
				System.out.println(a);
		System.out.println(file.exists());
		 // wb.close();
	
	}

}
