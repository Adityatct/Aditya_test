Feature: Manage and track ToDo list as a ToDo MVC user

Background:
	Given I am on todoMVC Home page 

Scenario: Add and Remove items from todo list
	When I add following items in todo list:
	| Jogging  |
	| Meeting  |
	| Shopping |	
	| Cycling  |
	Then I expect "4" items available in the todo list
	When I remove following items from todo list
	| Jogging |
	| Meeting |
	Then I expect "2" items available in the todo list
	 
Scenario: Mark items as completed from todo list
	When I add following items in todo list:
	| Jogging  |
	| Meeting  |
	| Shopping |	
	And I mark following items as completed from todo list
	| Jogging  |
	| Meeting  |
	And I click on "Completed" section
	Then I expect following items to be available in "Completed" section
	| Jogging  |
	| Meeting  |	  
	
Scenario: Move items from completed to active section
	When I add following items in todo list:
	| Jogging  |
	| Meeting  |
	| Shopping |	
	And I mark following items as completed from todo list
	| Jogging  |
	| Meeting  |
	And I click on "Completed" section
	And I move following items from "Completed" to "Active" section
	| Jogging  |
	And I click on "Active" section
	Then I expect following items to be available in "Active" section
	| Jogging  |
	| Shopping |	  

Scenario: Clear completed items from todo list
	When I add following items in todo list:
	| Meeting  |
	| Shopping |	
	| Cycling  |
	And I mark following items as completed from todo list
	| Shopping |	
	| Cycling  |
	And I click on "Completed" section
	And I clear completed items
	And I click on "All" section
	Then I expect following items to be available in "All" section
  | Meeting  |
	

	