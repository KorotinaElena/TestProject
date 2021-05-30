package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

public class CalcThree {
    @FindBy(css = "input.gLFyf.gsfi")
    public WebElement Calc3;

    @FindBy(xpath = "//*[contains(@aria-label, 'синус')]")
    public WebElement Butt1;
    @FindBy(xpath = ".//div[text()='(']")
    public WebElement Butt2;
    @FindBy(xpath = ".//div[text()='=']")
    public WebElement Butt3;

    public void clickB() {
        Butt1.click();
        Butt2.click();
        Butt3.click();
    }

    public CalcThree(WebDriver driver) {
        initElements(driver, this);
    }
}
