package airline_test_cases;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import airline_source_page.Airline_Booking_Page;
import airline_source_page.Airline_Multi_City_Booking_Search_Page;
import airline_source_page.Airline_Sign_Up_And_Login_Page;
@Listeners(Listeners_Class.class)
public class TC_7_Search_Functionality_With_Multi_City extends Launch_and_Quit
{
@Test(retryAnalyzer=airline_test_cases.Retry_Class.class)
public void multicity_search()
{
Airline_Sign_Up_And_Login_Page a1=new Airline_Sign_Up_And_Login_Page(driver);
	
	a1.clicktosignup();
	a1.customerlogin();
	a1.enteremail_id();
	a1.click_to_continue();
	a1.enter_user_password();
	a1.login();
	
	Airline_Multi_City_Booking_Search_Page a2=new Airline_Multi_City_Booking_Search_Page(driver);
	a2.click_multicity();
	a2.click_on_from();
	a2.click_Dubai();
	a2.click_on_to();
	a2.click_Bangkok();
	a2.click_multideparture_date();
	a2.choose_18_may();
	a2.Travellers();
	a2.plus_one_traveller();
	a2.choose_first_class();
	a2.Done_Button();
	a2.select_second_from();
	a2.select_Destination();
	a2.Select_Mumbai();
	a2.Click_Second_Departure_Date();
	a2.Choose_Returning_Date();
	a2.Click_Search_Button_Multi();
}
}
