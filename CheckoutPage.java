package pages;

import javax.swing.Action;

public class CheckoutPage {

	@FindBy(how=How.XPATH,using="//*[text()='Proceed to checkout']")
		@CacheLookup
WebElement ProceedToCheckoutbutton;
	@FindBy(how=How.XPATH,using="//*[@id='center_column']/form/p/button/span/text()")
	@CacheLookup
	WebElement ProceedToCheckoutbutton2;
	@FindBy(how=How.XPATH,using="//*[@id='form']/p/button/span/text()")
	@CacheLookup
	WebElement ProceedToCheckoutbutton3;
	@FindBy(how=How.NAME,using="cgv")
	@CacheLookup
	WebElement AgreeTermCondition;
	@FindBy(how=How.XPATH,using="//*[@id='HOOK_PAYMENT']/div[2]/div/p/a/text()")
	@CacheLookup
	WebElement PayByCheck;
	@FindBy(how=How.XPATH,using="//*[@id='cart_navigation']/button/span/text()")
	@CacheLookup
	WebElement ConfirmOrder;

public static void Checkout() throws InterruptedException
{
	ProceedToCheckoutbutton.click();
	ProceedToCheckoutbutton2.clcik();
	AgreeTermCondition.Click();
	ProceedToCheckoutbutton3.click();
	PayByCheck.click();
	ConfirmOrder.click();
}


