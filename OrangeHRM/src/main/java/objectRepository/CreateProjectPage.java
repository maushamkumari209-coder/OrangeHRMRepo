package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProjectPage {
	//initialization
	public CreateProjectPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	//declaration
	
	@FindBy(name="projectName")
	WebElement ProjectNamee;

	@FindBy(xpath="//input[@name='createdBy']")
	WebElement ProjectManagerr;
	
	@FindBy(xpath="(//select[@name='status'])[2]")
	WebElement ProjectStauss;
	
	@FindBy(xpath="//input[@value='Add Project']")
    private WebElement createProjectBtn;
	


public void craete(String ProjectName,String ProjectManager )
{
	ProjectNamee.sendKeys(ProjectName);
	ProjectManagerr.sendKeys( ProjectManager);
	
	
}

    public WebElement getProjectStatus() {
        return ProjectStauss;
    }

    public void getCreateProjectButton() {
        createProjectBtn.click();
    }
}