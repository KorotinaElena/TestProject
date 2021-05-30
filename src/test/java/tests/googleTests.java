package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.CalcButtons;
import pages.CalcThree;
import pages.CalcTwo;

import java.awt.*;
import java.security.Key;



public class googleTests {

    private static WebDriver driver;
    private static CalcButtons CalcButtons;
    private static CalcTwo CalcTwo;
    private static CalcThree CalcThree;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        CalcButtons = new CalcButtons(driver);
        CalcTwo = new CalcTwo(driver);
        CalcThree = new CalcThree(driver);
    }

    @Test
    public void test1() {
        driver.get("http://google.com");
        CalcButtons.Calc.sendKeys("Калькулятор", Keys.ENTER);
        CalcButtons.clickButtons();
    }

    @Test
    public void test2() {
        driver.get("http://google.com");
        CalcTwo.Calc2.sendKeys("Калькулятор", Keys.ENTER);
        CalcTwo.clickBut();
    }
    @Test
    public void test3() {
        driver.get("http://google.com");
        CalcThree.Calc3.sendKeys("Калькулятор", Keys.ENTER);
        CalcThree.clickB();

    }

    @AfterAll
    public static void teardown() {
        driver.quit();
    }

}
