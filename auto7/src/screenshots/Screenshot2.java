package screenshots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.browserLaunchers.BaseTest;

public class Screenshot2 extends  BaseTest
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", projectPath +"//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		List<WebElement> links = driver.findElements(By.linkText("Rajinikanth"));
		if(links.size()==0)
		{
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(srcFile, new File("C:\\Users\\DELL\\Desktop\\google.jpeg"));
		}
			

	}

}
