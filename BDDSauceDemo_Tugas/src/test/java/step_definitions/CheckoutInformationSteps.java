package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.CheckoutInformationPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutInformationSteps {
    private WebDriver webDriver;

    public CheckoutInformationSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on checkout information page")
    public void verifyInformationPage(){
        CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage(webDriver);
        Assert.assertTrue(checkoutInformationPage.verifyInformationPage());
    }
    @When("User input \"(.*)\" as firstName, input \"(.*)\" as lastName and input \"(.*)\" as zipCode")
    public void inputDataPersonal(String firstName, String lastName, String zipCode){
        CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage(webDriver);
        checkoutInformationPage.setFirstName(firstName);
        checkoutInformationPage.setLastName(lastName);
        checkoutInformationPage.setZipCode(zipCode);
    }

    @And("User click continue button")
    public void clickBtnContinue(){
        CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage(webDriver);
        checkoutInformationPage.clickBtnContinue();
    }
}
