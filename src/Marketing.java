/*
 * Mustafa Eyceoz
 * DUE: 6/1/17
 * Period 1
 * Text-Based Adventure Project
 * The Mystery at FirstBase
 */


public class Marketing extends RoomClass {
	
	//important robot var
	
	public static boolean battery = false;
	
	
	//takes battery
	public String takeItem()
	{
		if (battery == false)
		{
			battery = true;
			return "Under the t-shirts you find a battery. Why was it hidden there?";
		}
		else
		{
			return "You don't need buttons and t-shirts right now.";
		}
	}
	
	//room text
	public String toString()
	{
		return "You see some t-shirts and buttons. There's also some other stuff lying around in Marketing. North is \n Gold Squad.";
	}
}
