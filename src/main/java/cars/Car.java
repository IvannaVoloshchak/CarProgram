package cars;

public class Car {
    private static int nextUniqueId = 0;
    public final int id;
    public final Brand brand;
    public final String model;
    public final int year;
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
