package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Review {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL LATITUDE 7300\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://youtube.com");
        String s =driver.getTitle();
        if (s.contains("youtube")){
            System.out.println("dogrulandi: " + s);
        }else{
            System.out.println("Dogrulanmadi: " + s);
        }

        String url=driver.getCurrentUrl();
        if (url.contains("ÿoutube")){
            System.out.println("dogrulandi: " + url);
        }else {
            System.out.println("dogrulanmadi: " + url );
        }

        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();

        String title=driver.getTitle();
        if (title.contains("Amazon")){
            System.out.println("dogru: " + title);
        }else {
            System.out.println("dogru degil: " + title);
        }

        String url2=driver.getCurrentUrl();
        if (url2.contains("https://www.amazon.com/")){
            System.out.println("dogru: " + url2);
        }else {
            System.out.println("dogru degil: " + url2);
        }

        driver.quit();
    }
}
