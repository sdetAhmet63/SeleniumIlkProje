package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DenemeDay04 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL LATITUDE 7300\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.get("https://login.salesforce.com/");
        WebElement giris= driver.findElement(By.id("username"));
        giris.sendKeys("testtechproed@gmail.com");
        WebElement sifre= driver.findElement(By.id("password"));
        sifre.sendKeys("12345567dkjf");
        WebElement login=driver.findElement(By.id("Login"));
         login.click();
    }
}
