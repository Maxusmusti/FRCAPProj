/*
 * Mustafa Eyceoz
 * DUE: 6/1/17
 * Period 1
 * Text-Based Adventure Project
 * The Mystery at FirstBase
 */


public class TeamLeadRoom extends RoomClass{

	//warps to maze
	
	public String enterPortal()
	{
		if (RoomClass.deployedBot)
		{
			MainGame.ns = 5;
			MainGame.ew = 6;
			return "WOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOSHHHHHHHHHHHHHHHHHH";
		}
		else
		{
			return "You do not have a fully operational robot";
		}
	}
	
	//checks log in and room text options
	public String toString()
	{
		if (OpeningRoom.loggedIn)
		{
			return "User logged in......access granted. You now enter the team lead room. There is a strange glowing portal \n in the back. It appears to be too small to fit inside, but a robot could likely fit. \n As long as you have a fully operational working robot, you should be able to \"enter portal\"";
		}
		else
		{
			MainGame.ew--;
			return "User not logged in.....access denied.";
		}
	}
}
