import org.testng.Assert;
import org.testng.annotations.Test;
import uitests.CommonTools;

public class CommonToolTest {
    @Test
    public void verifyExtractInteger() {
        String value = "Результатов: примерно 757 000 (0,55 сек.) ";

        int actual = CommonTools.extractInteger(value);
        Assert.assertEquals(757000, actual);

    }

    @Test
    public void testOSVersion() {
        String os = System.getProperty("os.name");
        System.out.println(os);
    }
}
