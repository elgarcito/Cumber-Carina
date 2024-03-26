package com.solvd.carina_cucumber_example.cucumber;

import com.solvd.carina_cucumber_example.gui.pages.common.HomePageBaseCucumber;
import com.solvd.carina_cucumber_example.gui.pages.common.LoginPageBaseCucumber;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.webdriver.IDriverPool;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class StepsDataTable implements IDriverPool, IAbstractTest {

    private LoginPageBaseCucumber loginPage=null;

    @Given("I am in the login page of the Para Bank application using data table")
    public void i_am_in_the_login_page_of_the_para_bank_application_using_data_table() {
        HomePageBaseCucumber homePage=initPage(getDriver(), HomePageBaseCucumber.class);
        homePage.open();
    }

    //This doesn't work anymore
    @When("I enter valid credentials using data table")
    public void i_enter_valid_credentials_using_data_table(DataTable table) {
        List<String> loginForm =table.asList();
        HomePageBaseCucumber homePage=initPage(getDriver(), HomePageBaseCucumber.class);
        homePage.getUserInput().type(loginForm.get(0));
        homePage.getPasswordInput().type(loginForm.get(1));
        loginPage= homePage.clickSubmitButton();
    }

    @Then("I should be taken to the overview page using data table")
    public void i_should_be_taken_to_the_overview_page_using_data_table() throws InterruptedException {
        Thread.sleep(5000);
        loginPage.getLogOutButton().isDisplayed();
        loginPage.getLogOutButton().click();
    }
}
