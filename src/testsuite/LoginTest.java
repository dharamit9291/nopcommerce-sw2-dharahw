package testsuite;

import utilities.Utility;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp (){

        openBrowser(baseUrl);
    }

   @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
       // Find log in link and click on login link
        clickOnElement(By.linkText("Log in"));
       //This is from requirement
       String expectedMessage  = "Welcome, Please Sign In!";
       // Find the text element and get the text
       String actualMessage =  getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
       // validate actual and expected message
       Assert.assertEquals("Not navigate to login page", expectedMessage,actualMessage);

    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        clickOnElement(By.linkText("Log in"));
        sendTextToElement(By.id("Email"),"prime123@gmail.com");
        sendTextToElement(By.id("Password"),"prime123");
        clickOnElement(By.xpath("//button[@class = 'button-1 login-button']"));
        String expMessage = "Log out";
        String actMessage = getTextFromElement(By.linkText("Log out"));
        Assert.assertEquals(expMessage,actMessage);
    }
    @Test
    public void verifyTheErrorMessage(){
        clickOnElement(By.linkText("Log in"));
        sendTextToElement(By.id("Email"),"prime1234@gmail.com");
        sendTextToElement(By.id("Password"),"prime1234");
        clickOnElement(By.xpath("//button[@class = 'button-1 login-button']"));
        String expMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actMessage = getTextFromElement(By.xpath("//div[contains(@class,'message-error')]"));
        Assert.assertEquals("User not Logged in :",expMessage,actMessage);
    }

    public void tearDown(){
        closeBrowser();
    }
}
