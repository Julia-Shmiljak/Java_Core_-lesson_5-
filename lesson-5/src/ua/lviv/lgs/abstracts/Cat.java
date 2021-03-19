package ua.lviv.lgs.abstracts;

public class Cat extends Pet {
	
	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	void voice() {
		System.out.println("ί κ³ς- Μÿσσσ-Μÿσσσ");
		
	}

}
