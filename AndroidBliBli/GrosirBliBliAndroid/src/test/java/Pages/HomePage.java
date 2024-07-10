package Pages;

import Locators.HomePageLocators;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    public AppiumDriver driver;
    public WebDriverWait wait;

    public HomePage(AppiumDriver driver, WebDriverWait wait)
    {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean isLoginButtonAvailabe() {
        boolean isLoginAvailable = driver.findElement(HomePageLocators.login).isEnabled();
        driver.findElement(HomePageLocators.login).click();
        return isLoginAvailable;
    }

    public  String enterUserEmail(String userEmail) {
        WebElement email = wait.until(ExpectedConditions.elementToBeClickable(HomePageLocators.userEmail));
        email.sendKeys(userEmail);
        return email.getText();
    }

    public String enterUserPassword(String password) {
        WebElement passWord = wait.until(ExpectedConditions.elementToBeClickable(HomePageLocators.password));
        passWord.click();
        passWord.sendKeys(password);
        return passWord.getText();
    }

    public boolean login() {
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(HomePageLocators.loginSubmitButton));
        boolean isEnabled = loginButton.isEnabled();
        loginButton.click();
        return isEnabled;
    }

    public boolean addressIcon() {
        WebElement AddressIcon = wait.until(ExpectedConditions.elementToBeClickable(HomePageLocators.adressIcon));
        boolean isAddressIconAvailable = AddressIcon.isEnabled();
        AddressIcon.click();
        return isAddressIconAvailable;
    }

    public boolean newAddress() {
        WebElement newAddressIcon = wait.until(ExpectedConditions.elementToBeClickable(HomePageLocators.newAddress));
        boolean isNewAddressIconAvailable = newAddressIcon.isEnabled();
        newAddressIcon.click();
        return isNewAddressIconAvailable;
    }

    public boolean searchLocation() {
        WebElement searchLocation = wait.until(ExpectedConditions.elementToBeClickable(HomePageLocators.searchLocation));
        boolean isSearchLocationAvailable = searchLocation.isEnabled();
        searchLocation.click();
        return isSearchLocationAvailable;
    }

    public String inputSearchLocation(String cityName) {
        WebElement inputSearchLocation = wait.until(ExpectedConditions.elementToBeClickable(HomePageLocators.inputSearchLocation));
        inputSearchLocation.click();
        inputSearchLocation.sendKeys(cityName);
        return inputSearchLocation.getText();
    }

    public boolean searchResults() {
        WebElement searchResults = wait.until(ExpectedConditions.elementToBeClickable(HomePageLocators.searchResults));
        boolean isSearchResults = searchResults.isEnabled();
        searchResults.click();
        return isSearchResults;
    }

    public boolean selectThisLocation() {
        WebElement selectThisLocation = wait.until(ExpectedConditions.elementToBeClickable(HomePageLocators.selectThisLocation));
        boolean isSelectThisLocation = selectThisLocation.isEnabled();
        selectThisLocation.click();
        return isSelectThisLocation;
    }

    public String addressLabel(String addressLabel) {
        WebElement addressName = wait.until(ExpectedConditions.elementToBeClickable(HomePageLocators.adressLabel));
        addressName.sendKeys(addressLabel);
        return addressName.getText();
    }

    public String recipientName(String userName) {
        WebElement recName = wait.until(ExpectedConditions.elementToBeClickable(HomePageLocators.recipientName));
        recName.sendKeys(userName);
        return recName.getText();
    }

    public String recipientMobile(String mobileNumber) {
        String uiScrollable = "new UiScrollable(new UiSelector().scrollable(true))"
                + ".scrollIntoView(new UiSelector().text(\"Recipient's phone number\"))";

        driver.findElement(AppiumBy.androidUIAutomator(uiScrollable)).click();
        WebElement recNo = wait.until(ExpectedConditions.elementToBeClickable(HomePageLocators.recipientMobile));
        recNo.sendKeys(mobileNumber);
        return recNo.getText();
    }

    public boolean toggle() {
        WebElement toggles = wait.until(ExpectedConditions.elementToBeClickable(HomePageLocators.toggle));
        toggles.click();
        boolean isClickedToggle = toggles.isEnabled();
        return isClickedToggle;
    }

    public boolean saveAddress() {
        WebElement saveAdd = wait.until(ExpectedConditions.elementToBeClickable(HomePageLocators.saveAddress));
        boolean issaveAdd = saveAdd.isEnabled();
        saveAdd.click();
        return issaveAdd;
    }

    public boolean confirmSave() {
        WebElement confirmAdd = wait.until(ExpectedConditions.elementToBeClickable(HomePageLocators.correctSave));
        boolean isConfirmAdd = confirmAdd.isEnabled();
        confirmAdd.click();
        return isConfirmAdd;
    }
}
