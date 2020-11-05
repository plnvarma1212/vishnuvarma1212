package screenshots;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.browserLaunchers.BaseTest;

public class Screenshot4 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", projectPath +"//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		Date dt = new Date();
		System.out.println(dt);
		String d = dt.toString().replace(':', '_').replace(' ','_');
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile, new File("C:\\Users\\DELL\\Desktop\\"+ d + ".png"));

	}

}
