package TestLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Lib_HomePage {
	public static WebDriver driver;
	public static By SignOffLink = By.linkText("SIGN-OFF");
	public By triptype1 = By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]");
	public By triptype2 = By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]");
	public By passangerslist = By.name("passCount");
	public By departingfrom = By.name("fromPort");
	public By OnMonth = By.name("fromMonth");
	public By OnDate = By.name("fromDay");
	public By ArrivingIn = By.name("toPort");
	public By ReturningMonth = By.name("toMonth");
	public By ReturningDate = By.name("toDay");

	public Lib_HomePage(WebDriver driver)
	{		
		this.driver = driver;
	}
	public void flightdetails(int passangers, String strdepart, String str1month, int int1date, String strarrive, String str2month, int int2date ) throws InterruptedException
	{
		Select passangerscount = new Select(driver.findElement(passangerslist));
		passangerscount.selectByIndex(0);
		Select departcount = new Select(driver.findElement(departingfrom));
		departcount.selectByVisibleText(strdepart);
		Select onmonthcount = new Select(driver.findElement(OnMonth));
		onmonthcount.selectByVisibleText(str1month);
		Select ondatecount = new Select(driver.findElement(OnDate));
		ondatecount.selectByIndex(int1date);
		Select arrivingcount = new Select(driver.findElement(ArrivingIn));
		arrivingcount.selectByVisibleText(strarrive);
		Select returnmonthcount = new Select(driver.findElement(OnMonth));
		returnmonthcount.selectByVisibleText(str2month);
		Select returndatecount = new Select(driver.findElement(OnDate));
		returndatecount.selectByIndex(int2date);
		Thread.sleep(10000);
		
	}
	public static void Logoff()
	{
		driver.findElement(SignOffLink).click();
	}
	
}
