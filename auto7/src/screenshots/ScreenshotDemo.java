package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.browserLaunchers.BaseTest;

public class ScreenshotDemo extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", projectPath +"//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile, new File("C:\\Users\\DELL\\Desktop\\amazon.png"));
		
	}

}
