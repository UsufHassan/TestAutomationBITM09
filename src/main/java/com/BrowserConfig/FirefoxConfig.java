package com.BrowserConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class FirefoxConfig {
    public static WebDriver driver;
    public static void main(String[] args) {
        Lanuch_Firfox();
    }
    public static void Lanuch_Firfox(){
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        driver=new FirefoxDriver();
    }
}
