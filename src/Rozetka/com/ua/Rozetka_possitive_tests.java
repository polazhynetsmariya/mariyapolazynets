package Rozetka.com.ua;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.linkText;
import static org.testng.Assert.assertEquals;

/**
 * Created by S&M on 7/26/2016.
 */
public class Rozetka_possitive_tests {
    @Test
    public void LoginInRozetka () {
        System.setProperty("webdriver.chrome.driver", "C://Users//S&M//IdeaProjects//Mariya_Polazhynets//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://rozetka.com.ua/");
        driver.findElement(linkText("войдите в личный кабинет")).click();
        driver.findElement(By.name("login")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("28081989");
        driver.findElement(By.name("auth_submit")).click();
        driver.close();}

    @Test
    public void SignOutFromRozetka () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://Users//S&M//IdeaProjects//Mariya_Polazhynets//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://rozetka.com.ua/");
        driver.findElement(By.linkText("войдите в личный кабинет")).click();
        driver.findElement(By.name("login")).click();
        driver.findElement(By.name("login")).sendKeys("mariyapolazhynets@gmail.com");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("28081989");
        driver.findElement(By.name("auth_submit")).click();
        driver.findElement(By.xpath("//span[@id='header_user_menu_parent']/a")).click();
        driver.findElement(By.id("edit_profile")).click();
        driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
        assertEquals(driver.findElement(By.cssSelector("h1")).getText(), "Личные данные");
        driver.close();}

    @Test
    public void ReturnInMainMenu () {
        System.setProperty("webdriver.chrome.driver","C://Users//S&M//IdeaProjects//Mariya_Polazhynets//lib//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://rozetka.com.ua/");
        driver.findElement(By.linkText("Ноутбуки и компьютеры")).click();
        driver.findElement(By.xpath("//header[@id='body-header']/div[3]/div/div[2]/div/a/img")).click();
        driver.close();}
}


