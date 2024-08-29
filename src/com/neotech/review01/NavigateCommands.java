package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	//just practice, for this example makes no difference if its here or local
	static String url = "https://www.selenium.dev/";
	
	public static void main(String[] args) throws InterruptedException {

		
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get(url); 
		
		//1. this will load the webpage for the given url, but will NOT keep history
		//2. waits for the page and its elements to load
		
		driver.navigate().to(url); 
		//1. this will keep history
		//2. it doesnt wait for the web app to load
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize(); //will make full screen
		
		Thread.sleep(2000);
		
		driver.manage().window().minimize(); //will minimize the screen
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize(); //will make full screen
		
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://github.com/");
		
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://maven.apache.org/");
		
		Thread.sleep(2000);
		
		driver.navigate().back(); //will bring us back 
		
		Thread.sleep(2000);
		
		driver.navigate().back();//back to the first page
		
		Thread.sleep(2000);
		
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		
		driver.quit();

		
	}

}