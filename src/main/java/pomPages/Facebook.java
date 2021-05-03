package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {

	
	@FindBy(xpath = "//button[text()='Like']")
	private WebElement likebtn;
	
	public Facebook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void likeButton()
	{
		likebtn.click();
	}
}
