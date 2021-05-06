package Amazon_DDM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Amazon_signIn_UseridPage 
{
	@FindBy(xpath = "//input[@id='ap_email']") private WebElement UserId;
	@FindBy(xpath = "//input[@id='continue']") private WebElement ContinueBtn;
	
	public Amazon_signIn_UseridPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUserId(String userId)
	{
		UserId.sendKeys(userId);
	}
	
	public void clickContinueBtn()
	{
		ContinueBtn.click();
	}
	
}
