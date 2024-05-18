package airline_test_cases;

import org.testng.annotations.Test;

import airline_source_page.Airline_Booking_Page;
import airline_source_page.Airline_Credit_Card_Details_Page;
import airline_source_page.Airline_Seat_Selection_Page_While_One_Way_Booking;
import airline_source_page.Airline_Sign_Up_And_Login_Page;

public class TC_15_Reach_Till_Payment_And_Select_Credit_Card extends Launch_and_Quit
{
	@Test
	public void Credit_Card_Select() throws InterruptedException
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
		a3.Skip_to_payment();
		
		Airline_Credit_Card_Details_Page a4=new Airline_Credit_Card_Details_Page(driver);
		a4.Enter_Card();
		a4.Enter_Cardholder_Name();
		a4.Select_Expiry_Date();
		a4.Select_Expiry_Year();
		a4.Enter_CVV();
		a4.Click_Make_Payment();
	}
}
