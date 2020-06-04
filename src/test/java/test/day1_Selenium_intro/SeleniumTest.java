package test.day1_Selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        // Set up the web driver.
        WebDriverManager.chromedriver().setup();
        // Create the instances from the chrome driver.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        // test if the driver is working.
        driver.get("https://www.google.com");
        System.out.println("Driver Title: "+driver.getTitle());
        System.out.println("Current URL: "+driver.getCurrentUrl());





    }


}
