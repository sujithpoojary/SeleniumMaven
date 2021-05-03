package genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * @author sujith
 *
 */
public class PropertyFile implements AutoConstant {
	/**
	 * To Raed the data from property File
	 * @param keysvalue
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public String getPropertyData(String keysvalue) throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream(propertyFilePath));
		 return p.getProperty(keysvalue);
	}

}
