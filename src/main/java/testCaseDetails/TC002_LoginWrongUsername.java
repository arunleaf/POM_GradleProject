package testCaseDetails;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import dmsMethod.CommonMethod;

public class TC002_LoginWrongUsername extends CommonMethod {

		
		@BeforeClass
		public void setData() {
			testCaseName = "TC002_LoginFailwithUserneme";
			testCaseDescription ="LoginWrongUsername";
			category = "Functional Testing";
			author= "Kumar";
		}
		@Test
		public void LoginFailwithUsername() {
	
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id","username");
		type(eleUserName, "DemoSalesManagerrr");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		
		
	}
}







