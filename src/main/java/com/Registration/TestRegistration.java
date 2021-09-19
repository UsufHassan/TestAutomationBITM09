package com.Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRegistration {

    public static WebDriver driver;

    public static void main(String[] args){

        launch_chrome();
        open_uri();
        window_size();
        Register();
        //quit_chrome();
    }
    public static void launch_chrome(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }
    public static void open_uri(){
        driver.get("https://demo.opencart.com/index.php?route=account/register");
    }
    public static void window_size(){
        driver.manage().window().maximize();
    }
    public static void quit_chrome(){

        driver.quit();
    }
    public static void Register(){

        WebElement fName=driver.findElement(By.id("input-firstname"));
        fName.clear();
        fName.sendKeys("Usuf");

        WebElement lName=driver.findElement(By.id("input-lastname"));
        lName.clear();
        lName.sendKeys("Hassan");

        WebElement email=driver.findElement(By.id("input-email"));
        email.clear();
        email.sendKeys("hassan1@gmail.com");

        WebElement phone=driver.findElement(By.id("input-telephone"));
        phone.clear();
        phone.sendKeys("0172235000");

        WebElement pass=driver.findElement(By.id("input-password"));
        pass.sendKeys("1234567");

        WebElement Cpass=driver.findElement(By.id("input-confirm"));
        Cpass.sendKeys("1234567");

        WebElement check=driver.findElement(By.cssSelector("#content > form > div > div > input[type=checkbox]:nth-child(2)"));
        check.click();

        WebElement regBtn=driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        regBtn.click();

        String expected_title="Your Account Has Been Created!";
        String actual_title=driver.getTitle();

        if(expected_title.equals(actual_title)){
            System.out.println("Account Has been Created");
        }
        else {
            System.out.println("Account Not Created");
        }

    }
}
