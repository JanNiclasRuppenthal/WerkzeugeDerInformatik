public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();

        Car car = new Car("red", "VW", 5);
        Car car1 = new Car("blue", "Audi", 3);
	Car car2 = new Car("brown", "MAN", 1);

	Car car3 = new Car("green", "Opel", 1);

        factory.buildCar(car3);
	factory.buildCar(car2);
        factory.buildCar(car1);
    }
}
