package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import configuration.Configuration;
import functionLibrary.ApplicationLibrary;

public class CallLogLookerReport {
WebDriver dr;
	
	@Test(priority=1)
	public void test1()
	{
		ApplicationLibrary lib= new ApplicationLibrary();
		
		dr=lib.launchBrowser("Chrome");
		dr.get(Configuration.url);
		
	}
	
	//Komal
	@Test(priority=2)
	public void CFAlogin() throws InterruptedException
	{
		Thread.sleep(3000);
		dr.findElement(By.id("email")).sendKeys("snehal.d@moentek.com");
		
		dr.findElement(By.id("password")).sendKeys("lmc2demo");
		
		dr.findElement(By.id("b1")).click();
		
		
	}
	
	//Komal
	@Test(priority=6)
	public void SelectIsintheLastOptionFromDateRange()
	{
		dr.findElement(By.xpath("//span[text()='is in the last 7 days']")).click();
		dr.findElement(By.xpath("//span[@class='InlineInputText__InlineInputTextBase-sc-1nk1o3l-2 AIRam']")).click();
		dr.findElement(By.xpath("//span[text()='is in the last']")).click();
		
		
	}
	
	//Komal
	@Test(dependsOnMethods={"SelectIsintheLastOptionFromDateRange"})
	public void SelectNoOfDaysFromDateRange()
	{
		WebElement NoOfDays= dr.findElement(By.xpath("//div[@class='InputText-sc-6cvg1f-2 chZDbU sc-jgHCyG dUNqSA']"));
		NoOfDays.clear();
		NoOfDays.sendKeys("10");
	}

}
