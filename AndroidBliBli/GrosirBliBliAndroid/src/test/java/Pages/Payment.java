package Pages;

import Locators.PaymentLocators;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Payment {
    public AppiumDriver driver;
    public WebDriverWait wait;

    public Payment(AppiumDriver driver, WebDriverWait wait)
    {
        this.driver = driver;
        this.wait = wait;
    }
    public void productDetails() {
        String uiScrollable = "new UiScrollable(new UiSelector().scrollable(true))"
                + ".scrollIntoView(new UiSelector().resourceId(\"blibli.mobile.commerce:id/tv_change_payment\"))";

        driver.findElement(AppiumBy.androidUIAutomator(uiScrollable)).click();
    }

//    public void changeBankAccount() {
//        try {
//            System.out.println("Waiting for Change Account button to be clickable...");
//            WebElement changeAccount = wait.until(ExpectedConditions.elementToBeClickable(PaymentLocators.changeAccount));
//            System.out.println("Attempting to click Change Account button...");
//            changeAccount.click();
//            System.out.println("Change Account button clicked.");
//        } catch (Exception e) {
//            System.err.println("Exception occurred: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }

    public String chosenBank(String bankName) {
        String locator = PaymentLocators.chosenBank.replace("BankName", bankName);
        WebElement bankElement = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator(locator)));
        String enteredBankName = bankElement.getText();
        bankElement.click();
        return enteredBankName;
    }

    public boolean chooseMethod() {
        WebElement choosenMethod = wait.until(ExpectedConditions.elementToBeClickable(PaymentLocators.chooseMethod));
        boolean isChooseMethod = choosenMethod.isEnabled();
        choosenMethod.click();
        return isChooseMethod;
    }

    public boolean payButton() {
        WebElement payButton = wait.until(ExpectedConditions.elementToBeClickable(PaymentLocators.PayButton));
        boolean isPayButtonAvailable = payButton.isEnabled();
        payButton.click();
        return isPayButtonAvailable;
    }

    public boolean confirmPay() {
        WebElement confirmPay = wait.until(ExpectedConditions.elementToBeClickable(PaymentLocators.continuePayment));
        boolean isConfirmPayAvailable = confirmPay.isEnabled();
        confirmPay.click();
        return isConfirmPayAvailable;
    }

    public boolean goToHome() {
        String uiScrollable = "new UiScrollable(new UiSelector().scrollable(true))"
                + ".scrollIntoView(new UiSelector().resourceId(\"blibli.mobile.commerce:id/tv_return_home\"))";

        driver.findElement(AppiumBy.androidUIAutomator(uiScrollable)).click();
        WebElement goToHome = wait.until(ExpectedConditions.elementToBeClickable(PaymentLocators.homeIcon));
        boolean isHomeAvailable = goToHome.isEnabled();
        goToHome.click();
        return isHomeAvailable;
    }
}
