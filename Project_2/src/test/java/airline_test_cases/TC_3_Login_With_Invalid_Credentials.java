package airline_test_cases;

import org.testng.annotations.Test;

import airline_source_page.Airline_Sign_Up_And_Login_Page;

public class TC_3_Login_With_Invalid_Credentials extends Launch_and_Quit
{
	@Test
	public void Login_With_Invalid_Credentials()
	{
		Airline_Sign_Up_And_Login_Page a1=new Airline_Sign_Up_And_Login_Page(driver);
		a1.clicktosignup();
		a1.customerlogin();
		a1.enteremail_id();
		a1.click_to_continue();
		a1.wrongpassword();
		a1.login();
	}
}
