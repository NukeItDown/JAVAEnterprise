package lab1;

public class Cat extends Animal {
	foodtype type;
	
	Cat (String name, Integer age, foodtype type) {
		super(name,age);
		this.type = type;
	}
	
	void hunt() {
		this.setHunger(false);
	}

}
