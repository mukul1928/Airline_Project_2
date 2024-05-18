package airline_source_page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Airline_Multi_City_Booking_Search_Page 
{
	WebDriver driver;
	
	//Step=1
	
	@FindBy(id="mcity")
	WebElement Multicity;
	
	@FindBy(id="FromSector-mul1_show")
	WebElement select_first_from;
	
	@FindBy(id="spn9")
	WebElement Dubai;
	
	@FindBy(id="ToSector-mul1_show")
	WebElement select_first_to;
	
	@FindBy(xpath="(//span[@id='spn10'])[2]")
	WebElement Bangkok;
	
	@FindBy(id="ddateMul1")
	WebElement multideparturedate;
	
	@FindBy(id="18/05/2024")
	WebElement click_18May;
	
	@FindBy(id="imulDownArr")
	WebElement click_travellers;
	
	@FindBy(id="addadt")
	WebElement click_one_traveller;
	
	@FindBy(id="spnmFirst")
	WebElement first_class;
	
	@FindBy(xpath="(//a[@class='dn_btn'][normalize-space()='Done'])[2]")
	WebElement click_done;
	
	@FindBy(id="FromSector-mul2_show")
	WebElement from_2nd;
	
	@FindBy(id="ToSector-mul2_show")
	WebElement Destination_City;
	
	@FindBy(xpath="(//span[@class='flsctrhead'])[50]")
	WebElement Mumbai;
	
	@FindBy(id="ddateMul2")
	WebElement Second_Depature_Date;
	
	@FindBy(id="fiv_4_30/05/2024")
	WebElement Returning_Date_Multi;
	
	@FindBy(xpath="(//input[@value='Search'])[1]")
	WebElement Search_Multicity_Button;
	
	//Step=2
	
	public void click_multicity()
	{
		Multicity.click();
	}
	
	public void click_on_from()
	{
		select_first_from.click();
	}
	
	public void click_Dubai()
	{
		Dubai.click();
	}
	
	public void click_on_to()
	{
		select_first_to.click();
	}
	
	public void click_Bangkok()
	{
		Bangkok.click();
	}
	
	public void click_multideparture_date()
	{
		multideparturedate.click();
	}
	
	public void choose_18_may()
	{
		click_18May.click();
	}
	
	public void Travellers()
	{
		click_travellers.click();
	}
	
	public void plus_one_traveller()
	{
		click_one_traveller.click();
	}
	
	public void choose_first_class()
	{
		first_class.click();
	}
	
	public void Done_Button()
	{
		click_done.click();
	}
	
	public void select_second_from()
	{
		from_2nd.click();
	}
	
	public void select_Destination()
	{
		Destination_City.click();
	}
	
	public void Select_Mumbai()
	{
		Mumbai.click();
	}
	
	public void Click_Second_Departure_Date()
	{
		Second_Depature_Date.click();
	}
	
	public void Choose_Returning_Date()
	{
		Returning_Date_Multi.click();
	}
	
	public void Click_Search_Button_Multi()
	{
		Search_Multicity_Button.click();
	}
	
	//Step=3
	
	public Airline_Multi_City_Booking_Search_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
