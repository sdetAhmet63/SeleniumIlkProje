package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL LATITUDE 7300\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver =new ChromeDriver() ;

        webDriver.manage().window().maximize();

        webDriver.get("http://google.com");

        webDriver.navigate().to("http:youtube.com");


        webDriver.navigate().back();

        webDriver.navigate().forward();

        webDriver.navigate().refresh();

        webDriver.quit();
    }
}
