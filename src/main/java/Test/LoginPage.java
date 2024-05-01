package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        driver.get("https://www.wwgoa.com/login");
    }
    public void enterUsername(String username) {
        driver.findElement(By.xpath("//div[@class='control']//input[@name='username']")).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.xpath("//div[@class='control']//input[@name='password']")).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.cssSelector("button[class='button']")).click();
    }

    public String getErrorMessage() {
        return driver.findElement(By.xpath("//div[@type='danger']")).getText();
    }
}
