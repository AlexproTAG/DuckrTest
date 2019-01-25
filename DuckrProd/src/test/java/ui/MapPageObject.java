package ui;

import io.appium.java_client.AppiumDriver;
import startTestSetting.MainPageObject;

abstract  public class MapPageObject  extends MainPageObject {
    public MapPageObject(AppiumDriver driver) {
        super(driver);
    }

    protected static String
    LEFT_PANEL,
    SETTING_BUTTON;
}
