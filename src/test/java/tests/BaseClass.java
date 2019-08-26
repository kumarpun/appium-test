package tests;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup() {
		try {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		String platform = "ios";
		
		if(platform.equalsIgnoreCase("android")) {
//		caps.setCapability("paltformName", "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "");
		caps.setCapability(MobileCapabilityType.UDID, "");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
	//	caps.setCapability(MobileCapabilityType.APP, "");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		}
		
		else if(platform.equalsIgnoreCase("ios")) {
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.4");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
			
		}
		
      URL url = new URL("http://127.0.0.1:4723/wd/hub");
      
      
      driver = new AppiumDriver<MobileElement>(url, caps);
      
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//      driver = new AndroidDriver<MobileElement>(url, caps);
//      driver = new IOSDriver<MobileElement>(url, caps);


	} catch(Exception exp) {
		System.out.println("Cause is: "+exp.getCause());
		System.out.println("Message is: "+exp.getMessage());
		exp.printStackTrace();
	}
	}
//	@Test
//	public void sampleTest() {
//		System.out.println("I am in base class");
//	}
//	
	
	@AfterSuite
	public void teardown() {
		driver.close();
		driver.quit();
		
	}

}
