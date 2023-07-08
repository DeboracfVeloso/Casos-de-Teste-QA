import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class sauce01 {


    @Test
    public void Sauce() {

        System.setProperty("webdriver.chrome.driver", "C:\\Automacao\\Webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/");

        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("problem_user");

        WebElement PasswordId = driver.findElement(By.id("password"));
        PasswordId.sendKeys(("secret_sauce"));

        WebElement Login = driver.findElement(By.id("login-button"));
        Login.click();


    }
}

