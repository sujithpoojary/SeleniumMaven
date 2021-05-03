package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
	
	@FindBy(xpath = "//b[text()='Cucumber']")
	private WebElement cucumberbtn;
	
	public Search(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public void cucumberButton()
	{
		cucumberbtn.click();
	}
}
