package testScript;

import java.util.concurrent.TimeUnit;

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
	
	//Komal..
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
	
	//samiksha
	@Test(dependsOnMethods= {"SelectNoOfDaysFromDateRange"})
	public void selectPeriod()
	{
		dr.findElement(By.xpath("//input[@id='listbox-a03b0069-bca4-48ba-849c-48a15316ea02']")).click();
		dr.findElement(By.xpath("//span[text()='weeks']")).click();
	}
	
	//samiksha
	@Test(dependsOnMethods= {"selectPeriod"})
	public void fetchResults()
	{
		dr.findElement(By.xpath("//button[@class='ButtonBase__ButtonOuter-sc-1bpio6j-0 fhghIn ButtonBase-sc-1bpio6j-1 itHerX IconButton-n9jti8-1 sc-iIEYCM kZtxfb jJFvHt']")).click();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	

}
