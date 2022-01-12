package uitests;

import org.testng.Assert;
import org.testng.annotations.Test;
import uitests.pages.MainPage;
import uitests.pages.ResultsPages;

public class GoogleSearchTest extends TestBase {




    //1. Navigate to the main page
    //2. Type the query and submit
    //3. Assert the amount result
    // - get the amount results
    // - compare that with expectations
    @Test(dataProvider = "strings for query")
    public void testSearchAndVerifyResults(String paramOne) {
        MainPage mainPage = new MainPage(driver);
        mainPage.navigate();
        mainPage.typeQueryAndSubmit(paramOne);

        ResultsPages resultsPages = new ResultsPages(driver);
        int actualNumberOfResults = resultsPages.getNumberOfResults();

        Assert.assertTrue(actualNumberOfResults > 35000);
    }
}
