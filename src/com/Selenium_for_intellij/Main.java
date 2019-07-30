package com.Selenium_for_intellij;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import java.lang.Exception;

public class Main {

    public static void main(String[] args) throws Exception {
        login_to_gmail();
        login_to_facebook();
    }

    public static Object Login() throws Exception {
        try {
            System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Gecko Driver\\Chorom\\chromedriver_win32\\chromedriver.exe");
            WebDriver obj = new ChromeDriver();
            obj.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            obj.manage().window().maximize();
            return obj;
        }
        catch (Exception e){
            System.out.println("Something went wrong in your Login() Method");
            return null;
        }
    }

    public static void login_to_gmail() throws Exception {
        try {
            WebDriver obj = (WebDriver) Login();
            obj.get("https://www.gmail.com");
            obj.findElement(By.id("identifierId")).sendKeys("youremailaddress@xyz.com", Keys.ENTER);
            obj.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("your@pass", Keys.ENTER);
        }
        catch (Exception e){
            System.out.println("Something went wrong in your login_to_gmail() Method");
        }
    }

    public static void login_to_facebook() throws Exception {
        try {
            WebDriver obj = (WebDriver) Login();

            obj.get("https://www.facebook.com/aunasib");
            obj.findElement(By.id("email")).sendKeys("youremailaddress@xyz.com");
            obj.findElement(By.id("pass")).sendKeys("your@pass", Keys.ENTER);
            obj.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
        }
        catch (Exception e) {
            System.out.println("Something went wrong in your login_to_facebook() Method");
        }
    }
}
