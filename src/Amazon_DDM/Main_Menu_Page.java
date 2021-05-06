package Amazon_DDM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main_Menu_Page 
{
	@FindBy(xpath = "//a[text()='All Mobile Phones']") private WebElement AllMobile;
	
	public Main_Menu_Page(WebDriver driver)
	{	
		PageFactory.initElements(driver, this);
	}
	
	public void clickAllMobile()
	{
		AllMobile.click();
	}
}
