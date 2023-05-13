package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.SalesPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SalesSteps {
    private WebDriver webDriver;

    public SalesSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Then("User already on sales page")
    public void verifySalesPage(){
        SalesPage salesPage = new SalesPage(webDriver);
        Assert.assertTrue(salesPage.verifySalesPage());
    }

    @When("User sort the product list by \"(.*)\"")
    public void sortProduct(String sort){
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.setSortProduct(sort);
    }

    @Then("User add \"(.*)\" and \"(.*)\" to cart")
    public void clickProduct(String product1, String product2){
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.productClick(product1);
        salesPage.productClick(product2);
    }

    @And("User click cart button")
    public void clickCartBtn(){
        SalesPage salesPage = new SalesPage(webDriver);
        salesPage.clickCart();
    }
}
