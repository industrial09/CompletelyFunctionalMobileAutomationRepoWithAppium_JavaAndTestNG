package appiumTests.tests;

import framework.base.InitializeDriver;
import framework.base.Utilities;
import framework.config.ConfigReader;
import framework.config.Settings;
import framework.utilities.ExcelUtility;
import framework.utilities.LogUtility;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class InitializeMobileSession extends InitializeDriver {
    ExcelUtility excelUtility;
    LogUtility logUtility;
    AppiumDriver driver;

    @BeforeMethod
    public void setup() throws Exception {
        ConfigReader.ReadProperty();
        excelUtility = new ExcelUtility();
        logUtility = new LogUtility();
        logUtility.createLogFile();
        logUtility.write("Initializing Mobile Driver");
        //set the device type: native andorid, web android, native ios, web ios
        //in which one driver actions will be executed
        //device type must be set in src > main > java > framework > config > GlobalConfig.properties
        driver = createDriverSession(Settings.MobileType);
        if(Settings.MobileType.equals("WebAndroid") || Settings.MobileType.equals("WebIOS")) driver.get("https://www.tesla.com/");
        excelUtility = Utilities.getExcelData();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
