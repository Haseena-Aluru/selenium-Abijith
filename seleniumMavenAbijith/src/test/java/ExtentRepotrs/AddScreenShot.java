package ExtentRepotrs;

import java.time.Duration;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AddScreenShot {

	
	@Test
	public void screenShot()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		String Screenshot = ts.getScreenshotAs(OuputType,BASE64);
				 
	    ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_Reports/extentScreenshotReport.html");
	    ExtentReports extReport = new ExtentReports();
		 
		
	}
}
