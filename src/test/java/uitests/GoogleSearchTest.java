package uitests;

import data.Providers;
import org.junit.Assert;
import org.testng.annotations.Test;
import uitests.pages.MainPage;
import uitests.pages.ResultsPages;

public class GoogleSearchTest extends TestBase {
    //1. Navigate to the main page
    //2. Type the query and submit
    //3. Assert the amount result
    // - get the amount results
    // - compare that with expectations
//    @Test(dataProvider = "strings for query")
    @Test(dataProvider = Providers.STRINGS_FOR_QUERY, dataProviderClass = Providers.class)
    public void testSearchAndVerifyResults(String paramOne) {
        int testExpectedNumber = 3500;

        MainPage mainPage = new MainPage(driver);
        mainPage.navigate();
        mainPage.typeQueryAndSubmit(paramOne);

        ResultsPages resultsPages = new ResultsPages(driver);
        int actualNumberOfResults = resultsPages.getNumberOfResults();

        Assert.assertTrue("amount of result is less than " + testExpectedNumber,
                actualNumberOfResults > testExpectedNumber);
    }
}
