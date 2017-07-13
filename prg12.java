abstract class ElectronicDevice{
	abstract void turnOn();
	abstract void turnOff();
	void suspend(){
		System.out.println("Device Suspended");
	}
}
class Television extends ElectronicDevice{
	void turnOn(){
		System.out.println("Tv turned On");
	}
	void turnOff(){
		System.out.println("Tv turned Off");
	}
	void display(){
		System.out.println("Display Channel 1");
	}
}
class Mobile extends ElectronicDevice{
	void turnOn(){
		System.out.println("mobile turned On");
	}
	void turnOff(){
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
		ed.suspend();
	}
}