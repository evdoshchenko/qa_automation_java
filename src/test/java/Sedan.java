public class Sedan extends Car{

    String groundClearance;
    String chassis;

    public Sedan(String model, int year, String engineType) {
        super(model, year, engineType);
    }

    public void comfortModelDrive(){
        System.out.println("More comfort drive");
    }

    String drive(){
        System.out.println("Driving as a sedan");
        return "Driving as a sedan";
    }

}
