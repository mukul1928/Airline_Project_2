package airline_source_page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Airline_Credit_Card_Details_Page 
{
	WebDriver driver;
	
	//Step=1
	
	@FindBy(id="CC")
	WebElement Enter_Card_No;
	
	@FindBy(id="CCN")
	WebElement Enter_Cardholder_Name;
	
	@FindBy(id="CCMM")
	WebElement Expiry_Month;
	
	@FindBy(id="CCYYYY")
	WebElement Expiry_Year;
	
	@FindBy(id="CCCVV")
	WebElement CVV;
	
	@FindBy(xpath="(//div[@class='mk-pym'])[1]")
	WebElement Make_Payment;
	
	//Step=2
	
	public void Enter_Card()
	{
		Enter_Card_No.sendKeys("448978675642");
	}
	
	public void Enter_Cardholder_Name()
	{
		Enter_Cardholder_Name.sendKeys("Mukul Pandey");
	}
	
	public void Select_Expiry_Date()
	{
		Select s1=new Select(Expiry_Month);
		s1.selectByValue("12");
	}
	
	public void Select_Expiry_Year()
	{
		Select s2=new Select(Expiry_Year);
		s2.selectByValue("2030");;
	}
	
	public void Enter_CVV()
	{
		CVV.sendKeys("143");
	}
	
	public void Click_Make_Payment()
	{
		Make_Payment.click();
	}
	//Step=3
	
	public Airline_Credit_Card_Details_Page(WebDriver driver) 
	
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
}
