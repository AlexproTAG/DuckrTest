package ui.factories;

import io.appium.java_client.AppiumDriver;
import startTestSetting.MainPageObject;
import startTestSetting.Platform;
import ui.AutorizationPageObject;
import ui.android.AndroidAutorizationPageObject;
import ui.android.AndroidMapPageObject;
import ui.ios.IOSAutorizationPageObject;
import ui.ios.IOSMapPageObject;

public class MapPageObjectFactory {

    public static MainPageObject get (AppiumDriver driver)
    {
        if(Platform.getInstance().isAndroid()){
            return  new AndroidMapPageObject(driver);

        }else {
            return  new IOSMapPageObject(driver);
        }
    }
}
