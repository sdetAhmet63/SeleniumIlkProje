package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL LATITUDE 7300\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("http://google.com");
        driver.navigate().to("http://amazon.com");
        String sayfaTitle = driver.getTitle();
        String sayfaUrl = driver.getCurrentUrl();
        System.out.println(sayfaTitle);// Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more
        System.out.println(sayfaUrl);// https://www.amazon.com/
        driver.quit();


    }
}
