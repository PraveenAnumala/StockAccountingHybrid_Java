import org.openqa.selenium.WebDriver;

import commonFunctionLibrary.FuntionLibrary;

public class DummyFunctionLibrary {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		 FuntionLibrary.startBrowser();
		 
		 FuntionLibrary.openApplication();
		 
		 FuntionLibrary.waitForElement( "id","username","10");
		 FuntionLibrary.typeAction( "id","username","admin");
		
		 FuntionLibrary.waitForElement( "name","password","10");
		 FuntionLibrary.typeAction( "name","password","master");

		 FuntionLibrary.clickAction("xpath","//*[@id='btnsubmit']");
		 
		 FuntionLibrary.waitForElement( "id","logout","10");
		 FuntionLibrary.clickAction( "id", "logout");
		 
		 FuntionLibrary.waitForElement( "xpath","//*[text()='OK!']","20");
		 FuntionLibrary.clickAction( "xpath", "//*[text()='OK!']");
		 
		 FuntionLibrary.closeBrowser();

	}

}
