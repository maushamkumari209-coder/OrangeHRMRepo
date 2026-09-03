package listner;

   import java.io.IOException;

	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;
	import org.testng.Reporter;

	import genericUtility.BaseClass;
	import genericUtility.WebDriverUtility;

	public class ListenerImplementation extends BaseClass implements ITestListener {

	    WebDriverUtility wUtil = new WebDriverUtility();

	    @Override
	    public void onStart(ITestContext context) {

	        Reporter.log("===== Test Execution Started =====", true);
	    }

	    @Override
	    public void onFinish(ITestContext context) {

	        Reporter.log("===== Test Execution Finished =====", true);
	    }

	    @Override
	    public void onTestStart(ITestResult result) {

	        Reporter.log(result.getMethod().getMethodName() + " Test Started", true);
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {

	        Reporter.log(result.getMethod().getMethodName() + " Test Passed", true);
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {

	        Reporter.log(result.getMethod().getMethodName() + " Test Failed", true);

	        Reporter.log(result.getThrowable().toString(), true);

	 try {
	            wUtil.takeScreenShot(driver,
	                    result.getMethod().getMethodName());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	    }


	    @Override
	    public void onTestSkipped(ITestResult result) {

	        Reporter.log(result.getMethod().getMethodName() + " Test Skipped", true);
	    }

	}


