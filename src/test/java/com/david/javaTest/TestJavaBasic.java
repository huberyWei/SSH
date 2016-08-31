package com.david.javaTest;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestJavaBasic {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testString(){
		String string1 = "hello";
		String string2 = "he";
		String string3 = "llo";
		String string4 = string2 + string3;
		System.out.println(string1==(string2+string3));
		System.out.println(string1==(string2+new String("llo")));
		System.out.println(string1 == string4);
		System.out.println(string1 == ("he"+"llo"));
		System.out.println("---------------------");
		String s1 = "a";
		String s2 = s1 + "b";
		String s3 = "a" + "b";
		System.out.println(s2 == "ab");
		System.out.println(s3 == "ab");
	}
	
	@Test
	public void testFile(){
		
	}
	
	private final static int SPLIT_FILE_NUM_MIN = 4;
	private final static int SPLIT_FILE_NUM_MAX = 5;
	private final static String TC="BMW_MMS_TargetCustomer_";
	@Test
	public void max(){
		
		List<String> periods = new ArrayList<String>();
		List<String > lsList = new ArrayList<String>();
		lsList.add("BMW_MMS_TargetCustomer_201801.xlsx");
		lsList.add("BMW_MMS_TargetCustomer_201701.xlsx");
		lsList.add("BMW_MMS_TargetCustomer_201701-part01.xlsx");
		lsList.add("BMW_MMS_TargetCustomer_201801-part01.xlsx");
		lsList.add("BMW_MMS_TargetCustomer_201801-part02.xlsx");
		lsList.add("BMW_MMS_TargetCustomer_201801-part03.xlsx");
		lsList.add("BMW_MMS_TargetCustomer_201801-part04.xlsx");
		lsList.add("BMW_MMS_TargetCustomer_20101-part04.xlsx");
		lsList.add("BMW_MMS_TargetCustomer_20101-part04.xlsx1");
		int count = lsList.size();
		String[] items = null; 
		for (String content: lsList) {
			items = content.split("BMW_MMS_TargetCustomer_");
			int splitNum = items.length;
			System.out.println(items[0]);
			System.out.println(items[1]);
//			System.out.println(items[SPLIT_FILE_NUM_MIN-1]);
//			System.out.println(items[SPLIT_FILE_NUM_MIN-1].endsWith(".xlsx"));
//			System.out.println(items[SPLIT_FILE_NUM_MIN-1].substring(0, 6));
//			if (items[SPLIT_FILE_NUM_MIN-1].endsWith(".xlsx") && items[SPLIT_FILE_NUM_MIN-1].substring(0, 6).matches("[0-9]{6}")) {
//				System.out.println(items[SPLIT_FILE_NUM_MIN-1]);
//				
//			}
//			for (int i = 0; i < items.length; i++) {
//				System.out.print(items[i]+" ");
//				
//			}
			periods.add(items[SPLIT_FILE_NUM_MIN-1]);
			System.out.println("\n");
//			if (items[SPLIT_FILE_NUM_MIN-1].endsWith(".xlsx") && items[SPLIT_FILE_NUM_MIN-1].substring(0, 5).matches("[0-9]{6}")) {
//				System.out.println(items[SPLIT_FILE_NUM_MIN-1]);
//				
//			}
		}
	}
	
	@Test
	public void testMerge(){
		String primarykey = UUIDUtil.UUID();
		String period = "201803"; String phone = "18239898989"; String versionCode = "1-1"; 
		String name = "david"; String gender = "先生";
		String url = "http:hhhh.com"; String serviceItem = "service"; String carSeries = "carseries"; 
		String loanDueDate = "loadDuedate"; String text = "this is test";
		String attr1 = ""; String attr2 = ""; String attr3 = ""; String attr4 = ""; String attr5="";
		String nativeMerge = "MERGE INTO MMS_TARGET_CUSTOMER TC1 "  
				+ " USING (SELECT " + period + " AS period,"+ phone+ " AS phone FROM DUAL) TC2 "
				+ " ON ( TC1.CUSTOMER_PHONE=TC2.phone AND TC1.CUSTOMER_PERIOD=TC2.period) "
				+ " WHEN MATCHED THEN " 
					+ " UPDATE "
							+ " SET TC1.VERSION_CODE = " + versionCode
							+ ", TC1.CUSTOMER_NAME = '" + name
							+ "', TC1.CUSTOMER_GENDER = '" + gender
							+ "',  TC1.CUSTOMER_URL = '" + url
							+ "', TC1.CUSTOMER_SERVICE_ITEM = '" + serviceItem
							+ "', TC1.CUSTOMER_CAR_SERIES = '" + carSeries
							+ "', TC1.CUSTOMER_LOAN_DUE_DATE = '" + loanDueDate
							+ "', TC1.CUSTOMER_TEXT = '" + text 
							+ "', TC1.CREATED_BY = 'SYSTEM'"
							+ ", TC1.LAST_UPDATED_DATE = sysdate"
							+ ", TC1.LAST_UPDATED_BY = 'SYSTEM'"
							+ ", TC1.ATTRIBUTE1 = '" + attr1 
							+ "', TC1.ATTRIBUTE2 = '" + attr2 
							+ "', TC1.ATTRIBUTE3 = '" + attr3
							+ "', TC1.ATTRIBUTE4 = '" + attr4 
							+ "', TC1.ATTRIBUTE5 = '" + attr5 + "'"
				+ " WHEN NOT MATCHED THEN" 
					+ " INSERT "
						+ "(ID,"
						+ " CUSTOMER_PERIOD, "
						+ " CUSTOMER_PHONE,"
						+ " VERSION_CODE, "
						+ " CUSTOMER_NAME, "
						+ " CUSTOMER_GENDER, "
						+ " CUSTOMER_URL, "
						+ " CUSTOMER_SERVICE_ITEM, "
						+ " CUSTOMER_CAR_SERIES, "
						+ " CUSTOMER_LOAN_DUE_DATE, "
						+ " CUSTOMER_TEXT, "
						+ " CREATED_DATE, "
						+ " CREATED_BY, "
						+ " LAST_UPDATED_DATE, "
						+ " LAST_UPDATED_BY, "
						+ " ATTRIBUTE1, "
						+ " ATTRIBUTE2, "
						+ " ATTRIBUTE3, "
						+ " ATTRIBUTE4, "
						+ " ATTRIBUTE5) "
					+ "VALUES "
						+ "('"
						+ primarykey
						+ "','"
						+ period
						+ "','"
						+ phone
						+ "','"
						+ versionCode
						+ "', '"
						+ name
						+ "', '"
						+ gender
						+ "', '"
						+ url
						+ "',  '"
						+ serviceItem
						+ "', '"
						+ carSeries
						+ "', '"
						+ loanDueDate
						+ "', '"
						+ text
						+ "', sysdate, 'SYSTEM', sysdate,'SYSTEM','"
						+ attr1
						+ "', '"
						+ attr2
						+ "', '"
						+ attr3
						+ "', '"
						+ attr4
						+ "', '"
						+ attr5
						+ "')";
		System.out.println(nativeMerge);
	}
	
}
