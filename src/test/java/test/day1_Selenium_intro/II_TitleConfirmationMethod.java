package test.day1_Selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class II_TitleConfirmationMethod {

    // please create a method that verifies the current  url end returns string
    // "URL is verified!" or "Wrong title".

    public static String verifyURL(String ExpectedURL, String CurrentURL){
        String result="";
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get(CurrentURL);
        if(driver.getCurrentUrl().equalsIgnoreCase(ExpectedURL)){
            result+="URL is verified.";
        }else{
            result+=" WRONG!!! URL can not be verified.";
        }

        return result;
    }

    public static void main(String[] args) {

        verifyURL("https://www.apple.com/","https://www.apple.com");

    }
}
