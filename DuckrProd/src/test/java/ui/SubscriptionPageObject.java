package ui;

import io.appium.java_client.AppiumDriver;
import startTestSetting.MainPageObject;

abstract public class SubscriptionPageObject extends MainPageObject {

    public SubscriptionPageObject(AppiumDriver driver) {
        super(driver);
    }

    protected static String
     BACK_BUTTON ,
     START_BASE_YEAR_BUTTON,
     START_BASE_MONTH_BUTTON,
     START_PROF_YEAR_BUTTON,
     START_PROF_MONTH_BUTTON,
     SUBSCRIBE_BUTTON;


    public void tapToSkipButton(){
        waitForElementEndClick(BACK_BUTTON ,
                "Not find back button on screen" ,
                5
        );
    }
    public  void buyYearBaseSubscription(){
        waitForElementEndClick(START_BASE_YEAR_BUTTON ,
                "Not find button base year subscription" ,
                20
        );
        waitForElementEndClick(SUBSCRIBE_BUTTON ,
                "Not find element subscribe button " ,
                15
        );
    }

}
