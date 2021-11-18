import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest extends TestBase {

    @Test
    public void testUnusedLocators() {
    }

    //1. Navigate to the main page
    //2. Type the query and submit
    //3. Assert the amount result
    // - get the amount results
    // - compare that with expectations
    @Test
    public void testSearchAndVerifyResults() {
        navigateToMainPage();
        typeQueryAndSubmit();
        int actualNumberOfResults =  getNumberOfResults();
        Assert.assertTrue(actualNumberOfResults > 38000);
    }

    private int getNumberOfResults() {
        WebElement statsElement = driver.findElement(By.id("result-stats"));
        return CommonTools.parseResults(statsElement);
    }

    private void typeQueryAndSubmit() {
        WebElement textInput = driver.findElement(By.name("q"));
        textInput.sendKeys("Portnov Computer School");
        textInput.submit();
    }

    private void navigateToMainPage() {
        driver.get("https://google.com");
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
