package ui.ios;

import io.appium.java_client.AppiumDriver;
import ui.TutorialPageObject;

public class IOSTutorialPageObject extends TutorialPageObject {
    static
    {

        BUTTON_SKIP_TUTORIAL = "";
        OPEN_TITLE_PAGE_ONE = "";
        OPEN_TITLE_PAGE_TWO = "";
        OPEN_TITLE_PAGE_THREE = "";
        OPEN_TITLE_PAGE_FOUR = "";
        TUTORIAL_TITLE_TEXT ="";
        TUTORIAL_DESCRIPTION_TEXT ="";

    }

    public IOSTutorialPageObject(AppiumDriver driver) {
        super(driver);
    }
}
