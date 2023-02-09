/**
 * This is the Application object that will launch our application
 * @author Aung
 * @version 1.3
 * Lab1 
 * CS131ON
 */
public class Application {

	public static void main(String[] args) {
		
		NonPlayerCharacter npc = new NonPlayerCharacter(false, "AVERAGE");
		//Uncomment the line below to ensure reportStructure() method works after you have written it.
		System.out.println(npc.reportStructure());
		
		//calling exclaim method 
		npc.exclaim();
		
		BasketballTeam knight = new BasketballTeam();
		
		knight.setStats(3,4,5,6,7,8);
		knight.getStats();
		
		
	}//end main

}//end class