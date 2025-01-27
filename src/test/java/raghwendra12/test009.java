package raghwendra12;

import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public class test009 {

   @Description("Testing of emedicoz website only login page")
   @Test

    public void eMedicozlogininfo(){

//       EdgeOptions options = new EdgeOptions();
//       options.addArguments("--incognito");
//       options.addArguments("--maximized");
       WebDriver driver = new EdgeDriver();
//     /  WebDriver driver34 = new ChromeDriver();
       driver.navigate().to("https://www.emedicoz.com/");
       System.out.println(driver.getTitle());
//       Assert.assertEquals(driver.getTitle(),);
       WebElement buttonSubmit = driver.findElement(By.className("loginbtnSignupbtn"));
       buttonSubmit.click();
       WebElement mobileInputBox = driver.findElement(By.xpath("//input[@type='tel']"));
       mobileInputBox.sendKeys("9512433922");
      WebElement continueBtn = driver.findElement(By.className("common-bottom-btn"));
      continueBtn.click();
      WebDriverWait wait3 = new WebDriverWait(driver,Duration.ofSeconds(20));
       List<WebElement> CONT = wait3.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[contains(text(), 'Logout & Continue')]")));

       WebElement continue1 = driver.findElement(By.xpath("//button[contains(text(), 'Logout & Continue')]"));
       continue1.click();

//       WebElement otp1 = driver.findElement(By.xpath("//input[@type='text' and contains(@class, 'otp-field') and @maxlength='1,2 ,3,4' and @style='box-shadow: black 1px 1px 2px;']\n"));
//         otp1.sendKeys("2000");
       String otp = "2000";

       // Create a WebDriverWait instance (waiting for max 10 seconds)
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

       // Wait until all input fields are visible in the OTP box
       List<WebElement> otpFields = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div.otp_box input.otp-field")));
       if (otpFields.size() == otp.length()) {
           // Iterate through the OTP string and input each digit
           for (int i = 0; i < otp.length(); i++) {
               WebElement field = otpFields.get(i);

               // Ensure the field is clickable (to avoid any visibility/interaction issues)
               wait.until(ExpectedConditions.elementToBeClickable(field));

               // Enter the OTP value into the input field
               field.sendKeys(String.valueOf(otp.charAt(i)));
           }
       } else {
           System.out.println("OTP fields count does not match the predefined OTP length.");
       }
       WebElement Submit1 = driver.findElement(By.xpath("//button[@name='submit']\n"));
       Submit1.click();

       // Create a WebDriverWait instance (waiting for max 10 seconds)
//       WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
//
//       // Wait until  all input fields are visible in the OTP box
//       List<WebElement> logout = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[normalize-space()='Logout']")));
//       WebElement logout1 = driver.findElement(By.xpath("//button[normalize-space()='Logout']"));
//       logout1.click();
//       driver.quit();

//       WebElement logout = driver.findElement(By.xpath("//button[normalize-space()='Logout']"));
       WebDriverWait MEDIMART = new WebDriverWait(driver,Duration.ofSeconds(20));
       List<WebElement> Medimart = MEDIMART.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[@class='d-block' and text()='MediMart']\n")));
       WebElement medimart = driver.findElement(By.xpath("//span[@class='d-block' and text()='MediMart']\n"));
       medimart.click();
       WebDriverWait medimart1 = new WebDriverWait(driver,Duration.ofSeconds(50));
       List<WebElement> medimart21 = medimart1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='img_bg' and img[@src='https://dams-apps-production.s3.ap-south-1.amazonaws.com/banner_images/2064142Concept Books for MBBS.png']]\n")));
       WebElement Medimart12 = driver.findElement(By.xpath("//div[@class='img_bg' and img[@src='https://dams-apps-production.s3.ap-south-1.amazonaws.com/banner_images/2064142Concept Books for MBBS.png']]\n"));
       Medimart12.click();
       WebDriverWait medimart123 = new WebDriverWait(driver,Duration.ofSeconds(50));
       List<WebElement> medimart2112 = medimart123.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='back_bg']/img[@src='https://dams-apps-production.s3.ap-south-1.amazonaws.com/banner_images/487453dams-anesthesia-2023-concept-book-front.jpg']\n")));
       WebElement Medimart1245 = driver.findElement(By.xpath("//div[@class='back_bg']/img[@src='https://dams-apps-production.s3.ap-south-1.amazonaws.com/banner_images/487453dams-anesthesia-2023-concept-book-front.jpg']\n"));
       Medimart12.click();











   }
}
