import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest {
    @Test
    public void testName() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

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
}
