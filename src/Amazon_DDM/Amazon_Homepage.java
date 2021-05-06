package Amazon_DDM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Homepage 
{
	@FindBy(xpath="//span[contains(@id,'nav-link-acco')]") private WebElement signIn;
	
	public Amazon_Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clicksignIn()
	{
		signIn.click();
	}
}
