package Com.cjc.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.cjc.pagelogin.Pages;

public class Testcase {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\T440\\Desktop\\Testing\\Chrome exe\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	}
	
	@BeforeTest
	public void openurl()
	{
		driver.get("http://demo.guru99.com/test/newtours/login.php");
	}
	
	@BeforeClass
	public void maximizebrowser()
	{
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginverify()
	{
		Pages pg = new Pages(driver);
		
		pg.login();
	}

}
