package raghwendra12;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class test002 {
    public static void main(String[] args) {

        EdgeOptions edgeOptions = new EdgeOptions();
        EdgeDriver driver = new EdgeDriver();
//        EdgeOptions. ("--start-maximized", "--disable-notifications");
        driver.manage().window().maximize();

//        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.emedicoz.com/");
    }
}
