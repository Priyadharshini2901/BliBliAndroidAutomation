package Pages;

import Locators.FreshBliBliLocators;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FreshBliBli {
    public AppiumDriver driver;
    public WebDriverWait wait;

    public FreshBliBli(AppiumDriver driver, WebDriverWait wait)
    {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean searchButton() {
        WebElement search = wait.until(ExpectedConditions.elementToBeClickable(FreshBliBliLocators.searchButton));
        boolean isSearch  = search.isEnabled();
        search.click();
        return isSearch;
    }

    public boolean freshBliBliSuggested() {
        WebElement fresh = wait.until(ExpectedConditions.elementToBeClickable(FreshBliBliLocators.freshByblibli));
        boolean isSearch  = fresh.isEnabled();
        return isSearch;
    }

    public void isClickedFreshBliBli() {
        WebElement fresh = wait.until(ExpectedConditions.elementToBeClickable(FreshBliBliLocators.freshByblibli));
        fresh.click();
    }

    public boolean isClickableCategory() {
        WebElement category = wait.until(ExpectedConditions.elementToBeClickable(FreshBliBliLocators.kategori));
        boolean isCategory = category.isEnabled();
        category.click();
        return isCategory;
    }

    public boolean chooseDesiredCategory(String category1) {
        WebElement rice = wait.until(ExpectedConditions.elementToBeClickable(FreshBliBliLocators.besar));
        boolean isRice = rice.isEnabled();
        rice.click();
        return isRice;
    }

    public boolean isClickedOnSubCategory(String category2) {
        WebElement subCat = wait.until(ExpectedConditions.elementToBeClickable(FreshBliBliLocators.salings));
        boolean isSubCat = subCat.isEnabled();
        subCat.click();
        return isSubCat;
    }

    public boolean productWithDiscount() {
        WebElement product = wait.until(ExpectedConditions.elementToBeClickable(FreshBliBliLocators.increment));
        boolean productEnable = product.isEnabled();
        product.click();
        return productEnable;
    }

    public boolean clickOnTheProduct() {
        WebElement buyProduct = wait.until(ExpectedConditions.elementToBeClickable(FreshBliBliLocators.buyProduct));
        boolean isBuyProduct= buyProduct.isEnabled();
        buyProduct.click();
        return isBuyProduct;
    }
}
