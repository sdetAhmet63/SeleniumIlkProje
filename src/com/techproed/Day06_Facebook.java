package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL LATITUDE 7300\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        WebElement email= driver.findElement(By.id("email"));
        email.sendKeys("techproed@gmail.com");

        //WebElement sifre=driver.findElement(By.id("pass"));
      //  sifre.sendKeys("Test1234");
        WebElement sifreKutusu= driver.findElement(By.xpath("//*[@type='password']"));
        sifreKutusu.sendKeys("Test1234");

       // sifreKutusu.submit();
        //WebElement login= driver.findElement(By.id("u_0_d"));
       // login.click();

        WebElement log= driver.findElement(By.cssSelector("#u_0_d"));
        log.click();

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){

        }

        String faceUrl =driver.getCurrentUrl();
        System.out.println(faceUrl);

          if (faceUrl.contains("www.facebook.com/login/")){
              System.out.println("Giris Basarisiz");
          }else {
              System.out.println("Giris Bararili");
                }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();

    }
}
