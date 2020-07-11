package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollBarActions extends Reusable{

	public static void main(String[] args) throws InterruptedException, AWTException {
	
		launchbrowser();
		appurl("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.linkText("//a[text()='Nikon Camera']"));

		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		//js.executeScript("window.scrollBy(0,2200)");
  
		Thread.sleep(5000);
		js.executeScript("arguments[0].click();", ele);
		
		//nickoncamera.click();
		Thread.sleep(5000);
		driver.close();


	}

}
