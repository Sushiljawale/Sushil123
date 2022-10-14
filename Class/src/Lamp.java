
public class Lamp {

	boolean isOn;
	
	void turnON ()
	{
	isOn= true;
	System.out.println("Light on ?"+ isOn);	
	}
	
	
	void turnOff()
	{
	isOn=false;
	System.out.println("Light On ?"+ isOn);
	}
	

	
	public static void main(String[] args) {
		Lamp mp=new Lamp();
		mp.turnON();
		mp.turnOff();
		
	}

}
