package genericUtility;

	import java.io.IOException;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import objectRepository.LoginPage;

	public class BaseClass {

	    public static ChromeDriver driver;

	    FileUtility fUtil = new FileUtility();
	    WebDriverUtility wUtil = new WebDriverUtility();

	    @Parameters("BROWSER")
	    @BeforeClass
	    public void launchBrowser(String browser) throws IOException {

	        // Read Browser Name
	    	String BROWSER =browser;
	      //  String BROWSER = fUtil.getCommonData("browser");

	        // Launch Browser
	        if (BROWSER.equalsIgnoreCase("chrome")) {
	            driver = new ChromeDriver();
	        } 
	        else if (BROWSER.equalsIgnoreCase("edge")) {
	            driver = new ChromeDriver();
	        } 
	        else {
	            driver = new ChromeDriver();
	        }

	        // Maximize Browser
	      //  wUtil.maximizeWindow(driver);


	        // Read URL
	        String URL = fUtil.getCommonData("url");

	        // Open Application
	        driver.get(URL);
	        
	      
	    }

	    @BeforeMethod
	    public void login() throws IOException {

	        String USERNAME = fUtil.getCommonData("username");
	        String PASSWORD = fUtil.getCommonData("password");
	        
	        LoginPage lp = new LoginPage(driver);

	        lp.loginToApplication(USERNAME, PASSWORD);
	        
	        // Login code will be added using LoginPage POM
	        System.out.println("Login Successfully");
	    }

	    @AfterMethod
	  public void logout() {

	        // Logout code will be added using HomePage POM
	       System.out.println("Logout Successfully");
	  }

	    @AfterClass
	    public void closeBrowser() {

	        driver.quit();
	        System.out.println("Browser Closed");
	    }
	}

