/* Author: Michael Doherty
 * 
 * 
 * This class generates the answer values for the fretboard training game, and checks the validity of the answers
 * 
 * 
 * 
 * 
 * 
 * 
 */

package newpackage;
import java.util.Random;



public class Game {
	
	private Random rand = new Random();
	
	
	public Game()
	{
		
	}
	//generates random selection among the guitar strings
	public int getGuitarString()
	{
		int guitarString = 0;
		guitarString = rand.nextInt(6);	
		return guitarString;
	}
	//generates a random selection among the guitar frets
	public int getGuitarFret()
	{
		int guitarFret = 0;
		guitarFret = rand.nextInt(12);
		return guitarFret;
	}
	//checks validity of the answer
	public int checkAnswer(int givenAnswer, int givenString, int expectedAnswer, int expectedString)
	{
		
		int result = 0;
		//ignore answer if it was clicked on the wrong string
		if(givenString!=expectedString)
		{
			result = -1;
		}
		//if our answer is not what it should be, send back 0
		else if((givenAnswer%12)!=expectedAnswer)
		{
			result = 0;
		}
		//if the answer is right, send back 1
		else if((givenAnswer%12) ==expectedAnswer)
		{
			result = 1;
		}
		
		
		return result;
	}

}
