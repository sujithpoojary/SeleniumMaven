package genericlib;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
/**
 * 
 * @author sujith
 *
 */
public class BaseClass implements AutoConstant {
	/**
	 * To OPen the Application
	 */
	public WebDriver driver;
	public PropertyFile p;
	public Photo p1;
	public Utilities u=new Utilities();
	public ExecelFile e=new ExecelFile();
	@BeforeMethod
	public void openApp() throws FileNotFoundException, IOException
	{
	
			System.setProperty(key, value);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			p=new PropertyFile();
			driver.get(p.getPropertyData("srurl"));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
	}
	
	/**
	 * To Close the Application 
	 * @param r
	 * @throws IOException
	 */
	
	@AfterMethod
	public void closeApp(ITestResult r) throws IOException
	{
		int status = r.getStatus();
		String name = r.getName();
		if (status==2) {
			p1=new Photo();
			p1.getPhoto(driver, name);
			
		}
		
		driver.quit();
	}
	
	
}
