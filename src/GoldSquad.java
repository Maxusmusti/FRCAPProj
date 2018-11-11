/*
 * Mustafa Eyceoz
 * DUE: 6/1/17
 * Period 1
 * Text-Based Adventure Project
 * The Mystery at FirstBase
 */


public class GoldSquad extends RoomClass{
	
	//read note
	public String read()
	{
		return "It says \"go east to MEET YOUR DEMISE...unless you come prepared\".";
	}
	
	//a big mistake
	public String botherJimmie()
	{
		MainGame.bother = true;
		return "You decide to bother Jimmie.";
	}
	
	
	//another mistake
	public String fight()
	{
		FinalBossForReal.fight = true;
		return "Did you really think you could fight the great James Edward Harkins IV???";
	}
	
	//room text
	public String toString()
	{
		return ".......Jimmie is sitting in the corner playing minecraft. He has a message stapled to his back.";
	}

}
