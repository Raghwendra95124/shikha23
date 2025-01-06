package raghwendra12;

import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class test009 {

   @Description("Testing of emedicoz website only login page")
   @Test

    public void eMedicozlogininfo(){

       EdgeOptions options = new EdgeOptions();
       options.addArguments("--incognito");
       options.addArguments("--maximized");
       WebDriver driver = new EdgeDriver(options);
       driver.navigate().to("https://www.emedicoz.com/");
       System.out.println(driver.getTitle());
//       Assert.assertEquals(driver.getTitle(),);
       WebElement buttonSubmit = driver.findElement(By.className("loginbtnSignupbtn"));
       buttonSubmit.click();
       WebElement mobileInputBox = driver.findElement(By.xpath("//input[@type='tel']"));
       mobileInputBox.sendKeys("9512433922");
      WebElement continueBtn = driver.findElement(By.className("common-bottom-btn"));
      continueBtn.click();
       WebElement continue1 = driver.findElement(By.xpath("//button[contains(text(), 'Logout & Continue')]"));
       continue1.click();






    }
}
