package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	// Declaration

    @FindBy(name="username")
    private WebElement usernameun;

    @FindBy(name="password")
    private WebElement passwordpd;

    @FindBy(xpath="//button[@type='submit']")
    private WebElement loginBtn;
    

    // Initialization

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

 // Getters

public WebElement getUsernameEdt() {
    return usernameun;
}

public WebElement getPasswordEdt() {
    return passwordpd;
}

public WebElement getLoginBtn() {
    return loginBtn;
}


public void loginToApplication(String username, String password)
{
    usernameun.sendKeys(username);
    passwordpd.sendKeys(password);
    loginBtn.click();
}
}
