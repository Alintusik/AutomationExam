package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import pages.HomePage;
import util.BrowserFactory;

public class AllItemsRemoved extends BrowserFactory{

	HomePage homepage;

	@Before
	public void setup() {
		init();
		homepage = PageFactory.initElements(driver, HomePage.class);
	}

	@Test
	public void isAllCheckBoxesDeleted() {
		homepage.removeAllCheckBoxes();
	}
	@After
	public void closeDriver() {
		tearDown();
	}
  
}
