package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_followUsStepDef {

    P03_homePage follow=new P03_homePage();
    @When("user click on facebook")
    public void click_facebook() throws InterruptedException {
        follow.facebook().click();
        Thread.sleep(2000);
        ArrayList<String> tabs=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
    }

    @Then("^navigated to facebook \"(.*)\"$")
    public void navigate_facebook(String url) throws InterruptedException {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url);
        Thread.sleep(1000);
        ArrayList<String> tabs=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
    }

    @When("user click on twitter")
    public void click_twitter() throws InterruptedException {
        follow.twitter().click();
        Thread.sleep(2000);
        ArrayList<String> tabs=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
    }

    @Then("^navigated to twitter \"(.*)\"$")
    public void navigate_twitter(String url) throws InterruptedException {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url);
        Thread.sleep(1000);
        ArrayList<String> tabs=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
    }

    @When("user click on rss")
    public void click_rss() throws InterruptedException {
        follow.rss().click();
        Thread.sleep(2000);
        ArrayList<String> tabs=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
    }

    @Then("^navigated to rss \"(.*)\"$")
    public void navigate_rss(String url) throws InterruptedException {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url);
        Thread.sleep(1000);
        ArrayList<String> tabs=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
    }

    @When("user click on youtube")
    public void click_youtube() throws InterruptedException {
        follow.youtube().click();
        Thread.sleep(1000);
        ArrayList<String> tabs=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());

    }

    @Then("^navigated to youtube \"(.*)\"$")
    public void navigate_youtube(String url) throws InterruptedException {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url);
        Thread.sleep(1000);
        ArrayList<String> tabs=new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));

    }


}
