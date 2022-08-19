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

    /*public static void main(String args[]) throws Exception {
        AppiumDriver driver = InitializeDriver.createDriverSession("Android");
    }*/
    public AppiumDriver createDriverSession(String platformName) throws Exception {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
        dc.setCapability("newCommandTimeOut", 300);

        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        switch (platformName) {
            case "Android":
                dc.setCapability(MobileCapabilityType.DEVICE_NAME, "PIXELAPI30");
                dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
                String androidappPath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                        + File.separator + "resources" + File.separator + "ApiDemos-debug.apk";
                dc.setCapability(MobileCapabilityType.APP, androidappPath);
                return new AndroidDriver(url, dc);
            case "IOS":
                dc.setCapability(MobileCapabilityType.DEVICE_NAME, "IPhone 11");
                dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
                String iOSappPath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
                        + File.separator + "resources" + File.separator + "ApiDemos-debug.ipa";
                dc.setCapability(MobileCapabilityType.APP, iOSappPath);
                dc.setCapability("simulatorStartupTimeout", 18000);
                return new IOSDriver(url, dc);
            default:
                throw new Exception("No valid platform");
        }
    }
}
