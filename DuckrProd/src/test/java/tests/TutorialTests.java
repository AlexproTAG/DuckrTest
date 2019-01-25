package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import startTestSetting.CoreTestCase;
import startTestSetting.Platform;
import ui.TutorialPageObject;
import ui.android.AndroidTutorialPageObject;
import ui.factories.TutorialPageObjectFactory;
import ui.ios.IOSTutorialPageObject;

public class TutorialTests extends CoreTestCase {
    String title_text_page_one = "Precise Map Points" ;
    String title_text_page_two = "Save your tracks" ;
    String title_text_page_three = "Smart weather report" ;
    String title_text_page_four = "Share your experiences" ;
    String description_text_page_one = "Finally, save pins on a map exactly where you want them with precise GPS coordinates.  You can even easily share them with friends" ;
    String description_text_page_two = "Going on a hunt to somewhere new?  Drop breadcrumbs to retrace your steps later - or to find your way back home!" ;
    String description_text_page_three = "Get exact weather information at your favorite hunting spot.  Wind, Radar, Clouds, and more!" ;
    String description_text_page_four = "Not only can you share hunting spots with your closest friends, you can even share how your hunt went with results, photos, and videos!";
    @Test
    public void testOpenPageTwoTutoral() {




        TutorialPageObject TutorialPageObject = TutorialPageObjectFactory.get(driver);
        TutorialPageObject.openPageOneTutorial();
        TutorialPageObject.assertTextInTitle(title_text_page_one);
        TutorialPageObject.assertTextInDescription(description_text_page_one);
        TutorialPageObject.openPageTwoTutorial();
        TutorialPageObject.assertTextInTitle(title_text_page_two);
        TutorialPageObject.assertTextInDescription(description_text_page_two);
        TutorialPageObject.openPageThreeTutorial();
        TutorialPageObject.assertTextInTitle(title_text_page_three);
        TutorialPageObject.assertTextInDescription(description_text_page_three);
        TutorialPageObject.openPageFourTutorial();
        TutorialPageObject.assertTextInTitle(title_text_page_four);
        TutorialPageObject.assertTextInDescription(description_text_page_four);
        fastRegistration();


    }


}
