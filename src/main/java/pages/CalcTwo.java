package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

public class CalcTwo {

    @FindBy(css = "input.gLFyf.gsfi")
    public WebElement Calc2;

    @FindBy(xpath = ".//div[text()='6']")
    public WebElement But1;
    @FindBy(xpath = "//*[contains(@aria-label, 'деление')]")
    public WebElement But2;
    @FindBy(xpath = ".//div[text()='0']")
    public WebElement But3;
    @FindBy(xpath = ".//div[text()='=']")
    public WebElement But4;

    public void clickBut() {
        But1.click();
        But2.click();
        But3.click();
        But4.click();
    }

    public CalcTwo(WebDriver driver) {
        initElements(driver, this);
    }
}
