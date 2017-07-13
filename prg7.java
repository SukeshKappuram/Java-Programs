import java.util.Scanner;
class Student{
	int sid;
	String name;
	float marks;
}
class MainClass{
	public static void main(String[] arg){
		Student[] students=new Student[2];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<students.length;i++){		
			students[i]=new Student();
			students[i].sid=s.nextInt();
			students[i].name=s.next();
			students[i].marks=s.nextFloat();
		}
		
		for(Student su:students){
			System.out.println("StudentName :"+su.name
);
		}
	}
}