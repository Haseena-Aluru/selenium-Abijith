package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
	public homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(linkText="Log out")
	private WebElement logoutLink;
	
	@FindBy(partialLinkText= "Books")
	private WebElement bookLink;

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public void setLogoutLink(WebElement logoutLink) {
		this.logoutLink = logoutLink;
	}

	public WebElement getBookLink() {
		return bookLink;
	}
	


}
