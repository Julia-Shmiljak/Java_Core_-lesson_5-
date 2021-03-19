package ua.lviv.lgs.abstracts;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat("Tom", 7);
		Cow cow = new Cow("Patricia", 5);
		Dog dog = new Dog("Hatiko", 12);
		
		cat.voice();
		cow.voice();
		dog.voice();
	}
	
	
}
