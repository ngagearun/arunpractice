package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Reusable{

	public static void main(String[] args) throws InterruptedException {		
		
		launchbrowser();
		appurl("https://candidate.psiexams.com/catalog/displayagencylicenses.jsp?catalogID=334");
		String titlenname=driver.getTitle();
		System.out.println(titlenname);
		Thread.sleep(3000);
		dropdown(By.id("c0"),"National Board of Fitness Examiners");
		Thread.sleep(3000);
		driver.close();
		


	}

}
