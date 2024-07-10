package Locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class FreshBliBliLocators {
    public static final By searchButton = AppiumBy.id("blibli.mobile.commerce:id/iv_blibli_icon");
    public static final By freshByblibli = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"blibli.mobile.commerce:id/tv_title\")");
    public static final By kategori = AppiumBy.id("blibli.mobile.commerce:id/iv_category");
    public static final By besar = AppiumBy.androidUIAutomator("new UiSelector().text(\"Rice & Cooking Essentials\")");
    public static final By salings = AppiumBy.androidUIAutomator("new UiSelector().text(\"Salt & Seasoning\")");
    public static final By increment = AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"blibli.mobile.commerce:id/iv_cta\").instance(2)");
    public static final By buyProduct = AppiumBy.id("blibli.mobile.commerce:id/btn_buy_now");
}
