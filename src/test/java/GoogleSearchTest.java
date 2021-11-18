import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class GoogleSearchTest {

    WebDriver driver;

    @Test
    public void testSearchAndVerifyResults() {

        driver.get("https://google.com");


        WebElement textInput = driver.findElement(By.name("q"));
        textInput.sendKeys("Portnov Computer School");
        textInput.submit();

        String wholeStatsText = driver.findElement(By.id("result-stats")).getText();
        String[] array = wholeStatsText.split(" ");
        String numberOfResults = array [2] + array [3];

        int parseInteger = Integer.parseInt(numberOfResults);
        Assert.assertTrue(parseInteger > 38000);

    }

    @Parameters({"browser"})
    @BeforeSuite
    public void suitSetup(String browser) {

        String os = System.getProperty("os.name");

        if(os.contains("Windows")){
            System.setProperty("webdriver.gecko.driver", "src/test/resources/windows/geckodriver.exe");
            System.setProperty("webdriver.chrome.driver", "src/test/resources/windows/chromedriver.exe");
        }

        if (browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }



    }

    @Test
    public void testOSVersion() {
        String os = System.getProperty("os.name");
        System.out.println(os);
    }

    @Test
    public void testFirefox() {


        WebDriver driver = new FirefoxDriver();

        driver.get("https://google.com");

    }


}
