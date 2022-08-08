package ListConcept;

public class Employee {
	String name;         // global variable
	int age;             // global variable
	String department;   // global variable
	
	Employee(String name,int age,String department){     //constructor
		this.name=name;     //when global and local variable are same for that we used this keyword to represent you are using current current class variable
		this.age=age;
		this.department=department;
		
	
	}
}
