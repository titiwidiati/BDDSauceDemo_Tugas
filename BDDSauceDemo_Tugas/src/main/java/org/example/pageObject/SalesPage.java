package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SalesPage {
    public static WebDriver driver;

    public SalesPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifySalesPage;

    public boolean verifySalesPage(){
        return verifySalesPage.isDisplayed();
    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement sortProduct;

    public void setSortProduct(String sort){
        Select a = new Select(sortProduct);
        a.selectByVisibleText(sort);
    }

    public void productClick(String product){
        String a = "//div[text()[contains(.,'"+ product +"')]]/ancestor::div[@class='inventory_item_description']//*[contains(@id, 'add-to-cart')]";
        driver.findElement(By.xpath(a)).click();
    }

    @FindBy(xpath = "//a[.='2']")
    private WebElement cart;

    public void clickCart(){
        cart.click();
    }

}
