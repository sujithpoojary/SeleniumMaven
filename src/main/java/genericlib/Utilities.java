package genericlib;

import java.util.Set;

import org.openqa.selenium.Alert;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author sujith
 *
 */
public class Utilities {
	/**
	 * To Handle dropdown
	 * @param ele
	 * @param text
	 */
	public void dropdown(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public void dropdownIndex(WebElement ele,int a)
	{
		Select s=new Select(ele);
		s.selectByIndex(a);
	}
	/**
	 * To handle mouse action
	 * @param driver
	 * @param target
	 */
	public void mouseAction(WebDriver driver, WebElement target)
	{
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
		
	}
	
	/**
	 * TO handle double click
	 * @param driver
	 * @param target
	 */

	public void doubleClick(WebDriver driver, WebElement target)
	{
		Actions a=new Actions(driver);
		a.doubleClick(target).perform();
	}
	
	/**
	 * TO Handle the ScrollBar
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void scrollBar(WebDriver driver,int x,int y)
	{
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy("+x+","+y+")");
		
	}
	/**
	 * TO handle ALertPOPUP
	 * @param driver
	 */
	public void alertPopUp(WebDriver driver)
	{
		 driver.switchTo().alert().accept();
		
	}
	
	/**
	 * To wait for the Element
	 * @param driver
	 * @param ele
	 */
	public void elementToClicked(WebDriver driver,WebElement ele)
	{
		WebDriverWait w=new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public void switchingTab(WebDriver driver)
	{
		Set<String> child = driver.getWindowHandles();
		
		for (String s : child) {
			driver.switchTo().window(s);
			
		}
	}
	
	public void navigateURL(WebDriver driver, String url)
	{
		driver.navigate().to(url);
	}
}
