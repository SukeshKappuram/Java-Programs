import java.util.*;
class Student{
	int id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	int getId(){
		return id;
	}
	String getName(){
		return name;
	}
}
class Course{
	String name;
	int nfs;
	Student[] students=new Student[10];
	boolean isFull(){
		if(students.length==nfs){
			return true;
		}
		return false;
	}
	Student[] getStudents(){
		return students;
	}
	void registerStudent(Student student){
		if(!isFull()){
			students[nfs]=student;
			nfs++;
		}else{
			System.out.println("Course already full!!");
		}
	}
}
class Test{
	public static void main(String[] arg){
		
		Scanner s=new Scanner(System.in);
		Student st=new Student(s.nextInt(),s.next());
		
		Course c=new Course();
		c.registerStudent(st);
		for(Student s1:c.getStudents()){
			System.out.println(s1.name+" : "+s1.id);
		}
	}
}