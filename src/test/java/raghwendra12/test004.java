package raghwendra12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class test004 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.emedicoz.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        if (driver.getPageSource().contains("Quick Link")){
            System.out.println("verified");
            Assert.assertTrue(true);

        }else {Assert.assertTrue(false);
        }
driver.quit();

    }
}
