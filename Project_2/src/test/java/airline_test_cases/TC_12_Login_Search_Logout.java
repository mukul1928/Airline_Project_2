package airline_test_cases;
import org.testng.annotations.Test;
import airline_source_page.Airline_Booking_Page;
import airline_source_page.Airline_Sign_Up_And_Login_Page;

public class TC_12_Login_Search_Logout extends Launch_and_Quit
{
	@Test
	public void Login_Search_Flight_Logout() throws InterruptedException
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
		Thread.sleep(3000);
		a2.hoverovertoaccount();
		Thread.sleep(3000);
		a2.Click_Logout();
	}
}