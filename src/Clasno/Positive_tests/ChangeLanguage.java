package Clasno.Positive_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

/**
 * Created by S&M on 7/28/2016.
 */
public class ChangeLanguage{
    String driver_path="./lib/chromedriver.exe";
        @Test
        public void LoginInClasno () {
            System.setProperty("webdriver.chrome.driver", driver_path);
            WebDriver driver = new ChromeDriver();
            driver.get("http://clasno.com.ua/");
            driver.findElement(By.id("login_form")).click();
            driver.findElement(By.id("UserEmail1")).click();
            driver.findElement(By.id("UserEmail1")).clear();
            driver.findElement(By.id("UserEmail1")).sendKeys("mariyapolazhynets@gmail.com");
            driver.findElement(By.id("UserPassword1")).click();
            driver.findElement(By.id("UserPassword1")).clear();
            driver.findElement(By.id("UserPassword1")).sendKeys("28081989cfif");
            driver.findElement(By.cssSelector("button.btn")).click();
            driver.findElement(By.linkText("UA")).click();
            assertEquals(driver.findElement(By.cssSelector("li.c_lang_ua > span")).getText(), "UA");
            driver.findElement(By.linkText("Вихід")).click();
            driver.close();}


}
