public class Car {

    public int year;
    private String model;
    private String engineType;

    public Car(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engineType = engineType;
    }

    public String getModel() {
        return model;
    }

    public String getEngineType() {
        return engineType;
    }

    String drive(){
          System.out.println("Driving as a Car");
          return "Driving as a Car";
    }

    void turnLeft(){
        System.out.println("Turned left");
    }

    void turnRight(){
        System.out.println("Turned right");
    }
}
