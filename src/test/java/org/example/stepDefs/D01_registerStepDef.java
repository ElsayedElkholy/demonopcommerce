package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P01_RegisterPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_RegisterPage registers=new P01_RegisterPage();

    @And("user go to website")
    public void goWebsite() throws InterruptedException{
        String Url = "https://demo.nopcommerce.com/";
        Hooks.driver.navigate().to(Url);
        Thread.sleep(5000);

    }
    @And("user click register")
    public void clickOnRegister() {
        registers.register_open().click();

    }

    @When("^user enter valid data select gender type \"(.*)\" fname\"(.*)\" lname\"(.*)\" day\"(.*)\" month\"(.*)\" year\"(.*)\" email\"(.*)\"$")
    public void user_valid_data(String gender,String fname,String lname,String day,String month,String year,String email) throws InterruptedException {
        Thread.sleep(2000);

        registers.gendertype(gender).click();
        registers.first_name().sendKeys(fname);
        registers.last_name().sendKeys(lname);
        Select selectdDay =new Select(registers.day());
        selectdDay.selectByVisibleText(day);
        Select selectMonth =new Select(registers.month());
        selectMonth.selectByValue(month);
        Select selectYear =new Select(registers.year());
        selectYear.selectByVisibleText(year);
        registers.email().sendKeys(email);
    }



    @And("^user fills Password fields \"(.*)\" and \"(.*)\"$")
    public void user_pass(String pass1,String pass2) {
        registers.password().sendKeys(pass1);
        registers.confirm_Password().sendKeys(pass2);
    }


    @And("user clicks on register button")
    public void submit_register() throws InterruptedException{
        registers.registerBtn().click();
        Thread.sleep(5000);

    }
    @Then("success message is displayed")
    public void success_msg(){
        {
            Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]")).isDisplayed());
            SoftAssert soft = new SoftAssert();
            soft.assertTrue(Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]")).isDisplayed());
            soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/registerresult/1?returnUrl=/"));
            soft.assertTrue(Hooks.driver.findElement(By.cssSelector("a[href=\"/customer/info\"][class=\"ico-account\"]")).isDisplayed());
            soft.assertTrue(Hooks.driver.findElement(By.cssSelector("a[href=\"/logout\"][class=\"ico-logout\"]")).isDisplayed());
            String message=Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]")).getCssValue("color");
            soft.assertEquals(message,"rgba(76, 177, 124, 1)");
            soft.assertAll();
        }

    }
}
