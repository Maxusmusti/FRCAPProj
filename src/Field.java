/*
 * Mustafa Eyceoz
 * DUE: 6/1/17
 * Period 1
 * Text-Based Adventure Project
 * The Mystery at FirstBase
 */


public class Field extends RoomClass{
	
	//important robot var
	public static boolean gear = false;
	
	//takes gear
	public String takeItem()
	{
		if (gear == false)
		{
			gear = true;
			return "You reach in and pick up a gear. It still looks like there could be something else, but you know that there \n isn't...right?";
		}
		else
		{
			return "There is nothing to be picked up";
		}
	}
	
	//room text
	public String toString()
	{
		return "You step on to the field and notice a strange hole in the ground that may have something in it. Do you \n risk reaching and and trying to take it though?";
	}

}
