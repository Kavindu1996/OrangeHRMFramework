package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPage {

    WebDriver driver;
    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }

    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    //wait.until(ExpectedConditions.visibilityOfElementLocated(adminMenu));
    By adminMenu = By.xpath("//span[normalize-space()='Admin']");
    //By adminMenu = By.xpath("//span[text()='Admin']");
    By systemUsers = By.xpath("//h5[text()='System Users']");

    public void openAdminPage() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(adminMenu).click();
    }

    public boolean verifyAdminPage(){
        return driver.findElement(systemUsers).isDisplayed();
    }
}
