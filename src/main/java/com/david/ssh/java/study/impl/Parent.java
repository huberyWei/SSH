package com.david.ssh.java.study.impl;


public class Parent {
	//重载
	public static void test(int i,float h){
		System.out.println("test");
	}
	public static void test(int i,int h){
		System.out.println("test1");
	}
	
	private void testPrivate(){
		System.out.println("this is private ");
	}
	
	public void testPrivate(int i){
		System.out.println("this is private "+ i);
	}
	public static void main(String[] args) {
		Parent.test(1,2);
		Parent.test(1,2.0f);
	}
}
