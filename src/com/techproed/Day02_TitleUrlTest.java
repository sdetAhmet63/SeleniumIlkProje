package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL LATITUDE 7300\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://youtube.com");

       String title = driver.getTitle();

       if (title.contains("video")){
           System.out.println("'video' kelimesi var: " + title);
       }else {
           System.out.println("'video' kelimesi yok: " + title);
       }

       driver.quit();
    }
}
