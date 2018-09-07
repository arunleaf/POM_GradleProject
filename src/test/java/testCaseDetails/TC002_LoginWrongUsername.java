package testCaseDetails;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import dmsMethod.CommonMethod;
import utill.ReadExcel;

public class TC002_LoginWrongUsername extends CommonMethod {

		
		@BeforeClass
		public void setData() {
			testCaseName = "TC002_LoginFailwithUserneme";
			testCaseDescription ="LoginWrongUsername";
			category = "Functional Testing";
			author= "Kumar";
			dataSheetName="LoginFilure";
			
		}
		
		
		@Test(dataProvider="TestSheet")
		public void LoginFailwithUsername(String uname, String pwd, String data) {
	
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id","username");
		type(eleUserName, uname);
		WebElement elePassword = locateElement("id","password");
		type(elePassword, pwd);
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		verifyPartialText(locateElement("id", "errorDiv"), data);	
	}
		@DataProvider(name="TestSheet")
		public Object[][] data() throws IOException {
			return ReadExcel.getSheet(dataSheetName);
		}
}







