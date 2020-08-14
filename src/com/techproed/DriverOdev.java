package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverOdev {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL LATITUDE 7300\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://google.com");
        String title= driver.getTitle();
        System.out.println(title);//Google
        driver.get("http://youtube.com");
        String url = driver.getCurrentUrl();
        String tt  = driver.getTitle();
        System.out.println(url);//https://www.youtube.com/
        System.out.println(tt);//YouTube
        driver.navigate().back();
        String str = driver.getCurrentUrl();
        System.out.println(str);//https://www.google.com/?gws_rd=ssl
        driver.quit();



    }
}
