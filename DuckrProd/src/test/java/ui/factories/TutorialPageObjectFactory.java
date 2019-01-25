package ui.factories;

import io.appium.java_client.AppiumDriver;
import startTestSetting.Platform;
import ui.TutorialPageObject;
import ui.android.AndroidTutorialPageObject;
import ui.ios.IOSTutorialPageObject;

public class TutorialPageObjectFactory {

    public static TutorialPageObject get (AppiumDriver driver)
    {
        if(Platform.getInstance().isAndroid()){
            return  new AndroidTutorialPageObject(driver);

        }else {
            return  new IOSTutorialPageObject(driver);
        }
    }

}
