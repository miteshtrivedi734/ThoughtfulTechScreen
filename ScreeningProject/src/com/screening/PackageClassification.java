package com.screening;

public class PackageClassification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testPackages();
	}
	
	
	public static void testPackages() {
		// test for standard packages
		String test1 = classifyPackages(10,10,20,15);
		if (test1 == "STANDARD") {
			System.out.println("Test passed");
		}
		
		// test for special package with dimension limit
		String test2 = classifyPackages(150, 10, 10, 10);
		if (test2 == "SPECIAL") {
			System.out.println("Test passed");
		}
		
		// test for special package with volume limit
		String test3 = classifyPackages(120,100,100,15);
		if (test3 == "SPECIAL") {
			System.out.println("Test passed");
		}
		
		// test for special package with mass limit
		String test4 = classifyPackages(10,10,100,25);
		if (test4 == "SPECIAL") {
			System.out.println("Test passed");
		}
		
		// test for rejected package with both volume and mass limit
		String test5 = classifyPackages(150, 100, 100, 25);
		if (test5 == "REJECTED") {
			System.out.println("Test passed");
		}
		
	}

	
	public static String classifyPackages (int width, int height, int length, int mass) {
		
		boolean bulky = false;
		boolean heavy = false;
		if (width >= 150 || height >= 150 || length >=150) {
			bulky = true;
		}
		int volume = width * height * length;
		if (volume > 1000000) {
			bulky = true;
		}
		if (mass >=20) {
			heavy=true;
		}
		
		if (bulky && heavy) {
			return "REJECTED";
		}
		
		if (bulky) {
			return "SPECIAL";
		}
		
		if (heavy) {
			return "SPECIAL";
		}
		return "STANDARD";
	
}
}
