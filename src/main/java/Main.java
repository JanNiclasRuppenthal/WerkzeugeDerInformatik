public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();

        Car car = new Car("red", "VW", 5);
        Car car1 = new Car("blue", "Audi", 3);
        Car car2 = new Car("black", "Mercedes, 5")

        factory.buildCar(car);
        factory.buildCar(car1);
        factory.buildCar(Car2);
    }
}
