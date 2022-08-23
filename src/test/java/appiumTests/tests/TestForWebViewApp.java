package appiumTests.tests;

import appiumTests.screenFlows.screenWebViewFlows.WebViewFlows;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestForWebViewApp extends InitializeMobileSession{


    @Test
    public void validateTeslaLabelIsDisplayed() throws InterruptedException {
        WebViewFlows webViewFlows = new WebViewFlows(driver);
        webViewFlows.validateCompletePurchaseFlow();
        //String teslaLabel = webViewFlows.getTeslaLabel();
        Thread.sleep(3000);
        //Assert.assertTrue(teslaLabel.contains("Tesla"));
    }
}
