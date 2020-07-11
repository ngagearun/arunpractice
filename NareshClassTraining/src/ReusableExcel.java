import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReusableExcel {
	
	FileInputStream fi;
	XSSFWorkbook wb;
	XSSFSheet sh;
	ReusableExcel(String excelpath,String sheetname) throws IOException{
		try{
		 fi=new FileInputStream(excelpath);
		 wb=new XSSFWorkbook(fi);
		 sh=wb.getSheet(sheetname);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	String getExcelData(int row,int col){
		String value=null;
		try{
		  value= sh.getRow(row).getCell(col).getStringCellValue();
		}catch(Exception e){
			
		}
		return value;
	}
	
	

}
