package entities;

import java.util.Objects;

public abstract class Animal {
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Animal animal = (Animal) o; // CAST ESPLICITO DA OBJECT GENERICO AD ANIMAL
		return age == animal.age && Objects.equals(name, animal.name);
	}

	// METODI ASTRATTI
	public abstract void getInfo();
	// Un metodo dichiarato come abstract serve per obbligare/forzare
	// i figli ad avere un'implementazione di tale metodo

}
