package pages;

public class HomePage {

	@FindBy(how=How.XPATH,using="//*[@id='block_top_menu']/ul/li[3]/a")
	@CacheLookup
	WebElement Tshirts;
	
	public static void SelectItem() throws InterruptedException
	{
		Tshirts.click();
		
	}
}
