package airline_test_cases;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import airline_source_page.Airline_Booking_Page;
import airline_source_page.Airline_Seat_Selection_Page_While_One_Way_Booking;
import airline_source_page.Airline_Sign_Up_And_Login_Page;
@Listeners(Listeners_Class.class)
public class TC_13_Apply_Coupon_Ordering_Product extends Launch_and_Quit
{
	@Test(retryAnalyzer=airline_test_cases.Retry_Class.class)
	public void Validating_Coupon_Applying_While_Ordering_Product() throws InterruptedException
	{
		Airline_Sign_Up_And_Login_Page a1=new Airline_Sign_Up_And_Login_Page(driver);
		
		a1.clicktosignup();
		a1.customerlogin();
		a1.enteremail_id();
		a1.click_to_continue();
		a1.enter_user_password();
		a1.login();
		
		Airline_Booking_Page a2=new Airline_Booking_Page(driver);
		
		a2.from();
		a2.entersomevalueinfrom();
		a2.Bangalore();
		a2.to();
		a2.Goa();;
		a2.Choose_Date();
		a2.search_button();
		
		Airline_Seat_Selection_Page_While_One_Way_Booking a3=new Airline_Seat_Selection_Page_While_One_Way_Booking(driver);
		
		a3.Click_BookNow();
		a3.Click_Insurance();
		a3.Email_Id();
		a3.click_continue();
		a3.Title();
		a3.enterfirstname();
		a3.enterlastname();
		a3.entermobileno();
		Thread.sleep(2000);
		a3.click_continue_booking_second();
		a3.choose_your_seat();
		a3.window_seat_select();
		a3.Meal();
		a3.Click_Plus_On_Meal();
		a3.apply_coupon();
		a3.click_to_apply_button();
		a3.select_continue_third();
		a3.add_luggage();
		a3.select_continue_fourth();
	}
}
