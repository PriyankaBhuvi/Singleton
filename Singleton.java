package com.vstl.singleton;

public class Singleton {
	  
	//Singleton class is a class that can have only once object at a time.
	
	private static Singleton singleton_instance =null;
	public String str;
	
	private Singleton() {
		str="Singleton class pattern";
		
	}
  public static Singleton getInstance() {
	  if(singleton_instance ==null) 
		  singleton_instance =new Singleton();
		  return singleton_instance;
	  }
	  
 

 

  }


