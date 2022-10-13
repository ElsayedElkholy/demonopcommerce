package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class D03_currenciesStepDefs {
    P03_homePage currency=new P03_homePage();

    @When("user choose Euro from dropdown menu")
    public void user_choose_Euro_from_dropdown_menu() throws InterruptedException {
        currency.chooseEuro();
        Thread.sleep(2000);
    }

    @Then("euro is selected successfully")
    public void euro_is_selected_successfully() throws InterruptedException {
        String selected=Hooks.driver.findElement(By.cssSelector("select[onchange=\"setLocation(this.value)\"]")).getText();
        Assert.assertTrue(selected.contains("Euro"),"Euro is selected Successfully");
        currency.currencyEuro();
        Thread.sleep(2000);
    }

    @When("user choose USD from dropdown menu")
    public void user_choose_USD_from_dropdown_menu() throws InterruptedException {
        currency.chooseUSD();
        Thread.sleep(2000);
    }

    @Then("USD is selected successfully")
    public void usd_is_selected_successfully() throws InterruptedException {
        String selected=Hooks.driver.findElement(By.cssSelector("select[onchange=\"setLocation(this.value)\"]")).getText();
        Assert.assertTrue(selected.contains("US Dollar"),"USD selected Successfully");
        currency.currencyDollar();
        Thread.sleep(2000);
    }
}
