package lab1;

public class Animal implements AnimalInterface {

	private String name;
	private Integer age;
	private boolean hunger;
	
	Animal (String name, Integer age){
		this.name = name;
		this.age = age;
		this.hunger = false;
	}
	
	public void getAge() { 
		System.out.print(this.age);
	}


	public void getHunger() {
		System.out.print(this.hunger?"yes":"not");
	}


	public void getName() {
		System.out.print(this.name);
	}
	
	public void setHunger(boolean value) {
		this.hunger = value;
	}
	
	public void run() {
		if(!this.hunger) {	
			this.hunger = true;
			System.out.print(this.name + " is tired");
		}else
			System.out.print(this.name + " is hungry");
	}

}
