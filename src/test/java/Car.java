public class Car {

    private String model;
    int year;
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

    void drive(){
        System.out.println("Driving");
    }


    void turnLeft(){
        System.out.println("Turned left");
    }

    void turnRight(){
        System.out.println("Turned right");
    }
}
