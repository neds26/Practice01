package Com.cjc.pagelogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pages {
	
	public WebDriver driver;
	
	
	
	public Pages (WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Username = By.name("userName");
	
	By Password = By.name("password");
	
	By Signin = By.name("submit");
	
	public void login()
	{
		System.out.println("start");
		driver.findElement(Username).sendKeys("AAAAA");
		
		driver.findElement(Password).sendKeys("aaaaa");
		
		driver.findElement(Signin).click();
		
		System.out.println("ends");
		
	}
	
	
	

}
