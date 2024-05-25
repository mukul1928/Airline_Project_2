package airline_test_cases;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import airline_source_page.Airline_Booking_Page;
import airline_source_page.Airline_Sign_Up_And_Login_Page;
@Listeners(Listeners_Class.class)
public class TC_10_Validating_Flight_Details_Fair_Cancelation extends Launch_and_Quit
{
	@Test(retryAnalyzer=airline_test_cases.Retry_Class.class)
	public void flight_details() throws InterruptedException
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
		a2.clicktoaddmoreadults();
		a2.clicktoaddchildren();
		a2.clicktoaddinfant();
		a2.click_done();
		a2.search_button();
		a2.click_flight_details();
		Thread.sleep(3000);
		a2.click_more_fare();
		Thread.sleep(3000);
		a2.select_super_6E();
	}
}

