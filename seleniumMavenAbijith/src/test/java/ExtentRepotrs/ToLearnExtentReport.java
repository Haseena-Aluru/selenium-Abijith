package ExtentRepotrs;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReport {
	
	@Test 
	public void createReport()
	{
		
	ExtentSparkReporter spark = new ExtentSparkReporter ("./HTML_Reports/extentreport.html");
	
	
	ExtentReports extreport = new ExtentReports();
	
	
	extreport.attachReporter(spark);
	
	
	ExtentTest test = extreport.createTest("createReport");
	
	test.log(Status.PASS,"Successfully created extent report");
	
	
	extreport.flush();
		
	}

}
