import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class compra2 {
    @Test
    public void carrinhocompra2() {
        System.setProperty("webdriver.chrome.driver","C:\\Automacao\\Webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");

        WebElement username= driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement login = driver.findElement(By.id("login-button"));
        login.click();

        WebElement backpack = driver.findElement(By.id("item_4_title_link"));
        backpack.click();

        WebElement shoppingcart = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div/div/button"));
        shoppingcart.click();





    }

}