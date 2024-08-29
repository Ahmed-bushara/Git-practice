package com.neotech.review01;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonSearchCSSSelector {

	public static void main(String[] args) throws InterruptedException {
     setUp();
     
     
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(3000);
		
		//locate elements: 
		
		//		tag#id	---> #id
		
		//input#twotabsearchtextbox --> any input element with id twotabsearchtextbox
		
		// #twotabsearchtextbox  --> any element with id twotabsearchtextbox
		
		//	tag.class
		
		
		// tag[attribute='value']  (difference with xpath?? : no // and no @ before the attribute
			//we can use wildcard chars to match certain specific situations
				//^  --> starts with
				//$  --> ends with
				//*  --> contains
		
		//tag[attribute*='value']  --> tag with attribute contains 'value' 
		
		WebElement searchBox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		searchBox.sendKeys("deck lights");
		
		Thread.sleep(3000);
		System.out.println("this is a feature I want to develope");
		
		//we can use id: 
		// #nav-search-submit-button
		
		//in situations when we do not have a direct way to locate the element we want, 
		//we can locate elements close to it and then go to the element we want. 
		
		//Locate the span with id: nav-search-submit-text 
		//Then locate the direct child element (input):
			//#nav-search-submit-text > input
		
		//method chaining: locate the element and click on it
		
		driver.findElement(By.cssSelector("#nav-search-submit-text > input")).click();
		
		Thread.sleep(3000);
		
		

		driver.quit();
	}

}