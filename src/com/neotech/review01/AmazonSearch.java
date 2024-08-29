package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(3000);
		
		//We need to locate elements now: 
		//Selenium has 8 locators: id, name, className, linkText, partialLinkText, tagName, xpath, ccsSelector.
		
		//getting xpath by copying it from the browser: 
			//full xpath: /html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input
			//relative xpath: //*[@id="twotabsearchtextbox"]
		
		//my own xpath: 
			//start broad with the tag:   //input
			//check how many elements that identifies
			//then specify it according to the element/elements that you want
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("deck lights");
		
		//this could be: driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("deck lights");
		
		Thread.sleep(3000);
		
		
		WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit']"));
		searchButton.click();
		
		Thread.sleep(3000);
		
		
		//xpath relative path formula: 
			//tag[@attribute='attribute value']
			//with methods: 
				//contains(@attribute, 'something')
		
		
		driver.quit();
	}

}
