package airline_source_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Airline_Seat_Selection_Page_While_One_Way_Booking 
{
WebDriver driver;
		
	//Step=1

	@FindBy(xpath="(//button[contains(@type,'button')][normalize-space()='Book Now'])[1]")
	WebElement Book_Now_Button;
	
	@FindBy(id="chkInsurance")
	WebElement insurance;
	
	@FindBy(id="txtEmailId")
	WebElement enter_email;
	
	@FindBy(id="spnRdoBOOKNOW")
	WebElement coupon_code;
	
	@FindBy(xpath="(//div[@class='apl'])")
	WebElement apply_coupon_code;
	
	@FindBy(id="spnVerifyEmail")
	WebElement continue_booking;
	
	@FindBy(id="titleAdult0")
	WebElement select_title;
	
	@FindBy(id="txtFNAdult0")
	WebElement first_name;
	
	@FindBy(id="txtLNAdult0")
	WebElement last_name;
	
	@FindBy(id="txtCPhone")
	WebElement mobile_no;
	
	@FindBy(id="spnTransaction")
	WebElement Continue_Booking_2;
	
	@FindBy(linkText="Let Me Choose Myself")
	WebElement choose_seat;
	
	@FindBy(xpath="(//label[@class='s_seat_avl  darkblue-bg'])[3]")
	WebElement select_window;
	
	@FindBy(id="divancMealDtl")
	WebElement choose_meal;
	
	@FindBy(xpath="(//a[@id='add3'])[1]")
	WebElement add_meal;
	
	@FindBy(xpath="(//a[@id='add3'])[6]")
	WebElement add_India_favourite_beverage;
	
	@FindBy(xpath="(//span[@class='co1'])[2]")
	WebElement click_continue_3;
	
	@FindBy(xpath="(//a[@id='add31'])[6]")
	WebElement add_baggage;
	
	@FindBy(xpath="(//span[@class='co1'])[2]")
	WebElement click_continue_4;
	
	@FindBy(linkText="Skip to Payment")
	WebElement click_skip_to_payment;
	
	
	//Step=2
	
	public void Click_BookNow()
	{
		Book_Now_Button.click();
	}
	
	public void Click_Insurance()
	{
		insurance.click();
	}
	
	public void Email_Id()
	{
		enter_email.sendKeys("chandanpandey1928@gmail.com");
	}
	
	public void apply_coupon()
	{
		coupon_code.click();
	}
	
	public void click_to_apply_button()
	{
		apply_coupon_code.click();
	}
	
	public void click_continue()
	{
		continue_booking.click();
	}
	
	public void Title()
	{
		Select s1=new Select(select_title);
		s1.selectByVisibleText("MR");
	}
	
	public void enterfirstname()
	{
		first_name.sendKeys("Chandan");
	}
	
	public void enterlastname()
	{
		last_name.sendKeys("Pandey");
	}
	
	public void entermobileno()
	{
		mobile_no.sendKeys("8808058300");
	}
	
	public void click_continue_booking_second()
	{
		Continue_Booking_2.click();
	}
	
	public void choose_your_seat()
	{
		choose_seat.click();
	}
	
	public void window_seat_select() 
	{
		select_window.click();
	}
	
	public void Meal()
	{
		choose_meal.click();
	}
	
	public void Click_Plus_On_Meal()
	{
		add_meal.click();
	}
	
	public void Click_Plus_On_India_Favourite()
	{
		add_India_favourite_beverage.click();
	}
	
	public void select_continue_third()
	{
		click_continue_3.click();
	}
	
	public void add_luggage()
	{
		add_baggage.click();
	}
	
	public void select_continue_fourth()
	{
		click_continue_4.click();
	}
	
	public void Skip_to_payment()
	{
		click_skip_to_payment.click();
	}
	//Step=3
	
	public Airline_Seat_Selection_Page_While_One_Way_Booking(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}