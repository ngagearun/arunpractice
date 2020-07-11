package com.selenium;

import org.openqa.selenium.By;

public class WebBasedAlertDemo extends Reusable {

	public static void main(String[] args) throws InterruptedException {
	
		launchbrowser();
		appurl("https://candidate.psiexams.com/account/create_account.jsp");
		Thread.sleep(3000);
		sendText(By.name("emailid"), "test@gmail.com");
		sendText(By.name("firstname"), "arun");
		sendText(By.name("lastname"), "kumar");
		click(By.name("Submit"));
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();

	}

}
