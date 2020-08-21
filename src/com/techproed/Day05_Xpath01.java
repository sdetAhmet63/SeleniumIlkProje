package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Xpath01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL LATITUDE 7300\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement email= driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("testtechproed@gmail.com");

        WebElement sifre= driver.findElement(By.xpath("//input[@type='password']"));
        sifre.sendKeys("Test1234!");
        WebElement signIn= driver.findElement(By.xpath("//input[@type='submit']"));
        signIn.click();



    }
}
