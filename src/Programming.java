/*
 * Mustafa Eyceoz
 * DUE: 6/1/17
 * Period 1
 * Text-Based Adventure Project
 * The Mystery at FirstBase
 */


public class Programming extends RoomClass{
	
	//important robot var
	
	public static boolean code = false;
	
	//takes code
	public String takeItem()
	{
		if (code == false)
		{
			code = true;
			return "Code acquired. Now to deploy it";
		}
		else
		{
			return "You already have the code";
		}
	}
	
	//room text
	public String toString()
	{
		return "You have had many great memories here in Programming. It's a shame there may never be more if the team isn't saved. \n There's some code to take, but not much else here. North is Marketing.";
	}
}
