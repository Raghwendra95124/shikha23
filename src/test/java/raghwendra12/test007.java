package raghwendra12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test

public class test007 {
    public static void main(String[] args) {

        EdgeOptions options =new EdgeOptions();
        options.addArguments("--guest");
        options.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(options);
        driver.navigate().to("https://dev.emedicoz.com/qa/emedicoz-admin/auth_panel/login/index");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Emedicoz ADMIN LOGIN");
        Assert.assertEquals(driver.getCurrentUrl(),"https://dev.emedicoz.com/qa/emedicoz-admin/auth_panel/login/index");

//        <input type="text" class="form-control" value="" name="email" placeholder="Email" id="login_username">
        WebElement emailinputBox = driver.findElement(By.id("login_username"));
        emailinputBox.sendKeys("raghwendra@damsdelhi.com");
        WebElement passwordinputbox = driver.findElement(By.id("login_pwd"));
        passwordinputbox.sendKeys("Raghu@123");
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();
//        submitbox.sendKeys("raghwendra@damsdelhi.com");

//        <input type="password" class="form-control input-psswd" name="password" placeholder="Password" id="login_pwd" value="">
//        driver.quit();


    }




}
