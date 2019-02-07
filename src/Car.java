public class Car {
    private int year;
    private String make;
    private int miles;
    private String model;

    public Car(int year, String make, String model) {
        this.year = year;
        this.make = make;
        this.miles = 0;
        this.model = model;
    }


    //setters
    public void setYear(int year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void Drive(int miles) {
        this.miles += miles;
    }
    //getters
    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public int getMiles() {
        return miles;
    }

    public String getModel() {
        return model;
    }
    //more
    @Override
    public String toString() {
        return "This Car is a" + year + " " + make + " " + model + " with " + miles + " on it";
    }
}
