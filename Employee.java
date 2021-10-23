import java.util.Scanner;
public class Employee {
	int eid;
	String ename;
	double sal;
	String dept;
	
   Employee(int eid,String ename,double sal,String dept)
	{
		this.eid=eid;
		this.ename=ename;
		this.sal=sal;
		this.dept=dept;
		
		}
		public void PrintDetails()
		{
	

	    System.out.println(eid);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(dept);
	}
		
       public static void main(String[] args) {
		
				
		Employee e1=new Employee(2,"deepu",20000,"marketing");
		Employee e2=new Employee(3,"deepthi",30000,"accounts");
		e2.PrintDetails();
		e1.PrintDetails();
		
		
		
		

	}

}
