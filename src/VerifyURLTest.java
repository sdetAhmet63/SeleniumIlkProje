import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL LATITUDE 7300\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.navigate().to("http://www.google.com");
        String str= driver.getCurrentUrl();

        if (str.contains("www.google.com")){
            System.out.println("dogrulandi==>  " + str);
        }else{
            System.out.println("maaleseffff");
        }
           driver.quit();

    }
}
