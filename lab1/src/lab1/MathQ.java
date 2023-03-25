package lab1;

public abstract class MathQ {
	static final float PI = 3.14f;
	
	static Integer sum(Integer a, Integer b) {
		return a + b;
	}
	
	static Float div(Float a, Float b) {
		return a / b;
	}
	
	static Integer mult(Integer a, Integer b) {
		return a * b;
	}
	
	static Integer sub(Integer a, Integer b) {
		return a - b;
	}
	
	static Float cirlceA(Float r) {
		return PI*(r*r);
	}
}
