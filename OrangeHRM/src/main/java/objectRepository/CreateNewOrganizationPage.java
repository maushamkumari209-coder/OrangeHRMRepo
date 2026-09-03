package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.webdriverutility.WebDriverUtility;

public class CreateNewOrganizationPage  {
	
	WebDriverUtility wu=new WebDriverUtility();
	
	@FindBy(name="accountname")
    private WebElement orgNameEdt;
	
	@FindBy(id="phone")
    private WebElement phoneedt;
	
	@FindBy(id="email1")
    private WebElement emailedt;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement save;
	
	@FindBy(name="industry")
    private WebElement industrySD;
	
	@FindBy(name="accounttype")
    private WebElement typeedt;
	
	//Object Initialization
    public  CreateNewOrganizationPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

	
	  public WebElement getOrgNameEdt() {
		return orgNameEdt;
	}
	  
	  public WebElement getPhoneNumber() {
			return phoneedt;
		}

	  public WebElement getEmailNumber() {
			return emailedt;
		}

	public WebElement getSavebtnn() {
		return save;
	}
	
	public WebElement getIndustry() {
		return industrySD;
	}
	
	public WebElement getType() {
		return typeedt;
	}
	
	
	
	public void createOrg(String orgName) {
		orgNameEdt.sendKeys(orgName);
			//save.click();
	}
	
	public void createOrg1(String phoneNumber) {
		phoneedt.sendKeys(phoneNumber);
		save.click();
	}


    public void createOrg2(String orgName, String industry) {

        orgNameEdt.sendKeys(orgName);

        wu.select(industrySD, industry);
        
    }
    
    public void createOrg3(String type) {

    	wu.select(typeedt, type);

        save.click();
    }
    
    
    public void createOrg4(String emailNumber) {
		emailedt.sendKeys(emailNumber);
		save.click();
	}
}



