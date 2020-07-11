package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Reusable {
	static WebDriver driver;
	
	static Actions action;	
	static String  browsername="chrome";
	
	public static void launchbrowser(){
		if(browsername.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		}else if(browsername.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
	}
	
	public static void appurl(String url){		
		driver.get(url);

	}
	
	public static void sendText(By locatorname,String textvalue){
		driver.findElement(locatorname).clear();
		driver.findElement(locatorname).sendKeys(textvalue);
	}
	
	public static void click(By locatorname){
		driver.findElement(locatorname).click();
	}
	
	
	public static void mouseHover(By locatorname){
		try{
		action=new Actions(driver);
		action.moveToElement(driver.findElement(locatorname)).perform();
		}catch(Exception e){
			
		}
		
		
	}
	
	public static void dropdown(By locatorname,String text){
		
		Select sel=new Select(driver.findElement(locatorname));
		sel.selectByVisibleText(text);
	}
	
}
