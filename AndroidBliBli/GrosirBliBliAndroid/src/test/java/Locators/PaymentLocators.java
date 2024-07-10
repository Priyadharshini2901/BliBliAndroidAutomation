package Locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class PaymentLocators {
    public static final String chosenBank = "new UiSelector().text(\"BankName\")";
    public static final By chooseMethod = AppiumBy.id("blibli.mobile.commerce:id/bt_choose");
    public static final By PayButton = AppiumBy.id("blibli.mobile.commerce:id/btn_pay");
    public static final By continuePayment = AppiumBy.id("blibli.mobile.commerce:id/bt_expanded_one");
    public static final By homeIcon = AppiumBy.id("blibli.mobile.commerce:id/iv_home");
}
