package ui.factories;

import io.appium.java_client.AppiumDriver;
import startTestSetting.Platform;
import ui.AutorizationPageObject;
import ui.RegistrationPageObject;
import ui.android.AndroidAutorizationPageObject;
import ui.android.AndroidRegistrationPageObjekt;
import ui.ios.IOSAutorizationPageObject;
import ui.ios.IOSRegistrationPajeObject;

public class RegistrationPageObjectFactory {

    public static RegistrationPageObject get (AppiumDriver driver)
    {
        if(Platform.getInstance().isAndroid()){
            return  new AndroidRegistrationPageObjekt(driver);

        }else {
            return  new IOSRegistrationPajeObject(driver);
        }
    }
}
