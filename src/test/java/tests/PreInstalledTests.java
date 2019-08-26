package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class PreInstalledTests {
	
public static void testBundleID() throws MalformedURLException {
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.4");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");
		caps.setCapability(MobileCapabilityType.UDID, "5E678B99-DD7A-4CB6-B011-852F2B1DFC85");
		caps.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.apple.reminders");
		
		AppiumDriver<MobileElement> appium = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		
		appium.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	}

}
