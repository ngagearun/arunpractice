package com.testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Refinance extends Reusable {
	
	@BeforeMethod(groups={"regression","sanity","smoke"})
	public void moushoveronrefinance(){
		mousehover(By.linkText("Refinance"));
	}
	
	@Test(priority=3,groups="regression")

	public void RefinanceCalculatortextpage()

	{	

		click(By.linkText("Refi Calculator"));

		String actualtext=getText(By.xpath("//*[@id='CalcForm']/h1"));

		System.out.println(actualtext);

		Assert.assertTrue(actualtext.equalsIgnoreCase("Should I Refinance My Mortgage?"));

		

	}

	

	@Test(priority=4,groups="smoke")

	

	public void RefinanceAdvisortextpage()

	{

		

		click(By.linkText("Refi Advice"));

		String actualtext=getText(By.xpath("/html/body/section/section[2]/div/div[2]/div/div[2]/h1"));

		System.out.println(actualtext);

		Assert.assertTrue(actualtext.equalsIgnoreCase("Beginners Guide to Refinancing Your Mortgage"));

	}

	

@Test(priority=5,groups="smoke")

	

	public void RefinanceCoststextpage()

	{

		

		click(By.linkText("Refi Costs"));

		String actualtext=getText(By.xpath("/html/body/section/section[2]/div/div[2]/div/div[2]/h1"));

		System.out.println(actualtext);

		Assert.assertTrue(actualtext.equalsIgnoreCase("The Cost of Refinancing a Mortgage"));

	}

	

	

	

	

	

}
