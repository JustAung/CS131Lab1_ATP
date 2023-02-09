/**
 * 
 */

/**
 * @author Aung
 * Lab 1 Program 2
 *
 */
//Abstract Class SportsTeam with the Strings and ints
public abstract class SportsTeam{
protected String teamName;
protected String teamMascot;
protected String headCoach;
protected int wins;
protected int losses;
//default SportsTeam Constructor
public SportsTeam()
{
	String teamName = "";
	String teamMascot = "";
	String headCoach = "";
	int wins = 0;
	int losses = 0;
}//end of default class

//Preferred Constructor
public SportsTeam(String teamName, String teamMascot, String headCoach)
{
	teamName = "0";
	teamMascot = "0";
	headCoach = "0";
	wins = 0;
	losses = 0;
}//End of preferred Constructor

//getWinPercentage method
public double getWinPercentage() 
{
	return wins/(wins + losses);
	
}//end of getWinPercentage method

//abstract getStats
public abstract double[] getStats();
//end of getStats no implementation
}//end of class
