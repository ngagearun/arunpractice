package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver.exe" );
		//Launch Browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.eenadu.net/");
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("ఆంధ్రప్రదేశ్")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.findElement(By.linkText("తెలంగాణ")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.findElement(By.linkText("జాతీయ- అంతర్జాతీయ")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.findElement(By.linkText("క్రైమ్ ")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.findElement(By.linkText("బిజినెస్‌ ")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.findElement(By.linkText(" క్రీడలు ")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.findElement(By.linkText("సినిమా")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.findElement(By.linkText("వసుంధర")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
	}

}
