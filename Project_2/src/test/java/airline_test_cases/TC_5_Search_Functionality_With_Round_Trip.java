package airline_test_cases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import airline_source_page.Airline_Booking_Page;
import airline_source_page.Airline_Sign_Up_And_Login_Page;
@Listeners(Listeners_Class.class)
public class TC_5_Search_Functionality_With_Round_Trip extends Launch_and_Quit
{
	@Test(retryAnalyzer=airline_test_cases.Retry_Class.class)
	public void Round_Trip()
	{
Airline_Sign_Up_And_Login_Page a1=new Airline_Sign_Up_And_Login_Page(driver);
	
	a1.clicktosignup();
	a1.customerlogin();
	a1.enteremail_id();
	a1.click_to_continue();
	a1.enter_user_password();
	a1.login();
	
Airline_Booking_Page a2=new Airline_Booking_Page(driver);
	a2.round_trip();
	a2.from();
	a2.entersomevalueinfrom();
	a2.Bangalore();
	a2.to();
	a2.Goa();
	//a2.Departure_Date();
	a2.Choose_Date();
	a2.clicktoroundtrip();
	a2.search_button();
	}
}