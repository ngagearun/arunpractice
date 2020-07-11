package com.flipkart.businessscripts;



import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.ReusableTestNG;

public class Men extends ReusableTestNG {
	
	@BeforeMethod
	
	public void movetoMen() throws InterruptedException{
		Thread.sleep(4000);
		mouseHover(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[3]/span"));
		Thread.sleep(3000);
		click(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[3]/ul/li/ul/li[1]/ul/li[2]/a"));
		Thread.sleep(4000);
	}
	@Test(priority=3,groups={"smoke"})
	public void verifytitleofshoespage() throws InterruptedException{
		
		String acualvalue=readtext(By.className("_2yAnYN"));
		Assert.assertEquals("Sports Shoes", acualvalue);
	}

	
	@Test(priority=4,groups={"regression"})
	public void addshoeitemtocart() throws InterruptedException, IOException{
		
		click(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/a[1]"));
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
		click(By.linkText("8"));
		click(By.xpath("//button[text()='ADD TO CART']"));
		takeScreenShotofpage("D:\\shoeimage.png");
	}
}
