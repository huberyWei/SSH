package com.david.javaTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		Map map = new HashMap<String,String>();
		map.put("Rajib Sarma","100");
		map.put("Rajib Sarma","200");//The value "100" is replaced by "200".
		map.put("Sazid Ahmed","200");
		Iterator iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
		    Object key = entry.getKey();
		    Object val = entry.getValue();
			System.out.println("key = " + key +"; value = "+val);
		}
	}
}
