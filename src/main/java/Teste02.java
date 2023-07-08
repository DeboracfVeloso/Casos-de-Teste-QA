import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class Teste02 {

    public void loginfacebook() {

        System.setProperty("webdriver.chrome.driver" , "C:\\Automacao\\Webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new  ChromeDriver();

        driver.get("https://facebook.com");

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("dcfv@mentoria.com.br");






    }
}

