class MyClass{
	public static void main(String[] arg){
	try{
		int x=Integer.parseInt(arg[0]);
		System.out.println(10/x);
	}catch(Exception e){
		System.out.println("please pass only nums greater than 0");
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Use : MyClass <para> ..");
	}catch(NumberFormatException e){
		System.out.println("please pass only nums");
	}
		
	}
}