
class MyClass{
	enum PowerState{
		Off("Turned Off"),On("Turned On"),Suspend("Suspended");
	
	private String state;
	PowerState(String str){
		state=str;
	 }
	String getState(){
		return state;
	}
	}
	public static void main(String[] arg){
		PowerState p=PowerState.Off;
		System.out.println(p.getState());
	}
}