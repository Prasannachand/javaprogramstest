package com.test.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Locators1 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\browsers\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize(); 
		  driver.manage().deleteAllCookies();
		  driver.get("http://automationpractice.com/index.php");
		  //by id and name
		  driver.findElement(By.id("search_query_top")).click();
		  driver.findElement(By.id("search_query_top")).sendKeys("T_shirts");
		 driver.findElement(By.name("submit_search")).click();
		  //linktext and partial linktext
		 // driver.findElement(By.linkText("printed Chiffon Dress")).click();
		 // driver.findElement(By.partialLinkText("printed Chiffon Dress")).click();
		  int slider=driver.findElements(By.className("homeslider-container")).size();
		  System.out.println(slider);
		 List<WebElement> link= driver.findElements(By.className("index hide-left-column hide-right-column lang_en"));
		 //--
		 
		 link.get(9);
		 
		 int links=driver.findElements(By.tagName("a")).size();
		 System.out.println("number of links with tagname a: "+links);
		 
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		  
	}

}
