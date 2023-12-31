package entities;

import interfaces.Runner;

public class Cat extends Animal implements Runner {
	private String moustacheColor;
	private boolean tail;

	public Cat(String name, int age) {
		super(name, age);
		this.moustacheColor = "Colore generico";
		this.tail = false;
	}

	public Cat(String name, int age, String moustacheColor, boolean tail) {
		super(name, age);
		this.moustacheColor = moustacheColor;
		this.tail = tail;
	}

	public void meow() {
		System.out.println("MIAO!");
	}

	@Override
	public void walk() { // OVERRIDE
		// super.walk(); posso EVENTUALMENTE chiamare anche il metodo del padre
		System.out.println("Per essere più precisi, sono un GATTO e sto camminando");
	}

	@Override
	public void getInfo() {
		System.out.println("Ciao le mie informazioni sono: " + this.name + " ," + this.age + " ," + this.moustacheColor);
	}

	public void walk(int numeroDiPassi) { // OVERLOAD
		this.walk();
		System.out.println("Camminerò per " + numeroDiPassi + " passi");
	}

	@Override
	public void run() {
		System.out.println("Ciao sono un gatto e sto correndo");
	}

	@Override
	public String toString() {
		return "Cat{" +
				"moustacheColor='" + moustacheColor + '\'' +
				", tail=" + tail +
				", name='" + name + '\'' +
				", age=" + age +
				"} ";
	}
}
