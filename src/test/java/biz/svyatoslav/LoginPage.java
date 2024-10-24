package biz.svyatoslav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonCalculate() {
        By buttonCalculateBy = By.xpath(LoginPageXpath.BUTTON_CALCULATE_XPATH);
        WebElement buttonCalculateWebElement = driver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();
    }

    public void sendKeysInputName(String name) {
        By inputNameBy = By.xpath(LoginPageXpath.INPUT_NAME_XPATH);
        WebElement inputNameWebElement = driver.findElement(inputNameBy);
        inputNameWebElement.sendKeys(name);
    }

    public void sendKeysInputHeight(String height) {
        By inputHeightBy = By.xpath(LoginPageXpath.INPUT_HEIGHT_XPATH);
        WebElement inputHeightWebElement = driver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys(height);
    }

    public void sendKeysInputWeight(String weight) {
        By inputWeightBy = By.xpath(LoginPageXpath.INPUT_WEIGHT_XPATH);
        WebElement inputWeightWebElement = driver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys(weight);
    }

    public  void selectGenderFemale() {
        By genderBy = By.xpath(LoginPageXpath.GENDER_FEMALE_XPATH);
        WebElement genderWebElement = driver.findElement(genderBy);
        genderWebElement.click();
    }

    public void selectGenderMale() {
        By genderBy = By.xpath(LoginPageXpath.GENDER_MALE_XPATH);
        WebElement genderWebElement = driver.findElement(genderBy);
        genderWebElement.click();
    }

    public String getErrorMessageText() {
        By textMessageBy = By.xpath(LoginPageXpath.ERROR_MESSAGE_XPATH);
        WebElement textMessageWebElement = driver.findElement(textMessageBy);
        return textMessageWebElement.getText();
    }

    public String getResultMessageText() {
        By textMessageBy = By.xpath(LoginPageXpath.RESULT_MESSAGE_XPATH);
        WebElement textMessageWebElement = driver.findElement(textMessageBy);
        return textMessageWebElement.getText();
    }

//    public String getHeaderText() {
//        By textHeaderBy = By.xpath(LoginPageXpath.HEADER_MESSAGE_XPATH);
//        WebElement textHeaderWebElement = driver.findElement(textHeaderBy);
//        return textHeaderWebElement.getText();
//    }
}
