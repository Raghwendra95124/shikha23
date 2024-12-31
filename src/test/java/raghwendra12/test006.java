package raghwendra12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class test006 {
    public static void main(String[] args) {
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://admin.emedicoz.com/");
        System.out.println(driver1.getTitle());
        System.out.println(driver1.getCurrentUrl());
        if (driver1.getPageSource().contains("Dams ERP")){
            System.out.println("Verified");
            Assert.assertTrue(true);
        }else {Assert.assertTrue(false);
        }
        driver1.quit();
    }


}
