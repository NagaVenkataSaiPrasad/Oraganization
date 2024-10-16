/**craete a java application where we have a class named organization with employye details like "employee id", emp name,emp slaray,employee designation,emp experince,and organization name.we also have a static method named employee details with the class variable as parameter and returns nothing ,create instance for five employees under main and invoke this method under main method and while invoking according to the user choice the respective employess detatils should be displayed and do not use import statement.**/

class Organisation{
	static String orgname=new java.util.Scanner(System.in).next();
	int empId=new java.util.Scanner(System.in).nextInt();
	String empName=new java.util.Scanner(System.in).next();
	float empSalary=new java.util.Scanner(System.in).nextFloat();
	String empDesignation=new java.util.Scanner(System.in).next();
	float empExperince=new java.util.Scanner(System.in).nextFloat();	

	static void employeeDetails(Organisation obj){
		System.out.println(orgname);
		System.out.println(obj.empId);
		System.out.println(obj.empName);
		System.out.println(obj.empSalary);
		System.out.println(obj.empDesignation);
		System.out.println(obj.empExperince);
		
	}

	public static void main(String[] args){
		Organisation obj1=new Organisation();
		Organisation obj2=new Organisation();
		Organisation obj3=new Organisation();
		Organisation obj4=new Organisation();
		Organisation obj5=new Organisation();

				
	
		String i=new java.util.Scanner(System.in).next();
		switch(i){
			case "ravi":
				employeeDetails(obj1);
				break;
			case "sai":
				employeeDetails(obj2);
				break;
			case "anees":
				employeeDetails(obj3);
				break;
			case "prem":
				employeeDetails(obj4);
				break;
			case "krishna":
				employeeDetails(obj5);
				break; 

		}

	}
}