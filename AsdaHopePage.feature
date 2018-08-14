#ASDA HOME PAGE FEATURE FILE
Feature: Verify home page 
	As a ASDA online customer
I should be able to navigate through the home page
So that I can find the stuff I need

Background: 
	Given I am on the home page 
	
Scenario: Verify home page title 
	Given I am on the home page 
	Then I should see asda home "Asda.com - Online Food Shopping, George, & more" page title 
	
	
Scenario: Verify search box 
	Given I am on the home page 
	And click to search groceries or george "//*[@id='root']/div/header/div/div[2]/form/div[1]/select" button 
	And I enter "//input[@id='searchTerms']" item 
	And I click the "//div[@class='search-term']//i[@class='icon-search']" icon search 
	Then I should see "Search Results - ASDA Groceries" 
	
	
Scenario: Verify find a store 
	When I click "//span[@class='find-store-text']" button 
	Then I should see "Asda Store Locator" title 
	
	# not working in Chrome Browser
	#	Working in forefox
Scenario: Verify Help 
	When I click "//li[@class='yellow-bg']/a[text()='Help']" yellow button 
	Then I should see "Asda Customer Service" title 
	
	
Scenario Outline: Verify tabs in the home page 
	When I click on "<locator>" link 
	Then the page url should contain "<path>" 
	Examples: 
		|                        locator                                       |                        path              |    
		| //a[contains(text(),'Groceries')]                                    |                      groceries           |
		| //li[@class='custom-link']/a[contains(text(),'George Clothing')]     |                   george clothing        |
		| //li[@class='custom-link']/a[contains(text(),'George Home')]         |                    george home           |
		| //li[@class='custom-link']/a[contains(text(),'Money')]               |                    money                 |
		| //li[@class='sub-menu']/a[@id='nav-toggle']                          |                    nav-toggle            |
		
		
		
		
		#NOT working
Scenario: Verify asda mobile 
	When I click on the "//*[@id='root']/div/div[1]/div[8]/div/a[1]/span" button 
	Then I should be able to see "Asda Mobile | Pay as you go SIM | Order your free SIM" title 
	
	
	
Scenario Outline: Verify links on the home page 
	When I click on "<locator>" link 
	Then the page page url should contain "<path>" 
	Examples: 
		|                                locator                         |                      path                     |
		|                     //a[contains(text(),'Your Orders')]        |                   your orders                 |
		
		
		
		#This Scenario listed all the <a> links on the home page	
Scenario: Verify all tagName with 'a' links 
	Then I should see all tagName on the home page 
	
	
	
Scenario: Verify all tag with 'button' links 
	Then I should see all buttonTags on the home page 
	
	#	Asda Mobile Link
@run 
Scenario: Very Asda Mobile 
	When I click on "//div[@class='wrapper link-group']//span[@class='promo-link'][contains(text(),'Asda Mobile')]" link 
	Then I should see "Asda Mobile | Pay as you go SIM | Order your free SIM" title 
	
	
	
	
	
	
	
	
	
	
