package testsuite;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class RegisterTest extends LoginTest {
    //click on the ‘Register’ Tab
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        // Find link and click on link
        clickOnElement(By.linkText("Register"));
        //This is from requirement
        String expectedMessage  = "Register";
        // Find the text element and get the text
        String actualMessage =  getTextFromElement(By.xpath("//div[@class = 'page-title']"));
        // validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage,actualMessage);

    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        clickOnElement(By.linkText("Register"));

        //entering information
        clickOnElement(By.xpath("//input[@type='radio' and @value='M']"));
        sendTextToElement(By.xpath("//input[@id='FirstName']"),"Prime");
        sendTextToElement(By.xpath("//input[@id='LastName']"),"Testing");
        clickOnElement(By.xpath("//select[@name='DateOfBirthDay']/option[@value='1']"));
        clickOnElement(By.xpath("//select[@name='DateOfBirthMonth']/option[@value='1']"));
        clickOnElement(By.xpath("//select[@name='DateOfBirthYear']/option[@value='2000']"));
        sendTextToElement(By.xpath("//input[@id='Email']"),"pt125@gmail.com");
        sendTextToElement(By.xpath("//input[@id='Password']"),"ptpm123");
        sendTextToElement(By.xpath("//input[@id='ConfirmPassword']"),"ptpm123");
        clickOnElement(By.xpath("//button[@id='register-button']"));

        String expectedMessage  = "Your registration completed";
        String actualMessage =  getTextFromElement(By.xpath("//div[@class='result']"));

        Assert.assertEquals("registration unsuccessfull", expectedMessage,actualMessage);

    }
}
