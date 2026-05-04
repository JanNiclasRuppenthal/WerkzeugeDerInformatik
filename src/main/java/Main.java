public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();

        Car car = new Car("red", "VW", 5);
        Car car1 = new Car("blue", "Audi", 3);
	Car car2 = new Car("green", "MAN", 1);

        factory.buildCar(car2);
        factory.buildCar(car1);
    }
}
