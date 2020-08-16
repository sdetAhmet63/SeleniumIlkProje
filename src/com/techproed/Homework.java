package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL LATITUDE 7300\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String title=driver.getTitle();
        if (title.contains("facebook")){
            System.out.println("DOGRULANDI ");
        }else {
            System.out.println("DOGRU DEGIL: " + title);
        }

        String url=driver.getCurrentUrl();
        if (url.contains("https://www.facebook.com/")){
            System.out.println("DOGRULANDI");
        }else {
            System.out.println("DOGRU DEGIL: " + url);
        }
        driver.navigate().to("https://www.walmart.com/");
        String waltitle=driver.getTitle();
        if (waltitle.contains("Walmart.com")){
            System.out.println("DOGRULANDI");
        }else {
            System.out.println("DOGRU DEGIL: " + waltitle);
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.quit();
    }
}
