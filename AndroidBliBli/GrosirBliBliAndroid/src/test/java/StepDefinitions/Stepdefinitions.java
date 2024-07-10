package StepDefinitions;

import Pages.*;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import java.net.MalformedURLException;

public class Stepdefinitions {
    public AppSetUp appSetUp = new AppSetUp();
    public AppiumDriver driver;
    SoftAssert softAssert = new SoftAssert();
    WebDriverWait wait;
    HomePage homePage;
    FreshBliBli freshBliBli;
    Payment payment;
    Orders orders;

    @Given("blibli app is launched")
    public void blibliAppIsLaunched() throws MalformedURLException {
        this.appSetUp.setUpDriver();
        this.driver= appSetUp.driver;
        this.wait = appSetUp.wait;
        homePage = new HomePage(this.driver, this.wait);
        freshBliBli = new FreshBliBli(this.driver,this.wait);
        payment = new Payment(this.driver,this.wait);
        orders = new Orders(this.driver,this.wait);
    }

    @When("User enters email as {string} and password as {string}")
    public void userEntersEmailAsAndPasswordAs(String userEmail, String password) {
        softAssert.assertTrue(homePage.isLoginButtonAvailabe(),"Login button not available in the home page");
        softAssert.assertEquals(homePage.enterUserEmail(userEmail),userEmail,"Mismatched email, invalid!");
        softAssert.assertTrue(homePage.login(),"Login button after email");
        softAssert.assertEquals(homePage.enterUserPassword(password),password,"Mismatched password, invalid!");
    }

    @Then("User is succesfully logged in")
    public void userIsSuccesfullyLoggedIn() {
        homePage.login();
    }

    @When("User clicks on Add Address icon")
    public void userClicksOnAddAddressIcon() {
        softAssert.assertTrue(homePage.addressIcon(),"Address icon is not available");
    }

    @And("User selects new Address bar")
    public void userSelectsNewAddressBar() {
        softAssert.assertTrue(homePage.newAddress(),"New address icon is not available");
    }

    @Then("User enters {string} as the address")
    public void userEntersAsTheAddress(String cityName) {
        softAssert.assertTrue(homePage.searchLocation(),"Search location field not avaialble");
        softAssert.assertEquals(homePage.inputSearchLocation(cityName),cityName,"input mismatch!!");
    }

    @And("User chooses the Select location")
    public void userChoosesTheSelectLocation() {
        softAssert.assertTrue(homePage.searchResults(),"Search result for the etered cityName is not available");
        softAssert.assertTrue(homePage.selectThisLocation(),"Select location for city name entered is not available");
    }

    @When("User enters {string} doorNo {string} as recipientName and {string} as mobileNo")
    public void userEntersDoorNoAsRecipientNameAndAsMobileNo(String addressLabel, String recipientName, String recepientMobile) {
        softAssert.assertEquals(homePage.addressLabel(addressLabel),addressLabel,"Input mismatch for the door No!");
        softAssert.assertEquals(homePage.recipientName(recipientName),recipientName,"Input mismatch for the recipient name");
        softAssert.assertEquals(homePage.recipientMobile(recepientMobile),recepientMobile,"Input mismatch for the recipient mobile");
        softAssert.assertTrue(homePage.toggle(),"Toggle is unsuccessful");
    }

    @Then("User chooses Save Address")
    public void userChoosesSaveAddress() {
        softAssert.assertTrue(homePage.saveAddress(),"Save Address option is not available");
    }

    @And("new Address is selected")
    public void newAddressIsSelected() {
        softAssert.assertTrue(homePage.confirmSave(),"Confirmation message for save icon is not available");
    }

    @When("User clicks on search")
    public void userClicksOnSearch() {
        softAssert.assertTrue(freshBliBli.searchButton(),"Search icon is disabled");
    }

    @Then("Fresh By BliBli is suggested")
    public void freshByBliBliIsSuggested() {
        softAssert.assertTrue(freshBliBli.freshBliBliSuggested(),"Fresh Blibli is not visible for this location");
    }

    @When("User clicks on FreshByBliBli")
    public void userClicksOnFreshByBliBli() {
        freshBliBli.isClickedFreshBliBli();
    }
    @Then("User clicks on Categories to choose {string} and {string}")
    public void userClicksOnCategoriesToChooseAnd(String categoryName, String subCategoryName) {
        softAssert.assertTrue(freshBliBli.isClickableCategory(),"Error: Could not click on the category");
        softAssert.assertTrue(freshBliBli.chooseDesiredCategory(categoryName),"User's category name not found");
        softAssert.assertTrue(freshBliBli.isClickedOnSubCategory(subCategoryName),"subcategory is not chosen");
    }

    @And("choose the product with discount")
    public void chooseTheProductWithDiscount() {
         softAssert.assertTrue(freshBliBli.productWithDiscount(),"Error: discounted product is not chosen ");
    }

    @When("User clicks on the product")
    public void userClicksOnTheProduct() {
        softAssert.assertTrue(freshBliBli.clickOnTheProduct(),"Product is not enabled to purchase");
    }

    @Then("User navigated to productDetails page")
    public void userNavigatedToProductDetailsPage() {
        payment.productDetails();
    }

    @When("User changes the bank details to {string}")
    public void userChangesTheBankDetailsTo(String bankName) {
        softAssert.assertEquals(payment.chosenBank(bankName),bankName,"Error: Input for bankName is mismatched!!");
        softAssert.assertTrue(payment.chooseMethod(),"Choose Method button is not available");
    }

    @Then("User Payment is successfull")
    public void userPaymentIsSuccessfull() {
        softAssert.assertTrue(payment.payButton(),"Pay button is not visible");
        softAssert.assertTrue(payment.confirmPay(),"Confirm pay is not available");
    }

    @And("User cancels the order")
    public void userCancelsTheOrder() {
        softAssert.assertTrue(orders.cancelOrder(),"cancellation of order is unavailable");
    }

    @When("User confirms order cancellation")
    public void userConfirmsOrderCancellation() {
        softAssert.assertTrue(orders.confirmOrderCancellation(),"Confirm order cancellation is not available");
    }

    @Then("{string} message is displayed")
    public void messageIsDisplayed(String orderCancel) {
        softAssert.assertEquals(orders.cancellationVerification(),orderCancel,"Order message has been verified");
    }

    @And("User returns home")
    public void userReturnsHome() {
        softAssert.assertTrue(orders.returnHome(),"Return to home is not available");
        softAssert.assertAll();
    }
}
