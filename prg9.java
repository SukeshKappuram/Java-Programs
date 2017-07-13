class MyClass{
	public String toString(){
		return "This is MyClass Object"; 
	}
	public static void main(String[] arg){
		String s1=new String("Hello");
		String s2=new String("Hello");

		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.toString());
		System.out.println(s2.toString());

		MyClass m1=new MyClass();
		System.out.println(m1.toString());
		MyClass m2=new MyClass();
		System.out.println(m2 .toString());
		MyClass m3=m1;
		System.out.println(m3 .toString());
	}
}