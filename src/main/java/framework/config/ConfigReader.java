package framework.config;

import framework.base.MobileType;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    public static void ReadProperty(){
        Properties prop = new Properties();
        try {
            String path = "C:\\Users\\Christian Bautista\\IdeaProjects\\CompletelyFunctionalAppiumWithJavaRepo\\src\\main\\java\\framework\\config\\GlobalConfig.properties";
            InputStream file = new FileInputStream(path);
            prop.load(file);
            Settings.ExcelFileLocation = prop.getProperty("ExcelFileLocation");
            Settings.LogFileLocation = prop.getProperty("LogFileLocation");
            Settings.mobileType = MobileType.valueOf((String) prop.get("MobileType"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
