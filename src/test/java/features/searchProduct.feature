Feature: Search and place order for the products


@OfferPage
Scenario Outline: Search experiance for product search in both home page and offers page
Given user is on GreenCart landingPage
When user search with Shortname <Vegetables> and extracted actual name of the product 
Then user search for same shortname <Vegetables> in offers page to check if product exist with same name
And validates landingPage name and search page name

Examples:
|Vegetables|
|Tom|
|Beet|