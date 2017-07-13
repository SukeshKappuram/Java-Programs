class Student{
	int sid;
	String name;
	float marks;
}
class MainClass{
	public static void main(String[] arg){
		Student[] students=new Students[10];

		Student s=new Student();
		s.sid=103;
		s.name="Rakesh";
		s.marks=89.5f;
		students[0]=s;		
		
		students[0]=new Student();
		students[0].sid=101;
		students[0].name="Ravi";
		students[0].marks=67.5f;
	}
}