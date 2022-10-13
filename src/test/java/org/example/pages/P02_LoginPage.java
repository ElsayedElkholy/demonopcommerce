package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_LoginPage {

    public WebElement login_link(){
        By login=By.className("ico-login");
        return Hooks.driver.findElement(login);
    }
    public WebElement Email()
    {
        By email = By.name("Email");
        WebElement Email = Hooks.driver.findElement(email);
        return Email;
    }

    public WebElement Password()
    {
        By password = By.id("Password");
        WebElement Password = Hooks.driver.findElement(password);
        return Password;

    }

    public void loginStep(String username,String password){
        Email().clear();
        Email().sendKeys(username);
        Password().sendKeys(password);
    }
    public  WebElement LoginBtn()
    {
        By login = By.cssSelector("button[class=\"button-1 login-button\"]");
        WebElement LogIn = Hooks.driver.findElement(login);
        return LogIn;
    }

    public WebElement failmsg(){
        By msg=By.cssSelector("div[class=\"message-error validation-summary-errors\"]");
        WebElement fail= Hooks.driver.findElement(msg);
        return fail;
    }


}
