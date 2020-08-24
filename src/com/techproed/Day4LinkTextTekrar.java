package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day4LinkTextTekrar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL LATITUDE 7300\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        //1.yol
        WebElement tagName= driver.findElement(By.tagName("a"));
        System.out.println(tagName.getText());

        //2.yol list ile hepsini alabiliriz
        List<WebElement> list=driver.findElements(By.tagName("a"));
        for (WebElement w: list) {
            System.out.println(w.getText());
        }

    }
}
