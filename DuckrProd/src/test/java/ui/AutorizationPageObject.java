package ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import startTestSetting.MainPageObject;

abstract  public class AutorizationPageObject extends MainPageObject {

    public AutorizationPageObject(AppiumDriver driver) {
        super(driver);
    }

    protected  static String

      EMAIL_LINE ,
      PASSWORD_LINE,
      SIGN_IN,
      DUCKR_ICON,
      SING_UP;


    public  void inputEmailAndPassword(String email , String pass) {
        waitForElementEndSendKeys(
                EMAIL_LINE,
                email,
                "Not find email line",
                5
        );

        waitForElementEndSendKeys(
                PASSWORD_LINE,
                pass,
                "Not find email line",
                5
        );
    }

    public  void tapToSingInButton(){
        waitForElementEndClick(
                SIGN_IN,
                "Cannot tap to sing in button ",
                5
        );
    }
    public void clickToCreateNewUser(){
        waitForElementEndClick(
                SING_UP,
                "Cannot find Sing up button",
                5
        );

    }
    public  void  tapToIconDuckr(){
        waitForElementEndClick(DUCKR_ICON,"Not find icon duckr",5);
    }
}
