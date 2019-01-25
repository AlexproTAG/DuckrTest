package ui.android;

import io.appium.java_client.AppiumDriver;
import ui.TutorialPageObject;

public class AndroidTutorialPageObject extends TutorialPageObject
{
    static
    {

                BUTTON_SKIP_TUTORIAL = "id:com.duckr.skymedia.duckr_android:id/skip_text";
                OPEN_TITLE_PAGE_ONE = "xpath://android.support.v7.app.ActionBar.Tab[1]";
                OPEN_TITLE_PAGE_TWO = "xpath://android.support.v7.app.ActionBar.Tab[2]";
                OPEN_TITLE_PAGE_THREE = "xpath://android.support.v7.app.ActionBar.Tab[3]";
                OPEN_TITLE_PAGE_FOUR = "xpath://android.support.v7.app.ActionBar.Tab[4]";
                TUTORIAL_TITLE_TEXT ="id:com.duckr.skymedia.duckr_android:id/tutorial_title";
                TUTORIAL_DESCRIPTION_TEXT = "id:com.duckr.skymedia.duckr_android:id/tutorial_description";
                GO_TO_THE_APP_BUTTON_OR_SKIP = "id:com.duckr.skymedia.duckr_android:id/skip_text";

    }


    public AndroidTutorialPageObject(AppiumDriver driver) {
        super(driver);
    }



}
