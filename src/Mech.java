/*
 * Mustafa Eyceoz
 * DUE: 6/1/17
 * Period 1
 * Text-Based Adventure Project
 * The Mystery at FirstBase
 */


public class Mech extends RoomClass{
	
	//important robot var
	public static boolean chassis = false;
	
	//takes chassis
	public String takeItem()
	{
		if (chassis == false)
		{
			chassis = true;
			return "You look around and find a robot chassis, but it is missing a gear. Also, there is no code or battery, so \n this thing can't really do all that much as of now.";
		}
		else
		{
			return "There is nothing to be picked up";
		}
	}
	
	//room text
	public String toString()
	{
		return "You enter mech. You know that their are some important robot hardware pieces in here that you could use.";
				
	}

}
