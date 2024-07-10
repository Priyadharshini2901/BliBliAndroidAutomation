package Locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class OrdersLocators {
    public static final By confirmCancelOrder = AppiumBy.id("blibli.mobile.commerce:id/bt_expanded_one");
    public static final By checkCancellation = AppiumBy.id("blibli.mobile.commerce:id/tv_payment_status");
    public static final By returnHome = AppiumBy.id("blibli.mobile.commerce:id/tv_return_home");
}
