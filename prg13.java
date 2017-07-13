interface ElectronicDevice{
	public static final String WARINING="XYZ"; 
	void turnOn();
	void turnOff();
	
}
class Television implements ElectronicDevice{
	public void turnOn(){
		System.out.println("Tv turned On");
	}
	public void turnOff(){
		System.out.println("Tv turned Off");
	}
	void display(){
		System.out.println("Display Channel 1");
	}
}
class Mobile implements ElectronicDevice{
	public void turnOn(){
		System.out.println("mobile turned On");
	}
	public void turnOff(){
		System.out.println("mobile turned Off");
	}
}
class MainClass{
	public static void main(String[] arg){
		ElectronicDevice ed=new Television();
		//Television tv=new Television();

		ed.turnOn();
		ed.turnOff();
		
		Television tv=(Television)ed;
		tv.display();

		//Mobile m=new Mobile();

		ed=new Mobile();
		ed.turnOn();
		ed.turnOff();
		
	}
}