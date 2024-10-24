package biz.svyatoslav;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTest {
    @Test
    public void test0() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        String textHeaderXpath = "/html/body/table/tbody/tr[1]/td";
        By textHeaderBy = By.xpath(textHeaderXpath);
        WebElement textHeaderWebElement = driver.findElement(textHeaderBy);
        String actual = textHeaderWebElement.getText();
        Assertions.assertTrue(actual.contains("Расчёт веса"), "Должно было быть: Расчёт веса");
    }

    @Test
    public void test1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath);
        WebElement inputNameWebElement = driver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("John");

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = driver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();
    }

    @Test
    public void test2() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath);
        WebElement inputNameWebElement = driver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("John");

        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath);
        WebElement inputHeightWebElement = driver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("180");

        String inputWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightBy = By.xpath(inputWeightXpath);
        WebElement inputWeightWebElement = driver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys("80");

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = driver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();
    }

    @Test
    public void test3() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath);
        WebElement inputNameWebElement = driver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("John");

        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath);
        WebElement inputHeightWebElement = driver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("180");

        String inputWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightBy = By.xpath(inputWeightXpath);
        WebElement inputWeightWebElement = driver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys("80");

        String genderFemaleXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[2]";
        By genderBy = By.xpath(genderFemaleXpath);
        WebElement genderWebElement = driver.findElement(genderBy);
        genderWebElement.click();

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = driver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();
    }

    @Test
    public void test4() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = driver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();

        String textMessageXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b";
        By textMessageBy = By.xpath(textMessageXpath);
        WebElement textMessageWebElement = driver.findElement(textMessageBy);
        String actual = textMessageWebElement.getText();
        String expected = "Не указано имя.\n" +
                "Рост должен быть в диапазоне 50-300 см.\n" +
                "Вес должен быть в диапазоне 3-500 кг.\n" +
                "Не указан пол.";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath);
        WebElement inputNameWebElement = driver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("John");

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = driver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();

        String textMessageXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b";
        By textMessageBy = By.xpath(textMessageXpath);
        WebElement textMessageWebElement = driver.findElement(textMessageBy);
        String actual = textMessageWebElement.getText();
        String expected = "Рост должен быть в диапазоне 50-300 см.\n" +
                "Вес должен быть в диапазоне 3-500 кг.\n" +
                "Не указан пол.";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test6() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath);
        WebElement inputHeightWebElement = driver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("180");

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = driver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();

        String textMessageXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b";
        By textMessageBy = By.xpath(textMessageXpath);
        WebElement textMessageWebElement = driver.findElement(textMessageBy);
        String actual = textMessageWebElement.getText();
        String expected = "Не указано имя.\n" +
                "Вес должен быть в диапазоне 3-500 кг.\n" +
                "Не указан пол.";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test7() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightBy = By.xpath(inputWeightXpath);
        WebElement inputWeightWebElement = driver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys("80");

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = driver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();

        String textMessageXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b";
        By textMessageBy = By.xpath(textMessageXpath);
        WebElement textMessageWebElement = driver.findElement(textMessageBy);
        String actual = textMessageWebElement.getText();
        String expected = "Не указано имя.\n" +
                "Рост должен быть в диапазоне 50-300 см.\n" +
                "Не указан пол.";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test8() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath);
        WebElement inputNameWebElement = driver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("John");

        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath);
        WebElement inputHeightWebElement = driver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("180");

        String inputWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightBy = By.xpath(inputWeightXpath);
        WebElement inputWeightWebElement = driver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys("80");

        String genderFemaleXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[2]";
        By genderBy = By.xpath(genderFemaleXpath);
        WebElement genderWebElement = driver.findElement(genderBy);
        genderWebElement.click();

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = driver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();

        String textMessageXpath = "/html/body/table/tbody/tr[2]/td[2]";
        By textMessageBy = By.xpath(textMessageXpath);
        WebElement textMessageWebElement = driver.findElement(textMessageBy);
        String actual = textMessageWebElement.getText();
        String expected = "Идеальная масса тела";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test9() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath);
        WebElement inputNameWebElement = driver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("John");

        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath);
        WebElement inputHeightWebElement = driver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("165");

        String inputWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightBy = By.xpath(inputWeightXpath);
        WebElement inputWeightWebElement = driver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys("45");

        String genderMaleXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]";
        By genderBy = By.xpath(genderMaleXpath);
        WebElement genderWebElement = driver.findElement(genderBy);
        genderWebElement.click();

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = driver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();

        String textMessageXpath = "/html/body/table/tbody/tr[2]/td[2]";
        By textMessageBy = By.xpath(textMessageXpath);
        WebElement textMessageWebElement = driver.findElement(textMessageBy);
        String actual = textMessageWebElement.getText();
        String expected = "Слишком малая масса тела";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test10() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath);
        WebElement inputNameWebElement = driver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("John");

        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath);
        WebElement inputHeightWebElement = driver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("165");

        String inputWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightBy = By.xpath(inputWeightXpath);
        WebElement inputWeightWebElement = driver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys("75");

        String genderFemaleXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[2]";
        By genderBy = By.xpath(genderFemaleXpath);
        WebElement genderWebElement = driver.findElement(genderBy);
        genderWebElement.click();

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = driver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();

        String textMessageXpath = "/html/body/table/tbody/tr[2]/td[2]";
        By textMessageBy = By.xpath(textMessageXpath);
        WebElement textMessageWebElement = driver.findElement(textMessageBy);
        String actual = textMessageWebElement.getText();
        String expected = "Умеренный избыток массы тела";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test11() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath);
        WebElement inputNameWebElement = driver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("John");

        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath);
        WebElement inputHeightWebElement = driver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("165");

        String inputWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightBy = By.xpath(inputWeightXpath);
        WebElement inputWeightWebElement = driver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys("75");

        String genderMaleXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]";
        By genderBy = By.xpath(genderMaleXpath);
        WebElement genderWebElement = driver.findElement(genderBy);
        genderWebElement.click();

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = driver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();

        String textMessageXpath = "/html/body/table/tbody/tr[2]/td[2]";
        By textMessageBy = By.xpath(textMessageXpath);
        WebElement textMessageWebElement = driver.findElement(textMessageBy);
        String actual = textMessageWebElement.getText();
        String expected = "Незначительный избыток массы тела";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test12() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath);
        WebElement inputNameWebElement = driver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("John");

        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath);
        WebElement inputHeightWebElement = driver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("165");

        String inputWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightBy = By.xpath(inputWeightXpath);
        WebElement inputWeightWebElement = driver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys("85");

        String genderMaleXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]";
        By genderBy = By.xpath(genderMaleXpath);
        WebElement genderWebElement = driver.findElement(genderBy);
        genderWebElement.click();

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = driver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();

        String textMessageXpath = "/html/body/table/tbody/tr[2]/td[2]";
        By textMessageBy = By.xpath(textMessageXpath);
        WebElement textMessageWebElement = driver.findElement(textMessageBy);
        String actual = textMessageWebElement.getText();
        String expected = "Значительный избыток массы тела, тучность";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test13() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        String inputNameXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input";
        By inputNameBy = By.xpath(inputNameXpath);
        WebElement inputNameWebElement = driver.findElement(inputNameBy);
        inputNameWebElement.sendKeys("John");

        String inputHeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input";
        By inputHeightBy = By.xpath(inputHeightXpath);
        WebElement inputHeightWebElement = driver.findElement(inputHeightBy);
        inputHeightWebElement.sendKeys("1650");

        String inputWeightXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input";
        By inputWeightBy = By.xpath(inputWeightXpath);
        WebElement inputWeightWebElement = driver.findElement(inputWeightBy);
        inputWeightWebElement.sendKeys("85");

        String genderMaleXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]";
        By genderBy = By.xpath(genderMaleXpath);
        WebElement genderWebElement = driver.findElement(genderBy);
        genderWebElement.click();

        String buttonCalculateXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By buttonCalculateBy = By.xpath(buttonCalculateXpath);
        WebElement buttonCalculateWebElement = driver.findElement(buttonCalculateBy);
        buttonCalculateWebElement.click();

        String textMessageXpath = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b";
        By textMessageBy = By.xpath(textMessageXpath);
        WebElement textMessageWebElement = driver.findElement(textMessageBy);
        String actual = textMessageWebElement.getText();
        String expected = "Рост должен быть в диапазоне 50-300 см.";

        Assertions.assertEquals(expected, actual);
    }
}
