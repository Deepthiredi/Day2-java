
public class Student {


		String name;
		int sid;
		int age;
		String branch;
		Student(String name,int sid,int age,String branch)
		{
			this.name=name;
			this.sid=sid;
			this.age=age;
			this.branch=branch;
		}

		
		public static void main(String[] args) {
			Student s1=new Student("sony",3,20,"cs");
			Student s2=new Student("deepthi",5,22,"ec");
			System.out.println(s1.age);
			System.out.println(s2.age);
			
			
	}
	

}
