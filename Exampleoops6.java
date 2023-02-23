package oops;

import java.util.Date;

interface Calculator {
	public abstract void subOfTwo(int a, int b);

	void mulOfTwo(int a, int b);
}

abstract class Parent implements Calculator {

	public abstract void addOfTwo(int a, int b);
}

public class AbstractionEx extends Parent {


	public static void main(String[] args) {
		AbstractionEx obj = new AbstractionEx();
		obj.mulOfTwo(125, 24);
	}

	@Override
	public void subOfTwo(int a, int b) {
		System.out.println(a - b);
	}

	@Override
	public void mulOfTwo(int a, int b) {
		System.out.println(a * b);
	}

	@Override
	public void addOfTwo(int a, int b) {
		System.out.println(a + b);
	}

@Override
	public void divOfTwo(int a, int b) {
		System.out.println(a / b);
	}
}
