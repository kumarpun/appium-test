package appium.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppTest {
	
	@Test
	public static void testBundleID() throws MalformedURLException, InterruptedException {
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");

		  caps.setCapability("platformName", "iOS");
		  caps.setCapability("deviceName", "iPhone 8");
		  caps.setCapability("platformVersion", "12.4");
		  caps.setCapability("udid", "5E678B99-DD7A-4CB6-B011-852F2B1DFC85");
		  caps.setCapability("bundleId", "com.apple.mobileslideshow");
//		caps.setCapability("paltformName", "ANDROID");
//		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
//		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "");
//		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "pixel");
//		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
//		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
	//	caps.setCapability(MobileCapabilityType.APP, "");
	//  appium.findElement(By.AccessibilityId.id("Clear text")).click();
		
		  
		AppiumDriver<MobileElement> appium = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		
		appium.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		//click for you tab
		MobileElement FOR_YOU = appium.findElement(ByAccessibilityId.id("For You"));
		FOR_YOU.click();
        Thread.sleep(5000);

		MobileElement PHOTOS = appium.findElement(ByAccessibilityId.id("Photos"));
		PHOTOS.click();
        Thread.sleep(5000);

		MobileElement ALBUMS = appium.findElement(ByAccessibilityId.id("Albums"));
		ALBUMS.click();
		
		MobileElement SEE_ALL = appium.findElement(ByAccessibilityId.id("See All"));
		SEE_ALL.click();
		
		//  WebDriverWait wait = new WebDriverWait(appium, 60);
		//  wait.until(ExpectedConditions.elementToBeClickable(ByAccessibilityId.id("Allow"))).click();

	}
 
}
