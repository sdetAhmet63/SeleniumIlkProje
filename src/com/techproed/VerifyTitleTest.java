package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL LATITUDE 7300\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        String s=driver.getTitle();

        if (s.contains("Google")){
            System.out.println(" Title dogrulandi ");
        }else{
            System.out.println("Title dogrulanmadi maalesef...");
        }
            driver.quit();
    }
}
