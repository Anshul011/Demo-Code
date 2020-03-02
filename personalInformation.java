package pages;

public class personalInformation {

	@FindBy(how=How.NAME,using="firstname")
	@CacheLookup
	WebElement 	Name;
	@FindBy(how=How.NAME,using="lastname")
	@CacheLookup
	WebElement 	LastName;
	@FindBy(how=How.NAME,using="email")
	@CacheLookup
	WebElement 	Email;
	@FindBy(how=How.NAME,using="old_passwd")
	@CacheLookup
	WebElement 	Password;
	@FindBy(how=How.NAME,using="submitIdentity")
	@CacheLookup
	WebElement 	save;

public static void accountDetails(String FirstName, String LastName, String Email, String Password) throws InterruptedException
{
	Name.sendKeys(FirstName);
	LastName.sendKeys(LastName);
	Email.sendkeys(Email);
	Password.sendKeys(Password)
	save.click();
}
