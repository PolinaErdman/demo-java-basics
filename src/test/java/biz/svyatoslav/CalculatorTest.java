package biz.svyatoslav;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTest {
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
}
