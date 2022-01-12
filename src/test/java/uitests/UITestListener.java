package uitests;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;
import org.testng.internal.Utils;

import java.io.File;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;




public class UITestListener extends TestListenerAdapter {

    private WebDriver driver;

    @Override
    public void onTestFailure(ITestResult tr) {
        this.driver = (WebDriver) tr.getTestContext().getAttribute("driver");
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
        String path = "C:\\Users\\Danil Walk\\IdeaProjects\\qa_automation_java\\src\\screenshots";
        Utils.copyFile(screenshotFile, new File(buildFilePath(tr)));
    }

    private String buildFilePath(ITestResult testResult){
        String userDir = System.getProperty("user.dir");
        String folder = "/screenshots";
        String className = "/" + testResult.getTestClass().getName().replace(".","/");
        String testMethodName = "/" + testResult.getMethod().getMethodName();

        return new StringBuilder()
                .append(userDir)
                .append(folder)
                .append(className)
                .append(testMethodName)
                .append("/image.png").toString();
    }
}