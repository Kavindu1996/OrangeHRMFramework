package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutPage {

    WebDriver driver;
    public LogOutPage(WebDriver driver){
        this.driver = driver;
    }

    By profileIcon = By.xpath("//p[@class='oxd-userdropdown-name']");
    By logoutBtn = By.xpath("//a[text()='Logout']");

    public void logOut(){
        driver.findElement(profileIcon).click();
        driver.findElement(logoutBtn).click();
    }
}
