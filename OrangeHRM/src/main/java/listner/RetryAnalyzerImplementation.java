package listner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementation implements IRetryAnalyzer {

    int count = 0;
    int maxRetry = 2;

    @Override
    public boolean retry(ITestResult result) {

        if (count < maxRetry) {
            count++;
            System.out.println("Retrying Test : " + result.getMethod().getMethodName()
                    + " Retry Count : " + count);
            return true;
        }

        return false;
    }

}