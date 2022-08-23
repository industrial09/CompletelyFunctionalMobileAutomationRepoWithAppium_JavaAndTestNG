package framework.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class InitializeDriver {
    public AppiumDriver createDriverSession(String platformName) throws Exception {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("newCommandTimeOut", 300);
        String platform=null;

        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        switch (platformName) {
            case "NativeAndroid":
                if(platformName.contains("Android")) platform = "Android";
                dc.setCapability(MobileCapabilityType.PLATFORM_NAME, platform);
                dc.setCapability(MobileCapabilityType.DEVICE_NAME, "PIXELAPI30");
                dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                String androidappPath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                        + File.separator + "resources" + File.separator + "ApiDemos-debug.apk";
                dc.setCapability(MobileCapabilityType.APP, androidappPath);
                return new AndroidDriver(url, dc);
            case "NativeIOS":
                if(platformName.contains("IOS")) platformName = "IOS";
                dc.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
                dc.setCapability(MobileCapabilityType.DEVICE_NAME, "IPhone 11");
                dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                String iOSappPath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                        + File.separator + "resources" + File.separator + "ApiDemos-debug.ipa";
                dc.setCapability(MobileCapabilityType.APP, iOSappPath);
                dc.setCapability("simulatorStartupTimeout", 18000);
                return new IOSDriver(url, dc);
            case "WebAndroid":
                if(platformName.contains("Android")) platformName = "Android";
                dc.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
                dc.setCapability(MobileCapabilityType.DEVICE_NAME, "PIXEL 2 API 30");
                dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
                dc.setCapability("chromedriverExecutable", "C:\\Users\\Christian Bautista\\Downloads\\chromedriver_win32 (10)\\chromedriver.exe");
                return new AndroidDriver(url, dc);
            case "WebIOS":
                if(platformName.contains("IOS")) platformName = "IOS";
                dc.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
                dc.setCapability(MobileCapabilityType.DEVICE_NAME, "IPhone 11");
                dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                //Add browserDriver to automate web pages using IOS System
                return new IOSDriver(url, dc);
            default:
                throw new Exception("No valid platform");
        }
    }
}
