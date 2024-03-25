package com.solvd.carina_cucumber_example.cucumber;

import com.solvd.carina_cucumber_example.gui.pages.common.HomePageBaseCucumber;
import com.solvd.carina_cucumber_example.gui.pages.common.LoginPageBaseCucumber;
import com.solvd.carina_cucumber_example.gui.pages.desktop.HomePageCucumber;
import com.solvd.carina_cucumber_example.gui.pages.desktop.LoginPageCucumber;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.webdriver.IDriverPool;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.FindBy;

public class Steps implements IDriverPool, IAbstractTest {

    //private WebDriver driver=getDriver();

    private LoginPageBaseCucumber loginPage=null;

    @Given("I am in the login page of the Para Bank application")
    public void i_am_in_the_login_page_of_the_para_bank_application() {
        // Write code here that turns the phrase above into concrete actions
        //driver.get("https://parabank.parasoft.com/parabank/index.htm");
//        HomePageCucumber homePage=new HomePageCucumber(getDriver());
//        homePage.open();
        HomePageBaseCucumber homePage=initPage(getDriver(), HomePageBaseCucumber.class);
        homePage.open();
        //homePage.openURL("https://parabank.parasoft.com/parabank/index.htm");
        //throw new io.cucumber.java.PendingException();
    }
    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions
//        userInput.type("tautester");
//        passwordInput.type("password");
//        submitButton.click();
//        HomePageCucumber homePage=new HomePageCucumber(getDriver());
        HomePageBaseCucumber homePage=initPage(getDriver(), HomePageBaseCucumber.class);
        homePage.getUserInput().type("tautester");
        homePage.getPasswordInput().type("password");
        loginPage= homePage.clickSubmitButton();
        //throw new io.cucumber.java.PendingException();
    }
    @Then("I should be taken to the overview page")
    public void i_should_be_taken_to_the_overview_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(5000);
        //LoginPageCucumber loginPage=new LoginPageCucumber(getDriver());
        loginPage.getLogOutButton().isDisplayed();
        loginPage.getLogOutButton().click();
//        logOutButton.isDisplayed();
//        logOutButton.click();
       // throw new io.cucumber.java.PendingException();
    }
}
