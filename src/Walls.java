/*
 * Mustafa Eyceoz
 * DUE: 6/1/17
 * Period 1
 * Text-Based Adventure Project
 * The Mystery at FirstBase
 */


public class Walls extends RoomClass{

	//creates walls
	
	public boolean isAWall()
	{
		return true;
	}
	
	
	//wall text
	public String toString()
	{
		return "There is a wall, and you do not have any super powers...that you are aware of at least.";
	}
}
