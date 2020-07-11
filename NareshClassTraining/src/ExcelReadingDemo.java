import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReadingDemo {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fi=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		//sh.getRow(4).getCell(2).getStringCellValue();
	    /*XSSFRow row =sh.getRow(2);
	    XSSFCell cell= row.getCell(1);
	    String value =cell.getStringCellValue();*/	
		
		int total_rows =sh.getLastRowNum();
		 int total_cols=sh.getRow(2).getLastCellNum();
		 
		 for(int i=0;i<total_rows;i++){	
			 System.out.println("The row num is"+(i+1));
			       XSSFRow row= sh.getRow(i);			
			 for(int j=0;j<total_cols;j++){				 
				 XSSFCell cell= row.getCell(j);
				System.out.println(cell.getStringCellValue());
			 }
		 }  
	    wb.close();
	    fi.close();

	}

}
