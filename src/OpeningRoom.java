/*
 * Mustafa Eyceoz
 * DUE: 6/1/17
 * Period 1
 * Text-Based Adventure Project
 * The Mystery at FirstBase
 */


public class OpeningRoom extends RoomClass
{
	//important var
	
	public static boolean loggedIn = false;
	
	//log in
	public String logIn()
	{
		
		if (loggedIn)
		{
			return "Hours are already being logged.";
		}
		
		loggedIn = true;
		
			
		return "Your hours are being logged.";
	}
	
	//room text
	public String toString()
	{
		return "In the first room, there is not much, but you can see an old computer to your right. There are paths in all \n directions except east";
	}
}
