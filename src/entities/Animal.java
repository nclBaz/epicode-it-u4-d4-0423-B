package entities;

public class Animal {
	public String name;
	public int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// metodi
	public void sayYourName() {
		System.out.println("Ciao sono un animale e mi chiamo " + this.name);
	}

	public void walk() {
		System.out.println("Ciao sono un animale e sto camminando");
	}

	@Override
	public String toString() {
		return "Animal{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
