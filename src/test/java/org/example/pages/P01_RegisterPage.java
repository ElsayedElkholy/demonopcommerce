package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_RegisterPage {
    public WebElement register_open(){
        By register=By.className("ico-register");
        WebElement regis= Hooks.driver.findElement(register);
        return regis;
    }
    public WebElement gendertype(String type){
        WebElement gender=null;
        if(type.equals("male")){
            gender=Hooks.driver.findElement(By.cssSelector("input[type=\"radio\"][id=\"gender-male\"]"));
        }
        else if(type.equals("female")){
            gender=Hooks.driver.findElement(By.cssSelector("input[type=\"radio\"][id=\"gender-female\"]"));
        }
        return gender;
    }
    public WebElement first_name(){
        By firstname=By.cssSelector("input[id^=\"FirstName\"]");
        WebElement frst=Hooks.driver.findElement(firstname);
        return frst;
    }

    public WebElement last_name(){
        By lastname=By.cssSelector("input[id^=\"LastName\"]");
        WebElement last=Hooks.driver.findElement(lastname);
        return last;
    }

    public WebElement day(){
        WebElement day=Hooks.driver.findElement(By.name("DateOfBirthDay"));
        return day;
    }
    public WebElement month(){

        WebElement month=Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        return month;
    }
    public WebElement year(){
        WebElement year=Hooks.driver.findElement(By.name("DateOfBirthYear"));
        return year;
    }

    public WebElement email(){
        By email=By.cssSelector("input[id^=\"Email\"]");
        WebElement em=Hooks.driver.findElement(email);
        return em;
    }

    public WebElement password(){
        By password=By.cssSelector("input[id^=\"Password\"]");
        WebElement pass=Hooks.driver.findElement(password);
        return pass;
    }

    public WebElement confirm_Password(){
        By confirmpassword=By.xpath("//input[@id='ConfirmPassword']");
        WebElement confirmpass=Hooks.driver.findElement(confirmpassword);
        return confirmpass;
    }

    public WebElement registerBtn(){
        By regist = By.cssSelector("button[type=\"submit\"][id=\"register-button\"]");
        WebElement RegBtn = Hooks.driver.findElement(regist);
        return RegBtn;
    }


}
