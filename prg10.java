//String Buffer
//String Builder

class MyClass{
	public static void main(String[] arg){
		StringBuffer sb=new StringBuffer(20);
		sb.append("World");
		sb.insert(1,"Hello");
		sb.deleteCharAt(5);
		sb.append("Java");
		sb.insert(1,"Program");
		sb.append("NIIT");
		//sb.replace('l','t');
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.toString());
		System.out.println(sb.reverse());
	}
}

//S 18 11502 065