package com.solvd.carina_cucumber_example.gui.pages.desktop;

import com.solvd.carina_cucumber_example.gui.pages.common.HomePageBaseCucumber;
import com.solvd.carina_cucumber_example.gui.pages.common.LoginPageBaseCucumber;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP,parentClass = HomePageBaseCucumber.class)
public class HomePageCucumber extends HomePageBaseCucumber {
    @FindBy(css = "input[type=\"text\"]")
    private ExtendedWebElement userInput;
    @FindBy(css = "input[type=\"password\"]")
    private ExtendedWebElement passwordInput;
    @FindBy(css = "input[type=\"submit\"]")
    private ExtendedWebElement submitButton;

    @FindBy(xpath = "//h2[contains(text(),\"Customer Login\")]")
    private ExtendedWebElement customerLoginMessage;
    public HomePageCucumber(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(customerLoginMessage);
    }

    @Override
    public ExtendedWebElement getUserInput() {
        return userInput;
    }
    @Override
    public ExtendedWebElement getPasswordInput() {
        return passwordInput;
    }
    @Override
    public LoginPageBaseCucumber clickSubmitButton() {
        submitButton.click();
        return initPage(driver,LoginPageBaseCucumber.class);
    }

    @Override
    public void openURL(String url) {
        super.openURL(url);
    }
}
