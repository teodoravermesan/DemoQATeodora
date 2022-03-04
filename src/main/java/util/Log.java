package util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

    // Initialize Log4j logs
    private static Logger Log = LogManager.getRootLogger();
    private static ExecutionTimer executionTimer = new ExecutionTimer();

    // This is to print log for the beginning of the test case, as we usually run so many test cases as a test suite

    public static void startTestCase(String sTestCaseName) {
        Log.info("$$$$$$$$$$$$$$$$$$$$$" + sTestCaseName + " $$$$$$$$$$$$$$$$$$$$$$$$$");
    }

    //This is to print log for the ending of the test case
    public static void endTestCase(String sTestCaseName) {
        Log.info("XXXXXXXXXXXXXXXXXXXXXXX" + "-E---N---D-" + "XXXXXXXXXXXXXXXXXXXXXX");
    }

    // Need to create these methods, so that they can be called
    public static void info(String message) {
        Log.info(message);
    }

    public static void logStart(String message) {
        Log.info(message);
        executionTimer.start();
    }

    public static void logEnd(String message) {
        Log.info(executionTimer.toString() + message);
    }
}
