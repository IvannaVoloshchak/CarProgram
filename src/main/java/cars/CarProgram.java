package cars;

public class CarProgram {
    public static void main(String[] args) {
        Car[] cars = CarFactory.createArrayOfRandomized(7);
        System.out.println("New cars:");
        System.out.println(CarLogic.view(cars));

        Brand b = Brand.TOYOTA;
        System.out.println("\nCar with brand \"" + b + "\":");
        System.out.println(CarLogic.view(CarLogic.filter(cars, b)));

        String m = "Model12";
        int a = 2;
        System.out.println("\nCars with model \"" + m + "\", older than " + a + " years:");
        System.out.println(CarLogic.view(CarLogic.filter(cars, m, a)));

        int y = 2016;
        int p = 28000;
        System.out.println("\nCars with price more than " + p + ", and years " + y + ":");
        System.out.println(CarLogic.view(CarLogic.filter(cars, y, p)));
    }
}
