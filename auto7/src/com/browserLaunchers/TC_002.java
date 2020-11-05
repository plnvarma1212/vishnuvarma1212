package com.browserLaunchers;

import org.apache.log4j.Logger;

public class TC_002 extends BaseTest
{
	private static final Logger log =Logger.getLogger(TC_002.class);
	
	public static void main(String[] args) throws Exception 
	{
		
		
		init();
		log.info(" ***********************   TC_002 Started  *************************");
		log.info("Initializing the Properties files...");
		
		launch("chromebrowser");
		log.info("Opening the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigating the Url : " + childProp.getProperty("amazonurl"));
		
		selectItem("amazondropbox_id","Books");
		log.info("Selected the item Books By using the locator :- " + orProp.getProperty("amazondropbox_id"));
		
		type("amazonsearchtext_id","Harry potter");
		log.info("Entered the Harry Potter By using locator :- " +orProp.getProperty("amazonsearchtext_id"));
		
		elementClick("amazonsearchbutton_xpath");
		log.info("Clicked on SearchButton By using locator :- " + orProp.getProperty("amazonsearchbutton_xpath"));
				
		log.info(" ***********************   TC_002 Ended  *************************");
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry potter");
		
		//driver.findElement(By.xpath("//span[@id='nav-search-submit-text']//input[@class='nav-input']")).click();

	}

	
}
