package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {
    public void onTestStart(ITestResult result) {
        System.out.println("The name of the test started is :" + result.getMethod().getMethodName() + ": " + result.getMethod().getDescription());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getMethod().getMethodName() + ": " + result.getMethod().getDescription());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: " + result.getMethod().getMethodName() + ": " + result.getMethod().getDescription());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getMethod().getMethodName() + ": " + result.getThrowable());
    }

    public void onStart(ITestContext context) {
        System.out.println("Start Suite: " + context.getName());
    }

    public void onFinish(ITestContext context) {
        System.out.println("Finished Suite:" + context.getName());
        System.out.println(context.getName() + " Report Header");
        System.out.println("Nr of Passed Tests:\n" + context.getPassedTests().size() + '\n');
        System.out.println("Nr of Failed Tests:\n " + context.getFailedTests().size() + '\n');
        System.out.println("Nr of Skipped Tests:\n " + context.getSkippedTests().size() + '\n');
        System.out.println(context.getName() + " Report Footer");
    }
}
