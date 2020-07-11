package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DraggableDemo extends Reusable {

	public static void main(String[] args) throws InterruptedException {
		
		launchbrowser();
		appurl("https://jqueryui.com/draggable/");
		//Thread.sleep(3000);	
		
		driver.switchTo().frame(0);		
        action=new Actions(driver);
        try{
        WebElement draggable=driver.findElement(By.id("draggable"));
        action.dragAndDropBy(draggable, 235, 67).perform();
        }catch(Exception e){
        	e.printStackTrace();
        }
        finally{
        	Thread.sleep(3000);
        driver.close();
        }
    
		
	}

}
