package airline_test_cases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Class implements IRetryAnalyzer
{
	int initial_counts=0;
	int retry_counts=3;
	
	

	@Override
	public boolean retry(ITestResult result) 
	{
		if(initial_counts<retry_counts)
		{
			initial_counts++;
			return true;
		}
		return false;
	}
}
