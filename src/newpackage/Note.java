/*
 * 
 * This class generates the note that needs to be clicked based on the fret location and the tuning of the string
 * 
 * 
 */

package newpackage;
import java.util.Random;

public class Note {
	
	Random rand = new Random();
	public Note()
	{
		
	}
	public int getNote(int tuning, int index)
	{
		//String note = "";
		
		//int sharpOrFlat = rand.nextInt(2);
		//String sharpNotes[] = {"E", "F", "F#", "G", "G#", "A", "A#","B", "C", "C#", "D", "D#", };
		//String flatNotes[] =  {"E", "F", "Gb", "G", "Ab", "A","Bb", "B", "C","Db", "D", "Eb", };
		
		
		//the note index value = tuning value + index (fret) value
		
		index = (tuning + index);
		
		//if our index value is greater than 12, then that means
		//we loop back to the beginning of our indexes
		//because a guitar repeats notes once you hit the 12th fret
		if(index > 12)
		{
			//so if our index is > 12, we use modulus to find the right index of the note in the DB
			index = index % 12;
		}
		
		System.out.println("NOTE TO CLICK HAS ID: " + index);
		

		
		
		return index;
	}

}
