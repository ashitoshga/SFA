package TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import TestLibrary.Lib_HomePage;
import TestLibrary.Lib_LoginPage;

public class Main_Test {
	private WebDriver driver;
	private Lib_HomePage objHomePage;
	private Lib_LoginPage objLoginPage;

	
	
	
  @Test
  public void POM_Test() throws InterruptedException {
	//----- Navigate To Application ---------
	  objLoginPage.NavigateToApplication("http://newtours.demoaut.com/");
	  
	  //--- Login to Application -----
	  objLoginPage.logintest("admin", "mercury");
	  
	//--- Entering Flight Details to Application -----
	  objHomePage.flightdetails(1, "Zurich", "May", 9, "New York", "May", 9);
	  
	//--- Login to Application -----
	  //objHomePage.logoff
	  
  }
  @BeforeTest
  public void beforeClass() {
	  driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objHomePage = new Lib_HomePage(driver);
		objLoginPage = new Lib_LoginPage(driver);	  
  }

  @AfterTest
  public void afterClass() {
	  driver.close();
  }

}
