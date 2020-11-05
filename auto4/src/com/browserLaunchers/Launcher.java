package com.browserLaunchers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launcher 
{

	public static void main(String[] args) 
	{
		String projectPath = System.getProperty("user.dir");
		WebDriver driver;
		
		
		//System.setProperty("webdriver.chrome.driver", "D:\\AugustDrivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", projectPath +"//drivers//chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		
		//System.setProperty("webdriver.gecko.driver", "D:\\AugustDrivers\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", projectPath +"//drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		
		//webdriver.edge.driver
		//webdriver.ie.driver

	}

}
