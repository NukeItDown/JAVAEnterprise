package lab1;

public class Main {
	public static void main(String[] args) {
		System.out.print(MathQ.cirlceA(5.75f));
		System.out.print("\n");
		Cat cat1 = new Cat("Tom",2,foodtype.CARNIVORE);
		cat1.getName();
		System.out.print("\n");
		cat1.run();
		System.out.print("\n");
		cat1.getHunger();
		System.out.print("\n");
		cat1.run();
		System.out.print("\n");
		cat1.hunt();
		cat1.getHunger();
	}
}

