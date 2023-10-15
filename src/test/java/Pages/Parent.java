package Pages;

import Utilities.DriverCenter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {

    WebDriverWait wait=new WebDriverWait(DriverCenter.getDriver(), Duration.ofSeconds(20));
    public void myClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        element.click();
    }

    public void mySendKeys(WebElement element, String str) {
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.clear();
        element.sendKeys(str);
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverCenter.getDriver();
        js.executeScript("arguments[0].scrollIntoView(false);", element);
    }

    public void verifyContainsText(WebElement element, String value) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
        new Actions(DriverCenter.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    public void selectContainElement(WebElement element, String value) {
        wait.until(ExpectedConditions.visibilityOf(element));
        Select ddMenu = new Select(element);
        ddMenu.selectByValue(value);
    }

    public void hoverFunction(WebElement element) {
        Actions actions = new Actions(DriverCenter.getDriver());
        scrollToElement(element);
        Action action = actions.moveToElement(element).build();
        action.perform();
    }

    public static void waiting(int second) {
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
