package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D06_homeSlidersStepDefs {
    P03_homePage slider=new P03_homePage();

    @When("user click on button_one and click on first_slider")
    public void click_first_slider() throws InterruptedException {
        slider.button_one().click();
        slider.button_one().click();
        Thread.sleep(2000);
        slider.first_Slider().click();
        Thread.sleep(3000);
    }

    @And("navigate to the first slider page")
    public void navigated_first_slider(){
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/nokia-lumia-1020"),"Error Msg 1st");
    }

    @When("user click on button_two and click on second_slider")
    public void click_second_slider() throws InterruptedException {
        slider.button_two().click();
        slider.button_two().click();
        Thread.sleep(2000);
        slider.second_Slider().click();
    }

    @And("navigate to the second slider page")
    public void navigated_second_slider(){
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/iphone-6"),"Error Msg sec");
    }

}
