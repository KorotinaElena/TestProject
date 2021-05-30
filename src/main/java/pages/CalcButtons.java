package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

public class CalcButtons {

    @FindBy(css = "input.gLFyf.gsfi")
    public WebElement Calc;

    @FindBy(xpath = ".//div[text()='(']")
    public WebElement Buttons;
    @FindBy(xpath = ".//div[text()='1']")
    public WebElement Buttons1;
    @FindBy(xpath = ".//div[text()='+']")
    public WebElement Buttons2;
    @FindBy(xpath = ".//div[text()='2']")
    public WebElement Buttons3;
    @FindBy(xpath = ".//div[text()=')']")
    public WebElement Buttons4;
    @FindBy(xpath = "//*[contains(@aria-label, 'умножение')]")
    public WebElement Buttons5;
    @FindBy(xpath = ".//div[text()='3']")
    public WebElement Buttons6;
    @FindBy(xpath = "//*[contains(@aria-label, 'вычитание')]")
    public WebElement Buttons7;
    @FindBy(xpath = ".//div[text()='4']")
    public WebElement Buttons8;
    @FindBy(xpath = ".//div[text()='0']")
    public WebElement Buttons9;
    @FindBy(xpath = "//*[contains(@aria-label, 'деление')]")
    public WebElement Buttons10;
    @FindBy(xpath = ".//div[text()='5']")
    public WebElement Buttons11;
    @FindBy(xpath = ".//div[text()='=']")
    public WebElement Buttons12;

    public void clickButtons() {
        Buttons.click();
        Buttons1.click();
        Buttons2.click();
        Buttons3.click();
        Buttons4.click();
        Buttons5.click();
        Buttons6.click();
        Buttons7.click();
        Buttons8.click();
        Buttons9.click();
        Buttons10.click();
        Buttons11.click();
        Buttons12.click();
    }


    public CalcButtons(WebDriver driver) {
        initElements(driver, this);
    }
}



