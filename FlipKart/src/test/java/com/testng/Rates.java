package com.testng;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rates  extends Reusable {	
	
	@BeforeClass(groups={"regression","sanity","smoke"})
	public void mousehoveronFHAloans(){
		mousehover(By.linkText("Rates"));
		click(By.linkText("FHA Loans"));
	}
	
	@Test(priority=0,groups="regression")
	public void verifyFHAtextpage(){
				
		String actualtext=getText(By.xpath("/html/body/section[2]/div/div[2]/div[2]/h1"));
        Assert.assertEquals(actualtext, "FHA Maximum Financing Calculator");
    }	
	
	@Test(priority=1,groups={"regression","smoke"})
	public void fhaloancalculator(){
		
		scrollActions(By.xpath("//*[@id='KJE-P-INPUTS']/table/tbody/tr/td[1]/h2"));
		sendText(By.id("KJE-ITEM2"),"5");
		sendText(By.id("KJE-ITEM5"),"20");
		sendText(By.id("KJE-ITEM6"),"5");
		sendText(By.id("KJE-ITEM7"),"5");
		String actualtext=getText(By.xpath("//*[@id='KJE-P-INPUTS2']/table/tbody/tr/td[2]/div"));
        Assert.assertEquals(actualtext, "$8,750");
	}
	
	
	@Test(priority=2,groups="sanity")
	public void clickonmortgagerates(){
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2500)");
		WebElement table=driver.findElement(By.xpath("//*[@id='rates']/tbody"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("count:"+rows.size());
		for(int i=0;i<rows.size();i++){
		String text= driver.findElement(By.xpath("//*[@id='rates']/tbody/tr['"+(i+1)+"']/td/table/tbody/tr/td[1]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/span")).getText();
			//rows.get(i).findElement(By.xpath("td/table/tbody/tr/td[1]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/span")).getText();
			System.out.println(text);
		}
	}
	
	

}
