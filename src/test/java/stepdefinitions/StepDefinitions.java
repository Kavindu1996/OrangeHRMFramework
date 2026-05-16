package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.AdminPage;
import pages.DashboardPage;
import pages.LogInPage;
import pages.LogOutPage;
import utils.DriverFactory;


public class StepDefinitions {

    WebDriver driver;

    LogInPage logInPage;
    DashboardPage dashboardPage;
    AdminPage adminPage;
    LogOutPage logOutPage;






        @Given("user opens OrangeHRM login page")
        public void user_opens_orange_hrm_login_page() {
            System.out.println("STEP LOADED");
        }

        @When("user enters valid credentials")
        public void user_enters_valid_credentials() {
            System.out.println("LOGIN STEP");
        }

        @Then("user verifies dashboard page")
        public void user_verifies_dashboard_page() {
            System.out.println("DASHBOARD STEP");
        }


//    @Given("user opens OrangeHRM login page")
//    public void openSite(){
//        driver = DriverFactory.initDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//    }

//    @When("user enters valid credentials")
//    public void login(){
//        logInPage = new LogInPage(driver);
//        logInPage.login("Admin", "admin123");
//    }

//    @Then("user verifies dashboard page")
//    public void verifyDashboard(){
//        dashboardPage = new DashboardPage(driver);
//        assert dashboardPage.verifyDashboard();
//    }

//    @When("user navigates to admin page")
//    public void openAdmin(){
//        adminPage = new AdminPage(driver);
//        adminPage.openAdminPage();
//    }

//    @Then("user verifies system users page")
//    public void verifySystemUsers(){
//        assert adminPage.verifyAdminPage();
//    }
//
//    @And("user log out")
//    public void logOut(){
//        logOutPage = new LogOutPage(driver);
//        logOutPage.logOut();
//        driver.quit();
    }

