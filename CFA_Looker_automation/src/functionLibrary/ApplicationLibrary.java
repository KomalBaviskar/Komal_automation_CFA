package functionLibrary;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import configuration.Configuration;

public class ApplicationLibrary {
	/*
	 * Author:
	 * Date:
	 * Description:
	 * Param: 
	 */
	public WebDriver launchBrowser(String browserName)
	{
		WebDriver dr=null;
		
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",Configuration.chromeDriverPath);
			dr= new ChromeDriver();
			dr.manage().window().maximize();
		}else if(browserName.equals("firefox")){
			//System.setProperty("webdriver.gecko.driver",Configuration.firefoxDriverPath);
			dr= new FirefoxDriver();
			dr.manage().window().maximize();
		}
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return dr;
	}
	
	/*
	 * Author:
	 * Date:
	 * Description:
	 * Param: 
	 * 
	 */
	public boolean isElementPresent(WebDriver dr, By element)
	{
		List<WebElement> ele=dr.findElements(element);
		
		if(ele.size()>0)
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	/*
	public void captureScreenShot(WebDriver dr, String fileName) throws IOException
	{
		  TakesScreenshot screenshot=(TakesScreenshot)dr; File
		  src=screenshot.getScreenshotAs(OutputType.FILE);
		  String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		  FileHandler.copy(src, new File(Configuration.screenshotPath+fileName+"_"+timeStamp+".png"));
	}*/
}
