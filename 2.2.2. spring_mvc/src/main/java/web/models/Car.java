package web.models;

public class Car {
    private String model;
    private String country;
    private String color;

    public Car(String model, String country, String color) {
        this.model = model;
        this.country = country;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }
}
