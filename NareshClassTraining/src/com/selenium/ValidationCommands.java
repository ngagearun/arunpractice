package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommands {

	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.bing.com/");
			String titlenname=driver.getTitle();
			System.out.println(titlenname);
			Thread.sleep(3000);
			boolean status=driver.findElement(By.id("b_logo")).isDisplayed();
			if(status==true){
				System.out.println("Bing logo Image is present application");
			}else{
				System.out.println("Not Present in applicationss");
			}
			
			boolean textbox= driver.findElement(By.id("sb_form_q")).isEnabled();
			if(textbox==true){
				driver.findElement(By.id("sb_form_q")).sendKeys("Selenium");
			}else{
				System.out.println("Nt enabled");
			}
			
			driver.close();
			
			

	}

}
