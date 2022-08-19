package appiumTests.tests;

import appiumTests.screenFlows.PreferenceScreenFlows;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PreferenceScreenTests extends InitializeMobileSession{
    @Test
    public void validateIamAbleToWorkWithChkbox() throws InterruptedException {
        PreferenceScreenFlows preferenceScreenFlows = new PreferenceScreenFlows(driver);
        preferenceScreenFlows.validateAbilityToClickOnPreferenceChkbox();
    }
}
