Feature: Place order for the products


@PlaceOrder
Scenario Outline: Search experiance for product search in both home page and offers page
Given user is on GreenCart landingPage
When user search with Shortname <Vegetables> and extracted actual name of the product
And added "3" items of the selected product to cart
Then user proceeds to checkout and validates the <Vegetables> items in checkout page
And Verify user has ability to enter promo code and place the order

Examples:
|Vegetables|
|Tom|
