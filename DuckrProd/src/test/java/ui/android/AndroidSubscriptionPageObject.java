package ui.android;

import io.appium.java_client.AppiumDriver;
import ui.SubscriptionPageObject;

public class AndroidSubscriptionPageObject extends SubscriptionPageObject {
    public AndroidSubscriptionPageObject(AppiumDriver driver) {
        super(driver);
    }
    static {
                BACK_BUTTON = "xpath://android.widget.ImageButton[@content-desc='Navigate up']";
                START_BASE_YEAR_BUTTON = "id:com.duckr.skymedia.duckr_android:id/base_trial_year";
                START_BASE_MONTH_BUTTON = "id:com.duckr.skymedia.duckr_android:id/base_trial_month";
                START_PROF_YEAR_BUTTON = "id:com.duckr.skymedia.duckr_android:id/prof_trial_year";
                START_PROF_MONTH_BUTTON = "id:com.duckr.skymedia.duckr_android:id/prof_trial_month";
                SUBSCRIBE_BUTTON = "xpath://android.widget.Button[@content-desc='Subscribe']";
    }

}
