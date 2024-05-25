package airline_test_cases;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launch_and_Quit extends Listeners_Class
{
	@BeforeMethod
	@Parameters("browser")
	public void Launch_Browser(String browsername)
	{
		if(browsername.equals("chrome"))
		{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.easemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	}
	
	@AfterMethod
	public void Quit_Browser() throws IOException
	{
		driver.close();
	}
}
