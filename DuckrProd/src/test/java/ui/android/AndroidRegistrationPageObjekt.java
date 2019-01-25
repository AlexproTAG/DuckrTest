package ui.android;

import io.appium.java_client.AppiumDriver;
import ui.RegistrationPageObject;

public class AndroidRegistrationPageObjekt  extends RegistrationPageObject {
    public AndroidRegistrationPageObjekt(AppiumDriver driver) {
        super(driver);
    }

    static

    {
                EMAIL_LINE = "id:com.duckr.skymedia.duckr_android:id/et_email";
                PASSWORD_LINE = "id:com.duckr.skymedia.duckr_android:id/et_pass";
                RE_TYPE_PASSWORD_LINE= "id:com.duckr.skymedia.duckr_android:id/et_retype_pass";
                USER_NAME_LINE="id:com.duckr.skymedia.duckr_android:id/et_name";
                CHOOSE_STATE ="id:com.duckr.skymedia.duckr_android:id/et_state";
                SIGN_UP = "id:com.duckr.skymedia.duckr_android:id/btn_sign_up";
    }
}
