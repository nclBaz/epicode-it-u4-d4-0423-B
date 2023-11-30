import entities.Animal;
import entities.Cat;
import entities.Dog;
import entities.Student;
import interfaces.Jumper;
import interfaces.Runner;

public class Main {
	public static void main(String[] args) {
		// Animal genericAnimal = new Animal("Nome", 100);

		Cat felix = new Cat("Felix", 20);
/*		felix.sayYourName(); // ereditato dal padre
		felix.walk(); // ereditato dal padre
		felix.meow(); // non è ereditato ma creato nella classe Cat
		felix.walk(100000);*/

		Dog fido = new Dog("Fido", 10);
/*		fido.sayYourName(); // ereditato dal padre
		fido.walk(); // ereditato dal padre
		fido.bark(); // non è ereditato ma creato nella classe Dog

		felix.equals(fido);*/


		// **************************** POLIMORFISMO ****************************
		Animal[] animals = {felix, fido, new Dog("Rintintin", 10)};

		for (int i = 0; i < animals.length; i++) {
			/*animals[i].sayYourName();
			animals[i].getInfo();*/
			if (animals[i] instanceof Dog) {
				((Dog) animals[i]).bark();
			} else {
				System.out.println("Non sono un cane quindi non posso abbaiare");
			}
		}

		Student aldo = new Student("Aldo", "Baglio");

		Runner[] runners = {aldo, felix};
		System.out.println("-------------------- RUNNERS --------------------");
		for (int i = 0; i < runners.length; i++) {
			runners[i].run();
		}
		System.out.println("-------------------- JUMPERS --------------------");
		Jumper[] jumpers = {aldo, fido};
		for (int i = 0; i < jumpers.length; i++) {
			jumpers[i].jump();
		}
		System.out.println("-------------------- POLIMORFISMO DI METODO --------------------");

		printAnimal(fido);
		printAnimal(felix);
		// printAnimal(aldo);
	}

	public static void printAnimal(Animal animal) {
		System.out.println(animal);
	}
}