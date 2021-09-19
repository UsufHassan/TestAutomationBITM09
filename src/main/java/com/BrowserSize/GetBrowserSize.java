package com.BrowserSize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetBrowserSize {
    public static WebDriver driver;
    public static void main(String[] args) {
        Launch_Chrom();
        getMaxSize();
        //Close_Chrome();
        //quit_Chrome();
    }
    public static void Launch_Chrom(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void getMaxSize(){
        Dimension maxSize=driver.manage().window().getSize();
        System.out.println(maxSize);

        int Width=driver.manage().window().getSize().getWidth();
        int Height=driver.manage().window().getSize().getHeight();

        System.out.println("Width:"+ Width + "Height:"+ Height);
    }

    public static void Close_Chrome(){
        driver.close();
    }
    public static void quit_Chrome(){
        driver.quit();
    }
}
