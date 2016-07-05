package com.david.javaTest;

public class TestFinalMethod extends FinalMethod{
	public void nonFinalMethod() {
		System.out.println("test nonFinalMethod");
	}
	
	public static void main(String[] args) {
		TestFinalMethod t1 = new TestFinalMethod();
		t1.nonFinalMethod();
		t1.finalMethod();
	}

}
