package tests;

import org.junit.Test;
import startTestSetting.CoreTestCase;
import ui.AutorizationPageObject;
import ui.RegistrationPageObject;
import ui.SubscriptionPageObject;
import ui.TutorialPageObject;
import ui.factories.AutorizationPageObjectFactory;
import ui.factories.RegistrationPageObjectFactory;
import ui.factories.SubscriptionPageObjectFactory;
import ui.factories.TutorialPageObjectFactory;

public class SubscriptionBaseTest extends CoreTestCase {


    @Test
    public void testBuySubscriptionBaseYear(){
        TutorialPageObject TutorialPageObject = TutorialPageObjectFactory.get(driver);
        AutorizationPageObject AutorizationPageObject = AutorizationPageObjectFactory.get(driver);
        RegistrationPageObject RegistrationPageObject = RegistrationPageObjectFactory.get(driver);
        SubscriptionPageObject SubscriptionPageObject = SubscriptionPageObjectFactory.get(driver);

        fastRegistration();
        SubscriptionPageObject.buyYearBaseSubscription();
        SubscriptionPageObject.tapToSkipButton();
    }
}
