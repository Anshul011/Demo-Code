package pages;

import javax.swing.Action;

public class TShirtCatalougPage {

	@FindBy(how=How.XPATH,using="//*[@id='block_top_menu']/ul/li[3]/a")
	@CacheLookup
	WebElement Tshirts;
	@FindBy(how=How.XPATH,using="//*[text()='Faded Short Sleeve T-shirts']")
	@CacheLookup
	WebElement Pic;
	@FindBy(how=How.XPATH,using="//*[text()='Add to cart']")
	@CacheLookup
	WebElement AddToCart;
	@FindBy(how=How.XPATH,using="//*[text()='
							Proceed to checkout']")
							
	@CacheLookup
	WebElement ProceedToCheckout;
	
	public static void addItemtoCart() throws InterruptedException
	{
		Tshirts.click();
		Actions builder= new Actions(driver);
		Action mouseOverPic = builder.moveToElement(Pic).build();
		mouseOverPic.Perform();
		AddToCart.click();
		
		{
			Set<string> windowsid = driver.getWindowHandle();
			Iterator<string> itr = winodowsid.iterator();
			String mainwindow=Itr.next();
			String Childwindw = itr.next();
			Driver.switchto().window(childWindow);
			ProceedToCheckout.click();

			}
}
