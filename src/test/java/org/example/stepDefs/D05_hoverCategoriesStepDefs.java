package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D05_hoverCategoriesStepDefs {

    P03_homePage category=new P03_homePage();

    @When("user hover on Computer categories select notebooks subcategory")
    public void hover_on_main_categories_select_notebooks_subcategory() throws InterruptedException {
        Thread.sleep(2000);
        category.computersSubCatg();
        Thread.sleep(3000);
        String expected="notebooks";
        String actual=Hooks.driver.findElement(By.xpath("//div[@class=\"page-title\"]//h1")).getText();
        Assert.assertTrue(actual.contains(expected),"Actual Result same as expected");
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/software"));
    }

    @And("user hover on Electronics categories select cell phones subcategory")
    public void user_hover_on_Electronics_categories_select_cell_phones_subcategory() throws InterruptedException {
        Thread.sleep(2000);
        category.electronicsSubCatg();
        Thread.sleep(3000);
        String expected="Cell phones";
        String actual=Hooks.driver.findElement(By.xpath("//div[@class=\"page-title\"]//h1")).getText();
        Assert.assertTrue(actual.contains(expected),"Actual Result same as expected");
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/cell-phones"));
    }

    @And("user hover on apparel categories select shoes subcategory")
    public void user_hover_on_apparel_categories_select_shoes_subcategory() throws InterruptedException {
        Thread.sleep(2000);
        category.apparelSubCatg().click();
        Thread.sleep(3000);
        String expected="shoes";
        String actual=Hooks.driver.findElement(By.xpath("//div[@class=\"page-title\"]//h1")).getText();
        Assert.assertTrue(actual.contains(expected),"Actual Result same as expected");
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/shoes"));
    }





}
