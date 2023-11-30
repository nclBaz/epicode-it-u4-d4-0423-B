package entities;

import interfaces.Jumper;
import interfaces.Runner;

public class Student implements Runner, Jumper {
	private String name;
	private String surname;

	public Student(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				'}';
	}

	@Override
	public void run() {
		System.out.println("Ciao sono uno studente e sto correndo perchè devo scappare da Java");
	}

	@Override
	public void jump() {
		System.out.println("Ciao sono uno studente e sto saltando (la lezione di Java)");
	}
}
