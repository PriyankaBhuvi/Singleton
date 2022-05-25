package com.vstl.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		
			 Singleton x=Singleton.getInstance();
			
			 x.str=(x.str).toUpperCase();
			 System.out.println(x.str);
			
			 x.str=(x.str).toLowerCase();
			 System.out.println(x.str);

	}

}
