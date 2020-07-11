package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait extends Reusable{
	
public static void main(String[] args) throws InterruptedException {
		
		launchbrowser();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		appurl("http://only-testing-blog.blogspot.com/2014/06/alert_6.html");
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
        driver.close();
    
		
	}


}
