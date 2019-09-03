import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Settings {

    WebDriver driver;
//    @BeforeAll
//    public void setUpDriver() {
//        System.setProperty("webdriver.chrome.driver","C:/Repository/Ebay.com/chromedriver.exe");
//        driver = new ChromeDriver();
//    }

    @Test
    public void openHomePage() {
        System.setProperty("webdriver.chrome.driver", "C://Users//ВН/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://epam.com");
    }
}
