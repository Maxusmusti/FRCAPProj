/*
 * Mustafa Eyceoz
 * DUE: 6/1/17
 * Period 1
 * Text-Based Adventure Project
 * The Mystery at FirstBase
 */



//the main basic room class
public class RoomClass {
	
	//important vars
	
	public static boolean robot = false;
	public static boolean deployedBot = false;
	
	
	//picks stuff up in later rooms
	public String takeItem()
	{
		return "nothing in this room to pick up.";
	}
	
	//fights stuff in later rooms
	public String fight()
	{
		return "There are no enemies!";
	}
	
	//bothers Jimmies in later rooms
	public String botherJimmie()
	{
		return "Nobody around can be bothered.";
	}
	
	//builds a robot
	public String build()
	{
		if (!robot)
		{
			if (Field.gear && Mech.chassis && Marketing.battery)
			{
			robot = true;
			return "HUZZAH! YOU HAVE BUILT A ROBIT! Now to deploy the code.";
			}
			return "You cannot build anything without all of the necessary parts.";
		}
		else
		{
			return "You have already built the robot.";
		}
	}
	
	//logs in in later room
	public String logIn()
	{
		return "Nothing to log into.";
	}
	
	//reads stuff in later rooms
	public String read()
	{
		return "Nothing to read.";
	}
	
	//checks if there is a wall
	public boolean isAWall()
	{
		return false;
	}
	
	//gracious prof. (no spoilers)
	public String graciousProfessionalism()
	{
		return "Ummmm...not much use for that right now.";
	}
	
	//enters portal in later room
	public String enterPortal()
	{
		return "Have you gone insane?";
	}
	
	//lists all possible commands
	public static String help()
	{
		return "List of possible commands: \n Log in \n Build \n Fight \n Take \n Go West/East/North/South \n Read \n Inventory \n Deploy \n Bother \n Enter Portal \n Gracious Professionalism";

	}
	
	//deploys code to built robot
	public String deploy()
	{
		if (!deployedBot)
		{	
			if (Programming.code && robot)
			{
				deployedBot = true;
				return "WOWZERS! A WORKING ROBOT!";
			}
			else if (Programming.code)
			{
				return "You can't put code on an imaginary robot.";
			}
			else
			{
				return "You don't have code to deploy.";
			}
		}
		else
		{
			return "You have already deployed the code to your robot.";
		}
	}
	
	//checks inventory
	public String inventory()
	{
		String ret = "Inventory: \n";
		
		if (!robot && !deployedBot)
		{
			if (Field.gear == true)
			{
				ret += "gear \n";
			}
		
			if (Mech.chassis == true)
			{
				ret += "chassis \n";
			}
		
			if (Marketing.battery == true)
			{
				ret += "battery \n";
			}
		
			if (Programming.code == true)
			{
				ret += "code \n";
			}
		}
		else if (deployedBot)
		{
			ret += "working robot";
		}
		else
		{
			ret += "robot \n code";
		}
		return ret;
		
	}
	
	//room text
	public String toString()
	{
		return "You try to abandon your team, but you cannot bring yourself to do it. Also, a random obstacle has appeared \n preventing further escape, so you must turn back.";
	}
}
