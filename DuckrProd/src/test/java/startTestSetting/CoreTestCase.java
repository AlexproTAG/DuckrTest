package startTestSetting;

import io.appium.java_client.AppiumDriver;

import junit.framework.TestCase;
import ui.AutorizationPageObject;
import ui.RegistrationPageObject;
import ui.TutorialPageObject;
import ui.factories.AutorizationPageObjectFactory;
import ui.factories.RegistrationPageObjectFactory;
import ui.factories.TutorialPageObjectFactory;


public class CoreTestCase extends TestCase {


    protected static AppiumDriver driver ;




     @Override
    protected void setUp() throws Exception
    {
        super.setUp();
        driver = Platform.getInstance(). getDriver();






    }
     @Override
    protected void tearDown() throws Exception
    {


        driver.quit();
        super.tearDown();
    }
    protected  void backgroundApp(int seconds){driver.runAppInBackground(seconds);}
    public void hideKeyboard(){
        driver.hideKeyboard();
    }
    public void fastRegistration(){
        TutorialPageObject TutorialPageObject = TutorialPageObjectFactory.get(driver);
        AutorizationPageObject AutorizationPageObject = AutorizationPageObjectFactory.get(driver);
        RegistrationPageObject RegistrationPageObject = RegistrationPageObjectFactory.get(driver);

        TutorialPageObject.skipTutorial();
        AutorizationPageObject.clickToCreateNewUser();
        String email = RegistrationPageObject.generateRandomWord(5) + "@gmail.com" ;
        String password = RegistrationPageObject.generateRandomWord(7);
        String name = RegistrationPageObject.generateRandomWord(6);
        RegistrationPageObject.inputEmail(email);
        RegistrationPageObject.inputPassword(password);
        RegistrationPageObject.inputRePassword(password);
        driver.hideKeyboard();
        RegistrationPageObject.inputName(name);
        driver.hideKeyboard();
        RegistrationPageObject.setChooseState("Alabama");
        RegistrationPageObject.pressedButtonSignUp();

    }







}
