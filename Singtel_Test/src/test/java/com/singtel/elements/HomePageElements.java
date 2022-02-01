package com.singtel.elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements {
	WebDriver driver;
	
	public HomePageElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//header[@class='header']/input[@class='new-todo']") 
	 public WebElement itemName_box;
	
	@FindBy(xpath = "//ul[@class='todo-list']/li")
	 public List<WebElement> allItemsInList;

	@FindBy(xpath =  "//button[@class='destroy']")
	 public List<WebElement> crossItemList;
	
	@FindBy(xpath = "//span[@class='todo-count']/strong") 
	 public WebElement lbl_ItemCnt;
		
	@FindBy(xpath = "//div[@class='view']/label")
	 public WebElement itemInTheList;

	@FindBy(xpath =  "//input[@class='toggle']")
	 public List<WebElement> chkBxList_complteItem;
	
	@FindBy(xpath = "//ul[@class='filters']/li/a")
	 public List<WebElement> lnkList_section;
		
	@FindBy(xpath =  "//ul[@class='todo-list']/li[@class='todo completed']")
	 public List<WebElement> lblList_itemsCompleted;
		
	@FindBy(xpath = "//button[@class='clear-completed']")
	 public WebElement link_clearCompleted;
	
}
