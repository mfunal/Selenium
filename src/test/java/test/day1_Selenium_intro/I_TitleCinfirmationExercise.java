package test.day1_Selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_TitleCinfirmationExercise {

    //Please write a code to confirm the title of https://www.apple.com.
    //Expected value = "Apple".
    //Please maximize the window.
    //Please verify the current URL; https://www.apple.com. is expected value.
    //Please create thread sleep method for 3000ms.
    //Please go back to previous page.
    //Please create thread sleep method for 3000ms.
    //Please go to next page.
    //Please create thread sleep method for 3000ms.
    //Please close the window.

    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.apple.com");
        if(driver.getTitle().equals("Apple")){
            System.out.println("Title is verified");
        }else{
            System.out.println("Failed");
        }
        driver.manage().window().maximize();

        if(driver.getCurrentUrl().equalsIgnoreCase("https://www.apple.com/")){
            System.out.println("URL is verified");
        }else{
            System.out.println("Failed");
        }

        Thread.sleep(500);
        driver.navigate().back();
        Thread.sleep(500);
        driver.navigate().forward();
        Thread.sleep(500);
        //driver.quit();

        driver.close();
    }
}
