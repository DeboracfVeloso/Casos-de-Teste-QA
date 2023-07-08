import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Teste01 {

    @Test
    public void loginfacebook() {

     System.setProperty("webdriver.chrome.driver" , "C:\\Automacao\\Webdriver\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver = new  ChromeDriver();

     driver.get("https://facebook.com");

     WebElement emailField = driver.findElement(By.id("email"));
     emailField.sendKeys("17991280111");

     WebElement passwordField = driver.findElement(By.id("pass"));
     passwordField.sendKeys("xk590-+*");

     WebElement enterField = driver. findElement(By.name("login"));
     enterField.click();








    }
}
