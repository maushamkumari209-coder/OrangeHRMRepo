package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectPage {
	
	//initialization
	
	public ProjectPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[text()='Projects']")
	
	private WebElement Project;
	
	@FindBy(xpath="//a[text()='Employees']")
	
	private WebElement Employees;
	
    @FindBy(xpath="//span[text()='Create Project']")
	
	private WebElement createProject;
	
	//getters
	
	public WebElement getProject() {
		
		return Project;
	}
	
	public WebElement getEmployees() {
		
		return Employees;
	}
	
	
	public WebElement getCreateProject() {
		
		return createProject;
	}
	
	public void CreateProject()
	{
		Project.click();
		createProject.click();
	}
	
	

}
