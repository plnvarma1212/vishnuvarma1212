package com.browserLaunchers;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class BaseTest 
{
	
	public static String projectPath = System.getProperty("user.dir");
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties p;
	public static Properties parentProp;
	public static Properties childProp;
	
	public static void init() throws Exception
	{
		 fis = new FileInputStream(projectPath + "//data.properties" );
		 p = new Properties();
		 p.load(fis);
		 
		fis = new FileInputStream(projectPath + "//environment.properties");
		parentProp = new Properties();
		parentProp.load(fis);
		String e = parentProp.getProperty("env");
		System.out.println(e);
		
		fis = new FileInputStream(projectPath + "//"+ e + ".properties");
		childProp = new Properties();
		childProp.load(fis);
		System.out.println(childProp.getProperty("amazonurl"));
	}
	
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", projectPath +"//drivers//chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\admin\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
			option.addArguments("--disable-notifications");
			
			driver = new ChromeDriver(option);
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", projectPath +"//drivers//geckodriver.exe");
			ProfilesIni p = new ProfilesIni();
			FirefoxProfile profile = p.getProfile("AuFF");
			profile.setPreference("dom.webnotifications.enabled", false);
			
			FirefoxOptions option = new FirefoxOptions();
			option.setProfile(profile);
			
			driver = new FirefoxDriver(option);
		}
	}
	
	
	public static void navigateUrl(String url)
	{
		//driver.get(childProp.getProperty(url));
		driver.navigate().to(childProp.getProperty(url));
	}
	
	public static void elementClick(String locator) 
	{
		driver.findElement(By.xpath(locator)).click();
	}

	public static void type(String locator, String text) 
	{
		driver.findElement(By.name(locator)).sendKeys(text);
	}

	public static void selectItem(String locator, String option)
	{
		driver.findElement(By.id(locator)).sendKeys(option);
	}


}
