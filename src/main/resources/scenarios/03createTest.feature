@locators
Feature: Write test case as Scenario

Background: open Wikipedia
    Given I open browser to webpage "https://www.wikipedia.org/"
	Then I must see text "The Free Encyclopedia"

Scenario: search for term with objects file
 	Then I enter "Perforce" to "wiki.search"
 	Then I click on "wiki.search.btn"
 	Then I must see text "developer of software"
 	
 	
 @NAB	
 Scenario: Accessibility Web
 	Given I open browser to webpage "https://external-developer-shell.dev-x-openapi.nabx.extnp.national.com.au/login/identity"
 	Then I perform an audit of the accessibility on tag application screen "NABX"