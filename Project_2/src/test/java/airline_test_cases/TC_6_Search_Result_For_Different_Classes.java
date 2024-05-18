package airline_test_cases;

import org.testng.annotations.Test;

import airline_source_page.Airline_Booking_Page;
import airline_source_page.Airline_Sign_Up_And_Login_Page;

public class TC_6_Search_Result_For_Different_Classes extends Launch_and_Quit
{
	@Test
	public void Search_For_Different_Classes() throws InterruptedException
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
		a2.Goa();
		a2.Choose_Date();
		a2.clicktotravellers();
		a2.click_economy();
		Thread.sleep(1000);
		a2.click_prem_economy();
		Thread.sleep(1000);
		a2.click_business();
		Thread.sleep(1000);
		a2.click_first();
		Thread.sleep(1000);
		a2.click_done();
		//a2.search_button();
	}
}
