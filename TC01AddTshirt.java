package TestCases;

import org.testng.Assert;

import pages.SignInPage;
import test.BaseTest;

public class Tests {

	@Test(enabled=true, priority =1)
	public void OrderTshirt() throws Exception
	{
		SignInPage.Signin(anshul.sharma11@gmail.com, Dummypassword@123);
		HomePage.SelectItem();
		TshirtCatalougPage.addItemtoCart();
		CheckoutPage.checkout();
		OrderHistoryPage.OrderHistory()
		
		public static boolean validateElementExists(String xpath)
		{
			boolean result = false;
			{
				BaseTest.getDriver().findElement(By.Xpath("//*[@id='order-list']/tbody/tr/td[2]"));
				result = true;
			
			}
				return result;
		
		}
	}
		@Test(enabled=true, priority =2)
		public void updateAccountInformation() throws Exception
{
	 OrderHistoryPage.accountDetails();
	personalInformation.accountDetails(Test Name, LastName, abc.sga@gmail.com, dummypassword);
	
}
	}
	
