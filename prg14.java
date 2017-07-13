class Calc
{
	int add(int i,int j){
		System.out.println("two int para");
		return i+j;
	}
	float add(float i,float j){
		System.out.println("two float para");
		return i+j;
	}
	float add(float i,float j,float k){
		System.out.println("3 float para");
		return i+j+k;
	}
	float add(int i,float j){
		System.out.println("one int  and 1 Float para");
		return i+j;
	}
	float add(float i,int j){
		System.out.println("one float  and 1 int para");
		return i+j;
	}
	public static void main(String[] arg){
		Calc c=new Calc();
		System.out.println(c.add(4,5));
		System.out.println(c.add(4.5f,4.7f));
		System.out.println(c.add(4,5,5));
	}
}