package testScripts;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomPages.Home;
import pomPages.SeleniumTraining;

public class AddingToCart extends BaseClass {

	@Test
	public void tc1() throws InterruptedException
	{
		Home h=new Home(driver);
		u.mouseAction(driver, h.getCoursetab());
		Thread.sleep(3000);
		h.seleniumTrainingButton();
		Thread.sleep(3000);
		SeleniumTraining st=new SeleniumTraining(driver);
		u.doubleClick(driver, st.getAddBtn());
		st.addToCartBUtton();
		
		Thread.sleep(5000);
		u.alertPopUp(driver);
		
		st.cartButton();
		st.goToCartButton();
		
		
		
	}
	
}
