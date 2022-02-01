package com.singtel.step_defs;
 
import com.singtel.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class TodoListSteps {
	
	HomePage homePage;
	
	public TodoListSteps(HomePage homePage) {
		this.homePage = homePage;
	}
	
	@Given("I am on todoMVC Home page")
	public void redirectToHomePage() {
		homePage.redirectToHomePage();
	}
	
	@When("I add following items in todo list:")
	public void addItems_ToList(DataTable dataTable) {
		homePage.addItemsToList(dataTable);
	}

	@When("I remove following items from todo list")
	public void removeItems_FromList(DataTable dataTable) {
		homePage.removeItemsFromToDoList(dataTable);
	}
	
	@When("I mark following items as completed from todo list")
	public void markItems_Completed(DataTable dataTable) {
		homePage.markAnItemCompleted(dataTable);
	}
	
	@When("I click on {string} section")
	public void click_OnSection(String section)
	{
		homePage.clickOnSection(section);
	}
	
	@When("I move following items from {string} to {string} section")
	public void move_Items(String fromSection, String toSection, DataTable datatable)
	{
		homePage.moveItemsToparticularSection(fromSection, toSection, datatable);
	}
	
	@Then("I expect following items to be available in {string} section")
	public void verifyItems_InSection(String section, DataTable dataTable)
	{
		homePage.toVerifyItemsInSection(section, dataTable);
	}

	@Then("I expect {string} items available in the todo list")
	public void verify_ItemsInList(String cnt) {	
		homePage.toVerifyAddedItemsInList(cnt);
	}
	
	@When("I clear completed items")
	public void clear_completedItems()
	{
		homePage.clearCompletedItems();
	}

}
