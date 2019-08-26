package iosdemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;

public class FirstTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		firstTest();
	}
	public static void firstTest() throws MalformedURLException {
		
		  DesiredCapabilities caps = new DesiredCapabilities();
		
		  caps.setCapability("platformName", "iOS");
		  caps.setCapability("deviceName", "iPhone 8");
		  caps.setCapability("platformVersion", "12.4");
		 // caps.setCapability(CapabilityType.BROWSER_NAME, "safari");
		  caps.setCapability("app", "/Users/sevadevelopment/Library/Developer/Xcode/DerivedData/WebDriverAgent-brdadhpuduowllgivnnvuygpwhzy/Build/Products/Debug-iphonesimulator/IntegrationApp.app");
		
		  URL url = new URL("http://127.0.0.1:4723/wd/hub");
		  
		  IOSDriver driver = new IOSDriver(url, caps);

		  System.out.println("Completed Successfully");
	}

}
