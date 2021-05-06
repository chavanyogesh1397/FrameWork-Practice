package Facebook_DDM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookUser_Profile_Page 
{
	@FindBy(xpath = "//div[@aria-label='Account']") private WebElement Profile;
	@FindBy(xpath = "(//span[contains(@class,'lrazzd5p oo9gr5id hzawbc8m')])") private WebElement UserName;
	@FindBy(xpath = "//span[text()='Log Out']") private WebElement logout;
	String ExpUsername="Yøgesh Çhavan";
	
	
	public FacebookUser_Profile_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickProfile()
	{
		Profile.click();
	}
	
	public void verifyUSer()
	{
		
		String Actusername = UserName.getText();
		if(Actusername.equals(ExpUsername))
		{
			
			System.out.println(Actusername +": User name Verified");
		}
		else
		{
			System.out.println(Actusername + ": User name not verified");
		}
		
	}
	
	public void clickLogoutBtn()
	{
		logout.click();
	}
	

}
