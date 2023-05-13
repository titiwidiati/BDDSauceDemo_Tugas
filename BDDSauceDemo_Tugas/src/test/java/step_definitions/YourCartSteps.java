package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.example.pageObject.YourCartPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class YourCartSteps {
    private WebDriver webDriver;

    public YourCartSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Then("User already on your cart page")
    public void verifyCartPage(){
        YourCartPage yourCartPage = new YourCartPage(webDriver);
        Assert.assertTrue(yourCartPage.verifyCartPage());
    }

    @Then("User remove item Tshirt Red")
    public void removeTshirtRed() throws InterruptedException {
        YourCartPage yourCartPage = new YourCartPage(webDriver);
        yourCartPage.clickRemoveTshirtRed();
    }

    @And("User click checkout button")
    public void btnCheckout() throws InterruptedException {
        YourCartPage yourCartPage = new YourCartPage(webDriver);
        yourCartPage.clickBtnCheckout();
    }
}
