package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Reusable {
	
	static WebDriver driver;
	
	@Parameters({"browsername","appurl"})
	@BeforeTest(groups={"regression","sanity","smoke"})
	public void launchapp(String browsername,String appurl){		
		
		launchbrowser(browsername);
		openappurl(appurl,"");
	}
	
	@AfterTest(groups={"regression","sanity","smoke"})
	public void closeapp(){
		driver.close();
	}
	
	static void launchbrowser(String browsername){
		if(browsername.equalsIgnoreCase("chrome")){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		}else{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Downloads\\geckodriver.exe");
			driver=new FirefoxDriver();

		}
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	static void openappurl(String url,String testcasestep){
		driver.get(url);
	}
	
	static void click(By locatorname){
		try{
		driver.findElement(locatorname).click();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	static void mousehover(By locatorname){
		
		try{		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(locatorname)).perform();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	static String getText(By locatorname){
		String text=null;
		try{
			text=driver.findElement(locatorname).getText();
			}catch(Exception e){
				e.printStackTrace();
			}
		
		   return text;		
	}
	
	static void scrollActions(By locatorname){
		
		WebElement ele=driver.findElement(locatorname);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
	}
	
	static void sendText(By locatorname,String text){
		try{
			driver.findElement(locatorname).clear();
		driver.findElement(locatorname).sendKeys(text);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	 
	
	

}
