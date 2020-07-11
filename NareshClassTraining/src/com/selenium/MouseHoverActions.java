package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions extends Reusable {

	public static void main(String[] args) throws InterruptedException {
			launchbrowser();
			appurl("https://www.flipkart.com/");
			Thread.sleep(6000);
			String titlenname=driver.getTitle();
			System.out.println(titlenname);
			mouseHover(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[1]/span"));
			Thread.sleep(2000);
			driver.findElement(By.linkText("Mi")).click();
			Thread.sleep(3000);
			String text=driver.findElement(By.className("_2yAnYN")).getText();
			System.out.println(text);
			if(text.equals("Mi Mobiles")){
				System.out.println("Text showing crrect");
			}
			Thread.sleep(3000);
			driver.close();

	}

}
