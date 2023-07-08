import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class compra3 {
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

        WebElement packcart = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button"));
        packcart.click();

        WebElement shirtcart = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[3]/div[3]/button"));
        shirtcart.click();

        WebElement shoppingcart = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]/a"));
        shoppingcart.click();

        WebElement packremove = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[1]/div[3]/div[2]/div[2]/button"));
        packremove.click();

        WebElement checkout = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/a[2]"));
        checkout.click();

        WebElement firstname = driver.findElement(By.id("first-name"));
        firstname.sendKeys("debora");

        WebElement lastname = driver.findElement(By.id("last-name"));
        lastname. sendKeys("veloso");

        WebElement zipcode = driver.findElement(By.id("postal-code"));
        zipcode.sendKeys("302030");

        WebElement cont = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/form/div[2]/input"));
        cont.click();

        WebElement finish = driver.findElement(By.xpath("/html/body/div/div[2]/div[3]/div/div[2]/div[8]/a[2]"));
        finish.click();



























    }


}
