package airline_test_cases;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_and_Quit
{
WebDriver driver;

	@BeforeMethod
	public void Launch_Browser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.easemytrip.com/");
		//driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@AfterMethod
	public void Quit_Browser() throws IOException
	{
		TakesScreenshot tss=(TakesScreenshot) driver;
		File source=tss.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\mukul\\eclipse-workspace\\Project_2\\Screenshots\\One"+Math.random()+".png");
		FileHandler.copy(source, destination);
		driver.close();
	}
}
