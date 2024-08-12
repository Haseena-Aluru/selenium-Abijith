package genericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.qsp.genericutility.ExcelUtility;
import com.qsp.genericutility.FileUtility;
import com.qsp.genericutility.javautility;
import com.qsp.objectrepository.Loginpage;
import com.qsp.objectrepository.Welcomepage;
import com.qsp.objectrepository.homepage;

import objectRepository.Welcome;

public class Baseclass {
	public static WebDriver driver;
	public FileUtility fileLib;
	public ExcelUtility excelLib;
	public Welcome wp;
	public Loginpage lp;
	public homepage hp;
	public javautility javaLib;
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		fileLib = new FileUtility();
		String url = fileLib.getDataProperty("url");
		driver.get(url);
	}
		
		@BeforeMethod
		public void login() throws IOException
		{
			wp = new Welcome(driver);
			wp.getLoginLink().click();
			lp=new Loginpage(driver);
			String email = fileLib.getDataProperty("email");
			
			String password = fileLib.getDataProperty("password");
			lp.getEmailTextField().sendKeys(email);
			lp.getEmailTextField().sendKeys(password);
			lp.getLoginButton().click();
			
			
			
		}	
			@AfterMethod
			public void logout()
			{
				hp=new homepage(driver);
				hp.getLogoutLink().click();
			}
			
			
			@AfterClass
			public void closeBrowser()
			{
				driver.quit();
				
			
			
		}
		
		
		
	}


