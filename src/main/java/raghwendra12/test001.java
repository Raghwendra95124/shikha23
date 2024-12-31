package raghwendra12;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class test001 {
    public static void main(String[] args) {
        ChromiumDriver driver = new ChromeDriver();
        driver.get("https://www.emedicoz.com/");
         driver.quit();
    }
}
