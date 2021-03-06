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
	
	@Test(priority=3)
	public void NavigateToReportsPage() throws InterruptedException{
		Thread.sleep(3000);
		//click on reports icon
		dr.findElement(By.xpath("//*[@id='sidebar']/li[2]/a/i")).click();
		}
	
	@Test(priority=4)
	public void SelectCallLogsReportFromSelectAReportList() throws InterruptedException{
		//Select Call Logs Report From Select A Report List
		Thread.sleep(3000);
		dr.findElement(By.xpath("//span[@class='select2-arrow']")).click();
		dr.findElement(By.xpath("//input[@id='s2id_autogen1_search']")).click();
		dr.findElement(By.xpath("//input[@id='s2id_autogen1_search']")).sendKeys("call logs");
		dr.findElement(By.xpath("//span[@class='select2-match']")).click();
	}
	
	@Test(priority=5)
	public void ClickOnDateRangeButton() throws InterruptedException{
		//click on date range button
		Thread.sleep(3000);
		dr.findElement(By.xpath("//div[contains(@class,'Hover')]")).click();
		////ul[@id='select2-results-1']
	}
	
	
	

}
