package Selenium;

import comun.LeerProperties;
import net.bytebuddy.asm.Advice;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {
    public static Logger log = Logger.getLogger(SeleniumTest.class);
    static LeerProperties properties = new LeerProperties();

    public static void main(String[] args) throws InterruptedException {

        String rutaChrome = System.getProperty("user.dir") + "\\chromeDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", rutaChrome);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(options);
        properties.getSystemProperties();

        //un implict wait sirve para demorar la ejecución, aplica a todas las acciones la pausa configurada
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MICROSECONDS);
        log.info("Iniciar los parámetros de configuración");

        driver.get(System.getProperty("URL"));
        log.info("Accede a la página");

        WebElement txtUserId = driver.findElement(By.id("txtUsername"));
        WebElement txtUserName = driver.findElement(By.name("txtUsername"));
        WebElement txtUserXpath = driver.findElement(By.xpath("//div[@id='divUsername']/input"));
        txtUserId.sendKeys("Admin");
        log.info("Ingresa el usuario");

        WebElement txtPassId = driver.findElement(By.id("txtPassword"));
        WebElement txtPassName = driver.findElement(By.name("txtPassword"));
        WebElement txtPassXpath = driver.findElement(By.xpath("//div[@id='divPassword']/input"));
        txtPassId.sendKeys("admin123");
        log.info("Ingresa la contraseña");

        WebElement btnLogin = driver.findElement(By.id("btnLogin"));
        btnLogin.click();
        log.info("Clic en botón login");


        try {
            WebElement linkWelcome = driver.findElement(By.xpath("//a[@id='welcome']"));
            if (linkWelcome.getSize() != null) {
                log.info("login exitoso");
            }
        } catch (NoSuchElementException e) {
            log.info("login NO exitoso " + e);
        }

        driver.findElement(By.cssSelector(""));
        driver.findElement(By.tagName(""));
        //metodo que genere un numero random
        //metodo que genera un nombre random


        Thread.sleep(5000);



        driver.quit();

    }//main

    public String randomName(){
        String[] pesrona= new String[]{"Gerson","Jony","Carlos","Julia","Yessi"};
        return "";
    }

}
