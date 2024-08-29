package com.neotech.review01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {

		//Open a browser
		WebDriver driver = new FirefoxDriver();
		
		String url = "https://www.nytimes.com/";
		
		driver.get(url);

		Thread.sleep(3000); //wait (stop the code running) for 3 seconds
		
		
		//get the current url
		String currentUrl = driver.getCurrentUrl();
		
		
		
		if(url.equals(currentUrl))
		{
			System.out.println("URL's are the same!");
		}
		else
		{
			System.out.println("URL's are different!");
		}
		
		
		
		//get the webpage title
		String title = driver.getTitle();
		System.out.println("Title is: " + title);
		
		
		
		driver.quit();

	}
	

}