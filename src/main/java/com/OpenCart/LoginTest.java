package com.OpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static WebDriver driver;
    public static void main(String[] args){

        Launch_Chrom();
        open_LoginPage();
        TC_Longin_001();
        //TC_Longin_002();
        //TC_Longin_003();
        //TC_Longin_004();
        //close_Chrome();

    }


    // Step-1

    public static void Launch_Chrom(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }


        // Step-2

    public static void open_LoginPage(){
        driver.get("https://demo.opencart.com/index.php?route=account/login");

    }

    // Email and Pass Valid

    public static void TC_Longin_001(){

        // Step 3
        WebElement Email=driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("hassan@gmail.com");

        // Step 4

        WebElement Password=driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("1234567");


        // Step 5

        WebElement LoginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        LoginBtn.click();

        // Logout

        WebElement Logout=driver.findElement(By.linkText("Logout"));
        Logout.click();

        WebElement LoginPage=driver.findElement(By.linkText("Login"));
        LoginPage.click();

        // Verification

        String Expected_Title="My Account";
        String Actual_title=driver.getTitle();

        if (Expected_Title.equals(Actual_title)) {

            System.out.println("Account Successfully Login. Test Case Passed.");
        }

        else {
            System.out.println("Test Case Failed");
        }

        System.out.println("TC_Login_001 Executed Successfully");
    }


    // Email and Pass Invalid

    public static void TC_Longin_002(){

        // Step 3
        WebElement Email=driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("test@test.com");

        // Step 4

        WebElement Password=driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("/123456789");

        // Step 5

        WebElement LoginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        LoginBtn.click();

        // Verification

        String Expected_Title="Account Login";
        String Actual_title=driver.getTitle();

        if (Expected_Title.equals(Actual_title)) {

            System.out.println("Account Successfully Login. Test Case Passed.");
        }

        else {
            System.out.println("Test Case Failed");
        }

        System.out.println("TC_Login_001 Executed Successfully");

    }


    // Email valid but Password Invalid

    public static void TC_Longin_003(){

        // Step 3
        WebElement Email=driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("hassan@gmail.com");

        // Step 4

        WebElement Password=driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("*123456789");

        // Step 5

        WebElement LoginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        LoginBtn.click();

        // Verification

        String Expected_Title="Account Login";
        String Actual_title=driver.getTitle();

        if (Expected_Title.equals(Actual_title)) {

            System.out.println("Account Successfully Login. Test Case Passed.");
        }

        else {
            System.out.println("Test Case Failed");
        }

        System.out.println("TC_Login_001 Executed Successfully");

    }

    // Email Invalid and Password Valid

    public static void TC_Longin_004(){

        // Step 3
        WebElement Email=driver.findElement(By.id("input-email"));
        Email.clear();
        Email.sendKeys("test@test.com");

        // Step 4

        WebElement Password=driver.findElement(By.id("input-password"));
        Password.clear();
        Password.sendKeys("1234567");

        // Step 5

        WebElement LoginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        LoginBtn.click();

        // Verification

        String Expected_Title="Account Login";
        String Actual_title=driver.getTitle();

        if (Expected_Title.equals(Actual_title)) {

            System.out.println("Account Successfully Login. Test Case Passed.");
        }

        else {
            System.out.println("Test Case Failed");
        }

        System.out.println("TC_Login_001 Executed Successfully");

    }

    // Step 6
    public static void close_Chrome(){
        driver.close();
    }
}
