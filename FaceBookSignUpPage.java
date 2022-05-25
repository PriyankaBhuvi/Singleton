package com.vstl.assignment;
  
import java.util.Random;

public class FaceBookSignUpPage {
	
 	  public FaceBookSignUpPage() {
		  System.out.println("Open browser :");
	  }
	
	public void setFisrtName() {
		String strArray[]= {"Riya","Rohini","Ruhi","chaitali","Rima","Rishi","sonu"};
	System.out.println(strArray[new Random().nextInt(strArray.length)]);
	  
	}
	
	public void setLastName() {
		String strArray[] = {"Ghate","Malhotra","Bhuvi","Bhamne","upadye"};
		System.out.println(strArray[new Random().nextInt(strArray.length)]);
	}
	public void setMobileNumber() {
		Random rd=new Random();
		
		int intMobileNo;
		String str[]=new String [10];
		
		for(int intNum=0;intNum<10;intNum++) {
			intMobileNo= rd.nextInt(10);
			
			 str[intNum]=Integer.toString(intMobileNo);
			}
		System.out.println("Mobile Number:"+str[0]+str[1]+str[2]+str[3]+str[4]+str[5]+str[6]+str[7]+str[8]+str[9]);
		
	}
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	


