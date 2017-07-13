class Calc //varargs
{
	int add(int... j){
	int sum=0;	
		for(int i:j){
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] arg){
		Calc c=new Calc();
		System.out.println(c.add(4,5));
		System.out.println(c.add(4,4,6,4));
		System.out.println(c.add(4,5,5));
		System.out.println(c.add());
	}
}