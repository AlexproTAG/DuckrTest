package tests;

import org.junit.Test;
import startTestSetting.CoreTestCase;
import ui.AutorizationPageObject;
import ui.RegistrationPageObject;
import ui.TutorialPageObject;
import ui.factories.AutorizationPageObjectFactory;
import ui.factories.RegistrationPageObjectFactory;
import ui.factories.TutorialPageObjectFactory;

public class RegistrationTest extends CoreTestCase {

    @Test
    public void testInputEmailAndPass() throws InterruptedException {

        TutorialPageObject TutorialPageObject = TutorialPageObjectFactory.get(driver);
        AutorizationPageObject AutorizationPageObject = AutorizationPageObjectFactory.get(driver);
        RegistrationPageObject RegistrationPageObject = RegistrationPageObjectFactory.get(driver);

          fastRegistration();
          Thread.sleep(10000);
    }


}
