package com.flipkart.businessscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;








import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.ReusableTestNG;

public class Electronics extends ReusableTestNG{
	
	
	@BeforeMethod(groups={"sanity","regression","smoke"})
	public void moveToElectronics() throws InterruptedException{
		Thread.sleep(4000);
		
		mouseHover(Constants.electronics);
	}
	
	@Test(priority=1,groups={"regression1"})
	public static void verifyoutofstockforsamsungmobileunder15k() throws InterruptedException, AWTException{
		
		click(By.linkText("Samsung"));
		Thread.sleep(4000);
		List<WebElement> no_of_elements=driver.findElements(By.xpath("//*[@id='container']/div/div[3]/div[3]/div"));
		System.out.println(no_of_elements.size());
		for(int i=0;i<5;i++){		
			String text=driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[3]/div["+(i+1)+"]/div/div[1]/div[1]/h2")).getText();
			if(text.equalsIgnoreCase("Samsung Mobile under ₹15K")){
				click(By.xpath("//*[@id='container']/div/div[3]/div[3]/div["+(i+1)+"]/div/div[1]/div[2]/a/span"));
				break;
			}
		}		
		click(By.xpath("//div[contains(text(),'Samsung Galaxy J6 (Black, 64 GB)')]"));
		String main_window=driver.getWindowHandle();
		Set<String> number_of_windows=driver.getWindowHandles();
		System.out.println(number_of_windows.size());
		Iterator<String> itr =number_of_windows.iterator();
		while(itr.hasNext()){
			String windownames =itr.next();
			if(!windownames.equals(main_window)){
				driver.switchTo().window(windownames);
			}
		}
		Thread.sleep(3000);		
		String actualvalue =readtext(By.xpath("//div[@class='_13J5uS']"));
		Assert.assertEquals("Currently out of stock in this area.", actualvalue);
		driver.close();
		driver.switchTo().window(main_window);
		
	}
	
	@Test(priority=2,groups={"regression"})
	public void addMIMobiles() throws InterruptedException, IOException{
		
		click(By.linkText("Realme"));
		Thread.sleep(4000);
		click(By.xpath("//div[text()='Realme 6 (Comet White, 128 GB)']"));
		String main_window=driver.getWindowHandle();
		Set<String> number_of_windows=driver.getWindowHandles();
		System.out.println(number_of_windows.size());
		Iterator<String> itr =number_of_windows.iterator();
		while(itr.hasNext()){
			String windownames =itr.next();
			if(!windownames.equals(main_window)){
				driver.switchTo().window(windownames);
			}
		}
		Thread.sleep(3000);
		/*click(By.xpath("//button[text()='NOTIFY ME']"));
		takeScreenShotofpage("D:\\addtocartimage.png");*/
		driver.close();
		driver.switchTo().window(main_window);		
		driver.navigate().refresh();
		Thread.sleep(4000);
		
	}
	
	
	
	
	
	
	

}
