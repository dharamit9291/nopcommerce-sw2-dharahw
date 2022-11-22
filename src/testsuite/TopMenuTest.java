package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp (){

        openBrowser(baseUrl);
    }
//click on the ‘Computers’ Tab
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        clickOnElement(By.linkText("Computers"));
        String expectedMessage  = "Computers";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Computers')]"));

        Assert.assertEquals("Text not verified", expectedMessage,actualMessage);
    }
    //click on the ‘Electronics’ Tab
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        clickOnElement(By.linkText("Electronics"));
        String expectedMessage  = "Electronics";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Electronics')]"));

        Assert.assertEquals("Text not verified", expectedMessage,actualMessage);
    }
    //click on the ‘Apparel’ Tab
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        clickOnElement(By.linkText("Apparel"));
        String expectedMessage  = "Apparel";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Apparel')]"));

        Assert.assertEquals("Text not verified", expectedMessage,actualMessage);
    }
    //click on the ‘Digital downloads’ Tab
    @Test
    public void userShouldNavigateToDigitaldownloadsPageSuccessfully(){
        clickOnElement(By.linkText("Digital downloads"));
        String expectedMessage  = "Digital downloads";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));

        Assert.assertEquals("Text not verified", expectedMessage,actualMessage);
    }
    //click on the ‘Books’ Tab
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        clickOnElement(By.linkText("Books"));
        String expectedMessage  = "Books";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Books')]"));

        Assert.assertEquals("Text not verified", expectedMessage,actualMessage);
    }
    //click on the ‘Jewelry’ Tab
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        clickOnElement(By.linkText("Jewelry"));
        String expectedMessage  = "Jewelry";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Jewelry')]"));

        Assert.assertEquals("Text not verified", expectedMessage,actualMessage);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        clickOnElement(By.linkText("Gift Cards"));
        String expectedMessage  = "Gift Cards";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));

        Assert.assertEquals("Text not verified", expectedMessage,actualMessage);
    }
    @After
    public void tearDown(){

        closeBrowser();
    }

}
