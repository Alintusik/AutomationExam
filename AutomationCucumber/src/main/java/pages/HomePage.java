package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;


public class HomePage {

	
		WebDriver driver;

		public HomePage(WebDriver driver) {
			this.driver = driver;
		}
//PageFctory
		@FindBy(how =How.CSS, using="button[onclick='myFunctionSky()']")
		WebElement setSkyBlueBackgroundButton;
		
		@FindBy(how = How.CSS, using="button[onclick='myFunctionWhite()']")
		WebElement setWhiteBackgroundButton;
		
		@FindBy(how = How.CSS, using="body")
		WebElement bodyBackgroundColor;

//Scenario1 methods
		 public void setBlueBackgroundButtonExists() {
			  if(setSkyBlueBackgroundButton.isDisplayed()) {
				  System.out.println("The Set SkyBlue Background button exists");
			  }else {
				  System.out.println("Button Set SkyBlue Background was not found on the page!");
			  }
		}
		 public void changeSkyBlueBackground() { 
			 setSkyBlueBackgroundButton.click();
		}
	  
		 @SuppressWarnings("deprecation")
		public void backgroundcolorcheck() {
		    String backcolor= bodyBackgroundColor.getCssValue("background-color");
		    String hexcolor = Color.fromString(backcolor).asHex();
		   // System.out.println(hexcolor);
		    if (hexcolor.equals("#87ceeb")) {
		    	System.out.println("The background color its Sky Blue");
		    } else {
		    	Assert.fail("Test failed.!!! Color is NOT Sky Blue");
		    }
	  } 
	  //Scenario2 methods
		 public void setWhiteBackgroundButtonExists() {
		  if(setWhiteBackgroundButton.isDisplayed()) {
			  System.out.println("The Set White Background button exists");
		  }else {
			  System.out.println("Button Set white Background was not found on the page!");
		  }
	  }
	  
		 public void changeWhiteBackgroundColor() {
		  setWhiteBackgroundButton.click();
	  }
	  
		public void whitebackgroundcolorcheck() {
			String backcolor= bodyBackgroundColor.getCssValue("background-color");
			String hexcolor = Color.fromString(backcolor).asHex();
			
			if (hexcolor.equals("#ffffff")) {
    	System.out.println("The background color its White");
			} else {
    	System.out.println("Test failed.!!! Color is NOT White");
    }
	}
} 
