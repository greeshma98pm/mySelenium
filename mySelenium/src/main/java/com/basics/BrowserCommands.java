package com.basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserCommands {

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/"); //open url
		
		String actualurl=driver.getCurrentUrl();    //Get a string representing the current URL
		System.out.println(actualurl);
		
		String actualTitle=driver.getTitle();      //The title of the current page.
		System.out.println(actualTitle);
		
		String actualpagesource=driver.getPageSource(); //Get the source/html code of the last loaded page
		//System.out.println(actualpagesource);
	
		driver.close(); //Close the current window, quitting the browser if it's the last window currently open.
		driver.quit();  //Quits this driver, closing every associated window.
		
		
	}

}
