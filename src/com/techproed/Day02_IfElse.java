package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL LATITUDE 7300\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://amazon.com");

        String sayfa =driver.getTitle();

        if (sayfa.toLowerCase().contains("Car")){
            System.out.println("'Car' kelimesi geciyor " + sayfa);
        }else {
            System.out.println("'Car' kelimesi gecmiyor " + sayfa);
        }

        driver.quit();


    }
}
