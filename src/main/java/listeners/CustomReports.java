package listeners;

import org.testng.*;
import org.testng.xml.XmlSuite;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class CustomReports implements IReporter {
    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
                               String outputDirectory) {
        //Iterating over each suite included in the test
        for (ISuite suite : suites) {
            //get the suite name
            String suiteName = suite.getName();
            //Getting the results for the said suite
            Map<String, ISuiteResult> suiteResults = suite.getResults();
            for (ISuiteResult sr : suiteResults.values()) {
                ITestContext tc = sr.getTestContext();
                System.out.println("===============================================" + tc.getName() + " Test Report Header===============================================");
                System.out.println("Suite name: " + tc.getName());
                System.out.println("Test start time: " + tc.getStartDate());
                System.out.println("Test end time: " + tc.getEndDate());
                System.out.println("Test report output directory: " + tc.getOutputDirectory());

                System.out.println("Number of PASSED tests for '" + suiteName +
                        "' suite is: " + tc.getPassedTests().getAllResults().size());

                Collection<ITestNGMethod> passedMethods = tc.getPassedTests().getAllMethods();
                for (ITestNGMethod itm1 : passedMethods) {
                    System.out.println("Passed test: " + itm1.getMethodName() + ":" + itm1.getDescription());
                }

                System.out.println("Number of FAILED tests for '" + suiteName +
                        "' suite is: " + tc.getFailedTests().getAllResults().size());

                Collection<ITestNGMethod> failedMethods = tc.getFailedTests().getAllMethods();
                for (ITestNGMethod itm : failedMethods) {
                    System.out.println("Failed test: " + itm.getMethodName() + ":" + itm.getDescription());
                }

                System.out.println("Skipped nr tests for '" + suiteName +
                        "' suite is:" + tc.getSkippedTests().getAllResults().size());
                System.out.println("===============================================" + tc.getName() + " Test Report Footer===============================================\n");
            }
        }
    }
}
