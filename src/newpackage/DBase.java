package newpackage;
//***********************************************************
//                         DBase.java                       *
//***********************************************************
//  This class uses JDBC to communicate with a JavaDB       *
//  database of employee data.  The constructor connects    *
//  to the database.  The doFind method displays all        *
//  employees having a specified name.  The doUpdate        *
//  method updates the salary of one employee.              *
//***********************************************************

import java.sql.*;
import java.util.*;

public class DBase {
    private Connection conn;
         private boolean isopen;
         private String databaseName = "";
         private String url = "jdbc:mysql://localhost:3306/" + "csci_455_term_project_initial_dump_mdoherty";
         private String userString;
         private String username = "root";
         private String password = "Radne_Mald1!";

    // Attempt to connect to the JavaDB workers database.
    public DBase(String uname, String pword) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {conn = null;}
        isopen = (conn != null);
    }

    // Test whether the database is open.
    public boolean isOpen() {return isopen;}

    // Close the database connection.
    public void close() {
        if (!isopen) return;
        try {conn.close();}
        catch (Exception e) {}
        isopen = false;
        conn = null;
    }
    //used to create an account for the users
    //it first checks if a username is taken, and if so, exits,
    //and if not, it creates the account with the specified password
    public int createAccount(String username, String password)
    {
    	//IF A SUCCESS: RESULT = 1
    	//IF AN ACCOUNT EXISTS WITH THE NAME: RESULT = 0
    	//IF DB ERROR: RESULT = -1
    	int result = 0;
    	int exists = 0;
    	
    	PreparedStatement stmt = null;
        ResultSet rset = null;
        String sql;
    	
        
        if (!isopen) return -1;
        

        try {
        	//System.out.println(instrument);
            // Create a PreparedStatement for the query.
        	
            sql = "SELECT User.id FROM User"
            		+ " WHERE User.Uname = ?;";

  
			stmt = conn.prepareStatement(sql);

        
			
			 

            // Set the parameters in the statement.
			stmt.setString(1, username);
			
            
       

            // Execute the query and obtain the result set.
            rset = stmt.executeQuery();
           
   
           
           
           //checks if the account exists
           while (rset.next()) {
             exists = rset.getInt(1);
            }
           if(exists > 0)
           {
        	  // System.out.println("BAD");
        	   return result;
           }
           //if the username does not exists in the DB, we create that account
           else
           {
        	  // System.out.println("GOOD");
        	   result = 1;
        	   sql = "INSERT INTO User(Uname, Upassword)"
               		+ " VALUES(? , ?);";
        	   
        	   
        	   stmt = conn.prepareStatement(sql);
        	   // Set the parameters in the statement.
        	   stmt.setString(1, username);
        	   stmt.setString(2, password);
        	   //System.out.println("GOOD");
        	   
        	  //executes the update
        	   stmt.execute();
        	   
        	   
           }
           
           

        } catch (Exception e) {
        	
        	//System.out.println(e);
        }

        // Close the query statement and return.
        try {stmt.close();}
        catch (Exception e) {}
        
        

    	
    	return result;
    }
    //attempts to log in with the given username + password
    public int login(String username, String password)
    {
    	//SUCCESS: RESULT = 1
    	//FAILS: RESULT = 0
    	//DB ERROR: RESULT = -1;
    	int result = 0;
    	
    	
    	PreparedStatement stmt = null;
        ResultSet rset = null;
        String sql;
    	
        
        if (!isopen) return -1;
        

        try {
        	//System.out.println(instrument);
            // Create a PreparedStatement for the query.
        	
            sql = "SELECT User.id FROM User"
            		+ " WHERE User.Uname = ? AND User.Upassword = ?;";

  
			stmt = conn.prepareStatement(sql);

           
			
			 

            // Set the parameters in the statement.
			stmt.setString(1, username);
			stmt.setString(2, password);
			
            
        

            // Execute the query and obtain the result set.
            rset = stmt.executeQuery();
           
           
           
           
           //System.out.println(rset.toString());
           while (rset.next()) {
             result = rset.getInt(1);
            }
         //  System.out.println(result);

        } catch (Exception e) {}

        // Close the query statement and return.
        try {stmt.close();}
        catch (Exception e) {}
    
        
        
        
        
    	
    	
        return result;
    }

    //we get the instrument options based on the choice from the user
    public String getInstruments(int choice)
    {
    	String options = "";
    	String instrument = "";
    	switch(choice){
    	case 0:
    		instrument = "Bass";
    		break;
    	case 1:
    		instrument = "Guitar";
    		break;
    	}
    	
    	PreparedStatement stmt = null;
        ResultSet rset = null;
        String sql;
        
       
        
        		// Return if the database is closed.
                if (!isopen) return "FAILURE";

                try {
                	//System.out.println(instrument);
                    // Create a PreparedStatement for the query.
                	
                	//we query for all instruments that contain the word "guitar" or "bass"
                    sql = "SELECT Instrument.Iname FROM Instrument"
                    		+ " WHERE Iname LIKE CONCAT('%', ?,'%')";
        
                   // System.out.println(sql);
        			stmt = conn.prepareStatement(sql);

                    // Read the parameters from the user.
        			
        			 

                    // Set the parameters in the statement.
                   stmt.setString(1, instrument);
                    
                   

                    // Execute the query and obtain the result set.
                    rset = stmt.executeQuery();
                   
                    
                   //we save the resulting instruments
                    while (rset.next()) {
                       options += rset.getString(1)+ "\n";
                    }

                } catch (Exception e) {}

                // Close the query statement and return.
                try {stmt.close();}
                catch (Exception e) {}
            
    	 
    	 
    	//return instrument results
    	return options;
    }
    //provides the tuning options for the given instrument
    public String getTunings(String instrumentName)
    {
    	String tunings = "";
    	
    	
    	PreparedStatement stmt = null;
        ResultSet rset = null;
        String sql;
        
       
        
        		// Return if the database is closed.
                if (!isopen) return "FAILURE";

                try {
                	//System.out.println(instrument);
                    // Create a PreparedStatement for the query.
                	
                    sql = "SELECT Tuning.Tname FROM Tuning, Instrument"
                    		+ " WHERE Tuning.instrument = Instrument.id "
                    		+ " AND Instrument.id = (SELECT Instrument.id FROM Instrument WHERE Instrument.Iname = ?);";
        
        			stmt = conn.prepareStatement(sql);

                   
        			
        			 
        			System.out.println("NAME: " + instrumentName);
                    // Set the parameters in the statement.
                   stmt.setString(1,instrumentName);
                    
                   

                    // Execute the query and obtain the result set.
                    rset = stmt.executeQuery();
                   
                  // System.out.println("SOFARSOGOOD");
                    
                   //we save all the available tunings
                    while (rset.next()) {
                       tunings += rset.getString(1)+ "\n";
                    }

                } catch (Exception e) {}

                // Close the query statement and return.
                try {stmt.close();}
                catch (Exception e) {}
    	
    	
    	
    	
    	
    	
    	
    	//return available tunings
    	return tunings;
    	
    }
    //get the name of the note at the given id index
    public String getNoteName(int index)
    {
    	String fretNote = "";
    	//System.out.println(index);
    	
    	
    	PreparedStatement stmt = null;
        ResultSet rset = null;
        String sql;
        
       
        
        		// Return if the database is closed.
                if (!isopen) return "FAILURE";

                try {
                	//System.out.println(instrument);
                    // Create a PreparedStatement for the query.
                	
                    sql = "SELECT Note.Nname FROM Note"
                    		+ " WHERE Note.toneID = ?";
        
        			stmt = conn.prepareStatement(sql);

                 
        			
        			 
        			
                    // Set the parameters in the statement.
                   stmt.setString(1,index+"");
                    
                   

                    // Execute the query and obtain the result set.
                    rset = stmt.executeQuery();
                   
                   // System.out.println("SOFARSOGOOD");
                   
                    //we save the note name
                   
                    while (rset.next()) {
                       fretNote = rset.getString(1);
                    }

                } catch (Exception e) {}

                // Close the query statement and return.
                try {stmt.close();}
                catch (Exception e) {}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	System.out.println("NOTE TO FIND: " + fretNote);
    	
    	//we return the note name
    	return fretNote;
    }
    //we get the path to the audio file for the note
    public String getNotePath(int index)
    {
    	String notePath = "";
    	//System.out.println(index);
    	
    	
    	PreparedStatement stmt = null;
        ResultSet rset = null;
        String sql;
        
       
        
        		// Return if the database is closed.
                if (!isopen) return "FAILURE";

                try {
                	//System.out.println(instrument);
                    // Create a PreparedStatement for the query.
                	
                    sql = "SELECT Note.sound FROM Note"
                    		+ " WHERE Note.toneID = ?";
        
        			stmt = conn.prepareStatement(sql);

                
        			
        			 
        			
                    // Set the parameters in the statement.
                   stmt.setString(1,index+"");
                    
                   

                    // Execute the query and obtain the result set.
                    rset = stmt.executeQuery();
                   
                   // System.out.println("SOFARSOGOOD");
                   
                   //save the file path
                    while (rset.next()) {
                       notePath = rset.getString(1);
                    }

                } catch (Exception e) {}

                // Close the query statement and return.
                try {stmt.close();}
                catch (Exception e) {}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	//return the file path
    	return notePath;
    }
    //we get the tuning of each of the instrument's strings
    public String getFretNotes(String tuningName, String instrumentName)
    {
    	String fretNotes = "";
    	
    	
    	
    	
    	PreparedStatement stmt = null;
        ResultSet rset = null;
        String sql;
        
       
        
        		// Return if the database is closed.
                if (!isopen) return "FAILURE";

                try {
                	//System.out.println(instrument);
                    // Create a PreparedStatement for the query.
                	
                    sql = "SELECT TuningNote.stringONE, TuningNote.stringTWO, TuningNote.stringTHREE,TuningNote.stringFOUR, TuningNote.stringFIVE, TuningNote.stringSIX FROM TuningNote, Tuning"
                    		+ " WHERE TuningNote.tuningID = Tuning.id"
                    		+ " AND Tuning.id = (SELECT Tuning.id FROM Tuning WHERE Tuning.Tname = ? AND Tuning.instrument = (SELECT Instrument.id FROM Instrument WHERE Instrument.Iname = ?));";
        
        			stmt = conn.prepareStatement(sql);

                   
        			
        			 
        			
                    // Set the parameters in the statement.
                   stmt.setString(1,tuningName);
                   stmt.setString(2, instrumentName);
                    
                   

                    // Execute the query and obtain the result set.
                    rset = stmt.executeQuery();
                   
                    System.out.println("SOFARSOGOOD");
                    
                   int x = 1;
                   //we save all the fret notes
                    while (rset.next()) {
                    	
                       fretNotes += rset.getInt(1)+"\n";
                       fretNotes += rset.getInt(2)+"\n";
                       fretNotes += rset.getInt(3)+"\n";
                       fretNotes += rset.getInt(4)+"\n";
                       fretNotes += rset.getInt(5)+"\n";
                       fretNotes += rset.getInt(6)+"\n";
                       x++;
                    }
                    

                } catch (Exception e) {}

                // Close the query statement and return.
                try {stmt.close();}
                catch (Exception e) {}
                //return the fret notes
                return fretNotes;
    }
    //we get the high scores from the given tuning and difficulty
    public String getHighScores(int difficulty, int tuning)
    {
    	String highScoreString = "";
    	 userString = "";
    	
    	
    	
    	
    	PreparedStatement stmt = null;
        ResultSet rset = null;
        String sql;
        
       
    
        		// Return if the database is closed.
                if (!isopen) return "FAILURE";

                try {
                	//System.out.println(instrument);
                    // Create a PreparedStatement for the query.
                	
                	/*
                	 * At least one of your options must update the database and at least one
					 *	must access multiple tables
					 * 
					 * 
                	 * 
                	 */
                	
                    sql =  "select User.UName, Scoreboard.Score FROM Scoreboard " +
                    		"INNER JOIN User ON User.id = Scoreboard.userID " +
                    		" where modeID = (Select id from GameMode where difficulty = ? AND tuning = ?) " +
                    		"ORDER BY Scoreboard.Score DESC";
        
        			stmt = conn.prepareStatement(sql);

                   
        			
        			 
        			
                    // Set the parameters in the statement.
                   stmt.setString(1,difficulty + "");
                   stmt.setString(2, tuning + "");
                    
                   

                    // Execute the query and obtain the result set.
                    rset = stmt.executeQuery();
                   
                    
                   
                   int x = 1;
                   
                   
                   //We have to structure the string in html format
                   //to get the proper printing within the scoreboard section
                   
                   userString += "<html>";
                   highScoreString+= "<html>";
                    while (rset.next()) {
                    	userString += rset.getString(1) + "<br/>";
                    	highScoreString += + rset.getInt(2) + "<br/>";
                    }
                    userString += "<html>";
                    highScoreString+= "<html>";

           
                } catch (Exception e) {}

                // Close the query statement and return.
                try {stmt.close();}
                catch (Exception e) {}
                
                
                //returns the scores
                return highScoreString;
    }
    //because the previous query had to be broken into 2 sectins
    //the user list is return through this method
    public String getHighScoreUserString()
    {
    
    	return userString;
    }
    
    /*
     * 
     * This method gets the id value of the tuning based off of the name of the tuning with the given instrument
     * 
     */
    public int getInstrumentTuningID(String tuningName, String instrumentName)
    {
    	int id  = 0;
    	
    	
    	
    	
    	PreparedStatement stmt = null;
        ResultSet rset = null;
        String sql;
        
       
     
        		// Return if the database is closed.
                if (!isopen) return -300000;

                try {
                	//System.out.println(instrument);
                    // Create a PreparedStatement for the query.
                	
                	
                	
                    sql =  "SELECT Tuning.id from Tuning "
                    		+ "WHERE tuning.Tname = ? "
                    		+ "AND tuning.instrument = (Select id FROM Instrument WHERE Instrument.Iname = ?);";
        
        			stmt = conn.prepareStatement(sql);

                   
        			
        			 
        			
                    // Set the parameters in the statement.
                   stmt.setString(1,tuningName + "");
                   stmt.setString(2, instrumentName + "");
                    
                   

                    // Execute the query and obtain the result set.
                    rset = stmt.executeQuery();
                   
                    
                    //save the id
                   int x = 1;
                    while (rset.next()) {
                    	id = rset.getInt(1);
                    }
                    

                } catch (Exception e) {}

                // Close the query statement and return.
                try {stmt.close();}
                catch (Exception e) {}
                //return the id
                return id;
    }
    //this method publishes the scores to the scoreboard
    public void updateScoreboard(String userName, int score, int instrumentTuning, int difficulty)
    {
    	
    	System.out.println(userName + " SHOULD BE ADDED TO SCOREBOARD " + instrumentTuning + " WITH SCORE " + score);
    	
    	
    	
    	PreparedStatement stmt = null;
        ResultSet rset = null;
        String sql;
        
       
     
        		// Return if the database is closed.
                if (!isopen) return;

                try {
                	//System.out.println(instrument);
                    // Create a PreparedStatement for the query.
                	
                	
                	
                    sql =  "INSERT INTO Scoreboard(userID, modeID, score) "
                    		+"VALUES((SELECT User.id FROM User WHERE User.Uname = ?),(SELECT GameMode.id FROM GameMode WHERE GameMode.difficulty = ? AND GameMode.tuning = ?),?);";
                    		
        
        			stmt = conn.prepareStatement(sql);

                    // Read the parameters from the user.
        			
        			 
        			
                    // Set the parameters in the statement.
                   stmt.setString(1,userName + "");
                   stmt.setString(2,  difficulty+ "");
                   stmt.setString(3, instrumentTuning+"");
                   stmt.setString(4, score+"");
                   System.out.println("HOME STRETCH");
                 
                   

                    // Execute update to the scoreboard
                   stmt.execute();
                    
                    
                    
                
                    

                } catch (Exception e) {}

                // Close the query statement and return.
                try {stmt.close();}
                catch (Exception e) {}
                
                
    }
    //returns the time limit of the given gamemode
    public int getTime(int difficulty, int tuningID) {
        PreparedStatement stmt = null;
        ResultSet rset = null;
        String sql;
        int timeLimit =0;

        // Return if the database is closed.
        if (!isopen) return -300;

        try {

            // Create a PreparedStatement for the query.
            sql = "SELECT timeLimit FROM GameMode "
            		+ "WHERE difficulty = ? and tuning = ?";
            stmt = conn.prepareStatement(sql);


            // Set the parameters in the statement.
            stmt.setString(1, difficulty+"");
            stmt.setString(2, tuningID+"");

            // Execute the query and obtain the result set.
            rset = stmt.executeQuery();
            //store the time limit
            while (rset.next()) {
            	timeLimit = rset.getInt(1);
            }
        } catch (Exception e) {}

        // Close the query statement and return.
        try {stmt.close();}
        catch (Exception e) {}
        
        return timeLimit;
    }
    
    
    // Display all employees having a specified name.
  /*  public void doFind(Scanner kbd) {
        PreparedStatement stmt = null;
        ResultSet rset = null;
        String sql, last, first, dept;
        double salary;
        int id;

        // Return if the database is closed.
        if (!isopen) return;

        try {

            // Create a PreparedStatement for the query.
            sql = "SELECT Employee.Id, Employee.Fname, " +
            "Employee.Lname, Employee.Salary, Department.Name " +
            "FROM Employee " +
            "INNER JOIN Department ON Employee.Dept = Department.Id " +
            "WHERE Employee.Lname = ? AND Employee.Fname = ?";
            stmt = conn.prepareStatement(sql);

            // Read the parameters from the user.
            System.out.printf("First Name? ");
            first = kbd.next();
            System.out.printf("Last Name? ");
            last = kbd.next();

            // Set the parameters in the statement.
            stmt.setString(1, last);
            stmt.setString(2, first);

            // Execute the query and obtain the result set.
            rset = stmt.executeQuery();

            // Print the matching employees.
            System.out.printf("%n");
            System.out.printf(
                " Id   First Name    Last Name       Salary   Department%n"
            );
            while (rset.next()) {
                id = rset.getInt(1);
                first = rset.getString(2);
                last = rset.getString(3);
                salary = rset.getDouble(4);
                dept = rset.getString(5);
                System.out.printf("%4d  %-12s  %-12s  %9.2f  %-15s%n",
                    id, first, last, salary, dept);
            }

        } catch (Exception e) {}

        // Close the query statement and return.
        try {stmt.close();}
        catch (Exception e) {}
    }*/

    // Update the salary of one employee.
   
    
    
    
}
