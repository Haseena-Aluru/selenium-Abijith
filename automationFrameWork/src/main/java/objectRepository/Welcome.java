package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome {
	
	WebDriver driver;
	//Initialization
	public Welcome(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	//declaration
	@FindBy(linkText="Register")
	private WebElement registerlink;
	
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getRegisterlink() {
		return registerlink;
	}
	
	@FindBy(linkText ="Log in")
	private WebElement loginlink;
	
	
	@FindBy(xpath ="//span[text()='Shopping cart']")
	private WebElement shoppingCardLink;
	public WebElement getLoginlink() {
		return loginlink;
	}
	public WebElement getShoppingCardLink() {
		return shoppingCardLink;
	}

	
	
	
	

}
