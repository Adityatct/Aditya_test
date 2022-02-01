package com.singtel.pages;

import static org.junit.Assert.fail;  

import java.util.List;
import java.util.Map;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.singtel.elements.HomePageElements;
import com.singtel.step_defs.AbstractBase;

import io.cucumber.datatable.DataTable;

public class HomePage {
	
	WebDriver driver;
	AbstractBase base;
	HomePageElements homeElements;
	private WebDriver webdriver;
	
	public HomePage(AbstractBase base) {
		this.base = base;
		this.driver = base.getDriver();
		homeElements = new HomePageElements(this.driver);
	}
		
	public void redirectToHomePage()
	{
		String homePageUrl = base.getHomePageURL();
		driver.get(homePageUrl);
	}
	
	public void addItemsToList(DataTable dt)
	{
		List<String> items = dt.asList(String.class);
	
		for(int i=0;i<items.size();i++)
		{
			homeElements.itemName_box.sendKeys(items.get(i));
			homeElements.itemName_box.sendKeys(Keys.ENTER);
		}
	}

	public void removeItemsFromToDoList(DataTable dt)
	{
		List<String> itemsToRemove = dt.asList(String.class);
		int itemCnt = homeElements.allItemsInList.size();
		
		for(int k=0;k<itemsToRemove.size();k++)
		{
			for(int i=0;i<itemCnt;i++)
			{			
				if(homeElements.allItemsInList.get(i).getText().trim().equalsIgnoreCase(itemsToRemove.get(k)))
				{				
					Actions builder = new Actions(driver);
					builder.moveToElement(homeElements.allItemsInList.get(i)).perform();
					builder.moveToElement(homeElements.crossItemList.get(i)).click().perform();
					break;
				}
			}
		}
	}
	
	public void markAnItemCompleted(DataTable dt)
	{
		List<String> itemsToComplete = dt.asList(String.class);
		int itemCnt = homeElements.allItemsInList.size();
		for(int k=0;k<itemsToComplete.size();k++)
		{
			for(int i=0;i<itemCnt;i++)
			{			
				if(homeElements.allItemsInList.get(i).getText().trim().equalsIgnoreCase(itemsToComplete.get(k)))
				{
					homeElements.chkBxList_complteItem.get(i).click();
					break;
				}
			}	
		}
	}
	
	public void clickOnSection(String sectionToClick)
	{
		int sectionCnt = homeElements.lnkList_section.size();
		for(int i=0;i<sectionCnt;i++)
		{			
			if(homeElements.lnkList_section.get(i).getText().trim().equalsIgnoreCase(sectionToClick))
			{
				homeElements.lnkList_section.get(i).click();
				break;
			}
		}	
	}
	
	public void toVerifyItemsInSection(String section, DataTable dt)
	{
		List<String> itemsToVerify = dt.asList(String.class);
		int actualItemsInListCnt =0;
		List<WebElement> actualItemsList = null; 
		String errorMsg ="";
		
		if(section.equalsIgnoreCase("Completed"))
		{
			actualItemsInListCnt = homeElements.lblList_itemsCompleted.size();
			actualItemsList = homeElements.lblList_itemsCompleted;
			errorMsg = "Item marked as completed is not present in completed section : ";
		}
		else if(section.equalsIgnoreCase("Active")) 
		{
			actualItemsInListCnt = homeElements.allItemsInList.size();
			actualItemsList = homeElements.allItemsInList;
			errorMsg = "Item not present in 'Active' section : ";			
		}
		else if(section.equalsIgnoreCase("All")) 
		{
			actualItemsInListCnt = homeElements.allItemsInList.size();
			actualItemsList = homeElements.allItemsInList;
			errorMsg = "Item not present in 'All' section : ";			
		}

		for(int k=0;k<itemsToVerify.size();k++)
		{
				boolean itemFound=false;
				for(int i=0;i<actualItemsInListCnt;i++)
				{			
					if(actualItemsList.get(i).getText().trim().equalsIgnoreCase(itemsToVerify.get(k)))
					{
						itemFound=true;
						break;
					}
				}
				if(itemFound==false)
					fail(errorMsg + itemsToVerify.get(k));
		}		
	}
	

	public void moveItemsToparticularSection(String fromSection, String toSection, DataTable dt)
	{
		List<String> itemsToMove = dt.asList(String.class);
		
		if(fromSection.equalsIgnoreCase("Completed") && toSection.equalsIgnoreCase("Active"))
		{
			int completedItemsCnt = homeElements.lblList_itemsCompleted.size();
			for(int k=0;k<itemsToMove.size();k++)
			{
				for(int i=0;i<completedItemsCnt;i++)
				{			
					if(homeElements.lblList_itemsCompleted.get(i).getText().trim().equalsIgnoreCase(itemsToMove.get(k)))
					{
						homeElements.chkBxList_complteItem.get(i).click();
						break;
					}
				}
			}
		}
	}
	
	public void toVerifyAddedItemsInList(String expectedItemCnt)
	{		
		String actualItemCnt = homeElements.lbl_ItemCnt.getText();
		if (!expectedItemCnt.equals(actualItemCnt)) {
			fail("Actual items added in the list are incorrect : " + actualItemCnt);
		}

	}
	
	public void clearCompletedItems()
	{
		homeElements.link_clearCompleted.click();
	}
}