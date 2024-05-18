package airline_test_cases;

import org.testng.annotations.Test;

import airline_source_page.Airline_Sign_Up_And_Login_Page;
import junit.framework.Assert;

public class TC_1_Register_New_Account extends Launch_and_Quit
{
@Test
public void New_User_Register()
{	
	Airline_Sign_Up_And_Login_Page a1=new Airline_Sign_Up_And_Login_Page(driver);
	a1.clicktosignup();
	a1.customerlogin();
	a1.enteremail_id();
	a1.click_to_continue();
	a1.reset();
	a1.re_enter_user_email_id();
	a1.resetpasswordcontinue();
	a1.OTPboxex();
	a1.resetyourpassword();
}
}

