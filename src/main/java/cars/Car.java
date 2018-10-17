package cars;

public class Car {
    private static int nextUniqueId = 0;
    private int id;
    private Brand brand;
    private String model;
    private int year;
    private Color color;
    private double price;
    private String registrationNumber;

    Car(Brand brand, String model, int year, Color color, double price, String registrationNumber) {
        nextUniqueId++;
        id = nextUniqueId;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {

        return "Car{" +
                "id = " + id +
                ", brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", year = " + year +
                ", color = '" + color + '\'' +
                ", price = " + price +
                ", registrationNumber = " + registrationNumber +
                '}';
    }
}
