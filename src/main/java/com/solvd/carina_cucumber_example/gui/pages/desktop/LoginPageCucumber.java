package com.solvd.carina_cucumber_example.gui.pages.desktop;

import com.solvd.carina_cucumber_example.gui.pages.common.HomePageBaseCucumber;
import com.solvd.carina_cucumber_example.gui.pages.common.LoginPageBaseCucumber;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP,parentClass = LoginPageBaseCucumber.class)
public class LoginPageCucumber extends LoginPageBaseCucumber {

    @FindBy(xpath = "//a[contains(text(),\"Log Out\")]")
    private ExtendedWebElement logOutButton;
    public LoginPageCucumber(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(logOutButton);
    }
    @Override
    public ExtendedWebElement getLogOutButton() {
        return logOutButton;
    }
}
