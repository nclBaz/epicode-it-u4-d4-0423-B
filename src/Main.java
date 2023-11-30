import entities.Cat;
import entities.Dog;

public class Main {
	public static void main(String[] args) {

		Cat felix = new Cat("Felix", 20);
		felix.sayYourName(); // ereditato dal padre
		felix.walk(); // ereditato dal padre
		felix.meow(); // non è ereditato ma creato nella classe Cat
		felix.walk(100000);

		Dog fido = new Dog("Fido", 10);
		fido.sayYourName(); // ereditato dal padre
		fido.walk(); // ereditato dal padre
		fido.bark(); // non è ereditato ma creato nella classe Dog
	}
}