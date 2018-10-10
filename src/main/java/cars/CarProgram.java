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
        Car[] cars = {car1, car2, car3, car4, car5, car6, car7};
        for (Car car : cars) {
            System.out.println(car);
        }
    }

}
