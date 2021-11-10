import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class interviewQuestions

{
    //1. Loop that goes over values from 1 to 10
    //2. By using % operator, evaluate if number is even or odd
    //3. Using If statements print out only even numbers
    @Test
    public void testName() {
        solution();
    }

    @Test
    public void testName001() {
        solutionHelloWorld();
    }

    public void solution () {
        for (int i = 1; i <= 10; i++) {
            if (i%2==0) System.out.println(i);
        }
    }

    public void solutionHelloWorld () {
        for (int i = 1; i <= 10; i++) {
            if (i%2==0) System.out.println("Hello World");
        }
    }

    @Test
    public void swapTwoNumbersInArray() {
        int[] array = {1,2,3,4};
        swapSollution(array, 1, 2);
        System.out.println(Arrays.toString(array));
    }

    private void swapSollution(int[] array, int leftElement, int rightElement) {
        int temp = array[leftElement];
        array[leftElement] = array[rightElement];
        array[rightElement] = temp;
    }

    @Test
    public void testTwDimArray() {
        String[][] garage = {
            {"firstCar01","secondCar02","trirdCar03"},
            {"firstCar11","secondCar12","trirdCar13"},
            {"firstCar21","secondCar22","trirdCar23"}
        };

        String carToFind = "secondCar02";

        Assert.assertTrue(solutionForGarage(garage, carToFind));

        System.out.println(Arrays.deepToString(garage));
    }

    @Test
    public void testTwDimArray002() {
        String[][] garage = {
                {"firstCar01","secondCar02","trirdCar03"},
                {"firstCar11","secondCar12","trirdCar13"},
                {"firstCar21","secondCar22","trirdCar23"}
        };

        String carToFind = "Volvo";

        boolean result = solutionForGarage(garage, carToFind);

        Assert.assertFalse(result);
        System.out.println(Arrays.deepToString(garage));
    }

    private boolean solutionForGarage(String[][] garage, String carToFind) {
        boolean result = false;


        for(String[] eachFloor: garage){
            for(String eachCar : eachFloor){
                System.out.println(eachCar);
                if (eachCar.equalsIgnoreCase(carToFind)){
                    System.out.println(eachCar.toUpperCase() + " found! " );
                    result = true;
                }
            }
        }

        return result;
    }

    @Test
    public void testCounterLetters() {
        String input = "hello world";
        char letterToFind = 'l';

        int amountOfFoundLetters = solutionForLetter(input, letterToFind);
        System.out.println(amountOfFoundLetters);

        int expectedNumber = 3;

        Assert.assertEquals(expectedNumber, amountOfFoundLetters);
    }

    private int solutionForLetter(String input, char letterToFind) {
        int result = 0;
        for(char eachChar : input.toCharArray()){
            if(eachChar == letterToFind) result++;
        }
        return result;
    }
}
