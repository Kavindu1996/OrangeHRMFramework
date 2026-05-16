package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class DashboardPage {

    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    By dashBoardText = By.xpath("//h6[text()='Dashboard']");

    public boolean verifyDashboard() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver.findElement(dashBoardText).isDisplayed();
    }
}
