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

    //polymorphism
    @Test
    public void testOverriding() {
        Car myCar = new Car("Toyota", 2000, "4 cyl");

        myCar.drive();
    }

    @Test
    public void testOverriding001() {
        Sedan myCar = new Sedan("Toyota", 2000, "4 cyl");

        myCar.drive();
    }

    @Test
    public void testOverriding002() {
        Car myCar = new Car("Toyota", 2000, "4 cyl");

        myCar.drive();

        Car anotherCar = new Sedan("Toyota", 2000, "4 cyl");

        myCar.drive();

    }

    @Test
    public void testOverloading() {
        Sedan anotherCar = new Sedan("Toyota", 2001, "4 cyl");

        anotherCar.increaseSpeed();
        anotherCar.increaseSpeed("20");
        anotherCar.increaseSpeed(20);
    }
}
