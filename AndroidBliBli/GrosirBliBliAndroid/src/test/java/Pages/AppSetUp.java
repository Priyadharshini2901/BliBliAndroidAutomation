package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AppSetUp {
    public AppiumDriver driver;
    public WebDriverWait wait;

    public AppiumDriver setUpDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","Pixel 8 API 35");
        capabilities.setCapability("udid","emulator-5554");
        capabilities.setCapability("appium:automationName","uiAutomator2");
        capabilities.setCapability("appium:app","/Users/priyadharshini/Downloads/Blibli-11.4.0(66543) (1).apk");
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability("noReset",true);

        URL appiumUrl = new URL("http://127.0.0.1:4720/wd/hub");
        driver = new AndroidDriver(appiumUrl,capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        return driver;
    }
}
