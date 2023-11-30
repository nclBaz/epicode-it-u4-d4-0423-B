package entities;

import interfaces.Jumper;

public class Dog extends Animal implements Jumper {
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

	@Override
	public void jump() {
		System.out.println("Ciao sono un cane e sto saltando");
	}

	@Override
	public String toString() {
		return "Dog{} " + super.toString();
	}
}
