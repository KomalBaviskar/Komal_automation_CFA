package testing;

import org.openqa.selenium.WebDriver;

import configuration.Configuration;
import functionLibrary.ApplicationLibrary;

public class TestLogic {

public static void main(String[] args) {
		
		//D:\MoenTekRepo\CFAAutomation\BrowserDrivers\Chrome\89\chromedriver.exe
	
		
		
		System.out.println(System.getProperty("user.dir")+"\\Browser\\Chrome\\89\\chromedriver.exe");

		ApplicationLibrary lib= new ApplicationLibrary();
		
		WebDriver dr=lib.launchBrowser("Chrome");
		dr.get(Configuration.url);
		//this is comment by komal..........
	}
}
