$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/EndtoEndCheckout.feature");
formatter.feature({
  "line": 2,
  "name": "End to End Checkout",
  "description": "As a user I want to checkout product on sauce demo website",
  "id": "end-to-end-checkout",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Checkout"
    }
  ]
});
formatter.before({
  "duration": 8093035400,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "End to End Checkout Product",
  "description": "",
  "id": "end-to-end-checkout;end-to-end-checkout-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User already on sauce demo website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User input \"standard_user\" as userName and input \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User already on sales page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User sort the product list by \"Name (Z to A)\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User add \"Sauce Labs Onesie\" and \"Test.allTheThings() T-Shirt (Red)\" to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User click cart button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User already on your cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User remove item Tshirt Red",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User click checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User already on checkout information page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User input \"Titi\" as firstName, input \"Widya\" as lastName and input \"99999\" as zipCode",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User click continue button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User already on checkout overview page",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User done check the total price \"$8.63\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User click the finish button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User already completed checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 330987300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 50
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 505693700,
  "status": "passed"
});
formatter.match({
  "location": "SalesSteps.verifySalesPage()"
});
formatter.result({
  "duration": 93056200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name (Z to A)",
      "offset": 31
    }
  ],
  "location": "SalesSteps.sortProduct(String)"
});
formatter.result({
  "duration": 175418800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sauce Labs Onesie",
      "offset": 10
    },
    {
      "val": "Test.allTheThings() T-Shirt (Red)",
      "offset": 34
    }
  ],
  "location": "SalesSteps.clickProduct(String,String)"
});
formatter.result({
  "duration": 154841100,
  "status": "passed"
});
formatter.match({
  "location": "SalesSteps.clickCartBtn()"
});
formatter.result({
  "duration": 96227500,
  "status": "passed"
});
formatter.match({
  "location": "YourCartSteps.verifyCartPage()"
});
formatter.result({
  "duration": 51690100,
  "status": "passed"
});
formatter.match({
  "location": "YourCartSteps.removeTshirtRed()"
});
formatter.result({
  "duration": 70972900,
  "status": "passed"
});
formatter.match({
  "location": "YourCartSteps.btnCheckout()"
});
formatter.result({
  "duration": 90939800,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutInformationSteps.verifyInformationPage()"
});
formatter.result({
  "duration": 44124100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Titi",
      "offset": 12
    },
    {
      "val": "Widya",
      "offset": 39
    },
    {
      "val": "99999",
      "offset": 69
    }
  ],
  "location": "CheckoutInformationSteps.inputDataPersonal(String,String,String)"
});
formatter.result({
  "duration": 394567300,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutInformationSteps.clickBtnContinue()"
});
formatter.result({
  "duration": 119305400,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutOverviewSteps.verifyOverviewPage()"
});
formatter.result({
  "duration": 39965100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$8.63",
      "offset": 33
    }
  ],
  "location": "CheckoutOverviewSteps.verifyTotalPrice(String)"
});
formatter.result({
  "duration": 40397000,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutOverviewSteps.clickBtnFinish()"
});
formatter.result({
  "duration": 94444100,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutCompleteSteps.verifyDoneOrder()"
});
formatter.result({
  "duration": 64957300,
  "status": "passed"
});
formatter.after({
  "duration": 854436000,
  "status": "passed"
});
});