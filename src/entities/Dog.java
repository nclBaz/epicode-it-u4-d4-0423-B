package entities;

public class Dog extends Animal {
	public Dog(String name, int age) {
		super(name, age); // Qua richiamo il costruttore della classe padre
	}

	@Override
	public void getInfo() {
		System.out.println("Ciao le mie informazioni sono: " + this.name + " ," + this.age);
	}

	public void bark() {
		System.out.println("BAU!");
	}
}
