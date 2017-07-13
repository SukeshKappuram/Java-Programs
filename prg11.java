import java.util.*;
class MyClass{
	public static void main(String[] arg){
		String str="blue shirt, black shirt, red shirt, green shirt";
		String[] strs=str.split(", ");
		for(String s:strs){
			System.out.println(s);
		}
		StringTokenizer st=new StringTokenizer(str,", ");
		while(st.	hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}