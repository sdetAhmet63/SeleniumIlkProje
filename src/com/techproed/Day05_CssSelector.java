package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL LATITUDE 7300\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement email=driver.findElement(By.cssSelector("#session_email"));
        email.sendKeys("testtechproed@gmail.com");
        WebElement sifre= driver.findElement(By.cssSelector("input[placeholder='Password']"));
         sifre.sendKeys("Test1234!");
         sifre.submit();






    }
}
