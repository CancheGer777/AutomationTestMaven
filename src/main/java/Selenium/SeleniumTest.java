package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        String rutaChrome = System.getProperty("user.dir") + "\\chromeDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",rutaChrome);

        WebDriver driver = new ChromeDriver();

        driver.get("https://saucelabs.com/");
        Thread.sleep(5000);

        driver.quit();

    }
}
