package test.day1_Selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_GoogleTitleConfirmation {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        String actualTitle=driver.getTitle();
        String expectedTitle="Apple";
        Thread.sleep(4000);
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title is Verified");
        }else{
            System.out.println("Test Failed!!!");
        }
        driver.get("https://www.apple.com");
        WebElement searchBar=driver.findElement(By.id("ac-gn-link-search"));
        Thread.sleep(3000);
        searchBar.sendKeys("    How to make fistikli baklava?");
        Thread.sleep(2000);
        driver.findElement(By.id("idValue")).sendKeys(Keys.ENTER);








    }


}
