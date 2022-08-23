package appiumTests.screenFlows.screenWebViewFlows;

import appiumTests.screens.webViewScreens.*;
import io.appium.java_client.AppiumDriver;

public class WebViewFlows {
    private LandingPage landingPage;
    private MenuWindow menuWindow;
    private ModelXScreen modelXScreen;
    private CartPage cartPage;
    private CartFinalPricesPage cartFinalPricesPage;
    private PaymentSection paymentSection;

    public WebViewFlows(AppiumDriver driver){
        landingPage = new LandingPage(driver);
        menuWindow = new MenuWindow(driver);
        modelXScreen = new ModelXScreen(driver);
        cartPage = new CartPage(driver);
        cartFinalPricesPage = new CartFinalPricesPage(driver);
        paymentSection = new PaymentSection(driver);
    }

    public void validateCompletePurchaseFlow() throws InterruptedException {
        landingPage.clickOnMenuIcon();
        menuWindow.clickOnModelXOption();
        modelXScreen.clickOnOrderNowBtn();
        cartPage.handleLanguagePreferenceOption();
        cartPage.clickOnContinueToPaymentBtn();
        cartFinalPricesPage.clickOnOrderWithCard();
        paymentSection.enterPaymentData("Christian");
    }
}
