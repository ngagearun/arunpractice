package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTableDemo extends Reusable {

	public static void main(String[] args) {
		
		launchbrowser();
		appurl("https://money.rediff.com/gainers/bsc/dailygroupa?");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement sharetable =driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody"));
		List<WebElement> no_of_rows =sharetable.findElements(By.tagName("tr"));
		
				
		for(int row=0;row<2;row++){
			
			List<WebElement> no_of_cols =no_of_rows.get(row).findElements(By.tagName("td"));
			
			for(int col=0;col<no_of_cols.size();col++){
				
				String text=no_of_cols.get(col).getText();
				System.out.println(text);
				
			}
			
			
			
		}
		
		driver.close();
	}

}
