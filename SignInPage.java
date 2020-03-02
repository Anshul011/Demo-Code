package pages;



public class SignInPage {

	
		@FindBy(how=How.XPATH,using="//*[text()='Sign in']")
		@CacheLookup
		WebElement signin;
		@FindBy(how=How.NAME,using="email")
		@CacheLookup
		WebElement username;
		@FindBy(how=How.NAME,using="passwd")
		@CacheLookup
		WebElement password;
		@FindBy(how=How.NAME,using="SubmitLogin")
		@CacheLookup
		WebElement Login;
		
		public static void Signin(String uname, String pswrd) throws InterruptedException
		{
			signin.click();
			username.sendKeys(uname);
			password.sendKeys(pswrd);
			Login.click();
		}
	
}
