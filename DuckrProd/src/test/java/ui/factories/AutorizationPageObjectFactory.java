package ui.factories;

import io.appium.java_client.AppiumDriver;
import startTestSetting.Platform;
import ui.AutorizationPageObject;
import ui.android.AndroidAutorizationPageObject;
import ui.android.AndroidTutorialPageObject;
import ui.ios.IOSAutorizationPageObject;

public class AutorizationPageObjectFactory {

    public static AutorizationPageObject get (AppiumDriver driver)
    {
        if(Platform.getInstance().isAndroid()){
            return  new AndroidAutorizationPageObject(driver);

        }else {
            return  new IOSAutorizationPageObject(driver);
        }
    }
}
