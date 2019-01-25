package ui;

import io.appium.java_client.AppiumDriver;
import startTestSetting.MainPageObject;

abstract public class TutorialPageObject extends MainPageObject {
    public TutorialPageObject(AppiumDriver driver) {
        super(driver);
    }

    protected  static String

            BUTTON_SKIP_TUTORIAL ,
            OPEN_TITLE_PAGE_ONE ,
            OPEN_TITLE_PAGE_TWO ,
            OPEN_TITLE_PAGE_THREE,
            OPEN_TITLE_PAGE_FOUR ,
            TUTORIAL_TITLE_TEXT,
            TUTORIAL_DESCRIPTION_TEXT,
            GO_TO_THE_APP_BUTTON_OR_SKIP ;







//    String title_text_page_one = "Precise Map Points" ;
//
//    String title_text_page_two = "Save your tracks" ;
//
//    String title_text_page_three = "Smart weather report" ;
//
//    String  title_text_page_four = "Share your experiences" ;


//     String description_text_page_one = "Finally, save pins on a map exactly where you want them with precise GPS coordinates.  You can even easily share them with friends" ;
//
//     String description_text_page_two = "Going on a hunt to somewhere new?  Drop breadcrumbs to retrace your steps later - or to find your way back home!" ;
//
//     String description_text_page_three = "Get exact weather information at your favorite hunting spot.  Wind, Radar, Clouds, and more!" ;
//
//     String description_text_page_four = "Not only can you share hunting spots with your closest friends, you can even share how your hunt went with results, photos, and videos!" ;




    public  void skipTutorial(){
        waitForElementEndClick(
                BUTTON_SKIP_TUTORIAL,
                "Cant skip tutorial",
                5);
    }

    public void openPageOneTutorial()

    {
        waitForElementEndClick(
                OPEN_TITLE_PAGE_ONE,
                "Button open page one not found ",
                5
        );

    }
    public void openPageTwoTutorial()

    {
        waitForElementEndClick(
                OPEN_TITLE_PAGE_TWO,
                "Button open page two not found ",
                5
        );

    }
    public void openPageThreeTutorial()

    {
        waitForElementEndClick(
                OPEN_TITLE_PAGE_THREE,
                "Button open page three not found ",
                5
        );

    }
    public void openPageFourTutorial()

    {
        waitForElementEndClick(
                OPEN_TITLE_PAGE_FOUR,
                "Button open page four not found ",
                5
        );

    }

    public void assertTextInTitle(String title_text) {
        assertForElementText(
                TUTORIAL_TITLE_TEXT,
                "not find elemnt Title on screen ",
                5 ,
                title_text ,
                "Not correct text in title"
        );
    }
    public void assertTextInDescription(String description_text) {
        assertForElementText(
                TUTORIAL_DESCRIPTION_TEXT,
                "not find elemnt Title on screen ",
                5 ,
                description_text ,
                "Not correct text in title"
        );
    }












}
