package com.vstl.oops;

public class MethodOverloading {
	
	/*MethodOverloading : when the method name is same with different argument or 
	  input parameters within the same class.*/
	 
	 public void getCompanyDeatails() {
		 String strCompanyName="Infosys";
		
		 System.out.println("Comapany Name is  : "+strCompanyName);
	 }
	 
	 public void getCompanyDeatails(int intEmpId) {
		 int EmpId=2345;
		 System.out.println("The Emp Id is :"+EmpId);
	 }
	public void getCompanyDeatails(int intTotalProject,int TotalCompany) {
		 int intTotalProjects=800;
		 int intTotalCompanys=500;
		 
		 System.out.println("Total Employee : "+intTotalProject);
		 System.out.println("Total Company : "+TotalCompany);


	}
	
}


		 