package com.test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

	public static void main(String[] args) {
	
		
		 /* System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize(); 
		 // driver.deleteAllCookies();
		 driver.get("https:google.com");
		 driver.close(); 
		 driver.quit();*/
		 
	
	/*System.setProperty("webdriver.gecko.driver","C:\\browsers\\geckodriver.exe" );
	WebDriver driver1 = new FirefoxDriver();
	driver1.manage().window().maximize();
	driver1.get("https://google.com");*/
	
	
	System.setProperty("webdriver.edge.driver","C:\\browsers\\msedgedriver.exe" );
	WebDriver driver2 = new  EdgeDriver();
	driver2.manage().window().maximize();
	driver2.get("https://www.google.com/gmail/about/");

	WebElement supp = driver2.findElement(By.id("main_navbar"));
	
	//supp.sendKeys("abc");
	WebElement textbox =driver2.findElement(By.name("firstName"));
	
	textbox.sendKeys("abc");
	
	
	
	//driver2.findElement(By.xpath( "//*[@id=\"main_navbar\"]/ul/li[6]/a/span"));
	
	}
	
}
