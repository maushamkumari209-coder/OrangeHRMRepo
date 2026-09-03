
	
	package genericUtility;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	public class FileUtility {

	    /**
	     * This method reads data from CommonData.properties file
	     * @param key
	     * @return value
	     * @throws IOException
	     */
	    public String getCommonData(String key) throws IOException {

	        FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\eclipse\\eclipse\\NinzaHRM\\src\\main\\commondata1.properties");

	        Properties p = new Properties();

	        p.load(fis);

	        return p.getProperty(key);
	    }
	}


