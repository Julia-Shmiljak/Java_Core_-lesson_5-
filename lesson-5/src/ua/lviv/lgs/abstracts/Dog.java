package ua.lviv.lgs.abstracts;

public class Dog extends Pet {
	
	
	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	void voice() {
		System.out.println("ί οερ - Γΰσσσ-Γΰσσσ");
		
	}

}
