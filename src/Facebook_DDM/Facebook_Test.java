package Facebook_DDM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook_Test 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\chromedriver_win32new\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		Facebook_Login_Page login = new Facebook_Login_Page(driver);
		login.setUsername();
		login.setPassword();
		login.clickLoginBtn();
		
		FacebookUser_Profile_Page profile = new FacebookUser_Profile_Page(driver);
		profile.clickProfile();
		profile.verifyUSer();
		profile.clickLogoutBtn();
		
	}
}
