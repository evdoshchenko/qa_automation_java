public class Student {

    String name;
    String lastName;
    int[] grades = {};

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void printName(){
        System.out.println(name + " " + lastName);
    }

    public void study(){
        System.out.println("I am studying");
    }

    public void failClass(){
        System.out.println("I failed");
    }

    public void graduate(){
        System.out.println(name + " graduated");
    }
}
