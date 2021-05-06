package Amazon_DDM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Trending 
{
	@FindBy(xpath="//div[@id='hmenu-customer-name']/b") WebElement Username;
	@FindBy(xpath="(//div[@id='hmenu-content']//li)[38]/a") WebElement SignoutBtn;
	//
	@FindBy(xpath="//div[text()='Mobiles, Computers']") WebElement MobileAndComputeeer;
	
	public Amazon_Trending(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyUsername(String name)
	{
		String usrName = Username.getText();
		if(usrName.contains(name))
		{
			System.out.println(usrName +": User verify");
		}
		else
		{
			System.out.println(usrName +": User not verify");
		}
	}
	
	public void clickMobileAndComputeeer()
	{
		MobileAndComputeeer.click();
	}
	
	public void clickSignoutBtn()
	{
		SignoutBtn.click();
	}
	
}
