package uitests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;

@Listeners(UITestListener.class)
public class TestBase {

    WebDriver driver;

    @Parameters({"browser"})
    @BeforeMethod
    public void  methodSetup(@Optional("Chrome") String browser, ITestContext context){
        if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        }

        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        }

        context.setAttribute("driver", driver);     // override onTestFailure in ListenerAdapter
    }

    @AfterMethod
    public void testMethodTearDown(){
        driver.quit();
    }


    @BeforeSuite
    public void suiteSetup() {
        String os = System.getProperty("os.name");

        if (os.contains("Windows")) {
            System.setProperty("webdriver.gecko.driver", "src/test/resources/windows/geckodriver.exe");
            System.setProperty("webdriver.chrome.driver", "src/test/resources/windows/chromedriver.exe");
        }




    }

    @AfterSuite
    public void afterSuite(){

    }


    @DataProvider(name = "strings for query")
    public Object[][] createData1() {
        return new Object[][] {
                { "Portnov Computer School" },
                { "Portnov School" },
        };
    }
}

