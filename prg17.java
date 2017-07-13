class ElectronicDevice{
	public void turnOn(){
		System.out.println("ElectronicDevice Is turned On");
	}
	public void turnOff(){
		System.out.println("ElectronicDevice Is turned Off");
	}
}
class Television extends ElectronicDevice{
	
	public void turnOff(){
		System.out.println("Television Is turned Off");
	}
}
class MainClass{
	public static void main(String[] arg){
		ElectronicDevice ed=new ElectronicDevice();
		ed.turnOn();
		ed.turnOff();
		ed=new Television();
		ed.turnOn();
		ed.turnOff();
	}
}