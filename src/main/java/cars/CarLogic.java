package cars;

import java.util.Calendar;

public class CarLogic {
    public static String view(Car... cars) {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car).append("\n");
        }
        return sb.toString();
    }

    public static Car[] filter(Car[] cars, Brand brand) {
        Car[] dest = new Car[cars.length];
        Car[] res;
        int i = 0;
        for (Car car : cars) {
            if (car != null && car.brand == brand) {
                dest[i++] = car;
            }
        }
        res = new Car[i];
        if (i > 0) System.arraycopy(dest, 0, res, 0, i);
        return res;
    }

    public static Car[] filter(Car[] cars, String model, int age) {
        final int currYear = Calendar.getInstance().get(Calendar.YEAR);
        Car[] dest = new Car[cars.length];
        Car[] res;
        int i = 0;
        for (Car car : cars) {
            if (car != null && car.model.equalsIgnoreCase(model)
                    && (currYear - car.year) > age) {
                dest[i++] = car;
            }
        }
        res = new Car[i];
        if (i > 0) System.arraycopy(dest, 0, res, 0, i);
        return res;
    }

    public static Car[] filter(Car[] cars, int year, double price) {
        Car[] dest = new Car[cars.length];
        Car[] res;
        int i = 0;
        for (Car car : cars) {
            if (car != null && car.year == year && car.getPrice() > price) {
                dest[i++] = car;
            }
        }
        res = new Car[i];
        if (i > 0) System.arraycopy(dest, 0, res, 0, i);
        return res;
    }
}
