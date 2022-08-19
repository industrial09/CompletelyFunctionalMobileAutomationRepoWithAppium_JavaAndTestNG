package appiumTests.tests;

import framework.base.Drivercontext;
import framework.base.InitializeDriver;
import framework.base.Utilities;
import framework.config.ConfigReader;
import framework.config.Settings;
import framework.utilities.ExcelUtility;
import framework.utilities.LogUtility;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class InitializeMobileSession extends InitializeDriver {
    ExcelUtility excelUtility;
    LogUtility logUtility;
    AppiumDriver driver;

    @BeforeTest
    public void setup() throws Exception {
        ConfigReader.ReadProperty();
        excelUtility = new ExcelUtility();
        logUtility = new LogUtility();
        logUtility.createLogFile();
        logUtility.write("Initializing Mobile Driver");
        driver = createDriverSession("Android");
        excelUtility = Utilities.getExcelData();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
