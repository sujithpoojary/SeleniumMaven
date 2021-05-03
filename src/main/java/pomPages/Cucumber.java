package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cucumber {
	@FindBy(id = "add")
	private WebElement addbtn;
	
	public WebElement getAddbtn() {
		return addbtn;
	}

	@FindBy(xpath = "//button[@ondblclick='addtocart()']")
	private WebElement addtocartbtn;
	
	@FindBy(xpath = "//i[@class=\"fa fa-shopping-cart\"]")
	private WebElement cartbtn;
	
	@FindBy(xpath = "//a[text()='Go to Cart']")
	private WebElement gotocartbtn;
	
	public Cucumber(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void addToCartButton()
	{
		addtocartbtn.click();
	}
	public void cartButton()
	{
		cartbtn.click();
	}
	public void goToCartButton()
	{
		gotocartbtn.click();
	}
}
