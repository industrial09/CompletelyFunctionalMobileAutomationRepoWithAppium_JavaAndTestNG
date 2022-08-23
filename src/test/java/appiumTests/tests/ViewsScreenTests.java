package appiumTests.tests;

import appiumTests.screenFlows.screenNativeFlows.ViewsScreenFlows;
import org.testng.annotations.Test;

public class ViewsScreenTests extends InitializeMobileSession {
    ViewsScreenFlows viewsScreenFlows;

    @Test
    public void validateAbilityToEnterDataIntoTextFieldsField(){
        viewsScreenFlows = new ViewsScreenFlows(driver);
        viewsScreenFlows.validateAbilityToEnterDataIntoTextFields();
    }

    @Test
    public void validateAbilityToEnterDataIntoScrenTopField(){
        viewsScreenFlows = new ViewsScreenFlows(driver);
        viewsScreenFlows.validateAbilityToEnterDataIntoScreenTopField();
    }
}
