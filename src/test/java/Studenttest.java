import org.testng.Assert;
import org.testng.annotations.Test;


public class Studenttest {

    @Test
    public void testName() {
        String testParamOne = "Danil";
        String testParamTwo = "Evdoshchenko";

        Student studentOne = new Student(testParamOne, testParamTwo);

        studentOne.printName();
        studentOne.graduate();

        boolean isNameCorrect = studentOne.name.contentEquals("Danil");
        Assert.assertTrue(isNameCorrect);

        Assert.assertEquals(studentOne.name, "DAnil");
    }

    @Test
    public void testName032() {
        String testParamOne = "StudentName001";
        String testParamTwo = "StudentLastName001";

        Student studentOne = new Student(testParamOne, testParamTwo);

        studentOne.printName();
        studentOne.graduate();

        String expectedName = "StudentName001";

        Assert.assertEquals(studentOne.name, expectedName);
    }
}
