package com.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PrintingDropDownValues extends Reusable{

	public static void main(String[] args) throws IOException {
	
		FileInputStream fi=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet2");
		launchbrowser();
		appurl("https://candidate.psiexams.com/catalog/displayagencylicenses.jsp?catalogID=334");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement sponsorname  =driver.findElement(By.id("c0"));
		List<WebElement> dropdownvalues =sponsorname.findElements(By.tagName("option"));
		
		System.out.println(dropdownvalues.size());
		
		for(int i=0;i<dropdownvalues.size();i++){
			String text=dropdownvalues.get(i).getText();
			sh.createRow(i).createCell(6).setCellValue(text);
		}
		FileOutputStream fo=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
	       wb.write(fo);
	       fo.close();
	       wb.close();
	       fi.close();
		driver.close();

	}

}
