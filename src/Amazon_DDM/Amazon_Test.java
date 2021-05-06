package Amazon_DDM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Test 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium\\chromedriver_win32new\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		FileInputStream file = new FileInputStream("E:\\Software Testing\\Selenium\\Frameworks\\Excel data\\Amazon.xlsx");
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		Amazon_Homepage home = new Amazon_Homepage(driver);
		home.clicksignIn();
		
		Amazon_signIn_UseridPage login = new Amazon_signIn_UseridPage(driver);
		login.setUserId(sheet.getRow(0).getCell(1).getStringCellValue());
		login.clickContinueBtn();
		
		Amazon_signIn_PasswordPage pass = new Amazon_signIn_PasswordPage(driver);
		pass.setPassword(sheet.getRow(1).getCell(1).getStringCellValue());
		pass.clickSigninBtn();
		
		Amazon_MainPage main = new Amazon_MainPage(driver);
		main.clickAllBtn();
		
		Amazon_Trending trend = new Amazon_Trending(driver);
		Thread.sleep(2000);
		trend.verifyUsername(sheet.getRow(2).getCell(1).getStringCellValue());
		trend.clickMobileAndComputeeer();
		
		Main_Menu_Page all = new Main_Menu_Page(driver);
		all.clickAllMobile();
		main.clickAllBtn();
		Thread.sleep(2000);
		trend.clickSignoutBtn();
		
		
	}
}
