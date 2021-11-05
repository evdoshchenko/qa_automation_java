import org.testng.annotations.Test;

public class FirstExamle {

    @Test
    public void test00001() {
        System.out.println("Hello Java automation");
    }

    @Test
    public void test00002() {
        String message01 = "Hello, ";
        String message02 = new String("world!");
        System.out.println(message01+message02);
    }

    @Test
    public void test00003() {
        int myNumber;
        myNumber = 5;
        System.out.println("I have " + myNumber + " cookies");
    }

    @Test
    public void test00005() {
        boolean b = true;

        if(b = true){
            System.out.println("B is true");
        }else{
            System.out.println("B is false");
        }
    }

    @Test
    public void test00006() {
        boolean b = true;
        boolean isBTrue = b ==true;

        if(isBTrue){
            System.out.println("B is true");
        }else{
            System.out.println("B is false");
        }
    }

    @Test
    public void test00007() {

        int value1 = 1;
        int value2 = 2;

        if ((value1 == 1) && (value2 == 1)){
            System.out.println("And Boom!");
        }

        if ((value1 == 1) || (value2 == 1)){
            System.out.println("Or Boom!");
        }
    }

    @Test
    public void test00008() {
        boolean b = true;

        boolean toBe = true;
        b = toBe || !toBe;
        if (b) {
            System.out.println(toBe);
        }

    }

    @Test
    public void test00009() {
        boolean elementVisible = false;

        if (elementVisible) {
            System.out.println("CLICK on element");
        } else {
            System.out.println("Looking for another element");
        }
    }

    @Test
    public void test00010() {
        int[] array = new int[10]; // size of array

        array[0] = 1;
        array[1] = 2;
        array[2] = 4;
        System.out.println(array[2]);

        int[] array2 = new int[]{17,2,53,4,5,6,47,8,39};
        System.out.println(array2[0]);

        int[] array3 = {5,3,62,3,7};
        System.out.println(array3[2]);

    }

    @Test
    public void test00011() {

        for (int i = 0; i < 3; i++){
            System.out.println("Hello number " + (i+1));
        }
    }

    @Test
    public void test00012() {
        int[] array = {1,34,5,646,656, 34545, 54};
        System.out.println("array.length = " + array.length);

        for (int i = 0; i < array.length;  i++){
            System.out.println(array[i]);
        }

        for (int i = array.length-1; i >= 0;  i--){
            System.out.println(array[i]);
        }
    }


    @Test
    public void test00013() {
        int[] array = {1,34,5,646,737, 34545, 54};
        int valueToSearch = 1737;
        boolean elementFound = false;

        for (int i = 0; i < array.length;  i++){

            if (array[i] == valueToSearch) {
                System.out.println("Element value found " + array[i]);
                System.out.println("index of the element is: " + i);
                elementFound = true;
            }


        }

        if (elementFound==false) {
            System.out.println("element not found");
        }

    }

    public void searchForElement(int[] inputArray, int valueToSearch){
        boolean elementFound = false;
        for (int i = 0; i < inputArray.length;  i++){
            if (inputArray[i] == valueToSearch) {
                System.out.println("Element value found " + inputArray[i]);
                System.out.println("index of the element is: " + i);
                elementFound = true;
            }
        }

        if (elementFound==false) {
            System.out.println("element not found");
        }
    }

    @Test
    public void test00014() {
        int[] array = {1,34,5,646,737, 34545, 54};
        searchForElement(array, 34);
    }

    @Test
    public void test00015() {
        int[] array = {1,34,5,646,737, 34545, 54};
        searchForElement(array, 33534);
    }
    @Test
    public void test00016() {
        int[] array = {1,34,5,646,737, 34545, 54};
        searchForElement(array, 1);
    }
    @Test
    public void test00017() {
        int[] array = {1,34,5,646,737, 34545, 54};
        searchForElement(array, 324634);
    }
}
