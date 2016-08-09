package Rozetka.com.ua;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by S&M on 7/26/2016.
 */
public class Rozetka_negatine_tests {
    @Test
    public void NegativeLoginInRozeta () {
        System.setProperty("webdriver.chrome.driver", "C://Users//S&M//IdeaProjects//Mariya_Polazhynets//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://rozetka.com.ua/");
        driver.findElement(By.linkText("войдите в личный кабинет")).click();
        driver.findElement(By.name("login")).clear();
        driver.findElement(By.name("login")).sendKeys("mariyapolazhynets@mail.ru");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("28081989");
        driver.findElement(By.name("auth_submit")).click();
        assertEquals(driver.findElement(By.name("login")).getText(), "");
        driver.close();}

    @Test
    public void NegativePasswordInRozeta () {
        System.setProperty("webdriver.chrome.driver", "C://Users//S&M//IdeaProjects//Mariya_Polazhynets//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://rozetka.com.ua/");
        driver.findElement(By.linkText("войдите в личный кабинет")).click();
        driver.findElement(By.name("login")).clear();
        driver.findElement(By.name("login")).sendKeys("mariyapolazhynets@gmail.com");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("28081988");
        driver.findElement(By.name("auth_submit")).click();
        assertEquals(driver.findElement(By.name("password")).getText(), "");
        driver.close();}
}
