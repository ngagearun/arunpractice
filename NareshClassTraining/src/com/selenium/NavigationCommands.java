package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class NavigationCommands{

	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.selenium.dev/");
			String titlenname=driver.getTitle();
			System.out.println(titlenname);
			
			driver.findElement(By.linkText("Downloads")).click();
			
			driver.findElement(By.linkText("Projects")).click();
			
			driver.findElement(By.linkText("Documentation")).click();
			
			driver.navigate().back();
			
			System.out.println(driver.getCurrentUrl());
			
			driver.navigate().forward();
			
			System.out.println(driver.getCurrentUrl());
			
			driver.navigate().refresh();
			
			String url=driver.getCurrentUrl();
			driver.get(url);
			
			driver.navigate().to(url);
			
			driver.findElement(By.id("search-by")).sendKeys(Keys.F5);
			
			driver.close();		

	}

}
