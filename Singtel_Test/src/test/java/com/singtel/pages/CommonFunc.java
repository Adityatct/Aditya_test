package com.singtel.pages;


import org.openqa.selenium.WebDriver;
import com.singtel.step_defs.AbstractBase;

public class CommonFunc {

	WebDriver driver;
	AbstractBase base;
	
	static int PAGE_LOAD_TIMEOUT = 20;
	static int IMPLICIT_WAIT = 30;
	
	String refID;
	
	public CommonFunc(AbstractBase base) {
		this.base = base;
		this.driver = base.getDriver();
	}

	public void navigateToPage(String url) {
		driver.get(url);
	}
	
	public String getCurrentPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getCurrentPageTitle() {
		return driver.getTitle();
	}
}
