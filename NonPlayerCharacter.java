import java.security.SecureRandom;
import java.util.Random;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author Aung
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter{
	//instance variables boolean active and String intelligenceType both private
	private boolean active;
	private String intelligenceType;
	
	
	//getter for setActive
	public boolean getActive() {
		return active;
		
	}//end getActive
	
	//setter for setActive
		public void setActive(boolean Active) 
		{
			this.active=Active;
		}//end of setActive
	
	//getter for setIntelligenceType
	public String getIntelligenceType() {
		return intelligenceType;
		
	}//end getIntelligenceType
	
	//setter for setIntelligenceType
		public void setIntelligenceType(String IntelligenceType) 
		{
			this.intelligenceType=IntelligenceType;
		}//end of setIntelligenceType
	
	//default NonPlayerCharacterconstructor
	public NonPlayerCharacter(boolean Active, String intelligenceType) 
	{
		super();
		active = false;
		
		setIntelligenceType("AVERAGE");
		
	}//end of NonPlayerCharacterconstructor
	
	//preferred NonPlayerCharacterconstructor
	public NonPlayerCharacter(String id,String personality, boolean aactive, String aintelligenceType ) 
	{
		super();
		active = aactive;
		intelligenceType = aintelligenceType;
	}//end of preferred NonPlayerCharacterconstructor

	//reportStructure constructor
	public String reportStructure() 
	{
		super.reportStructure();
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("UniqueID: "+getUniqueID()+"\n");
		sb.append("Personality: "+getPersonality()+"\n");
		sb.append("==================================\n");
		sb.append("Active: "+getActive()+"\n");
		sb.append("Intelligence: "+getIntelligenceType()+"\n");

		
		return sb.toString();
	}//end of reportStructure constructor
	
	//start of introduce method
	public String introduce() 
	{
		return ("Hello, my name is " +uniqueID);
	}//end of introduce method 
	
	//start of exclaim method
	public void exclaim() 
	{
		String[] Str = {"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"};
		Random random = new Random();
		int index = random.nextInt(Str.length);
		System.out.println(Str[index]);
	
	}//end of exclaim method

	

}//end class