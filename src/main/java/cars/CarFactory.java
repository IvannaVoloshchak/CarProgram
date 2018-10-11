package cars;

import java.util.Random;

public class CarFactory {
    public static Car createRandomized() {

        Brand[] brands = Brand.values();
        int randomNumber = getRandomNumberInRange(0, brands.length - 1);
        Brand brand = brands[randomNumber];

        String model = "Model" + getRandomNumberInRange(1, 20);

        int year = getRandomNumberInRange(2000, 2018);

        Color[] colors = Color.values();
        int randomColor = getRandomNumberInRange(0, colors.length - 1);
        Color color = colors[randomColor];

        double price = (double) getRandomNumberInRange(10000, 1000000);

        String registrationNumber = "VI" + getRandomNumberInRange(1000, 9999) + "IV";

        Car car = new Car(brand, model, year, color, price, registrationNumber);

        return car;
    }

    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}

