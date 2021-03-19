package ua.lviv.lgs.constructor;

public class MainCons {
		String name;
		int age;

		public MainCons(int age) {
			this.age = age;
		
		}

		public MainCons(int age, String name) {
			this(age);
			this.name = name;
		}

     }
		
	