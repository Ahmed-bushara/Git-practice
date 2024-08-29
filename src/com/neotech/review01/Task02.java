package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#userName"))
		.sendKeys("ahmed abdelmonem");
				driver.findElement(By.cssSelector("input#userEmail"))
				.sendKeys("aab@gmail.com");
				driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"))
				.sendKeys("SA,riyadh");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]"))
				.sendKeys("SA,riyadh");
				driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		Thread.sleep(3000);
		
       driver.quit();
	}

}
