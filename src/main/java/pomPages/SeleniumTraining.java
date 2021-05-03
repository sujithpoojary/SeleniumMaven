package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumTraining {

	@FindBy(id="add")
	private WebElement addBtn;

	public WebElement getAddBtn() {
		return addBtn;
	}
	
	@FindBy(xpath = "//button[@ondblclick='addtocart()']")
	private WebElement addtocartbtn;
	
	@FindBy(xpath = "//span[@class=\"label label-success cart_count\"]")
	private WebElement cartbtn;
	
	@FindBy(xpath = "//a[text()='Go to Cart']")
	private WebElement gotocartbtn;
	
	public SeleniumTraining(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void addToCartBUtton()
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
