package pages;

public class OrderHistoryPage {
	
	@FindBy(how=How.XPATH,using="//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")
	@CacheLookup
	WebElement Account;
	@FindBy(how=How.XPATH,using="//*[@id='center_column']/div/div[1]/ul/li[1]/a/span")
	@CacheLookup
	WebElement OrderHistory;
	@FindBy(how=How.XPATH,using="//*[@id='center_column']/div/div[1]/ul/li[4]/a/span")
	@CacheLookup
	WebElement 	PersonalInfo;

public static void OrderHistory() throws InterruptedException
{
	Account.click();
	OrderHistory.click();
}
public static void accountDetails() throws InterruptedException
{
	Account.click();
	PersonalInfo.click();
}
}
