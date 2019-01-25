package ui;

import io.appium.java_client.AppiumDriver;
import startTestSetting.CoreTestCase;
import startTestSetting.MainPageObject;


import java.util.Random;

abstract  public class RegistrationPageObject extends MainPageObject {
     public RegistrationPageObject (AppiumDriver driver) {
         super(driver);
     }


     protected  static String

     EMAIL_LINE,
     PASSWORD_LINE,
     RE_TYPE_PASSWORD_LINE,
     USER_NAME_LINE,
     CHOOSE_STATE ,
             SIGN_UP;

     public void inputEmail(String email){
         waitForElementEndSendKeys(EMAIL_LINE ,
                 email ,
                 "Not find line email to input ",
                 5
         );
     }
     public void inputPassword(String password){
         waitForElementEndSendKeys(PASSWORD_LINE ,
                  password ,
                 "Not find line password to input ",
                 5
         );
     }
     public void inputRePassword(String password){
         waitForElementEndSendKeys(RE_TYPE_PASSWORD_LINE ,
                 password ,
                 "Not find line re password to input ",
                 5
         );
     }

     public void inputName(String password){
         waitForElementEndSendKeys(USER_NAME_LINE ,
                 password ,
                 "Not find line name to input ",
                 5
         );
     }

     public  void setChooseState(String state){
         waitForElementEndClick(
                 CHOOSE_STATE ,
                 "Not find line choose state " ,
                 5
         );

         //swipeUpToFindElement("xpath://*[@text='"+ state +"' ]","ooo",10 );
         waitForElementEndClick(
                 "xpath://*[@text='"+ state +"' ]" ,
                 "not find ctate",
                 5
         );

     }

     public String generateRandomWord(int wordLength) {
        Random r = new Random(); // Intialize a Random Number Generator with SysTime as the seed
        StringBuilder sb = new StringBuilder(wordLength);
        for(int i = 0; i < wordLength; i++) { // For each letter in the word
            char tmp = (char) ('a' + r.nextInt('z' - 'a')); // Generate a letter between a and z
            sb.append(tmp); // Add it to the String
        }
        return sb.toString();
    }
 public  void pressedButtonSignUp(){
         waitForElementEndClick(
                 SIGN_UP,
                 "not find button sign up",
                 5
         );
 }
//     public  void fastRandomUserRegistration(){
//         String email = generateRandomWord(5) + "@gmail.com" ;
//         String password = generateRandomWord(7);
//         String name = generateRandomWord(6);
//
//         inputEmail(email);
//         inputPassword(password);
//         inputRePassword(password);
//         inputName(name);
//         setChooseState("Alabama");
//
//     }


}

