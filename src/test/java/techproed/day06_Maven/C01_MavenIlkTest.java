package techproed.day06_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.time.Duration;
import java.util.List;

public class C01_MavenIlkTest {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //https://www.amazon.com/ sayfasina gidelim

        driver.get("https://amazon.com");

        //arama kutusunu locate edelim
        driver.findElement(By.cssSelector("input#twotabsearchtextbox"));

        //“Samsung headphones” ile arama yapalim


        //Bulunan sonuc sayisini yazdiralim

        //1-16 of 201 results for "Samsung headphones"


        //Ilk urunu tiklayalim


        //Sayfadaki tum basliklari yazdiralim

        //sayfayı kapatınız
        driver.close();

    }

}
