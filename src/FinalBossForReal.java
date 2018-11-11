/*
 * Mustafa Eyceoz
 * DUE: 6/1/17
 * Period 1
 * Text-Based Adventure Project
 * The Mystery at FirstBase
 */


public class FinalBossForReal extends RoomClass{
	
	//win cond.
	public static boolean win = false;
	public static boolean fight = false;
	
	//gracious prof. (no spoilers)
	public String graciousProfessionalism()
	{
		win = true;
		return "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHHHHHHHHHHHHHAHHHHHH-Oh hey, your kindness cured my curse! Thanks dude. Here's your \n team back and here's a $10,000 robotics scholarship.";
	}
	
	//fights Kamen
	public String fight()
	{
		fight = true;
		return "YOU CANT FIGHT THE KAMEN!.........You died.";
	}
	
	//room text
	public String toString()
	{
		return "BWAHAHA! SO YOU HAVE FINALLY FOUND ME! IT REALLY IS A SHAME THAT YOU HAVE NO WAY OF STOPPING ME, THE GREAT DEAN \n KAMEN! WHAT COULD YOU POSSIBLY DO, DEFEAT ME WITH \"GRACIOUS PROFESSIONALISM\"? Or will you try to \"Fight\"?";
	}

}
