package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;


public class ArratListConcept {

	public static void main(String[] args) {
		//1.ArrayList is a dynamic array.we don't need to define size. 
		//2.can contains duplicate values/elements
		//3.maintains insertion order
		//4.It is not Synchronized
		//5.it allowes random access to fetch the elements because it stores the values on the basis of indexs
		ArrayList ar=new ArrayList();
		ar.add(10); //0
		ar.add(20); //1
		ar.add(30); //2
		System.out.println(ar.size());
		ar.add(40); //3
		ar.add(50); //4
		ar.add(60);
		ar.add("Tom");
		ar.add(12.66);
		ar.add('M');
		ar.add(true);
		System.out.println(ar.size());   // size of arraylsit
		System.out.println(ar.get(4));   // to get the value from an index 
        // to print all the values from arraylist:
		//1.for loop
		//2.Iterartor		
		
		for (int i=0; i<ar.size(); i++) {
		System.out.println(ar.get(i ));		
	}
	// non generic vs generic:
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(100);
		ar1.add(200);
		//ar1.add("testing");   not allowed	
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Webautomation");
		//ar2.add(300);  not allowed
		
		// ArrayList<E> ar3=new ArrayList<E>(); when you are not aware about datatypes then in that case E will be used.
		
		//** very impronant -how to define the thuser defined class object array list
		// Employee class Object
		Employee e1=new Employee("Nupur",29,"testing");
		Employee e2=new Employee("Nupur",29,"testing");
		Employee e3=new Employee("Nupur",29,"testing");
		
		// create arraylist:
		 ArrayList<Employee> ar4=new ArrayList<Employee>();
		 ar4.add(e1);
		 ar4.add(e2);
		 ar4.add(e3);
		 
		 // iterator to traverse the value:
		 
		 Iterator<Employee> it=ar4.iterator();
		 while(it.hasNext()) {
			Employee emp =it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.department);
		 }
		 
		 //**very improntant/ 
		 
		 System.out.println("***********");
		 //********addAll()
		 
		 ArrayList<String> ar5=new ArrayList<String>();
		 ar5.add("test");
		 ar5.add("selenium");
		 ar5.add("QTP");
		 
		 ArrayList<String> ar6=new ArrayList<String>();
		 ar6.add("dev");
		 ar6.add("java");
		 ar6.add("javascript");  
		 
		 ar5.addAll(ar6);
		 for(int i=0; i<ar5.size(); i++) {
			 System.out.println(ar5.get(i)); 
		 }
		 System.out.println("***********");
		 
		 // removeAll:
		 ar5.removeAll(ar6);
		 for(int i=0; i<ar5.size(); i++) {
			 System.out.println(ar5.get(i)); 
		 }
		 System.out.println("***********");
		 //retainAll()    //only common element will be printed
		 ArrayList<String> ar7=new ArrayList<String>();
		 ar7.add("test");
		 ar7.add("selenium");
		 ar7.add("QTP");
		 
		 ArrayList<String> ar8=new ArrayList<String>();
		 ar8.add("test");
		 ar8.add("java");
		
		 ar7.retainAll(ar8);
		 for(int i=0; i<ar7.size(); i++) {
			 System.out.println(ar7.get(i)); 
		 }
		 
		 }
		 
		

}

