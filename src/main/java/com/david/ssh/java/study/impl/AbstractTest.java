package com.david.ssh.java.study.impl;

import com.david.ssh.java.study.InterfaceTest;

public abstract class AbstractTest {
	private static final int L=123;
	private int flag =90;
	
	Parent parent = new Parent();

	//wrong --Abstract methods do not specify a body
	//public abstract void abstractFun(){};
	//抽象方法是一种特殊的方法：它只有声明，而没有具体的实现。抽象方法的声明格式为：
	public abstract void abstractFun();
	
	/*
	 * The abstract method test in type AbstractTest can only set a visibility modifier, one of public or protected
	*/
	//private abstract void test2();
	private void test2(){
		System.out.println("hh");
	}

}
