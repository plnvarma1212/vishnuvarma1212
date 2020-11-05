package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class amazon {

	public static void main(String[] args) 
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");

		
		for(int i=0;i<6;i++)
		{
			((RemoteWebDriver)driver).executeScript("window.scrollBy(0,400)");

	}
//driver.findElement(By.xpath("//a[contains(text(),'About Us')]")).click();
//driver.navigate().back();
	}
}
