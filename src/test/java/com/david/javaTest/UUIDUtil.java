package com.david.javaTest;

public class UUIDUtil {
	public static String UUID(){
		return java.util.UUID.randomUUID().toString().toLowerCase().replace("-", "");
	}
	
}
