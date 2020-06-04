package test.day1_Selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class III_CurrentURLConfirmationMethod {
    public static String confirmTitle(String ExpectedTitle, String URL){
        String result="";
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get(URL);
        if(driver.getTitle().equals(ExpectedTitle)){
            result="Title is correct!";
        }else{
            result="Wrong title!!!";
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println(confirmTitle("Apple","https://www.apple.com"));
        String title=confirmTitle("Apple", "https://www.apple.com");
        System.out.println(title);
    }
}
