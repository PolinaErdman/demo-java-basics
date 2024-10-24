package biz.svyatoslav;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTest {

//    @Test
//    public void test0() {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
//        LoginPage loginPage = new LoginPage(driver);
//        String actual = loginPage.getHeaderText();
//        String expected = LoginPageMessages.HEADER_TEXT;
//        Assertions.assertEquals(expected, actual);
//    }

    @Test
    public void test1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysInputName("Jhon");
        loginPage.clickButtonCalculate();
    }

    @Test
    public void test2() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysInputName("Jhon");
        loginPage.sendKeysInputHeight("180");
        loginPage.sendKeysInputWeight("80");
        loginPage.clickButtonCalculate();
    }

    @Test
    public void test3() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysInputName("Jhon");
        loginPage.sendKeysInputHeight("180");
        loginPage.sendKeysInputWeight("80");
        loginPage.selectGenderFemale();
        loginPage.clickButtonCalculate();
    }

    @Test
    public void test4() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickButtonCalculate();
        String actual = loginPage.getErrorMessageText();
        String expected = LoginPageMessages.INVALID_NAME_HEIGHT_WEIGHT_GENDER;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysInputName("Jhon");
        loginPage.clickButtonCalculate();
        String actual = loginPage.getErrorMessageText();
        String expected = LoginPageMessages.INVALID_HEIGHT_WEIGHT_GENDER;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysInputHeight("180");
        loginPage.clickButtonCalculate();
        String actual = loginPage.getErrorMessageText();
        String expected = LoginPageMessages.INVALID_NAME_WEIGHT_GENDER;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysInputWeight("80");
        loginPage.clickButtonCalculate();
        String actual = loginPage.getErrorMessageText();
        String expected = LoginPageMessages.INVALID_NAME_HEIGHT_GENDER;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test8() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysInputName("Jhon");
        loginPage.sendKeysInputHeight("180");
        loginPage.sendKeysInputWeight("80");
        loginPage.selectGenderFemale();
        loginPage.clickButtonCalculate();
        String actual = loginPage.getResultMessageText();
        String expected = LoginPageMessages.RESULT_IDEAL;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test9() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysInputName("Jhon");
        loginPage.sendKeysInputHeight("165");
        loginPage.sendKeysInputWeight("45");
        loginPage.selectGenderMale();
        loginPage.clickButtonCalculate();
        String actual = loginPage.getResultMessageText();
        String expected = LoginPageMessages.RESULT_TOO_LOW;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test10() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysInputName("Jhon");
        loginPage.sendKeysInputHeight("165");
        loginPage.sendKeysInputWeight("75");
        loginPage.selectGenderFemale();
        loginPage.clickButtonCalculate();
        String actual = loginPage.getResultMessageText();
        String expected = LoginPageMessages.RESULT_FAT2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test11() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysInputName("Jhon");
        loginPage.sendKeysInputHeight("165");
        loginPage.sendKeysInputWeight("75");
        loginPage.selectGenderMale();
        loginPage.clickButtonCalculate();
        String actual = loginPage.getResultMessageText();
        String expected = LoginPageMessages.RESULT_FAT1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test12() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysInputName("Jhon");
        loginPage.sendKeysInputHeight("165");
        loginPage.sendKeysInputWeight("85");
        loginPage.selectGenderMale();
        loginPage.clickButtonCalculate();
        String actual = loginPage.getResultMessageText();
        String expected = LoginPageMessages.RESULT_FAT3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test13() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.sendKeysInputName("Jhon");
        loginPage.sendKeysInputHeight("1650");
        loginPage.sendKeysInputWeight("85");
        loginPage.selectGenderMale();
        loginPage.clickButtonCalculate();
        String actual = loginPage.getErrorMessageText();
        String expected = LoginPageMessages.INVALID_HEIGHT;
        Assertions.assertEquals(expected, actual);
    }
}
