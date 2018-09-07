package testCaseDetails;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dmsMethod.CommonMethod;

public class TC004_LoginUsernameAndPasswordBlank extends CommonMethod {
	
	@BeforeClass
	public void setData() {
		testCaseName = "TC004_LoginUsernameAndPasswordBlank";
		testCaseDescription ="LoginPass";
		category = "Regrssion Testing";
		author= "Arun";
	}
	@Test
	public void loginUsernameAndPasswordBlank()	
	{
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName," ");
		WebElement elePassword = locateElement("id","password");
		type(elePassword," ");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		closeBrowser();
	}
}
