package Pages;

import Locators.OrdersLocators;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orders {
    public AppiumDriver driver;
    public WebDriverWait wait;

    public Orders(AppiumDriver driver, WebDriverWait wait)
    {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean cancelOrder() {
        WebElement cancelOrder = wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.androidUIAutomator("new UiSelector().scrollable(true)")));
        boolean isCancelOrder = cancelOrder.isEnabled();
        String uiScrollable = "new UiScrollable(new UiSelector().scrollable(true))"
                + ".scrollIntoView(new UiSelector().resourceId(\"blibli.mobile.commerce:id/bt_cancel\"))";

        driver.findElement(AppiumBy.androidUIAutomator(uiScrollable)).click();
        return isCancelOrder;
    }

    public boolean confirmOrderCancellation() {
        WebElement confirmOrder = wait.until(ExpectedConditions.elementToBeClickable(OrdersLocators.confirmCancelOrder));
        boolean isConfirmOrder = confirmOrder.isEnabled();
        confirmOrder.click();
        return isConfirmOrder;
    }

    public String cancellationVerification() {
        WebElement confirmMsg = wait.until(ExpectedConditions.elementToBeClickable(OrdersLocators.checkCancellation));
        return confirmMsg.getText();
    }

    public boolean returnHome() {
        WebElement returnToHome =wait.until(ExpectedConditions.elementToBeClickable(OrdersLocators.returnHome));
        boolean isReturnToHome = returnToHome.isEnabled();
        returnToHome.click();
        return isReturnToHome;
    }
}
