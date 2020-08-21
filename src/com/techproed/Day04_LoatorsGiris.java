package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LoatorsGiris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL LATITUDE 7300\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        WebElement signInLink = driver.findElement(By.id("sign-in"));
        signInLink.click();
        WebElement className = driver.findElement(By.className("form-control"));
        className.sendKeys("testtechproed@gmail.com");
        WebElement sifre =driver.findElement(By.id("session_password"));
        sifre.sendKeys("Test1234!");
        WebElement signInButonu = driver.findElement(By.name("commit"));
        signInButonu.click();

        String sayfaTitle= driver.getTitle();
        if (sayfaTitle.equals("Address Book")){
            System.out.println("islem basarili");
        }else {
            System.out.println("islem basarisiz");
        }

    }
}
