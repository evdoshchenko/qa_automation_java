import org.testng.Assert;
import org.testng.annotations.Test;

public class CarTest {

    @Test
    public void testName() {
        Car myCar = new Car("Toyota", 2000, "4 cyl");

        myCar.drive();
        myCar.turnLeft();
        myCar.turnRight();

        boolean isEqual = myCar.year == 2000;
        boolean isVolvo = myCar.getModel().equalsIgnoreCase("Volvo");

        Assert.assertTrue(isEqual);
        Assert.assertFalse(isVolvo);
    }
}
