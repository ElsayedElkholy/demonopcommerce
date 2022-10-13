package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class D02_LoginStepDefs {
    P02_LoginPage loginPage =new P02_LoginPage();

    @Given("user navigate to Home page")
    public void user_navigate_to_Home_page(){
        String url = "https://demo.nopcommerce.com/";
        Hooks.driver.navigate().to(url);
        Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @And("user go to login page")
    public void user_go_to_login_page(){
        loginPage.login_link().click();
        Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @When("^user enter \"(.*)\" and \"(.*)\"$")
    public void user_enter_valid_email(String username,String password){
        loginPage.loginStep(username,password);
    }

    @And("user press on login button")
    public void user_clicks_login_button(){
        loginPage.LoginBtn().click();
    }

    @Then("user login to the system successfully")
    public void user_logged_in_successfully (){
        Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertFalse(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/login?returnUrl=%2F/"));
        SoftAssert soft=new SoftAssert();

        soft.assertTrue(Hooks.driver.findElement(By.cssSelector("a[href=\"/customer/info\"][class=\"ico-account\"]")).isDisplayed());
        soft.assertTrue(Hooks.driver.findElement(By.cssSelector("a[href=\"/logout\"][class=\"ico-logout\"]")).isDisplayed());

        soft.assertAll();
    }

    @Then("user login fail msg")
    public void user_could_not_login() {
        Hooks.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        String message= loginPage.failmsg().getText();
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(message.contains("Login was unsuccessful"));
        String stringColor= loginPage.failmsg().getCssValue("color");
        soft.assertEquals(stringColor,"#e4434b");
    }
}
