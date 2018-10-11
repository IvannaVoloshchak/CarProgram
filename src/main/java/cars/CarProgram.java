package cars;

public class CarProgram {
    public static void main(String[] args) {
        Car car1 = CarFactory.createRandomized();
        Car car2 = CarFactory.createRandomized();
        Car car3 = CarFactory.createRandomized();
        Car car4 = CarFactory.createRandomized();
        Car car5 = CarFactory.createRandomized();
        Car car6 = CarFactory.createRandomized();
        Car car7 = CarFactory.createRandomized();
        Car car8 = CarFactory.createRandomized();
        Car[] cars = {car1, car2, car3, car4, car5, car6, car7, car8};
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("\n Car with brand Toyota ");

        for (Car car : cars) {
            if (car.brand == Brand.TOYOTA) {
                System.out.println(car);
            }
        }
        System.out.println("\n Cars with brand Mazda, older than 5 years ");

        for (Car car : cars) {
            if (car.brand == Brand.MAZDA && (2018 - car.year) >= 5) {
                System.out.println(car);
            }
        }
        System.out.println("\n Cars with price more than 40000, and years 2016 ");

        for (Car car : cars) {
            if (car.year == 2016 && car.price > 40000) {
                System.out.println(car);
            }
        }
    }
}
