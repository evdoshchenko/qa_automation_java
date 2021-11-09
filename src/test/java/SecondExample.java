import org.testng.annotations.Test;

public class SecondExample {

    @Test
    public void testNameOne() {
        int variableOne = 1;
        int variableTwo = 67;
        printTwoNumbers(variableOne, variableTwo);
    }

    @Test
    public void testNameTwo() {
        int variableOne = 5;
        int variableTwo = 7;
        printTwoNumbers(variableOne, variableTwo);
    }

    public void printTwoNumbers(int firstParameter, int secondParameter){
        System.out.println(firstParameter + " " + secondParameter);
    }

    @Test
    public void test001() {
        float floatValue = (float) 4.5;
        float floatCast = 5.3f;
        System.out.println(floatValue+floatCast);
    }

    @Test
    public void testBooleans() {
        boolean booleanVariable = true;

        int amountOfLinks = 5;
        int amountOfClicks = 4;

        boolean isThereAreStillLinksToClick = amountOfLinks > amountOfClicks; // true
        if (isThereAreStillLinksToClick) {
            System.out.println("Keep clicking on links");
        }
    }

    @Test
    public void testMoreLogical() {
        int amountOfLinks = 5;
        int amountOfClicks = 4;

        boolean elementOneVisible = false;

        boolean isThereAreStillLinksToClick = amountOfLinks > amountOfClicks;

        int currentTime = 5000;
        int timeSinceTestStarted = 2000;

        boolean isThereStillSomeTime = isThereAreStillLinksToClick(currentTime, timeSinceTestStarted);

        if (elementOneVisible && isThereAreStillLinksToClick || isThereStillSomeTime){
            System.out.println("Keep clicking on links");
        } else {
            System.out.println("Some conditions are not met");
        }
    }

    public boolean isThereAreStillLinksToClick(int currentTime, int timeSinceTestStarted){
        boolean result = false;

        result = (currentTime - timeSinceTestStarted)>1000;

        return result;

    }

    @Test
    public void testEscMark() {
        boolean yesItstrue = true;
        System.out.println(!yesItstrue);
    }

    @Test
    public void testEx4() {
        String a = "Wow";
        String b = "Wow";

        boolean b1 = a.equals(b);
        boolean b2 = a.equals(b + "!");
        boolean b3 = !a.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }

    @Test
    public void testArrays() {
        int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6};

        String firstCar = "Volvo";
        String secondCar = "Toyota";
        String trirdCar = "Tesla";
        String[] garage = {firstCar,secondCar,trirdCar};

        for(int i = 0; i<garage.length; i++){
            System.out.println("Car"+"["+i+"]"+garage[i]);
        }

        for(String eachCar : garage){
            System.out.println("Car:"+eachCar);
        }
    }

    @Test
    public void testWhile() {
        int i = 0;
        while (i<10) {
            System.out.println("While is still on");
            i++;
        }
    }
}
