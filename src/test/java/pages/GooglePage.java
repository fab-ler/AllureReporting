package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.AllureUtils;

public class GooglePage extends BasePage{
    
    public GooglePage(WebDriver driver) {
        super(driver);
    }

    @Step("Opening Google")
    public GooglePage openPage() {
        driver.get("http://google.com");
        AllureUtils.takeScreenshot(driver);
        return this;
    }

    @Step("Input {keyword} into search window")
    public GooglePage inputKeyWord(String keyword) {
        driver.findElement(By.name("q")).sendKeys(keyword);
        AllureUtils.takeScreenshot(driver);
        return this;
    }

    @Step("Click to search button")
    public GooglePage search() {
        driver.findElement(By.name("btnK")).click();
        AllureUtils.takeScreenshot(driver);
        return this;
    }
}
