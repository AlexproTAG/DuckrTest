package ui.android;

import io.appium.java_client.AppiumDriver;
import ui.AutorizationPageObject;

public class AndroidAutorizationPageObject extends AutorizationPageObject {
    public AndroidAutorizationPageObject(AppiumDriver driver) {
        super(driver);
    }

    static
    {

                EMAIL_LINE = "id:com.duckr.skymedia.duckr_android:id/et_email" ;
                PASSWORD_LINE = "id:com.duckr.skymedia.duckr_android:id/et_pass";
                SIGN_IN = "id:com.duckr.skymedia.duckr_android:id/btn_sign_in";
                SING_UP = "id:com.duckr.skymedia.duckr_android:id/tv_sign_up";

    }


}
