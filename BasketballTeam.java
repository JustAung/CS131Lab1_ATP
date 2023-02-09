/**
 * 
 */

/**
 * @author aung
 *Lab 1 Program 2
 */
//BasketBalTeam Class with private ints
public class BasketballTeam extends SportsTeam{
private int fieldGoals;
private int fieldGoalsAttempted;
private int freeThrows;
private int freeThrowsAttempted;

//default constructor
public BasketballTeam()
{
	int fieldGoals = 0;
	int fieldGoalsAttempted = 0;
	int freeThrows = 0;
	int freeThrowsAttempted = 0;
}//end of default constructor all int instance set to 0

//Preferred constructor
public BasketballTeam(String teamName, String teamMascot, String headcoach)
{
	int fieldGoals = 0;
	int fieldGoalsAttempted = 0;
	int freeThrows = 0;
	int freeThrowsAttempted = 0;
}//end of Preferred constructor

//fieldGoallPercentage method
public double fieldGoallPercentage()
{
	return fieldGoals/fieldGoalsAttempted;
	
}//end of fieldGoallPercentage method

//freeThrowPrecentage() method
public double freeThrowPrecentage()
{
	return freeThrows/freeThrowsAttempted;
	
}//end of freeThrowsPercentage() method

//setStats method
public void setStats(int wins, int losses, int fieldGoals, int FieldGoalsAttempted, int freeThrows, int freeThrowsAttempted)
{
	
}//end of setStats method

@Override
public  double[] getStats() {
	double[] stats = new double [3];    // Creating an array of 3 elements  
	stats[0]=getWinPercentage();  
	stats[1]=fieldGoallPercentage();  
	stats[2]=freeThrowPrecentage();
	
	for (int i = 0; i < stats.length; i++) //for loop to print the array  
		System.out.println( stats[i]+ " "); 
	return stats;
	
}//end of getStats



}//end of class



