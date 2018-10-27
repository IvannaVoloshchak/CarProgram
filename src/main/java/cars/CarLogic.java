package cars;

import java.util.Arrays;
import java.util.Calendar;

public class CarLogic {
    public static String view(Car... cars) {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car).append("\n");
        }
        return sb.toString();
    }

    public static Car[] filterByBrand(Car[] cars, Brand brand) {
        Car[] dest = new Car[cars.length];
        int i = 0;
        for (Car car : cars) {
            if (car != null && car.getBrand() == brand) {
                dest[i++] = car;
            }
        }
        return Arrays.copyOf(dest, i);
    }

    public static Car[] filterByModelAge(Car[] cars, String model, int age) {
        final int edgeYear = Calendar.getInstance().get(Calendar.YEAR) - age;
        Car[] dest = new Car[cars.length];
        int i = 0;
        for (Car car : cars) {
            if (car != null && car.getModel().equalsIgnoreCase(model)
                    && (car.getYear()) < edgeYear) {
                dest[i++] = car;
            }
        }
        return Arrays.copyOf(dest, i);
    }

    public static Car[] filterByYearPrice(Car[] cars, int year, double price) {
        Car[] dest = new Car[cars.length];
        int i = 0;
        for (Car car : cars) {
            if (car != null && car.getYear() == year && car.getPrice() > price) {
                dest[i++] = car;
            }
        }
        return Arrays.copyOf(dest, i);
    }
}
