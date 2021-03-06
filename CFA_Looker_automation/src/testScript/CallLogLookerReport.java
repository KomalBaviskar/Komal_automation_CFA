package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
	
	@Test(priority=2)
	public void CFAlogin() throws InterruptedException
	{
		Thread.sleep(3000);
		dr.findElement(By.id("email")).sendKeys("snehal.d@moentek.com");
		
		dr.findElement(By.id("password")).sendKeys("lmc2demo");
		
		dr.findElement(By.id("b1")).click();
		
		
	}
	

}
