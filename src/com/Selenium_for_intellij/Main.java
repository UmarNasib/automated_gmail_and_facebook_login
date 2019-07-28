package com.Selenium_for_intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        login_to_gmail();
        login_to_facebook();
    }

    public static void login_to_gmail(){
        System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Gecko Driver\\Chorom\\chromedriver_win32\\chromedriver.exe");
        WebDriver obj = new ChromeDriver();
        obj.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        obj.get("https://www.gmail.com");
        obj.findElement(By.id("identifierId")).sendKeys("umarnasib13@gmail.com", Keys.ENTER);
        obj.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Nasib@1115", Keys.ENTER);
       }

    public static void login_to_facebook(){
        System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Gecko Driver\\Chorom\\chromedriver_win32\\chromedriver.exe");
        WebDriver obj = new ChromeDriver();
        obj.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        obj.get("https://www.facebook.com/aunasib");
        obj.findElement(By.id("email")).sendKeys("umarnasib@gmail.com");
        obj.findElement(By.id("pass")).sendKeys("Nasib@1115", Keys.ENTER);
        obj.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
    }
}
