package genericUtility;

import java.io.File;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class WebDriverUtility {
	
	//maximize browser
	
	public void maximizeBrowser(WebDriver driver) {
		
		
		driver.manage().window().maximize();
	}
	
	//ImplicitWait
	
	public void implicitWait(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	//Switch Window Using Title
	
	public void switchToWindow(WebDriver driver, String partialTitle) {

        Set<String> allWindows = driver.getWindowHandles();

        for(String id : allWindows) {

            driver.switchTo().window(id);

            if(driver.getTitle().contains(partialTitle)) {
                break;
            }
        }
	}
	
	//Switch frame 
	
	public void switchFrame(WebDriver driver,WebElement element) {
		
		driver.switchTo().frame(element);		
}
	//Accept alert
	
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	//Mouse hover
	
	public void mouseHover(WebDriver driver,WebElement element) {
		Actions action =new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	//handle dropdown
	public void handleDropDown(String text, WebElement element) {
	    Select s = new Select(element);
	    s.selectByVisibleText(text);
	}
	
	
     //Capture Screenshot
     
	public void takeScreenShot(WebDriver driver, String screenshotName) throws IOException {

	    TakesScreenshot ts = (TakesScreenshot) driver;

	    File src = ts.getScreenshotAs(OutputType.FILE);

	    File dest = new File("./ScreenShots/" + screenshotName + ".png");

	    FileHandler.copy(src, dest);

	    System.out.println("Screenshot captured successfully.");
	}
}