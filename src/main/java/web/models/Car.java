package web.models;

public class Car {
    private String brand;
    private String model;
    private int enginePower;

    public Car (String brand, String model, int enginePower){
        this.brand = brand;
        this.model = model;
        this.enginePower = enginePower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
}
