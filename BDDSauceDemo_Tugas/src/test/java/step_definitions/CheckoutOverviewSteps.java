package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en_scouse.An;
import org.example.pageObject.CheckoutOverviewPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewSteps {
    private WebDriver webDriver;

    public CheckoutOverviewSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on checkout overview page")
    public void verifyOverviewPage(){
        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(webDriver);
        Assert.assertTrue(checkoutOverviewPage.verifyOverviewPage());
    }
    @And("User done check the total price \"(.*)\"")
    public void verifyTotalPrice(String totalPrice){
        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(webDriver);
        Assert.assertEquals(totalPrice, checkoutOverviewPage.verifyTotalPrice());
    }
    @And("User click the finish button")
    public void clickBtnFinish(){
        CheckoutOverviewPage checkoutOverviewPage= new CheckoutOverviewPage(webDriver);
        checkoutOverviewPage.clickBtnFinish();
    }
}
