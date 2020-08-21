package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DenemeDay03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL LATITUDE 7300\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.get("http://a.testaddressbook.com/");

        WebElement sign= driver.findElement(By.id("sign-in"));
        sign.click();

        WebElement mail= driver.findElement(By.id("session_email"));
        mail.sendKeys("testtechproed@gmail.com");
        WebElement sifre = driver.findElement(By.id("session_password"));
        sifre.sendKeys("Test1234!");
        WebElement buton= driver.findElement(By.name("commit"));
        buton.click();







    }
}
