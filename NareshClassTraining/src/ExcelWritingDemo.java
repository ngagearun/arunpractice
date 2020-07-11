import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelWritingDemo {

	public static void main(String[] args) throws IOException {
		
		
		ReusableExcel re=new ReusableExcel("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx", "WritingData");
		System.out.println(re.getExcelData(5, 2));
		
		
		/*FileInputStream fi=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		int sheetcount=wb.getNumberOfSheets();
		for(int i=0;i<sheetcount;i++){			
			System.out.println(wb.getSheetName(i));
			if(wb.getSheetName(i).equals("WritingData")){
				wb.createSheet("WritingData");	
			}else{
				wb.getSheet("WritingData");
			}
			
		}
		XSSFSheet sh=wb.getSheet("WritingData");
		sh.createRow(6).createCell(3).setCellValue("Writingexcel programm");
	       
	  
	       FileOutputStream fo=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
	       wb.write(fo);
	       System.out.println("Ecel wriiten happened");
		wb.close();
		fi.close();
*/
	}

}
