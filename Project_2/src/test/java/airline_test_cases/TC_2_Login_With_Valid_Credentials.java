package airline_test_cases;

import org.testng.annotations.Test;

import airline_source_page.Airline_Sign_Up_And_Login_Page;

public class TC_2_Login_With_Valid_Credentials extends Launch_and_Quit 
{
@Test
public void Login_with_Valid_Email_and_Password()
{
	Airline_Sign_Up_And_Login_Page a1=new Airline_Sign_Up_And_Login_Page(driver);
	a1.clicktosignup();
	a1.customerlogin();
	a1.enteremail_id();
	a1.click_to_continue();
	a1.enter_user_password();
	a1.login();
}
}
