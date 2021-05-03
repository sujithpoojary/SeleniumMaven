package testScripts;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomPages.Cucumber;
import pomPages.Home;
import pomPages.Search;

public class AddingCucumberToCart extends BaseClass{
	
	@Test
	public void tc2() throws InterruptedException
	{
	Home h=new Home(driver);
	h.searchBox();
	Thread.sleep(2000);
	h.searchButton();
	
	Search s=new Search(driver);
	s.cucumberButton();
	
	Cucumber c=new Cucumber(driver);
	u.doubleClick(driver, c.getAddbtn());
	c.addToCartButton();
	
	u.alertPopUp(driver);
	
	c.cartButton();
	c.goToCartButton();
	
	
	
	

	
}
}