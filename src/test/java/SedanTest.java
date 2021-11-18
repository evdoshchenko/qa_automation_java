import org.testng.Assert;
import org.testng.annotations.Test;

public class SedanTest {

    @Test
    public void testName() {
        Sedan myNewCar = new Sedan("Camry",2001,"4cyl");
        myNewCar.turnLeft();
        myNewCar.comfortModelDrive();
    }

    @Test
    public void testAnotherCar() {
        Car justACar = new Car("Some Car", 2020, "4cyl");

        String drive = justACar.drive();
        Assert.assertTrue(drive.contentEquals("Driving as a Car"));

        Sedan anotherCar = new Sedan("Honda", 2002, "4cyl");
        anotherCar.comfortModelDrive();

        String comfortDrive = anotherCar.drive();
        boolean isEqual = comfortDrive.equalsIgnoreCase("Driving as a sedan");
        Assert.assertTrue(isEqual);
    }
}
