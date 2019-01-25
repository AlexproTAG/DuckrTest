package startTestSetting;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import startTestSetting.Platform;

import java.util.List;
import java.util.regex.Pattern;

public class MainPageObject  {


        protected AppiumDriver driver ;

        public  MainPageObject(AppiumDriver driver)
        {
            this.driver = driver;
        }

        public WebElement waitForElementPresent(String locator , String error_messenge , long timeOutInSeconds)
        {
            By by = this.getLocatorByString(locator);
            WebDriverWait wait = new WebDriverWait(driver , timeOutInSeconds);
            wait.withMessage(error_messenge +"\n");
            return wait.until(
                    ExpectedConditions.presenceOfElementLocated(by)
            );

        }


        public  WebElement waitForElementPresent(String locator , String error_messenge )
        {
            return  waitForElementPresent(locator, error_messenge , 5);
        }

        public WebElement waitForElementEndClick(String locator , String error_messenge , long timeoutInSeconds )
        {

            WebElement element = waitForElementPresent(locator, error_messenge , timeoutInSeconds) ;
            element.click();
            return  element ;

        }

        public   WebElement waitForElementEndSendKeys(String locator, String value , String error_messenge , long timeoutInSeconds )
        {
            WebElement element = waitForElementPresent(locator, error_messenge , timeoutInSeconds) ;
            element.sendKeys(value);
            return  element ;
        }

        public   boolean waitForElementNotPresent(String locator , String error_messenge , long timeOutInSecond)
        {
            By by = this.getLocatorByString(locator);
            WebDriverWait wait = new WebDriverWait(driver , timeOutInSecond) ;
            wait.withMessage(error_messenge + "\n");
            return wait.until(
                    ExpectedConditions.invisibilityOfElementLocated(by)

            );
        }


        public    WebElement  waitForElementAndClear(String locator , String error_messange , long timeoutInSecond)
        {
            WebElement element = waitForElementPresent(locator, error_messange , timeoutInSecond);
            element.clear();
            return element;
        }

        public  WebElement assertForElementTextAndSendKeys(String locator , String error_messenge , long timeoutInSecond, String assert_text ,String send_text ,String assert_messenge)
        {
            WebElement element = waitForElementPresent(locator, error_messenge , timeoutInSecond) ;
            String text= element.getAttribute("text");

            Assert.assertEquals(
                    assert_messenge,
                    assert_text,
                    text
            );
            element.sendKeys(send_text);
            return element ;

        }

        public   WebElement assertForElementText (String locator , String error_messenge , long timeoutInSecond, String assert_text  ,String assert_messenge )
        {

            String text ;
            WebElement element = waitForElementPresent(locator, error_messenge , timeoutInSecond) ;
            if (Platform.getInstance().isAndroid()){
                text= element.getAttribute("text")
                        .replaceAll("\n"," " )
                        .replaceAll("  "," ")
                        .replaceAll("   "," ")
                        .replaceAll("    "," ")
                        .replaceAll("     "," ");


            }else {
                text= element.getAttribute("name")
                        .replaceAll("\n"," " )
                        .replaceAll("  "," ")
                        .replaceAll("   "," ")
                        .replaceAll("    "," ")
                        .replaceAll("     "," ");
            }
            Assert.assertEquals(
                    assert_messenge,
                    assert_text,
                    text
            );
            return  element ;
        }


        public   int getCountOfElement(String locator)
        {
            By by = this.getLocatorByString(locator);
//        waitForElementPresent(
//                by,
//                error_messenge,
//                timeoutInSecond
//
//        ) ;
            List countElement = driver.findElements(by);

            return countElement.size();
        }

        public    void swipeUp(int timeOfSwipe)
        {
            TouchAction action =  new TouchAction(driver);
            Dimension size = driver.manage().window().getSize();
            int x = (int)(size.width / 2);
            int start_y = (int)(size.height * 0.8);
            int end_y = (int)(size.height*0.2);
            action
                    .press(x,start_y)
                    .waitAction(timeOfSwipe)
                    .moveTo(x,end_y)
                    .release()
                    .perform();
        }

        public    void swipeUpQuick()
        {
            swipeUp(200);

        }

        public   void swipeUpToFindElement(String locator , String error_messenge,int max_swipes)
        {
            By by = this.getLocatorByString(locator);
            int already_swipe = 0;
            waitForElementPresent(locator,"Not find elevent to swipe",5);
            driver.findElements(by);
            driver.findElements(by).size();
            while (driver.findElements(by).size()==0)
            {
                if(already_swipe > max_swipes){
                    waitForElementPresent(locator,"cannot find element by swype"+error_messenge ,0);
                    return;
                }
                swipeUpQuick();
                ++already_swipe;
            }
        }

        public    void swipeElementToLeft(String locator , String error_messenge)
        {

            WebElement element = waitForElementPresent(
                    locator ,
                    error_messenge ,
                    10
            ) ;
            int left_x = element.getLocation().getX();
            int rigth_x = left_x + element.getSize().getWidth();
            int upper_y = element.getLocation().getY() ;
            int lower_y = upper_y + element.getSize().getHeight();
            int middle_y = (upper_y + lower_y) / 2 ;
            TouchAction action =  new TouchAction(driver);
            action
                    .press(rigth_x,middle_y)
                    .waitAction(300)
                    .moveTo(left_x,middle_y)
                    .release()
                    .perform();

        }

        public   void assertElementNotPresent(String locator ,String error_messenge )
        {

            int amount_of_elements = getCountOfElement(locator);
            if (amount_of_elements > 0){
                String default_messenge = "An element" + locator + "supposed to be not present";
                throw  new AssertionError(default_messenge + " " + error_messenge);
            }
        }

        public   String waitForElementAndGetAttribute(String locator, String attribute , String error_messenge , long timeoutInSeconds )
        {

            WebElement element = waitForElementPresent(locator , error_messenge ,15 ) ;
            return element.getAttribute(attribute);
        }

        public  void assertElementPresent (String locator , String error_messenge )
        {

            {
                waitForElementPresent(locator , error_messenge ,0);
            }
        }

        private By getLocatorByString(String locator_with_type)
        {
            String[] explored_lokator = locator_with_type.split(Pattern.quote(":"),2);
            String by_type = explored_lokator[0];
            String locator = explored_lokator[1];
            if (by_type.equals("xpath")) {
                return By.xpath(locator);
            }else if (by_type.equals("id")) {
                return By.id(locator);
            }else  {
                throw new IllegalArgumentException("Cannot get typ of locator. Locator: "+ locator);

            }


        }





    }

