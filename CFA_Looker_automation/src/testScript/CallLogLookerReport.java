package testScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		Thread.sleep(4000);
		dr.findElement(By.id("email")).sendKeys("snehal.d@moentek.com");
		
		dr.findElement(By.id("password")).sendKeys("lmc2demo");
		
		dr.findElement(By.id("b1")).click();
		
	}
	

	//Rushabh
	@Test(priority=3)
	public void NavigateToReportsPage() throws InterruptedException {
	
		Thread.sleep(6000);
		dr.findElement(By.xpath("//*[@id='sidebar']/li[2]/a/i")).click();

		}
	
	//Rushabh
	@Test(priority=4)
	public void SelectCallLogsReportFromSelectAReportList() throws InterruptedException{
		//Select Call Logs Report From Select A Report List
		Thread.sleep(4000);
		dr.findElement(By.xpath("//span[@class='select2-arrow']")).click();
		dr.findElement(By.xpath("//input[@id='s2id_autogen1_search']")).click();
		dr.findElement(By.xpath("//input[@id='s2id_autogen1_search']")).sendKeys("call logs");
		dr.findElement(By.xpath("//span[@class='select2-match']")).click();
		
	}
	
	//Rushabh
	//@Test(dependsOnMethods= {"SelectCallLogsReportFromSelectAReportList"})
    /* @Test(priority=5)
	public void ClickOnDateRangeButton() throws InterruptedException{
		//click on date range button
	     Thread.sleep(4000);
	     dr.findElement(By.xpath("//span[text()='is in the last 7 days']")).click();
       
	}*/
	
	//Komal
	@Test(priority=5)
	public void SelectIsintheLastOptionFromDateRange() throws InterruptedException
	{
		// Thread.sleep(4000);
	//ad source	// dr.findElement(By.xpath("//div[@class='sc-ehSCib gWslmI'][4]/div/span")).click();
		// WebDriverWait wait = new WebDriverWait(dr, 40);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='is in the last 7 days']"))).click();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(dr.findElement(By.xpath("//h1[text()='Call Logs - Enhanced']")).getText());
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
//<<<<<<< HEAD
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
	
//=======
//branch 'master' of https://github.com/KomalBaviskar/Komal_automation_CFA.git
//>>>>>>> branch 'master' of https://github.com/KomalBaviskar/Komal_automation_CFA.git


