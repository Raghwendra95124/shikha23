package raghwendra12;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class test003 {
    public static void main(String[] args) throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.navigate().to("https://web.whatsapp.com/");
        chromeDriver.navigate().to(new URL("https://www.w3.org/TR/webdriver2/"));
        chromeDriver.navigate().back();
        chromeDriver.navigate().refresh();
        chromeDriver.quit();



    }
}
