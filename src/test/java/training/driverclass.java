package training;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverclass {

    public static WebDriver driver;

    public void opendriver() {
        String browser;
        browser = System.getProperty("browser");
        if (browser.equalsIgnoreCase("CHROME")) {
            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FIREFOX")) {
            FirefoxDriverManager.getInstance().setup();
        }

    }

    public void closedriver() {
        driver.quit();
    }

}
