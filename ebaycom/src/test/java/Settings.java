import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Settings {
    WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeEach
    public void setUpDriver() {
        System.setProperty("webdriver.chrome.driver", "C://Users//ВН/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void openHomePage() {

        driver.get("http://ebay.com");
    }
    @AfterEach
    public void finishTest() {
        driver.quit();
    }
}
