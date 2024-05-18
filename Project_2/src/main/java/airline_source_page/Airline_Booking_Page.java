package airline_source_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Airline_Booking_Page 
{
	WebDriver driver;
	
	//Step=1
	
	@FindBy(id="FromSector_show")
	WebElement clickfrom;
	
	@FindBy(id="a_FromSector_show")
	WebElement entervalue_in_from;
	
	@FindBy(xpath="(//span[@id='spn2'])[1]")
	WebElement select_Bangalore;
	
	@FindBy(id="a_Editbox13_show")
	WebElement clickto;
	
	@FindBy(xpath="(//span[@id='spn5'])[2]")
	WebElement entervalue_in_to;
	
	@FindBy(id="ddate")
	WebElement select_departure_date;
	
	@FindBy(id="fiv_5_31/05/2024")
	WebElement select_date;
	
	@FindBy(xpath="(//div[@class='fss_flex search_colm'])")
	WebElement click_search;
	
	@FindBy(id="welcome-det-User")
	WebElement hoverovertouser;
	
	@FindBy(xpath="(//span[@class='fnt14'][normalize-space()='Log Out'])[1]")
	WebElement logout;
	
	@FindBy(id="rtrip")
	WebElement click_to_round_trip;
	
	@FindBy(id="frth_1_17/06/2024")
	WebElement return_date;
	
	@FindBy(id="iDownArr")
	WebElement traveller_class;
	
	@FindBy(id="spanEconomy")
	WebElement economy;
	
	@FindBy(id="spanpEconomy")
	WebElement prem_economy;
	
	@FindBy(id="spanBusiness")
	WebElement business;
	
	@FindBy(id="spanFirst")
	WebElement first;
	
	@FindBy(id="traveLer")
	WebElement Done;
	
	@FindBy(id="add")
	WebElement add_more_adults;
	
	@FindBy(xpath="(//button[@class='add plus_boxChd'])[1]")
	WebElement add_children;
	
	@FindBy(xpath="(//button[@class='add plus_box1Inf'])[1]")
	WebElement add_infant;
	
	@FindBy(id="0")
	WebElement flight_details;
	
	@FindBy(id="divMoreFare0")
	WebElement morefare;
	
	@FindBy(xpath="(//span[@class='checkk-radio'])[3]")
	WebElement Super_6E;
	
	
	//Step=2
	
	public void from()
	{
		clickfrom.click();
	}
	
	public void entersomevalueinfrom()
	{
		entervalue_in_from.click();
	}
	
	public void Bangalore()
	{
		select_Bangalore.click();
	}
	
	public void to()
	{
		clickto.click();
	}
	
	public void Goa()
	{
		entervalue_in_to.click();
	}
	
	public void Departure_Date()
	{
		select_departure_date.click();
	}
	
	public void Choose_Date()
	{
		select_date.click();
	}
	
	public void search_button()
	{
		click_search.click();
	}
	
	public void hoverovertoaccount()
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(hoverovertouser).perform();
	}
	
	public void Click_Logout()
	{
		logout.click();
	}
	
	public void round_trip()
	{
		click_to_round_trip.click();
	}
	
	public void clicktoroundtrip()
	{
		return_date.click();
	}
	
	public void clicktotravellers()
	{
		traveller_class.click();
	}
	
	public void click_economy()
	{
		economy.click();
	}
	
	public void click_prem_economy()
	{
		prem_economy.click();
	}
	
	public void click_business()
	{
		business.click();
	}
	
	public void click_first()
	{
		first.click();
	}
	
	public void click_done()
	{
		Done.click();
	}
	
	public void clicktoaddmoreadults()
	{
		add_more_adults.click();
	}
	
	public void clicktoaddchildren()
	{
		add_children.click();
	}
	
	public void clicktoaddinfant()
	{
		add_infant.click();
	}
	
	public void click_flight_details()
	{
		flight_details.click();
	}
	
	public void click_more_fare()
	{
		morefare.click();
	}
	
	public void select_super_6E()
	{
		Super_6E.click();
	}
	//Step=3
	
	public Airline_Booking_Page(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
