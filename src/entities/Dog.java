package entities;

public class Dog extends Animal {
	public Dog(String name, int age) {
		super(name, age); // Qua richiamo il costruttore della classe padre
	}

	public void bark() {
		System.out.println("BAU!");
	}
}
