package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day4Tekrar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL LATITUDE 7300\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://google.com");
        WebElement arama= driver.findElement(By.name("q"));
        arama.sendKeys("city bike");
        arama.submit();
        WebElement sonuc= driver.findElement(By.id("result-stats"));
        System.out.println(sonuc.getText());

        WebElement shopp= driver.findElement(By.partialLinkText("Shopp"));
        shopp.click();


    }
}
