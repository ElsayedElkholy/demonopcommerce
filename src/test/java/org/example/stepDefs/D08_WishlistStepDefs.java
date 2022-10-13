package org.example.stepDefs;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class D08_WishlistStepDefs {


    P03_homePage wish=new P03_homePage();

    @When("click on add HTC_One_M8_Android to wishlist")
    public void click_on_HTC_One_M8_Android() throws InterruptedException {
        Thread.sleep(4000);
        wish.htc().click();
        Thread.sleep(4000);
    }
    @Then("success message appears")
    public void success_message_appears(){
        SoftAssert soft = new SoftAssert();
        String actual=wish.notificationMessage().getText();
        soft.assertTrue(Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).isDisplayed());
        String expected="The product has been added to your wishlist";
        soft.assertTrue(actual.contains(expected),"HTC One M8 Android L 5.0 Lollipop is added to wishlist");
        soft.assertNotEquals(Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-qty\"]")).getText(),"0");;
        System.out.println("HTC One M8 Android L 5.0 Lollipop is added to wishlist");
        String message=Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getCssValue("background-color");
        soft.assertEquals(message,"rgb(75 176 122)");
        soft.assertAll();

    }

}



