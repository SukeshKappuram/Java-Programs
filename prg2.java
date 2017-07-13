class Student{
	int i;
	float f;
	double d;
	char c;
	long l;
	short s;
	boolean b;
	byte y;

	static int x;

	void display(){
		System.out.print(i);
	}
	

	public static void main(String[] arg){
		Student s=new Student();
		System.out.println(s.i);
		System.out.println(x);
	}
}
