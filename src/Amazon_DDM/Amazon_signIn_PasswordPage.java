package Amazon_DDM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_signIn_PasswordPage 
{
	@FindBy(xpath = "//input[@id='ap_password']") private WebElement Password ;
	@FindBy(xpath = "//input[@id='signInSubmit']") private WebElement SigninBtn;
	
	public Amazon_signIn_PasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setPassword(String pass)
	{
		Password.sendKeys(pass);
	}
	
	public void clickSigninBtn()
	{
		SigninBtn.click();
	}
}
