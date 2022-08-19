package appiumTests.screens;

import framework.base.Drivercontext;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class CommonMethods {
    public AppiumDriver driver;
    public TouchAction action;
    public CommonMethods(AppiumDriver driver){
        this.driver = driver;
        action = new TouchAction(driver);
    }


    public void getText(MobileElement el){
        el.getText();
    }

    public void enterText(MobileElement el, String textToEnter){
        el.sendKeys(textToEnter);
    }

    public void clearTextField(MobileElement el){
        el.clear();
    }

    public void tapOnElement(MobileElement el){
        action.tap(ElementOption.element(el)).perform();
    }

    public void tapOnElementWithCoordinates(int exeX, int exeY){
        action.tap(PointOption.point(538, 416)).perform();
    }

    public void pressOnElement(MobileElement el){
        action.press(ElementOption.element(el)).release().perform();
    }

    public void longPressOnElement(MobileElement el){
        action.press(ElementOption.element(el)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4))).release().perform();
    }

    public void swipeNTimes(int timesToSwipe){
        Dimension size = this.driver.manage().window().getSize();
        int startXPoint = size.width/2;
        int startYPoint = startXPoint;
        int endXPoint = (int) (size.height * 0.1);
        int endYPoint = (int) (size.height * 0.975);

        for(int i=0; i<2; i++) {
            action.press(PointOption.point(startYPoint, endYPoint)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))
            ).moveTo(PointOption.point(startXPoint, endXPoint)).release().perform();
        }
    }
}
