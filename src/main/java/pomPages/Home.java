package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	@FindBy(xpath = "//a[text()='COURSE']")
	private WebElement coursetab;
	
	public WebElement getCoursetab() {
		return coursetab;
	}
	
	@FindBy(xpath = "//a[text()='Selenium Training']")
	private WebElement seleniumTrainingtab;
	
	@FindBy(id = "navbar-search-input")
	private WebElement searchtb;
	
	@FindBy(id = "searchBtn")
	private WebElement searchbtn;
	
	@FindBy(name = "addresstype")
	private WebElement courseDD;
	
	public WebElement getCourseDD() {
		return courseDD;
	}


	public Home(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	}
	
	
	public void seleniumTrainingButton()
	{
		seleniumTrainingtab.click();
	}
	
	public void searchBox()
	{
		searchtb.sendKeys("cucumber");
	}
	public void searchButton()
	{
		searchbtn.click();
	}
	
}
