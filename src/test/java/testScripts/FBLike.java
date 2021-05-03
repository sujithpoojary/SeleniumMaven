package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomPages.Facebook;
import pomPages.Home;
import pomPages.Skillrary;
import pomPages.Testing;

public class FBLike extends BaseClass{

	
	@Test
	public void tc3() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		Skillrary sr=new Skillrary(driver);
		sr.gearsButton();
		sr.demoSRTab();
		
		u.switchingTab(driver);
		
		Home h=new  Home(driver);
		
		u.dropdownIndex(h.getCourseDD(), 1);
		
		Testing t=new Testing(driver);
		t.fbButton();
		
		Facebook f=new Facebook(driver);
		f.likeButton();
		
		u.navigateURL(driver, p.getPropertyData("url"));
	}
}
