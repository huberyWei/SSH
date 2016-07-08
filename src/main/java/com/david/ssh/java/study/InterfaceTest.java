package com.david.ssh.java.study;

public interface InterfaceTest {
	int flag = 1;
	//Illegal modifier for the interface field InterfaceTest.a; only public, static & final are permitted
	//private int a = 10;
	public void save();
	public void update();
}
