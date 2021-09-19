package com.chrom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromcomfig {

    public static WebDriver driver;

    public static void main(String[] args) {
        Launch_Chrom();
        //Close_Chrome();
        //quit_Chrome();
    }
    public static void Launch_Chrom(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }


    public static void Close_Chrome(){
        driver.close();
    }


    public static void quit_Chrome(){
        driver.quit();
    }

}


