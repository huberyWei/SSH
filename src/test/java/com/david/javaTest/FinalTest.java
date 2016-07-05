package com.david.javaTest;

public class FinalTest {
	final String teString ;
	public static final  String hello;//如果不在静态代码块中初始化则The blank final field hello may not have been initialized
	static{
		final String staticFinalVar ="staticFinalVar";
		hello="hello has been initialized in static block";
		//hello="hh";
		//teString = "this is initial block";//Cannot make a static reference to the non-static field teString
		System.out.println(staticFinalVar);
		System.out.println(hello);
	}
	{
		teString = "this is initial block";
		System.out.println(teString);
	}
	private final String S = "final实例变量S";
	private final int A = 100;
	public final int B = 90;

	public static final int C = 80;
	private static final int D = 70;

	public final int E; // final空白,必须在初始化对象的时候赋初值

	public FinalTest(int x) {
		E = x;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new FinalTest(2);
//		new FinalTest(2).f1(2);
//		FinalTest t = new FinalTest(2);
//
//		// 使用final关键字修饰一个变量是指引用变量不能变，引用变量所指向的对象中的内容还是可以被修改。
//		final StringBuffer stringBuffer = new StringBuffer("hello stringBuffer");
//		System.out.println(stringBuffer);
//		stringBuffer.append(" append ");
//		System.out.println(stringBuffer);
//
//		// t.A=101; //出错,final变量的值一旦给定就无法改变
//		// t.B=91; //出错,final变量的值一旦给定就无法改变
//		// t.C=81; //出错,final变量的值一旦给定就无法改变
//		// t.D=71; //出错,final变量的值一旦给定就无法改变
//
//		System.out.println(t.A);
//		System.out.println(t.B);
//		System.out.println(t.C); // 不推荐用对象方式访问静态字段
//		System.out.println(t.D); // 不推荐用对象方式访问静态字段
//		System.out.println(FinalTest.C);
//		System.out.println(FinalTest.D);
//		// System.out.println(FinalTest.E); //出错,因为E为final空白,依据不同对象值有所不同.
//		System.out.println(t.E);
//
//		FinalTest t1 = new FinalTest(3);
//		System.out.println(t1.E); // final空白变量E依据对象的不同而不同
	}

	private void test() {
		System.out.println(new FinalTest(1).A);
		System.out.println(FinalTest.C);
		System.out.println(FinalTest.D);
	}

	public void test2() {
		final int a; // final空白,在需要的时候才赋值
		final int b = 4; // 局部常量--final用于局部变量的情形
		final int c; // final空白,一直没有给赋值.
		a = 3;
		// a=4; 出错,已经给赋过值了.
		// b=2; 出错,已经给赋过值了.
	}

	public void f1(final int i) {
		// i++; //i是final类型的,值不允许改变的.
		System.out.println(i);
	}
}
