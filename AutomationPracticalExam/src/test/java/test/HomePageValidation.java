package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import util.BrowserFactory;

public class HomePageValidation {
	
	WebDriver driver;
	
	@Test
	public void landOnHomePage() {
		driver = BrowserFactory.init();
	}

}
