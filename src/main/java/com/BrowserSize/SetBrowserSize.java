package com.BrowserSize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetBrowserSize {
    public static WebDriver driver;
    public static void main(String[] args) {
        Launch_Chrom();
        setSizeTab();
        setSizeMobile();
        //Close_Chrome();
        //quit_Chrome();
    }
    public static void Launch_Chrom(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }


    public static void setSizeTab(){
        driver.manage().window().setSize(new Dimension( 768 , 500));
    }

    public static void setSizeMobile(){
        driver.manage().window().setSize(new Dimension( 375 , 500));
    }

    public static void Close_Chrome(){
        driver.close();
    }
    public static void quit_Chrome(){
        driver.quit();
    }
}
