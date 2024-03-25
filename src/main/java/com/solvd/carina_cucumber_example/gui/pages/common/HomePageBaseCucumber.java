package com.solvd.carina_cucumber_example.gui.pages.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBaseCucumber extends AbstractPage {
    public HomePageBaseCucumber(WebDriver driver) {
        super(driver);
    }

    public abstract ExtendedWebElement getUserInput();
    public abstract ExtendedWebElement getPasswordInput();
    public abstract LoginPageBaseCucumber clickSubmitButton();

}
