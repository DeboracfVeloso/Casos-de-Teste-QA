import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class belezanaweb {
    @Test
    public void carrinhodecompra() {
        System.setProperty("webdriver.chrome.driver","C:\\Automacao\\Webdriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.belezanaweb.com.br/");

        WebElement cookies= driver.findElement(By.id("onetrust-accept-btn-handler"));
        cookies.click();

        WebElement hair= driver.findElement(By.xpath("/html/body/header/nav/ul/li[3]/a"));
        hair.click();




    }
}
