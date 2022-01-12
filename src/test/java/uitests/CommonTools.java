package uitests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommonTools {

    public static int extractInteger(String stringValue){
//        String[] array = stringValue.split(" ");
//        String numberOfResults = array [2] + array [3];
//        int parseInteger = Integer.parseInt(numberOfResults);
//        return parseInteger;

        String[] array = stringValue.split(" ");
        String numberOfResults = array[2] + array [3];
        int parsedInteger = Integer.parseInt(numberOfResults);
        return parsedInteger;
    }

    public static int parseResults(WebElement element) {
//        String wholeStatsElement = element.getText();
//        return extractInteger(wholeStatsElement);

        String wholeStatsText = element.getText();
        return extractInteger(wholeStatsText);

    }
}
