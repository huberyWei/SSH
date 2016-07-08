package com.david.ssh.java.study.impl;


public class Child extends Parent{
	public Child(){
		super();
	}
	public static void test(int i,float h){
		System.out.println("test　child");
	}
	public static void test(int i,int h){
		System.out.println("test1 child");
	}
	
	private void testPrivate(){
		System.out.println("this is private child");
	}
	
	public static void main(String[] args) {
		Child child = new Child();
		Child.test(1,2);
		Child.test(1,2.0f);
		child.testPrivate();
		child.testPrivate(8);
	}
}
