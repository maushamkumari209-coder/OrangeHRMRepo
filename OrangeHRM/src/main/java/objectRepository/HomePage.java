package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends genericUtility.WebDriverUtility {
	
	   WebDriver driver;
	    WebDriverWait wait;
	
	 @FindBy(linkText = "Organizations")
	    private WebElement orgLink;

	    @FindBy(linkText="Contacts")
	    private WebElement contactlnk;
	    
	    @FindBy(linkText="Products")
	    private WebElement Productslnk;
	    
	    @FindBy(linkText="Productss")
	    private WebElement Productslnk1;
	    
	    
	    
	    @FindBy(xpath="//img[@title='Create Product...']")
	    private WebElement CreateProductslnk;
	    
	    @FindBy(linkText="Leads")
	    private WebElement Leadslnk;
	    
	    @FindBy(linkText="Leadss")
	    private WebElement Leadslnk1;
	    
	    @FindBy(xpath="//img[@title='Create Lead...']")
	    private WebElement CreateLeadslnk;

	    
	    @FindBy(linkText="Campaigns")
	    private WebElement campaignslnk;
	    
	    @FindBy(linkText="Campaignss")
	    private WebElement campaignslnk1;
	    
	    @FindBy(linkText="More")
	    private WebElement morelnk;
	    
	    @FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	    private WebElement adminimg;
	    
	    @FindBy(xpath="//a[@href='index.php?module=Users&action=Logout']")
	    private WebElement signout;


	    
	    //Object Initialization
	    public HomePage(WebDriver driver)
	    {
	    	
	    	 this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

		public WebElement getOrgLink() {
			return orgLink;
		}

		
		public WebElement getContactlnk() {
			return contactlnk;
		}
		
		public WebElement getProductslnk() {
			return Productslnk;
		}
		
		public WebElement getProductslnk1() {
			return Productslnk1;
		}
		
		
		public WebElement getCreateProducts() {
			return CreateProductslnk;
		}
		
		public WebElement getLeadslnk() {
			return Leadslnk;
		}
		
		public WebElement getLeadslnk1() {
			return Leadslnk1;
		}
		
		public WebElement getCreateLeadslnk() {
			return CreateLeadslnk;
		
		}

		public WebElement getCampaignslnk() {
			return campaignslnk;
		}
		
		public WebElement getCampaignslnk1() {
			return campaignslnk1;
		}


		public WebElement getMorelnk() {
			return morelnk;
		}
		
		public WebElement getImgForLogout() {
			return adminimg;
		}


		public WebElement getLogout() {
			return signout;
		}

	



	
}
