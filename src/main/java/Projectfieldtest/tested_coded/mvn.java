package Projectfieldtest.tested_coded;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mvn {
	private static final WebElement passwordfield = null;
	public static WebDriver driver=null;
	@FindBy(id="email")
	private WebElement emailid;
	@FindBy(id="pass")
	private WebElement passworldfield;
	@FindBy(id="loginbutdon")
	private WebElement loginbutton;
	@FindBy(id="u_0_h")
	private WebElement cellno;
	@FindBy(linkText="Forgot account?")
	private WebElement forgotlink;
	public void Home_page(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}	
	public enteringtheemail(String email)
	emailid.sendKeys(email);
}
public void password(String password){
	passwordfield.sendKeys(password);
}
public void clickbutton(){
	loginbutton.click();
}
public void cellenetered(Stringcell)

	{	
	}
	

}
