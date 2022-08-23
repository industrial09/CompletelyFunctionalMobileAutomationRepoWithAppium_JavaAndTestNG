package appiumTests.tests;

import appiumTests.screenFlows.screenNativeFlows.PreferenceScreenFlows;
import org.testng.annotations.Test;

public class PreferenceScreenTests extends InitializeMobileSession {
    //All classes can integrate more test scripts and running every single one
    //from beginning like LogIn
    @Test
    public void validateIamAbleToWorkWithChkbox() throws InterruptedException {
        PreferenceScreenFlows preferenceScreenFlows = new PreferenceScreenFlows(driver);
        preferenceScreenFlows.validateAbilityToClickOnPreferenceChkbox();
    }
}
