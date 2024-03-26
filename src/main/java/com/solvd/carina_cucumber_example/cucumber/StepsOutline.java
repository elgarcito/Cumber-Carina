package com.solvd.carina_cucumber_example.cucumber;

import com.solvd.carina_cucumber_example.gui.pages.common.HomePageBaseCucumber;
import com.solvd.carina_cucumber_example.gui.pages.common.LoginPageBaseCucumber;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.webdriver.IDriverPool;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsOutline implements IDriverPool, IAbstractTest {

    //Before each scenario
    @Before
    public void setUp(){
        getDriver().manage().window().fullscreen();
    }
    private LoginPageBaseCucumber loginPage=null;

    @Given("I am in the login page of the Para Bank application outline")
    public void i_am_in_the_login_page_of_the_para_bank_application_outline() {
        HomePageBaseCucumber homePage=initPage(getDriver(), HomePageBaseCucumber.class);
        homePage.open();
    }

    @When("I enter valid {string} and {string} outline")
    public void i_enter_valid_and_outline(String username,String password) {
        HomePageBaseCucumber homePage=initPage(getDriver(), HomePageBaseCucumber.class);
        homePage.getUserInput().type(username);
        homePage.getPasswordInput().type(password);
        loginPage= homePage.clickSubmitButton();
    }

    @Then("I should be taken to the overview page outline")
    public void i_should_be_taken_to_the_overview_page_outline() throws InterruptedException {
        Thread.sleep(5000);
        loginPage.getLogOutButton().isDisplayed();
        loginPage.getLogOutButton().click();
    }

    //after each scenario
    @After
    public void shutDown(){
       // getDriver().quit();
    }

}
