package Amazon_DDM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_MainPage 
{
	@FindBy(xpath="//i[@class='hm-icon nav-sprite']") private WebElement AllBtn;
	
	public Amazon_MainPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickAllBtn()
	{
		AllBtn.click();
	}

}
