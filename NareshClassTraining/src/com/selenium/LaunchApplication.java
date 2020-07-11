package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchApplication extends Reusable {

	public static void main(String[] args) throws InterruptedException {
		
	    launchbrowser();
		appurl("https://www.mortgagecalculator.org/");
		String titlenname=driver.getTitle();
		System.out.println(titlenname);
		sendText(By.id("homeval"), "123233");
		Thread.sleep(3000);
		driver.findElement(By.id("downpayment")).sendKeys("32344");	
		Thread.sleep(3000);
		driver.findElement(By.name("cal")).click();
		Thread.sleep(3000);
		
		
		driver.close();

	}

}
