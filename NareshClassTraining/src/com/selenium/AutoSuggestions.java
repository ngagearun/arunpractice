package com.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutoSuggestions extends Reusable {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		FileInputStream fi=new FileInputStream(System.getProperty("user.dir")+"\\configuration.properties");
		Properties prop=new Properties();
		prop.load(fi);
		
		launchbrowser();
		appurl(prop.getProperty("appurl"));
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		sendText(By.id("tags"), "A");
		WebElement autocomplete =driver.findElement(By.id("ui-id-1"));
		List<WebElement> list =autocomplete.findElements(By.tagName("li"));
		
		
		for(int i=0;i<list.size();i++){			
			String value =list.get(i).getText();
			if(value.equalsIgnoreCase("BASIC")){
				list.get(i).click();
				break;
			}
			
		}
		
		Thread.sleep(4000);		
		driver.close();
		//driver.findElement(By.id("")).sendKeys("ree");
	

	}

}
