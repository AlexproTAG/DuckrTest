package ui.factories;

import io.appium.java_client.AppiumDriver;
import startTestSetting.Platform;
import ui.RegistrationPageObject;
import ui.SubscriptionPageObject;
import ui.android.AndroidRegistrationPageObjekt;
import ui.android.AndroidSubscriptionPageObject;
import ui.ios.IOSRegistrationPajeObject;
import ui.ios.IOSSubscriptionPageObject;

public class SubscriptionPageObjectFactory {
    public static SubscriptionPageObject get (AppiumDriver driver)
    {
        if(Platform.getInstance().isAndroid()){
            return  new AndroidSubscriptionPageObject(driver);

        }else {
            return  new IOSSubscriptionPageObject(driver);
        }
    }
}
