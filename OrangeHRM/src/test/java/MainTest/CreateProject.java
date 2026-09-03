package MainTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.WebDriverUtility;
import objectRepository.CreateProjectPage;
import objectRepository.ProjectPage;


public class CreateProject extends BaseClass {
	
	@Test
	public void createProject() throws InterruptedException {
		
		Thread.sleep(5000);
		ProjectPage p=new ProjectPage(driver);
		p.CreateProject();
		CreateProjectPage cp=new CreateProjectPage(driver);
		cp.craete("ibm", "ram");
		WebDriverUtility wu=new WebDriverUtility();
		wu.handleDropDown("Created",cp.getProjectStatus());
		cp.getCreateProjectButton();
		System.out.println("project created sucessfully");
		
		
	}
		

	}


