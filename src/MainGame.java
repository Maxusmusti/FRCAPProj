/*
 * Mustafa Eyceoz
 * DUE: 6/1/17
 * Period 1
 * Text-Based Adventure Project
 * The Mystery at FirstBase
 */

import java.util.*;

public class MainGame {

	//important variables
	
	public static boolean bother = false;
	static int ns = 0;
	static int ew = 1;
	
	public static void main(String[] args) {

		//first line of the game
		
		System.out.println(" You are standing outside of FirstBase. Something weird is going and on, and you do not understand it, \n but you know one thing for sure: If you do not go in (north) and figure it out, the Base and Team 811 \n are doomed.");
		
		//creating all of the rooms(the rooms are arranged in the form of the map)
		
		RoomClass[][] AllDaRooms = new RoomClass[16][16];                                                                                                                                                                                                                            AllDaRooms[7][7] = new Walls(); AllDaRooms[7][8] = new Walls();    AllDaRooms[7][9] = new Walls(); AllDaRooms[7][10] = new Walls(); AllDaRooms[7][11] = new Walls();   AllDaRooms[7][12] = new Walls();  
		                                                                                                                 AllDaRooms[6][3] = new Walls();           AllDaRooms[6][4] = new Walls();                                         AllDaRooms[6][6] = new Walls();           AllDaRooms[6][7] = new Walls(); AllDaRooms[6][8] = new Maze1();    AllDaRooms[6][9] = new Maze1(); AllDaRooms[6][10] = new Maze1(); AllDaRooms[6][11] = new Maze1();   AllDaRooms[6][12] = new DeadEnd(); AllDaRooms[6][13] = new Walls(); 
		                                                                               AllDaRooms[5][2] = new Walls();   AllDaRooms[5][3] = new GoldSquad();       AllDaRooms[5][4] = new TeamLeadRoom();  AllDaRooms[5][5] = new Walls(); AllDaRooms[5][6] = new FinalBossRoom();   AllDaRooms[5][7] = new Maze1(); AllDaRooms[5][8] = new Maze1();    AllDaRooms[5][9] = new Walls(); AllDaRooms[5][10] = new Maze1(); AllDaRooms[5][11] = new Walls();   AllDaRooms[5][12] = new Walls();                                                
		                                       AllDaRooms[4][1] = new Walls();         AllDaRooms[4][2] = new Walls();   AllDaRooms[4][3] = new Marketing();	   AllDaRooms[4][4] = new Walls();	                                  	   AllDaRooms[4][6] = new Walls();           AllDaRooms[4][7] = new Walls(); AllDaRooms[4][8] = new Maze1();    AllDaRooms[4][9] = new Walls(); AllDaRooms[4][10] = new Maze1(); AllDaRooms[4][11] = new DeadEnd(); AllDaRooms[4][12] = new Walls();   AllDaRooms[4][13] = new Walls();
		AllDaRooms[3][0] = new Walls();        AllDaRooms[3][1] = new Field();         AllDaRooms[3][2] = new Walls();   AllDaRooms[3][3] = new Programming();     AllDaRooms[3][4] = new Walls();                                                                                   AllDaRooms[3][7] = new Walls(); AllDaRooms[3][8] = new Maze1();    AllDaRooms[3][9] = new Walls(); AllDaRooms[3][10] = new Maze2(); AllDaRooms[3][11] = new Walls();   AllDaRooms[3][12] = new Maze2();   AllDaRooms[3][13] = new DeadEnd(); AllDaRooms[3][14] = new Walls();
		AllDaRooms[2][0] = new Walls();        AllDaRooms[2][1] = new Intersection();  AllDaRooms[2][2] = new Hallway(); AllDaRooms[2][3] = new MegaIntersect();   AllDaRooms[2][4] = new Mech();          AllDaRooms[2][5] = new Walls();                                                                           AllDaRooms[2][8] = new DeadEnd();  AllDaRooms[2][9] = new Walls(); AllDaRooms[2][10] = new Maze2(); AllDaRooms[2][11] = new Maze2();   AllDaRooms[2][12] = new Maze3();   AllDaRooms[2][13] = new Walls();   AllDaRooms[2][14] = new Walls();
		AllDaRooms[1][0] = new MentorTables(); AllDaRooms[1][1] = new OpeningRoom();   AllDaRooms[1][2] = new Walls();   AllDaRooms[1][3] = new Wiring();          AllDaRooms[1][4] = new Walls();                                                                                                                   AllDaRooms[1][8] = new Walls();                                    AllDaRooms[1][10] = new Walls(); AllDaRooms[1][11] = new Walls();   AllDaRooms[1][12] = new Maze3();   AllDaRooms[1][13] = new Maze3();   AllDaRooms[1][14] = new FinalBossForReal(); AllDaRooms[1][15] = new Walls();
		AllDaRooms[0][0] = new Walls();        AllDaRooms[0][1] = new RoomClass();     AllDaRooms[0][2] = new Walls();   AllDaRooms[0][3] = new Walls();                                                                                                                                                                                                                                                                                                    AllDaRooms[0][12] = new Walls();   AllDaRooms[0][13] = new Walls();   AllDaRooms[0][14] = new Walls();
		
		//main game loop
		
		while (true)
		{
		Scanner scanz = new Scanner(System.in);
		String s = scanz.nextLine().toUpperCase();
		
		//all commands
		
		switch(s)
		{
			case "GO NORTH":
			{	
				if (ns < 100)
				{	
					ns++;
					System.out.println(AllDaRooms[ns][ew]);
					if (AllDaRooms[ns][ew].isAWall() == true)
						ns--;
				}
				break;
			}
			case "GO SOUTH":
			{
				if (ns > 0)
				{	
					ns--;
					System.out.println(AllDaRooms[ns][ew]);
					if (AllDaRooms[ns][ew].isAWall() == true)
						ns++;
				}
				else
				{
					System.out.println("YOU CANNOT ABANDON YOUR TEAM!");
				}
				break;
			}
			case "GO EAST":
			{
				if (ew < 100)
				{	
					ew++;
					System.out.println(AllDaRooms[ns][ew]);
					if (AllDaRooms[ns][ew].isAWall() == true)
						ew--;
				}
				break;
			}
			case "GO WEST":
			{
				if (ew > 0)
				{	
					ew--;
					System.out.println(AllDaRooms[ns][ew]);
					if (AllDaRooms[ns][ew].isAWall() == true)
						ew++;
				}
				break;
			}
			case "HELP":
			{
				System.out.println(AllDaRooms[ns][ew].help());
				break;
			}
			case "BUILD":
				System.out.println(AllDaRooms[ns][ew].build());
				break;
			case "TAKE":
			{
				System.out.println(AllDaRooms[ns][ew].takeItem());
				break;
			}
			case "LOG IN":
			{
				System.out.println(AllDaRooms[ns][ew].logIn());
				break;
			}
			case "READ":
			{
				System.out.println(AllDaRooms[ns][ew].read());
				break;
			}
			case "INVENTORY":
			{
				System.out.println(AllDaRooms[ns][ew].inventory());
				break;
			}
			case "DEPLOY":
			{
				System.out.println(AllDaRooms[ns][ew].deploy());
				break;
			}
			case "BOTHER":
			{
				System.out.println(AllDaRooms[ns][ew].botherJimmie());
				if (bother)
				{
					System.out.println("Whoops, you died.");
					reset();
				}
				break;
			}
			case "ENTER PORTAL":
			{
				System.out.println(AllDaRooms[ns][ew].enterPortal());
				if (ns == 5 && ew == 6)
				{
					System.out.println(AllDaRooms[ns][ew]);
				}
				break;
			}
			case "GRACIOUS PROFESSIONALISM":
			{
				System.out.println(AllDaRooms[ns][ew].graciousProfessionalism());
				if (FinalBossForReal.win)
				{
					System.out.println("Congratulations, you saved your team and beat the game....have you basked in your own \n glory for long enough? Ok good, the game is restarting now.");
					reset();
				}
				break;
			}
			case "FIGHT":
			{
				System.out.println(AllDaRooms[ns][ew].fight());
				if (FinalBossForReal.fight)
				{
					reset();
				}
				break;
			}
			default:
			{
				System.out.println("Command not recognized. Type \"help\" for the list of all possible commands.");
			}
		}
		
		
		}
		

	}
	
	//reset switch
	
	public static void reset()
	{
		bother = false;
		RoomClass.deployedBot = false;
		RoomClass.robot = false;
		Mech.chassis = false;
		Programming.code = false;
		Marketing.battery = false;
		OpeningRoom.loggedIn = false;
		FinalBossForReal.win = false;
		FinalBossForReal.fight = false;
		Field.gear = false;
		
		ns = 0;
		ew = 1;
		
		System.out.println("Back to the beginning of the game you go");
		System.out.println(" You are standing outside of FirstBase. Something weird is going and on, and you do not understand it, \n but you know one thing for sure: If you do not go in (north) and figure it out, the Base and Team 811 \n are doomed.");
		
		
	}


}
