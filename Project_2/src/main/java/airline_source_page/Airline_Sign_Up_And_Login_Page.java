package airline_source_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Airline_Sign_Up_And_Login_Page
{
	WebDriver driver;
	
	//step=1
	
	@FindBy(id="divSignInPnl")
	WebElement signup;
	
	@FindBy(xpath="(//span[@class='fnt14'])[7]")
	WebElement click_customer_login;
	
	@FindBy(xpath="(//input[@class='ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required'])[1]")
	WebElement enter_email;
	
	@FindBy(id="shwotp")
	WebElement click_continue;
	
	@FindBy(xpath="(//input[@id='txtEmail2'])[1]")
	WebElement enter_password;
	
	@FindBy(xpath="(//input[@id='txtEmail2'])[1]")
	WebElement enter_wrong_password;
	
	@FindBy(xpath="(//input[@ng-click=\"Authenticate('P')\"])[1]")
	WebElement click_login;
	
	@FindBy(linkText="Reset Password")
	WebElement resetuserpassword;
	
	@FindBy(xpath="(//input[@id='txtEmail5'])")
	WebElement re_enter_email;
	
	@FindBy(xpath="(//input[@ng-click='CheckUserFP();'])[1]")
	WebElement reset_continue_button;
	
	@FindBy(id="divResetOTP")
	WebElement OTP;
	
	@FindBy(xpath="//input[@class='ng-pristine ng-empty ng-invalid ng-invalid-required ng-touched']")
	WebElement resetpassword;
	
	//step=2
	
	public void clicktosignup()
	{
	Actions a1=new Actions(driver);
	a1.moveToElement(signup).perform();
	}
	
	public void customerlogin()
	{
		click_customer_login.click();
	}
	
	public void enteremail_id()
	{
		enter_email.sendKeys("mukulpandey89@gmail.com");
	}
	
	public void click_to_continue()
	{
		click_continue.click();
	}
	
	public void enter_user_password()
	{
		enter_password.sendKeys("mukul1928@");;
	}
	
	public void wrongpassword()
	{
		enter_wrong_password.sendKeys("jamesbond007");
	}
	public void login()
	{
		click_login.click();
	}
	
	public void reset()
	{
		resetuserpassword.click();
	}
	
	public void re_enter_user_email_id()
	{
		re_enter_email.sendKeys("mukulpandey89@gmail.com");
	}
	
	public void resetpasswordcontinue()
	{
		reset_continue_button.click();
	}
	
	public void resetyourpassword()
	{
		resetpassword.sendKeys("mukul1928@");
	}
	
	public void OTPboxex()
	{
		OTP.sendKeys("557129");
	}
	

public Airline_Sign_Up_And_Login_Page(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
}
