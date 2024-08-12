package books;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qsp.genericutility.ExcelUtility;
import com.qsp.objectrepository.homepage;

import genericUtility.Baseclass;

public class TC_DWS_005_Test extends Baseclass {
	
	@Test
	public void clickonBooks()
	{
		hp = new homepage(driver);
		hp.getBooksLink().click();
		excelLib = new ExcelUtility();
		String actualTitle = driver.getTitle();
		String expectedTitle = excelLib.getStringDataFromExcel("Books",1,0);
		Assert.assertEquals(actualTitle,expectedTitle,"Books page is not displayed");
		Reporter.log("Books page is display",true);
		
	}

}
2