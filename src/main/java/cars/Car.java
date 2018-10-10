package cars;

public class Car {
    int id;
    Brand brand;
    String model;
   int  year;
    Color color;
    double price;
    String registrationNumber;
    static int uniqueId=0;


    Car(Brand brand, String model, int  year, Color color, double price, String registrationNumber){
        uniqueId++;
        id =uniqueId;
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.color=color;
        this.price=price;
        this.registrationNumber=registrationNumber;
    }

    @Override
    public String toString() {

        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model=" + model +
                ", year=" + year+
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registrationNumber=" + registrationNumber +
                '}';
    }
}
