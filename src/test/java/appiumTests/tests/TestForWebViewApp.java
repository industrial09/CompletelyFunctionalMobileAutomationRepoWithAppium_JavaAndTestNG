package appiumTests.tests;

import appiumTests.screenFlows.screenWebViewFlows.WebViewFlows;
import org.testng.annotations.Test;

public class TestForWebViewApp extends InitializeMobileSession {
    //All classes can integrate more test scripts just like in ViewScreenTests class
    //and running every single one from beginning, like LogIn flow

    @Test
    public void validateTeslaLabelIsDisplayed() throws InterruptedException {
        WebViewFlows webViewFlows = new WebViewFlows(driver);
        webViewFlows.validateCompletePurchaseFlow();
        //String teslaLabel = webViewFlows.getTeslaLabel();
        Thread.sleep(3000);
        //Assert.assertTrue(teslaLabel.contains("Tesla"));
    }
}
