package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;

public class WindowBasedAlert extends Reusable {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		
		launchbrowser();
		appurl("https://www.flipkart.com/");
		click(By.name("q"));
		//Thread.sleep(3000);
		//click(By.xpath("//*[@id='post-body-4105674242499183386']/div[1]/form/input[10]"));
		//Thread.sleep(3000);
		//Runtime.getRuntime().exec("C:\\Users\\Lenovo\\Desktop\\NareshUploadFile.exe");
		
		
		

	}

}
