package Facebook_DDM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_Login_Page 
{
	@FindBy(xpath="//input[@id='email']") private WebElement Username;
	@FindBy(xpath="//input[@id='pass']") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']") private WebElement LoginBtn;
	@FindBy(xpath="//a[text()='Forgotten password?']") private WebElement Forgotpass;
	@FindBy(xpath="//a[@id='u_0_2_sk']") private WebElement CreateNewAcBtn;
//////////////////////////////////////////////////////
	
	public Facebook_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//////////////////////////////////////////////////////
	
	public void setUsername()
	{
		Username.sendKeys("yogeshrock96@yahoo.com");
	}
	
	public void setPassword()
	{
		Password.sendKeys("jayshivray");
	}
	
	public void clickLoginBtn()
	{
		LoginBtn.click();
	}
	
	public void clickForgotpass()
	{
		Forgotpass.click();
	}
	
	public void clickNewAcBtn()
	{
		CreateNewAcBtn.click();
	}
	
	
}
