import java.util.Scanner;
class MyClass{
	public static void main(String[] arg){
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		float f=s.nextFloat();
		String str=s.next();
		char c=s.next().charAt(0);
		System.out.println(i);
		System.out.println(f);
		System.out.println(str);
		System.out.println(c);
	}
}