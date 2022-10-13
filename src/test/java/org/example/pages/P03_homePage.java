package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class P03_homePage {

    // Currencies Start
    public WebElement chooseEuro(){
        By euro=By.id("customerCurrency");
        WebElement eurocur= Hooks.driver.findElement(euro);
        Select selectCurrency=new Select(eurocur);
        selectCurrency.selectByVisibleText("Euro");
        return eurocur;
    }
    public WebElement chooseUSD(){
        By usd=By.id("customerCurrency");
        WebElement usdcur=Hooks.driver.findElement(usd);
        Select selectCurrency=new Select(usdcur);
        selectCurrency.selectByVisibleText("US Dollar");
        return usdcur;
    }
    public List<WebElement> currencyEuro(){
        int count = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]")).size();
        for(int x=0;x<count;x++) {
            String actual = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]")).get(x).getText();
            String expected = "€";
            Assert.assertTrue(actual.contains(expected), "Error in currency");
        }
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }
    public List<WebElement> currencyDollar(){
        int count =Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]")).size();
        for(int x=0;x<count;x++) {
            String actual = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]")).get(x).getText();
            String expected = "$";
            Assert.assertTrue(actual.contains(expected), "Error in currency");
        }
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }
    // Currencies End


    // Search Start
    public WebElement searchBox(){
        By search=By.cssSelector("input[id=\"small-searchterms\"]");
        WebElement searchBox= Hooks.driver.findElement(search);
        return searchBox;
    }

    public WebElement searchbBtn() {
        By searchbtn = By.cssSelector("input[id=\"small-searchterms\"]");
        WebElement searchButton=Hooks.driver.findElement(searchbtn);
        return searchButton;
    }

    public WebElement founded(){
        By found=By.cssSelector("h2[class=\"product-title\"] a");
        WebElement foundButton=Hooks.driver.findElement(found);
        return foundButton;
    }
    // Search End


    // Hover Start
    public WebElement computersSubCatg() throws InterruptedException {
        By computer= By.xpath("//ul[@class=\"top-menu notmobile\"]//li//a[@href=\"/computers\"]");
        WebElement computers=Hooks.driver.findElement(computer);
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(computers).build().perform();
        Thread.sleep(1000);
        By soft=By.xpath("//ul[@class=\"sublist first-level\"]//li//a[@href=\"/notebooks\"]");
        WebElement notebooks=Hooks.driver.findElement(soft);
        action.moveToElement(notebooks).click().build().perform();
        return notebooks;
    }
    public WebElement electronicsSubCatg() {
        By subcat = By.cssSelector("a[href=\"/electronics\"]");
        WebElement selectedsub = Hooks.driver.findElement(subcat);
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(selectedsub).build().perform();
        By cellphone = By.cssSelector("a[href=\"/cell-phones\"]");
        WebElement Electronics_SubCategory_Camera_photo = Hooks.driver.findElement(cellphone);
        action.moveToElement(Electronics_SubCategory_Camera_photo).click().build().perform();
        return selectedsub;
    }
    public WebElement apparelSubCatg() {
        By subcat = By.cssSelector("a[href=\"/apparel\"]");
        WebElement selectedsub = Hooks.driver.findElement(subcat);
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(selectedsub).build().perform();
        By shoes = By.cssSelector("a[href=\"/shoes\"]");
        WebElement apparel_SubCategory_sheos = Hooks.driver.findElement(shoes);
        action.moveToElement(apparel_SubCategory_sheos).click().build().perform();
        return selectedsub;
    }
    // Hover End


    // Slider Start
    public WebElement button_one(){
        WebElement btn= Hooks.driver.findElement(By.cssSelector("a[rel=\"1\"]"));
        return btn;
    }
    public WebElement first_Slider(){
        WebElement slider=Hooks.driver.findElement(By.cssSelector("div[id=\"nivo-slider\"]"));
        return slider;
    }
    public WebElement button_two(){
        WebElement btn= Hooks.driver.findElement(By.cssSelector("a[rel=\"0\"]"));
        return btn;
    }
    public WebElement second_Slider(){
        WebElement slider=Hooks.driver.findElement(By.cssSelector("div[id=\"nivo-slider\"]"));
        return slider;
    }
    // Slider End



    // Follow Us Start
    public WebElement facebook(){
        By face=By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]");
        WebElement fbLink= Hooks.driver.findElement(face);
        return fbLink;
    }
    public WebElement twitter(){
        By twitter=By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]");
        WebElement twitterLink= Hooks.driver.findElement(twitter);
        return twitterLink;
    }
    public WebElement rss(){
        By rss=By.cssSelector("a[href=\"/news/rss/1\"]");
        WebElement rssLink= Hooks.driver.findElement(rss);
        return rssLink;
    }
    public WebElement youtube(){
        By youtube=By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]");
        WebElement youtubeLink= Hooks.driver.findElement(youtube);
        return youtubeLink;
    }
    // Follow Us End



    // Wish list Start
    public WebElement htc(){
        By htc=By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]");
        WebElement htcM8= Hooks.driver.findElement(htc);
        return htcM8;
    }

    public WebElement notificationMessage() {
        By noty = By.cssSelector("div[class=\"bar-notification success\"]");
        WebElement notify = Hooks.driver.findElement(noty);
        return notify;
    }
    // Wish list End

}
