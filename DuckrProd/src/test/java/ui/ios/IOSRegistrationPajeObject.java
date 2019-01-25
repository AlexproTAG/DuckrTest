package ui.ios;

import io.appium.java_client.AppiumDriver;
import ui.RegistrationPageObject;

public class IOSRegistrationPajeObject extends RegistrationPageObject {
    public IOSRegistrationPajeObject(AppiumDriver driver) { super(driver); }

    static {
    EMAIL_LINE = "";
    PASSWORD_LINE ="";
    RE_TYPE_PASSWORD_LINE= "";
    USER_NAME_LINE= "";
    CHOOSE_STATE= "";
    }
}
