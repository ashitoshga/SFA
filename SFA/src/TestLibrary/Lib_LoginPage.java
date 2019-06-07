package TestLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Lib_LoginPage {
	 WebDriver driver;
	 public By UNtextbox = By.name("userName");
	public By PWtextbox = By.name("password");
	public By Loginbutton = By.name("login");
	
	 public Lib_LoginPage(WebDriver driver) 
	 {
		 this.driver = driver;
	 } 
	 public void NavigateToApplication(String URL)
	 {	driver.get(URL);	 }

	 public void logintest (String UN, String PW)
	{
		driver.findElement(UNtextbox).sendKeys(UN);
		driver.findElement(PWtextbox).sendKeys(PW);
		driver.findElement(Loginbutton).click();
	}

}
