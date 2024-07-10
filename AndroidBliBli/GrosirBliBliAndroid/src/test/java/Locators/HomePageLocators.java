package Locators;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class HomePageLocators {
    public static final By login = AppiumBy.id("blibli.mobile.commerce:id/bt_login");
    public static final By userEmail = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\")");
    public static final By password = AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)");
    public static final By loginSubmitButton = AppiumBy.xpath("//android.widget.Button[@text=\"Log in\"]");
    public static final By adressIcon = AppiumBy.id("blibli.mobile.commerce:id/iv_arrow_down_icon");
    public static final By newAddress = AppiumBy.id("blibli.mobile.commerce:id/cl_add_new_address");
    public static final By searchLocation = AppiumBy.id("blibli.mobile.commerce:id/et_key_search");
    public static final By inputSearchLocation = AppiumBy.className("android.widget.EditText");
    public static final By searchResults = AppiumBy.id("blibli.mobile.commerce:id/tv_place_title");
    public static final By selectThisLocation = AppiumBy.className("android.widget.Button");
    public static final By adressLabel = AppiumBy.accessibilityId("blibli.mobile.commerce:id/et_address_label");
    public static final By recipientName = AppiumBy.accessibilityId("blibli.mobile.commerce:id/et_receiver_name");
    public static final By recipientMobile = AppiumBy.accessibilityId("blibli.mobile.commerce:id/et_phone_number");
    public static final By toggle = AppiumBy.id("blibli.mobile.commerce:id/sw_default");
    public static final By saveAddress = AppiumBy.id("blibli.mobile.commerce:id/bt_save");
    public static final By correctSave = AppiumBy.id("blibli.mobile.commerce:id/bt_expanded_one");
}
