package newpackage;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.Scanner;
import java.awt.CardLayout;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.Choice;
import javax.swing.JPasswordField;

import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.WindowAdapter;


public class guitarGui{

	static Timer timer;
	static int timeLimit; 
	static int selectedIndex;
	static int selectedString;
	static int answerIndex;
	static int answerString;
	static int score = 0;
	static int difficulty = 1;
	static int running = 0;
	static JLabel tuningNameLabel = new JLabel("Tuning Name: ");
	static String userBoardNames;
	protected static boolean windowLock = false;
	static DBase myDB = new DBase(null,null);
	static int stringOneTuning;
	static int stringTwoTuning;
	static int stringThreeTuning;
	static int stringFourTuning;
	static int stringFiveTuning;
	static int stringSixTuning;
	
	private JFrame frame;
	private JPanel cards;
	private JPanel menuPanel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton guitarButton;
	private JButton bassButton;
	private JButton menuBackButton;
	private JPanel titlePanel;
	private JLabel LabelGame;
	private JLabel TitleVersion;
	private JLabel TitleName;
	private JButton BeginBTTN;
	private JButton ExitBTTN;
	private JPanel tuningMenu;
	private JLabel tuningInstructionLabel;
	private JButton nextButtonTuning;
	private JPanel customTuningPanel;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JPanel gamePanel;
	private Choice tuningChoice;
	private Choice guitarChoice;
	private Choice bassChoice;
	static String sessionName = "";
	static String instrumentChoice;
	private JPanel mainPagePanel;
	private JPanel LoginPanel;
	private JTextField userNameBox;
	private JPasswordField passBox;
	private JButton accountLogButton;
	private JButton createAccountButton;
	private JLabel titleNameLabel;
	private JButton startResetButton;
	private static JLabel scoreLabel;
	private static JLabel selectedLineLabel;
	private JButton sixString_1_6;
	private JButton sixString_1_7;
	private JButton sixString_1_8;
	private JButton sixString_1_9;
	private JButton sixString_1_10;
	private JButton sixString_1_11;
	private JButton sixString_1_12;
	private JButton sixString_1_13;
	private JButton sixString_1_14;
	private JButton sixString_1_15;
	private JButton sixString_2_1;
	private JButton sixString_2_2;
	private JButton sixString_2_3;
	private JButton sixString_2_4;
	private JButton sixString_2_5;
	private JButton sixString_2_6;
	private JButton sixString_2_7;
	private JButton sixString_2_8;
	private JButton sixString_2_9;
	private JButton sixString_2_10;
	private JButton sixString_2_11;
	private JButton sixString_2_12;
	private JButton sixString_2_13;
	private JButton sixString_2_14;
	private JButton sixString_2_15;
	private JButton sixString_3_1;
	private JButton sixString_3_2;
	private JButton sixString_3_3;
	private JButton sixString_3_4;
	private JButton sixString_3_5;
	private JButton sixString_3_6;
	private JButton sixString_3_7;
	private JButton sixString_3_8;
	private JButton sixString_3_9;
	private JButton sixString_3_10;
	private JButton sixString_3_11;
	private JButton sixString_3_12;
	private JButton sixString_3_13;
	private JButton sixString_3_14;
	private JButton sixString_3_15;
	private JButton sixString_4_1;
	private JButton sixString_4_2;
	private JButton sixString_4_3;
	private JButton sixString_4_4;
	private JButton sixString_4_5;
	private JButton sixString_4_6;
	private JButton sixString_4_7;
	private JButton sixString_4_8;
	private JButton sixString_4_9;
	private JButton sixString_4_10;
	private JButton sixString_4_11;
	private JButton sixString_4_12;
	private JButton sixString_4_13;
	private JButton sixString_4_14;
	private JButton sixString_4_15;
	private JButton sixString_5_1;
	private JButton sixString_5_2;
	private JButton sixString_5_3;
	private JButton sixString_5_4;
	private JButton sixString_5_5;
	private JButton sixString_5_6;
	private JButton sixString_5_7;
	private JButton sixString_5_8;
	private JButton sixString_5_9;
	private JButton sixString_5_10;
	private JButton sixString_5_11;
	private JButton sixString_5_12;
	private JButton sixString_5_13;
	private JButton sixString_5_14;
	private JButton sixString_5_15;
	private JButton sixString_6_1;
	private JButton sixString_6_2;
	private JButton sixString_6_3;
	private JButton sixString_6_4;
	private JButton sixString_6_5;
	private JButton sixString_6_6;
	private JButton sixString_6_7;
	private JButton sixString_6_8;
	private JButton sixString_6_9;
	private JButton sixString_6_10;
	private JButton sixString_6_11;
	private JButton sixString_6_12;
	private JButton sixString_6_13;
	private JButton sixString_6_14;
	private JButton sixString_6_15;
	private JLabel timeLabel;
	private static JLabel locateNoteLabel;
	private JLabel stringOneNameLabel;
	private JLabel stringTwoNameLabel;
	private JLabel stringThreeNameLabel;
	private JLabel stringFourNameLabel;
	private JLabel stringFiveNameLabel;
	private JLabel stringSixNameLabel;
	protected static JLabel difficultyNameLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args)  {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guitarGui window = new guitarGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public guitarGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//DATABASE CODE
		//DBase myDB = new DBase(null,null);
		Game myGame = new Game();
		Note myNote = new Note();
		
		
		
		
		
		frame = new JFrame();
		
		/*			
		 * Your menu must provide an exit command which closes the database
			connection and terminates the program.
		 * 			SATISFIED HERE
		 * 
		 * 
		 * ON PROGRAM CLOSING, THE DATABASE CLOSES
		 */
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				myDB.close();
			}
		});
		
		
		frame.setBounds(100, 100, 750, 353);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	
		cards = new JPanel();
		frame.getContentPane().add(cards, BorderLayout.CENTER);
		cards.setLayout(new CardLayout(0, 0));
		
		LoginPanel = new JPanel();
		cards.add(LoginPanel, "loginPanel");
		LoginPanel.setLayout(null);
		
		menuPanel = new JPanel();
		menuPanel.setLayout(null);
		cards.add(menuPanel, "menu");
		
	
		mainPagePanel = new JPanel();
		cards.add(mainPagePanel, "mainPagePanel");
		mainPagePanel.setLayout(null);
		
		titlePanel = new JPanel();
		titlePanel.setLayout(null);
		cards.add(titlePanel, "title");
		
		tuningMenu = new JPanel();
		cards.add(tuningMenu, "tuningMenu");
		tuningMenu.setLayout(null);
		
		customTuningPanel = new JPanel();
		cards.add(customTuningPanel, "customTuningGuitar");
		customTuningPanel.setLayout(null);
		
		CardLayout cl = (CardLayout)(cards.getLayout());
		cards.setVisible(true);
	    cl.show(cards, "mainPagePanel");
	    
	    gamePanel = new JPanel();
		cards.add(gamePanel, "gamePanel");
		gamePanel.setLayout(null);
		
		lblNewLabel = new JLabel("Select An Instrument");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(252, 37, 146, 14);
		menuPanel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Instruments");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(262, 62, 122, 14);
		menuPanel.add(lblNewLabel_1);
		
		
		//DB CODE
		String items;
		
		//DB CODE GETS CHOICES OF GUITARS
		guitarChoice = new Choice();
		items = myDB.getInstruments(1);
		Scanner guitarScanner = new Scanner(items);
		//add all choices to our choice box
		while(guitarScanner.hasNext())
			{
				guitarChoice.add(guitarScanner.nextLine());
			}
			//System.out.println(items + "E");
				
		guitarChoice.setBounds(424, 131, 164, 20);
		menuPanel.add(guitarChoice);
		guitarChoice.setVisible(false);
		
		bassChoice = new Choice();
		menuPanel.add(bassChoice);
		bassChoice.setVisible(false);
		
		//we query for all bass options
		
		items = myDB.getInstruments(0);
		bassButton = new JButton("Bass Guitar");
		//when the bass button is clicked, bass choices appear and guitar choices disappear
		bassButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				guitarChoice.setVisible(false);
				bassChoice.setVisible(true);
			}
			
		});
		bassButton.setBounds(91, 88, 89, 23);
		//and add each option to our choice box for basses
		Scanner bassScanner = new Scanner(items);
		while(bassScanner.hasNext())
		{
			bassChoice.add(bassScanner.nextLine());
		}
		bassChoice.setBounds(51, 131, 174, 20);
		menuPanel.add(bassButton);
		
		
		
		//labeled button for the guitar choice box
		guitarButton = new JButton("Guitar");
		//when the guitar button is pressed, the bass choices disappear and the guitar choices appear
		guitarButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//cl.show(cards, "guitarMenu");
				bassChoice.setVisible(false);
				guitarChoice.setVisible(true);
			}
		});
		guitarButton.setBounds(460, 88, 89, 23);
		menuPanel.add(guitarButton);
		
	
		// a button that allows users to go back to the title page
		menuBackButton = new JButton("Back");
		menuBackButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl.show(cards, "title");
			}
		});
		menuBackButton.setBounds(10, 11, 67, 23);
		menuPanel.add(menuBackButton);
		
		
		//a button for continuing once the user selects their desired instrument
		JButton instrumentNextButton = new JButton("Next");
		instrumentNextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//if no instrument is selected let user know 
				if((guitarChoice.isVisible()==false && bassChoice.isVisible()==false))
				{
					JOptionPane.showMessageDialog(frame, "Please select a type of instrument before proceeding");
				}
				else
				{
					//if a guitar is selected we note the choice
					if(guitarChoice.isVisible())
					{
						instrumentChoice = guitarChoice.getSelectedItem();
					}
					//and if else the bass is selected
					else
					{
						instrumentChoice = bassChoice.getSelectedItem();
						
						
						
					}
					String tunings;
					//we get the tuning for that specific instrument from the db
					tunings = myDB.getTunings(instrumentChoice);
					
					//we put each tuning choice into the choice box
					Scanner tuningScanner= new Scanner(tunings);
					while(tuningScanner.hasNext())
						{
							tuningChoice.add(tuningScanner.nextLine());
						}
					tuningChoice.setBounds(171, 151, 268, 20);
					
					
					
					cl.show(cards, "tuningMenu");
					
					
				}
				
			}
		});
		
		
		
		instrumentNextButton.setBounds(228, 176, 195, 23);
		menuPanel.add(instrumentNextButton);
		
		//title screen labels
		//**********************************************************
		LabelGame = new JLabel("Fretboard Training");
		LabelGame.setHorizontalAlignment(SwingConstants.CENTER);
		LabelGame.setBounds(217, 84, 280, 14);
		titlePanel.add(LabelGame);
		
		TitleVersion = new JLabel("Version 1.1");
		TitleVersion.setHorizontalAlignment(SwingConstants.CENTER);
		TitleVersion.setBounds(227, 109, 270, 14);
		titlePanel.add(TitleVersion);
		
		TitleName = new JLabel("By Michael Doherty");
		TitleName.setHorizontalAlignment(SwingConstants.CENTER);
		TitleName.setBounds(217, 134, 280, 14);
		titlePanel.add(TitleName);
		//*******************************************************************************
		
		//takes the user from the title screen to the menu
		BeginBTTN = new JButton("Start");
		BeginBTTN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cl.show(cards, "menu");
			}
		});
		BeginBTTN.setBounds(217, 175, 89, 23);
		titlePanel.add(BeginBTTN);
		
		//allows users to close the window
		ExitBTTN = new JButton("Exit");
		ExitBTTN.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
			}
		});
		ExitBTTN.setBounds(408, 175, 89, 23);
		titlePanel.add(ExitBTTN);
		
		//label for displaying account name on title screen
		titleNameLabel = new JLabel("New label");
		titleNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleNameLabel.setBounds(601, 11, 99, 23);
		titlePanel.add(titleNameLabel);
		
		
		//labels for selecting tuning
		tuningInstructionLabel = new JLabel("Please select your tuning");
		tuningInstructionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tuningInstructionLabel.setBounds(171, 11, 268, 14);
		tuningMenu.add(tuningInstructionLabel);
		
		//we have our choice box for displaying every tuning for the instrument
		tuningChoice = new Choice();
		String tunings;
		//query for the tunings
		tunings = myDB.getTunings(instrumentChoice);
		//add all tunings to the box
		Scanner tuningScanner= new Scanner(tunings);
		while(tuningScanner.hasNext())
			{
				tuningChoice.add(tuningScanner.nextLine());
			}
		tuningChoice.setBounds(171, 151, 268, 20);
		tuningChoice.add("Select A Tuning");
		
		tuningMenu.add(tuningChoice);
		
		//buton for moving past the tunings to the game page
		nextButtonTuning = new JButton("Next");
		nextButtonTuning.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//do not let user pass without selecting a tuning
				if((tuningChoice.getSelectedItem().equals("Select A Tuning")))
				{
					JOptionPane.showMessageDialog(frame, "Please select a type of tuning before proceeding");
				}
				else
				{
					//code set for 6 string guitar
					if(instrumentChoice.equals("6 String Guitar"))
					{
						//expand the window
						frame.setBounds(100, 100, 1401, 350);
						//get the fret notes for our tuning for this specific instrument
						String fretNotes = myDB.getFretNotes(tuningChoice.getSelectedItem(), instrumentChoice);
						
						//set the label on the game page to reflect this tuning
						tuningNameLabel.setText(tuningChoice.getSelectedItem());
						Scanner fretScanner = new Scanner(fretNotes);
						//print the notes in the console for reference
						System.out.println(fretNotes);
						int myString = 0;
						while(fretScanner.hasNext())
						{
							
							
								//set the tuning of strings to the correct value, and update the labels on the game page
									stringOneTuning = Integer.parseInt(fretScanner.nextLine());
									stringOneNameLabel.setText("String 1: " + myDB.getNoteName(stringOneTuning));
									myString++;
					
									stringTwoTuning = Integer.parseInt(fretScanner.nextLine());
									stringTwoNameLabel.setText("String 2: " + myDB.getNoteName(stringTwoTuning));
									myString++;
							
									stringThreeTuning = Integer.parseInt(fretScanner.nextLine());
									stringThreeNameLabel.setText("String 3: " + myDB.getNoteName(stringThreeTuning));
									myString++;
								
									stringFourTuning = Integer.parseInt(fretScanner.nextLine());
									stringFourNameLabel.setText("String 4: " + myDB.getNoteName(stringFourTuning));
									myString++;
					
									stringFiveTuning = Integer.parseInt(fretScanner.nextLine());
									stringFiveNameLabel.setText("String 5: " + myDB.getNoteName(stringFiveTuning));
									myString++;
									
									stringSixTuning = Integer.parseInt(fretScanner.nextLine());
									stringSixNameLabel.setText("String 6: " + myDB.getNoteName(stringSixTuning));
								
							
							
						}
						//go to game page
						cl.show(cards, "gamePanel");
						
						
					}
					//other instruments are not set up, so we send this notice
					else
					{
						JOptionPane.showMessageDialog(frame, "Sorry but this instrument is unavailable at this time!");
					}
						

					
				}
				
			}
		});
		nextButtonTuning.setBounds(263, 201, 89, 23);
		tuningMenu.add(nextButtonTuning);
		
		
		//************* MAIN PAGE CODE *********
		
		
		JLabel titleLabel = new JLabel("Fretboard Trainer");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setBounds(257, 35, 174, 14);
		mainPagePanel.add(titleLabel);
		
		JButton MainExitButton = new JButton("Exit");
		MainExitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
				
				
			}
		});
		MainExitButton.setBounds(257, 188, 174, 23);
		mainPagePanel.add(MainExitButton);
		
		JButton loginButton = new JButton("Login");
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl.show(cards, "loginPanel");
				
			}
		});
		loginButton.setBounds(257, 125, 174, 23);
		mainPagePanel.add(loginButton);
		
		//************* END OF MAIN PAGE CODE *********
		
		
		//THIS IS IN-PROGRESS CODE *****************************************************************************************************************************
		//DUE TO TIME CONSTRAINTS THIS SECTION WAS DROPPED
		//MAY DEVELOP FURTHER BUT IS CURRENTLY INACTIVE
		
		lblNewLabel_3 = new JLabel("Please Insert Your Desired Tuning");
		lblNewLabel_3.setBounds(218, 21, 170, 14);
		customTuningPanel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("First String:");
		lblNewLabel_4.setBounds(119, 90, 56, 14);
		customTuningPanel.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Second String:");
		lblNewLabel_5.setBounds(105, 128, 70, 14);
		customTuningPanel.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Third String:");
		lblNewLabel_6.setBounds(116, 170, 59, 14);
		customTuningPanel.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Fourth String:");
		lblNewLabel_7.setBounds(327, 90, 70, 14);
		customTuningPanel.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Fifth String:");
		lblNewLabel_8.setBounds(337, 128, 70, 14);
		customTuningPanel.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Sixth String:");
		lblNewLabel_9.setBounds(338, 170, 59, 14);
		customTuningPanel.add(lblNewLabel_9);
		
		JButton TuningNextButton = new JButton("New button");
		TuningNextButton.setBounds(240, 207, 89, 23);
		customTuningPanel.add(TuningNextButton);
		
		
		
		String notes[] = {"Ab", "A", "A#", "Bb", "B", "C", "C#", "Db", "D", "D#", "Eb", "E", "F", "F#", "Gb", "G", "G#"};
		
		
		
		
		JComboBox lowE_comboBox = new JComboBox(notes);
		lowE_comboBox.setBounds(185, 86, 45, 22);
		customTuningPanel.add(lowE_comboBox);
		
		JComboBox a_comboBox = new JComboBox(notes);
		a_comboBox.setBounds(185, 124, 45, 22);
		customTuningPanel.add(a_comboBox);
		
		JComboBox d_comboBox = new JComboBox(notes);
		d_comboBox.setBounds(185, 166, 45, 22);
		customTuningPanel.add(d_comboBox);
		
		JComboBox g_comboBox = new JComboBox(notes);
		g_comboBox.setBounds(407, 86, 45, 22);
		customTuningPanel.add(g_comboBox);
		
		JComboBox b_comboBox = new JComboBox(notes);
		b_comboBox.setBounds(407, 124, 45, 22);
		customTuningPanel.add(b_comboBox);
		
		JComboBox highE_comboBox = new JComboBox(notes);
		highE_comboBox.setBounds(407, 166, 45, 22);
		customTuningPanel.add(highE_comboBox);
		
		
		//END OF IN-PROGRESS CODE ************************************************************************************************************
		
		//we build the game page to have the correct images assigned to the labels
		selectedLineLabel = new JLabel("");
		//label displays the highlighted line during the game
		selectedLineLabel.setIcon(new ImageIcon(guitarGui.class.getResource("/Images/highlight_line.png")));
		selectedLineLabel.setBounds(10, 2, 1375, 394);
		gamePanel.add(selectedLineLabel);
		//we set this label to be invisible when the game is not active
		selectedLineLabel.setVisible(false);
		
		startResetButton = new JButton("Start");
		//when the start game button is pressed
		startResetButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//if another window is not open, and another game is not running this button will be active
				if(running ==0 && windowLock==false)
				{
					//we note that a game is running
					running++;
					
					int instrumentTuning = myDB.getInstrumentTuningID(tuningChoice.getSelectedItem(), instrumentChoice);
					timeLimit = myDB.getTime(difficulty, instrumentTuning);
					System.out.println("Time: " + timeLimit);
					//we update our labels
					scoreLabel.setText("Score: ");
					selectedLineLabel.setVisible(true);
					score = 0;
					int delay = 1000;
				    int period = 1000;
				    
				    updateGame();
				    
				   
				    
				    //we use a timer to implement the in-game time
					 timer = new Timer();
					// timeLimit = 10;
					 
					    timer.scheduleAtFixedRate(new TimerTask() {

					        public void run() {
					        	//if we run out of time
					        	if (timeLimit <=0)
					        	{
					        		//the orange line goes away
					        		selectedLineLabel.setVisible(false);
					        		//the game ends
					        		running--;
					        		timer.cancel();
					        		timeLabel.setText("Time Remaining: " + timeLimit);
					        		
					        		//we query the high scores for our game with the given tuning and given instrument
					        		int instrumentTuning = myDB.getInstrumentTuningID(tuningChoice.getSelectedItem(), instrumentChoice);
					        		myDB.updateScoreboard(sessionName, score, instrumentTuning, difficulty);
					        		String highScores = myDB.getHighScores(difficulty, instrumentTuning);
					        		
					        		//we then build the scoreboard to display the desired data
					        		Scoreboard mySB = new Scoreboard(userBoardNames,highScores);
					        		userBoardNames = myDB.getHighScoreUserString();
					        		mySB.start(userBoardNames, highScores);
					        		
					        		
					        		//JOptionPane.showMessageDialog(frame, "HIGH SCORES HERE");
					        	}
					        	else
					        	{
					        		
					        	}
					        		
					          
					       
					        timeLabel.setText("Time Remaining: " + timeLimit);
					        timeLimit -=1;
					        }
					    }, delay, period);
					
					
					
					
				}
				//we prevent a game from starting if another window is open
				else if(windowLock == true)
				{
					JOptionPane.showMessageDialog(frame, "Please close other pop up windows before beginning a new game");
				}
				
				
				
				
			}
			
			
				
			
		});
		startResetButton.setBounds(624, 237, 169, 63);
		gamePanel.add(startResetButton);
		
		//make a score label for displaying user's score in real time
		scoreLabel = new JLabel("Score:");
		scoreLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		scoreLabel.setBounds(1221, 0, 119, 34);
		gamePanel.add(scoreLabel);
		
		/*START OF BUTTON MAPPING
		 * 
		 * For the next block of code, the logic is as follows:
		 * 
		 * *************************************    VARIABLES    *************************************
		 * 
 		 * 
		 * answerString - The string that the user should click on when guessing their answer
		 * 
		 * answerIndex - the fret of the guitar that the user should click when guessing their answer
		 * 
		 * selectedString - this variable indicates which string the user clicked on
		 * 			- When playing the game, users should not be penalized for misclicking a string
		 * 			  That they are not being tested on, so we use this to keep track of which strings
		 * 			  are valid answer options and which are not
		 * 
		 * selectedIndex - this variable indicates which fret the user clicked on
		 * 					When clicking on a string
		 * 
		 * 
		 * 		Each fret has values coded to indicate which string it exists on as well as its location on the fretboard
		 * 
		 * 
		 * result - This variable has 3 possible values: 1, 0, -1
		 * 			1 = correct answer; the user clicked the right fret on the right string
		 * 			0 = incorrect answer; the user clicked the wrong fret on the right string
		 * 		   -1 = incorrect string; the clicked the wrong string
		 * 
		 * 
		 * ******************************************************************************************
		 * *************************************    LOGIC    ******************************************
		 * 		every button is made transparent
		 * 
		 * 		when a button is clicked, its fret index and string values are sent to our instance of the Game
		 * 		class with the pre-generated answers to see the user's response
		 * 		
		 * 		if the incorrect string is clicked, we ignore that button press
		 * 		
		 * 		if the correct string is clicked, we check where that click occurred, and then update our score to reflect
		 * 		if the answer was right or wrong, and then update the game to prompt for a new answer set.
		 * 
		 * 
		 */
		
		JButton sixString_1_1 = new JButton("");
		sixString_1_1.setOpaque(false);
		sixString_1_1.setContentAreaFilled(false);
		sixString_1_1.setBorderPainted(false);
		sixString_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selectedIndex = 1;
				selectedString = 0;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
				
			}
		});
		sixString_1_1.setBounds(21, 49, 119, 23);
		gamePanel.add(sixString_1_1);
		
		JButton sixString_1_2 = new JButton("");
		
		sixString_1_2.setOpaque(false);
		sixString_1_2.setContentAreaFilled(false);
		sixString_1_2.setBorderPainted(false);
		sixString_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 2;
				selectedString = 0;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_1_2.setBounds(150, 49, 119, 23);
		gamePanel.add(sixString_1_2);
		
		JButton sixString_1_3 = new JButton("");
		sixString_1_3.setOpaque(false);
		sixString_1_3.setContentAreaFilled(false);
		sixString_1_3.setBorderPainted(false);
		sixString_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 3;
				selectedString = 0;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_1_3.setBounds(277, 49, 111, 23);
		gamePanel.add(sixString_1_3);
		
		JButton sixString_1_4 = new JButton("");
		sixString_1_4.setOpaque(false);
		sixString_1_4.setContentAreaFilled(false);
		sixString_1_4.setBorderPainted(false);
		sixString_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 4;
				selectedString = 0;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_1_4.setBounds(398, 49, 100, 23);
		gamePanel.add(sixString_1_4);
		
		JButton sixString_1_5 = new JButton("");
		sixString_1_5.setOpaque(false);
		sixString_1_5.setContentAreaFilled(false);
		sixString_1_5.setBorderPainted(false);
		sixString_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 5;
				selectedString = 0;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_1_5.setBounds(508, 49, 95, 23);
		gamePanel.add(sixString_1_5);
		
		sixString_1_6 = new JButton("");
		sixString_1_6.setOpaque(false);
		sixString_1_6.setContentAreaFilled(false);
		sixString_1_6.setBorderPainted(false);
		sixString_1_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 6;
				selectedString = 0;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_1_6.setBounds(613, 49, 89, 23);
		gamePanel.add(sixString_1_6);
		
		
		sixString_1_7 = new JButton("");
		sixString_1_7.setOpaque(false);
		sixString_1_7.setContentAreaFilled(false);
		sixString_1_7.setBorderPainted(false);
		sixString_1_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 7;
				selectedString = 0;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_1_7.setBounds(712, 49, 86, 23);
		gamePanel.add(sixString_1_7);
		
		sixString_1_8 = new JButton("");
		sixString_1_8.setOpaque(false);
		sixString_1_8.setContentAreaFilled(false);
		sixString_1_8.setBorderPainted(false);
		sixString_1_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 8;
				selectedString = 0;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_1_8.setBounds(811, 49, 75, 23);
		gamePanel.add(sixString_1_8);
		
		sixString_1_9 = new JButton("");
		sixString_1_9.setOpaque(false);
		sixString_1_9.setContentAreaFilled(false);
		sixString_1_9.setBorderPainted(false);
		sixString_1_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 9;
				selectedString = 0;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_1_9.setBounds(896, 49, 75, 23);
		gamePanel.add(sixString_1_9);
		
		sixString_1_10 = new JButton("");
		sixString_1_10.setOpaque(false);
		sixString_1_10.setContentAreaFilled(false);
		sixString_1_10.setBorderPainted(false);
		sixString_1_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 10;
				selectedString = 0;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_1_10.setBounds(981, 49, 70, 23);
		gamePanel.add(sixString_1_10);
		
		
		sixString_1_11 = new JButton("");
		sixString_1_11.setOpaque(false);
		sixString_1_11.setContentAreaFilled(false);
		sixString_1_11.setBorderPainted(false);
		sixString_1_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 11;
				selectedString = 0;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_1_11.setBounds(1061, 49, 64, 23);
		gamePanel.add(sixString_1_11);
		
		sixString_1_12 = new JButton("");
		sixString_1_12.setOpaque(false);
		sixString_1_12.setContentAreaFilled(false);
		sixString_1_12.setBorderPainted(false);
		sixString_1_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 12;
				selectedString = 0;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_1_12.setBounds(1135, 49, 61, 23);
		gamePanel.add(sixString_1_12);
		
		sixString_1_13 = new JButton("");
		sixString_1_13.setOpaque(false);
		sixString_1_13.setContentAreaFilled(false);
		sixString_1_13.setBorderPainted(false);
		sixString_1_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 13;
				selectedString = 0;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_1_13.setBounds(1206, 49, 57, 23);
		gamePanel.add(sixString_1_13);
		
		sixString_1_14 = new JButton("");
		sixString_1_14.setOpaque(false);
		sixString_1_14.setContentAreaFilled(false);
		sixString_1_14.setBorderPainted(false);
		sixString_1_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 14;
				selectedString = 0;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_1_14.setBounds(1273, 49, 53, 23);
		gamePanel.add(sixString_1_14);
		
		sixString_1_15 = new JButton("");
		sixString_1_15.setOpaque(false);
		sixString_1_15.setContentAreaFilled(false);
		sixString_1_15.setBorderPainted(false);
		sixString_1_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 15;
				selectedString = 0;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_1_15.setBounds(1335, 49, 50, 23);
		gamePanel.add(sixString_1_15);
		
		sixString_2_1 = new JButton("");
		sixString_2_1.setOpaque(false);
		sixString_2_1.setContentAreaFilled(false);
		sixString_2_1.setBorderPainted(false);
		sixString_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 1;
				selectedString = 1;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_2_1.setBounds(15, 75, 126, 23);
		gamePanel.add(sixString_2_1);
		
		sixString_2_2 = new JButton("");
		sixString_2_2.setOpaque(false);
		sixString_2_2.setContentAreaFilled(false);
		sixString_2_2.setBorderPainted(false);
		sixString_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 2;
				selectedString = 1;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_2_2.setBounds(150, 75, 119, 23);
		gamePanel.add(sixString_2_2);
		
		sixString_2_3 = new JButton("");
		sixString_2_3.setOpaque(false);
		sixString_2_3.setContentAreaFilled(false);
		sixString_2_3.setBorderPainted(false);
		sixString_2_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 3;
				selectedString = 1;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_2_3.setBounds(277, 75, 111, 23);
		gamePanel.add(sixString_2_3);
		
		sixString_2_4 = new JButton("");
		sixString_2_4.setOpaque(false);
		sixString_2_4.setContentAreaFilled(false);
		sixString_2_4.setBorderPainted(false);
		sixString_2_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 4;
				selectedString = 1;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_2_4.setBounds(398, 75, 100, 23);
		gamePanel.add(sixString_2_4);
		
		sixString_2_5 = new JButton("");
		sixString_2_5.setOpaque(false);
		sixString_2_5.setContentAreaFilled(false);
		sixString_2_5.setBorderPainted(false);
		sixString_2_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 5;
				selectedString = 1;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_2_5.setBounds(508, 75, 95, 23);
		gamePanel.add(sixString_2_5);
		
		sixString_2_6 = new JButton("");
		sixString_2_6.setOpaque(false);
		sixString_2_6.setContentAreaFilled(false);
		sixString_2_6.setBorderPainted(false);
		sixString_2_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 6;
				selectedString = 1;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_2_6.setBounds(613, 75, 89, 23);
		gamePanel.add(sixString_2_6);
		
		sixString_2_7 = new JButton("");
		sixString_2_7.setOpaque(false);
		sixString_2_7.setContentAreaFilled(false);
		sixString_2_7.setBorderPainted(false);
		sixString_2_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 7;
				selectedString = 1;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_2_7.setBounds(712, 75, 86, 23);
		gamePanel.add(sixString_2_7);
		
		sixString_2_8 = new JButton("");
		sixString_2_8.setOpaque(false);
		sixString_2_8.setContentAreaFilled(false);
		sixString_2_8.setBorderPainted(false);
		sixString_2_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 8;
				selectedString = 1;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_2_8.setBounds(811, 75, 75, 23);
		gamePanel.add(sixString_2_8);
		
		sixString_2_9 = new JButton("");
		sixString_2_9.setOpaque(false);
		sixString_2_9.setContentAreaFilled(false);
		sixString_2_9.setBorderPainted(false);
		sixString_2_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 9;
				selectedString = 1;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_2_9.setBounds(896, 75, 75, 23);
		gamePanel.add(sixString_2_9);
		
		sixString_2_10 = new JButton("");
		sixString_2_10.setOpaque(false);
		sixString_2_10.setContentAreaFilled(false);
		sixString_2_10.setBorderPainted(false);
		sixString_2_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 10;
				selectedString = 1;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_2_10.setBounds(981, 75, 70, 23);
		gamePanel.add(sixString_2_10);
		
		sixString_2_11 = new JButton("");
		sixString_2_11.setOpaque(false);
		sixString_2_11.setContentAreaFilled(false);
		sixString_2_11.setBorderPainted(false);
		sixString_2_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 11;
				selectedString = 1;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_2_11.setBounds(1061, 75, 64, 23);
		gamePanel.add(sixString_2_11);
		
		sixString_2_12 = new JButton("");
		sixString_2_12.setOpaque(false);
		sixString_2_12.setContentAreaFilled(false);
		sixString_2_12.setBorderPainted(false);
		sixString_2_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 12;
				selectedString = 1;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_2_12.setBounds(1135, 75, 61, 23);
		gamePanel.add(sixString_2_12);
		
		sixString_2_13 = new JButton("");
		sixString_2_13.setOpaque(false);
		sixString_2_13.setContentAreaFilled(false);
		sixString_2_13.setBorderPainted(false);
		sixString_2_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 13;
				selectedString = 1;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_2_13.setBounds(1206, 75, 57, 23);
		gamePanel.add(sixString_2_13);
		
		sixString_2_14 = new JButton("");
		sixString_2_14.setOpaque(false);
		sixString_2_14.setContentAreaFilled(false);
		sixString_2_14.setBorderPainted(false);
		sixString_2_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 14;
				selectedString = 1;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_2_14.setBounds(1273, 75, 53, 23);
		gamePanel.add(sixString_2_14);
		
		sixString_2_15 = new JButton("");
		sixString_2_15.setOpaque(false);
		sixString_2_15.setContentAreaFilled(false);
		sixString_2_15.setBorderPainted(false);
		sixString_2_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 15;
				selectedString = 1;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_2_15.setBounds(1335, 75, 50, 23);
		gamePanel.add(sixString_2_15);
		
		sixString_3_1 = new JButton("");
		sixString_3_1.setOpaque(false);
		sixString_3_1.setContentAreaFilled(false);
		sixString_3_1.setBorderPainted(false);
		sixString_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 1;
				selectedString = 2;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_3_1.setBounds(10, 102, 130, 23);
		gamePanel.add(sixString_3_1);
		
		sixString_3_2 = new JButton("");
		sixString_3_2.setOpaque(false);
		sixString_3_2.setContentAreaFilled(false);
		sixString_3_2.setBorderPainted(false);
		sixString_3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 2;
				selectedString = 2;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_3_2.setBounds(150, 102, 119, 23);
		gamePanel.add(sixString_3_2);
		
		sixString_3_3 = new JButton("");
		sixString_3_3.setOpaque(false);
		sixString_3_3.setContentAreaFilled(false);
		sixString_3_3.setBorderPainted(false);
		sixString_3_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 3;
				selectedString = 2;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_3_3.setBounds(277, 102, 111, 23);
		gamePanel.add(sixString_3_3);
		
		sixString_3_4 = new JButton("");
		sixString_3_4.setOpaque(false);
		sixString_3_4.setContentAreaFilled(false);
		sixString_3_4.setBorderPainted(false);
		sixString_3_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 4;
				selectedString = 2;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_3_4.setBounds(398, 102, 100, 23);
		gamePanel.add(sixString_3_4);
		
		sixString_3_5 = new JButton("");
		sixString_3_5.setOpaque(false);
		sixString_3_5.setContentAreaFilled(false);
		sixString_3_5.setBorderPainted(false);
		sixString_3_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 5;
				selectedString = 2;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_3_5.setBounds(508, 102, 95, 23);
		gamePanel.add(sixString_3_5);
		
		sixString_3_6 = new JButton("");
		sixString_3_6.setOpaque(false);
		sixString_3_6.setContentAreaFilled(false);
		sixString_3_6.setBorderPainted(false);
		sixString_3_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 6;
				selectedString = 2;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_3_6.setBounds(613, 102, 89, 23);
		gamePanel.add(sixString_3_6);
		
		sixString_3_7 = new JButton("");
		sixString_3_7.setOpaque(false);
		sixString_3_7.setContentAreaFilled(false);
		sixString_3_7.setBorderPainted(false);
		sixString_3_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 7;
				selectedString = 2;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_3_7.setBounds(712, 102, 86, 23);
		gamePanel.add(sixString_3_7);
		
		sixString_3_8 = new JButton("");
		sixString_3_8.setOpaque(false);
		sixString_3_8.setContentAreaFilled(false);
		sixString_3_8.setBorderPainted(false);
		sixString_3_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 8;
				selectedString = 2;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_3_8.setBounds(811, 102, 75, 23);
		gamePanel.add(sixString_3_8);
		
		sixString_3_9 = new JButton("");
		sixString_3_9.setOpaque(false);
		sixString_3_9.setContentAreaFilled(false);
		sixString_3_9.setBorderPainted(false);
		sixString_3_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 9;
				selectedString = 2;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_3_9.setBounds(896, 102, 75, 23);
		gamePanel.add(sixString_3_9);
		
		sixString_3_10 = new JButton("");
		sixString_3_10.setOpaque(false);
		sixString_3_10.setContentAreaFilled(false);
		sixString_3_10.setBorderPainted(false);
		sixString_3_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 10;
				selectedString = 2;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_3_10.setBounds(981, 102, 70, 23);
		gamePanel.add(sixString_3_10);
		
		sixString_3_11 = new JButton("");
		sixString_3_11.setOpaque(false);
		sixString_3_11.setContentAreaFilled(false);
		sixString_3_11.setBorderPainted(false);
		sixString_3_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 11;
				selectedString = 2;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_3_11.setBounds(1061, 102, 64, 23);
		gamePanel.add(sixString_3_11);
		
		sixString_3_12 = new JButton("");
		sixString_3_12.setOpaque(false);
		sixString_3_12.setContentAreaFilled(false);
		sixString_3_12.setBorderPainted(false);
		sixString_3_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 12;
				selectedString = 2;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_3_12.setBounds(1135, 102, 61, 23);
		gamePanel.add(sixString_3_12);
		
		sixString_3_13 = new JButton("");
		sixString_3_13.setOpaque(false);
		sixString_3_13.setContentAreaFilled(false);
		sixString_3_13.setBorderPainted(false);
		sixString_3_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 13;
				selectedString = 2;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_3_13.setBounds(1206, 102, 57, 23);
		gamePanel.add(sixString_3_13);
		
		sixString_3_14 = new JButton("");
		sixString_3_14.setOpaque(false);
		sixString_3_14.setContentAreaFilled(false);
		sixString_3_14.setBorderPainted(false);
		sixString_3_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 14;
				selectedString = 2;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_3_14.setBounds(1273, 102, 53, 23);
		gamePanel.add(sixString_3_14);
		
		sixString_3_15 = new JButton("");
		sixString_3_15.setOpaque(false);
		sixString_3_15.setContentAreaFilled(false);
		sixString_3_15.setBorderPainted(false);
		sixString_3_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 15;
				selectedString = 2;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_3_15.setBounds(1335, 102, 50, 23);
		gamePanel.add(sixString_3_15);
		
		sixString_4_1 = new JButton("");
		sixString_4_1.setOpaque(false);
		sixString_4_1.setContentAreaFilled(false);
		sixString_4_1.setBorderPainted(false);
		sixString_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 1;
				selectedString = 3;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_4_1.setBounds(10, 131, 130, 23);
		gamePanel.add(sixString_4_1);
		
		sixString_4_2 = new JButton("");
		sixString_4_2.setOpaque(false);
		sixString_4_2.setContentAreaFilled(false);
		sixString_4_2.setBorderPainted(false);
		sixString_4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 2;
				selectedString = 3;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_4_2.setBounds(150, 131, 119, 23);
		gamePanel.add(sixString_4_2);
		
		sixString_4_3 = new JButton("");
		sixString_4_3.setOpaque(false);
		sixString_4_3.setContentAreaFilled(false);
		sixString_4_3.setBorderPainted(false);
		sixString_4_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 3;
				selectedString = 3;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_4_3.setBounds(277, 131, 111, 23);
		gamePanel.add(sixString_4_3);
		
		sixString_4_4 = new JButton("");
		sixString_4_4.setOpaque(false);
		sixString_4_4.setContentAreaFilled(false);
		sixString_4_4.setBorderPainted(false);
		sixString_4_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 4;
				selectedString = 3;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_4_4.setBounds(398, 131, 100, 23);
		gamePanel.add(sixString_4_4);
		
		sixString_4_5 = new JButton("");
		sixString_4_5.setOpaque(false);
		sixString_4_5.setContentAreaFilled(false);
		sixString_4_5.setBorderPainted(false);
		sixString_4_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 5;
				selectedString = 3;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_4_5.setBounds(508, 131, 95, 23);
		gamePanel.add(sixString_4_5);
		
		sixString_4_6 = new JButton("");
		sixString_4_6.setOpaque(false);
		sixString_4_6.setContentAreaFilled(false);
		sixString_4_6.setBorderPainted(false);
		sixString_4_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 6;
				selectedString = 3;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_4_6.setBounds(613, 131, 89, 23);
		gamePanel.add(sixString_4_6);
		
		sixString_4_7 = new JButton("");
		sixString_4_7.setOpaque(false);
		sixString_4_7.setContentAreaFilled(false);
		sixString_4_7.setBorderPainted(false);
		sixString_4_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 7;
				selectedString = 3;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_4_7.setBounds(712, 131, 86, 23);
		gamePanel.add(sixString_4_7);
		
		sixString_4_8 = new JButton("");
		sixString_4_8.setOpaque(false);
		sixString_4_8.setContentAreaFilled(false);
		sixString_4_8.setBorderPainted(false);
		sixString_4_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 8;
				selectedString = 3;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_4_8.setBounds(811, 131, 75, 23);
		gamePanel.add(sixString_4_8);
		
		sixString_4_9 = new JButton("");
		sixString_4_9.setOpaque(false);
		sixString_4_9.setContentAreaFilled(false);
		sixString_4_9.setBorderPainted(false);
		sixString_4_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 9;
				selectedString = 3;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_4_9.setBounds(896, 131, 75, 23);
		gamePanel.add(sixString_4_9);
		
		sixString_4_10 = new JButton("");
		sixString_4_10.setOpaque(false);
		sixString_4_10.setContentAreaFilled(false);
		sixString_4_10.setBorderPainted(false);
		sixString_4_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 10;
				selectedString = 3;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_4_10.setBounds(981, 131, 70, 23);
		gamePanel.add(sixString_4_10);
		
		sixString_4_11 = new JButton("");
		sixString_4_11.setOpaque(false);
		sixString_4_11.setContentAreaFilled(false);
		sixString_4_11.setBorderPainted(false);
		sixString_4_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 11;
				selectedString = 3;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_4_11.setBounds(1061, 131, 64, 23);
		gamePanel.add(sixString_4_11);
		
		sixString_4_12 = new JButton("");
		sixString_4_12.setOpaque(false);
		sixString_4_12.setContentAreaFilled(false);
		sixString_4_12.setBorderPainted(false);
		sixString_4_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 12;
				selectedString = 3;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_4_12.setBounds(1135, 131, 61, 23);
		gamePanel.add(sixString_4_12);
		
		sixString_4_13 = new JButton("");
		sixString_4_13.setOpaque(false);
		sixString_4_13.setContentAreaFilled(false);
		sixString_4_13.setBorderPainted(false);
		sixString_4_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 13;
				selectedString = 3;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_4_13.setBounds(1206, 131, 57, 23);
		gamePanel.add(sixString_4_13);
		
		sixString_4_14 = new JButton("");
		sixString_4_14.setOpaque(false);
		sixString_4_14.setContentAreaFilled(false);
		sixString_4_14.setBorderPainted(false);
		sixString_4_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 14;
				selectedString = 3;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_4_14.setBounds(1273, 131, 53, 23);
		gamePanel.add(sixString_4_14);
		
		sixString_4_15 = new JButton("");
		sixString_4_15.setOpaque(false);
		sixString_4_15.setContentAreaFilled(false);
		sixString_4_15.setBorderPainted(false);
		sixString_4_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 15;
				selectedString = 3;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_4_15.setBounds(1335, 131, 50, 23);
		gamePanel.add(sixString_4_15);
		
		sixString_5_1 = new JButton("");
		sixString_5_1.setOpaque(false);
		sixString_5_1.setContentAreaFilled(false);
		sixString_5_1.setBorderPainted(false);
		sixString_5_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 1;
				selectedString = 4;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_5_1.setBounds(20, 160, 120, 23);
		gamePanel.add(sixString_5_1);
		
		sixString_5_2 = new JButton("");
		sixString_5_2.setOpaque(false);
		sixString_5_2.setContentAreaFilled(false);
		sixString_5_2.setBorderPainted(false);
		sixString_5_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 2;
				selectedString = 4;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_5_2.setBounds(150, 160, 119, 23);
		gamePanel.add(sixString_5_2);
		
		sixString_5_3 = new JButton("");
		sixString_5_3.setOpaque(false);
		sixString_5_3.setContentAreaFilled(false);
		sixString_5_3.setBorderPainted(false);
		sixString_5_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 3;
				selectedString = 4;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_5_3.setBounds(277, 160, 111, 23);
		gamePanel.add(sixString_5_3);
		
		sixString_5_4 = new JButton("");
		sixString_5_4.setOpaque(false);
		sixString_5_4.setContentAreaFilled(false);
		sixString_5_4.setBorderPainted(false);
		sixString_5_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 4;
				selectedString = 4;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_5_4.setBounds(398, 160, 100, 23);
		gamePanel.add(sixString_5_4);
		
		sixString_5_5 = new JButton("");
		sixString_5_5.setOpaque(false);
		sixString_5_5.setContentAreaFilled(false);
		sixString_5_5.setBorderPainted(false);
		sixString_5_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 5;
				selectedString = 4;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_5_5.setBounds(508, 160, 95, 23);
		gamePanel.add(sixString_5_5);
		
		sixString_5_6 = new JButton("");
		sixString_5_6.setOpaque(false);
		sixString_5_6.setContentAreaFilled(false);
		sixString_5_6.setBorderPainted(false);
		sixString_5_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 6;
				selectedString = 4;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_5_6.setBounds(613, 160, 89, 23);
		gamePanel.add(sixString_5_6);
		
		sixString_5_7 = new JButton("");
		sixString_5_7.setOpaque(false);
		sixString_5_7.setContentAreaFilled(false);
		sixString_5_7.setBorderPainted(false);
		sixString_5_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 7;
				selectedString = 4;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_5_7.setBounds(712, 160, 86, 23);
		gamePanel.add(sixString_5_7);
		
		sixString_5_8 = new JButton("");
		sixString_5_8.setOpaque(false);
		sixString_5_8.setContentAreaFilled(false);
		sixString_5_8.setBorderPainted(false);
		sixString_5_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 8;
				selectedString = 4;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_5_8.setBounds(811, 160, 75, 23);
		gamePanel.add(sixString_5_8);
		
		sixString_5_9 = new JButton("");
		sixString_5_9.setOpaque(false);
		sixString_5_9.setContentAreaFilled(false);
		sixString_5_9.setBorderPainted(false);
		sixString_5_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 9;
				selectedString = 4;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_5_9.setBounds(896, 160, 75, 23);
		gamePanel.add(sixString_5_9);
		
		sixString_5_10 = new JButton("");
		sixString_5_10.setOpaque(false);
		sixString_5_10.setContentAreaFilled(false);
		sixString_5_10.setBorderPainted(false);
		sixString_5_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 10;
				selectedString = 4;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_5_10.setBounds(981, 160, 70, 23);
		gamePanel.add(sixString_5_10);
		
		sixString_5_11 = new JButton("");
		sixString_5_11.setOpaque(false);
		sixString_5_11.setContentAreaFilled(false);
		sixString_5_11.setBorderPainted(false);
		sixString_5_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 11;
				selectedString = 4;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_5_11.setBounds(1061, 160, 64, 23);
		gamePanel.add(sixString_5_11);
		
		sixString_5_12 = new JButton("");
		sixString_5_12.setOpaque(false);
		sixString_5_12.setContentAreaFilled(false);
		sixString_5_12.setBorderPainted(false);
		sixString_5_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 12;
				selectedString = 4;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_5_12.setBounds(1135, 160, 61, 23);
		gamePanel.add(sixString_5_12);
		
		sixString_5_13 = new JButton("");
		sixString_5_13.setOpaque(false);
		sixString_5_13.setContentAreaFilled(false);
		sixString_5_13.setBorderPainted(false);
		sixString_5_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 13;
				selectedString = 4;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_5_13.setBounds(1206, 160, 57, 23);
		gamePanel.add(sixString_5_13);
		
		sixString_5_14 = new JButton("");
		sixString_5_14.setOpaque(false);
		sixString_5_14.setContentAreaFilled(false);
		sixString_5_14.setBorderPainted(false);
		sixString_5_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 14;
				selectedString = 4;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_5_14.setBounds(1273, 160, 53, 23);
		gamePanel.add(sixString_5_14);
		
		sixString_5_15 = new JButton("");
		sixString_5_15.setOpaque(false);
		sixString_5_15.setContentAreaFilled(false);
		sixString_5_15.setBorderPainted(false);
		sixString_5_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 15;
				selectedString = 4;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_5_15.setBounds(1335, 160, 50, 23);
		gamePanel.add(sixString_5_15);
		
		sixString_6_1 = new JButton("");
		sixString_6_1.setOpaque(false);
		sixString_6_1.setContentAreaFilled(false);
		sixString_6_1.setBorderPainted(false);
		sixString_6_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 1;
				selectedString = 5;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_6_1.setBounds(20, 188, 120, 23);
		gamePanel.add(sixString_6_1);
		
		sixString_6_2 = new JButton("");
		sixString_6_2.setOpaque(false);
		sixString_6_2.setContentAreaFilled(false);
		sixString_6_2.setBorderPainted(false);
		sixString_6_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 2;
				selectedString = 5;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_6_2.setBounds(150, 188, 119, 23);
		gamePanel.add(sixString_6_2);
		
		sixString_6_3 = new JButton("");
		sixString_6_3.setOpaque(false);
		sixString_6_3.setContentAreaFilled(false);
		sixString_6_3.setBorderPainted(false);
		sixString_6_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 3;
				selectedString = 5;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_6_3.setBounds(277, 188, 111, 23);
		gamePanel.add(sixString_6_3);
		
		sixString_6_4 = new JButton("");
		sixString_6_4.setOpaque(false);
		sixString_6_4.setContentAreaFilled(false);
		sixString_6_4.setBorderPainted(false);
		sixString_6_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 4;
				selectedString = 5;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_6_4.setBounds(398, 188, 100, 23);
		gamePanel.add(sixString_6_4);
		
		sixString_6_5 = new JButton("");
		sixString_6_5.setOpaque(false);
		sixString_6_5.setContentAreaFilled(false);
		sixString_6_5.setBorderPainted(false);
		sixString_6_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 5;
				selectedString = 5;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_6_5.setBounds(508, 188, 95, 23);
		gamePanel.add(sixString_6_5);
		
		sixString_6_6 = new JButton("");
		sixString_6_6.setOpaque(false);
		sixString_6_6.setContentAreaFilled(false);
		sixString_6_6.setBorderPainted(false);
		sixString_6_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 6;
				selectedString = 5;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_6_6.setBounds(613, 188, 89, 23);
		gamePanel.add(sixString_6_6);
		
		sixString_6_7 = new JButton("");
		sixString_6_7.setOpaque(false);
		sixString_6_7.setContentAreaFilled(false);
		sixString_6_7.setBorderPainted(false);
		sixString_6_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 7;
				selectedString = 5;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_6_7.setBounds(712, 188, 86, 23);
		gamePanel.add(sixString_6_7);
		
		sixString_6_8 = new JButton("");
		sixString_6_8.setOpaque(false);
		sixString_6_8.setContentAreaFilled(false);
		sixString_6_8.setBorderPainted(false);
		sixString_6_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 8;
				selectedString = 5;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_6_8.setBounds(811, 188, 75, 23);
		gamePanel.add(sixString_6_8);
		
		sixString_6_9 = new JButton("");
		sixString_6_9.setOpaque(false);
		sixString_6_9.setContentAreaFilled(false);
		sixString_6_9.setBorderPainted(false);
		sixString_6_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 9;
				selectedString = 5;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_6_9.setBounds(896, 188, 75, 23);
		gamePanel.add(sixString_6_9);
		
		sixString_6_10 = new JButton("");
		sixString_6_10.setOpaque(false);
		sixString_6_10.setContentAreaFilled(false);
		sixString_6_10.setBorderPainted(false);
		sixString_6_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 10;
				selectedString = 5;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_6_10.setBounds(981, 188, 70, 23);
		gamePanel.add(sixString_6_10);
		
		sixString_6_11 = new JButton("");
		sixString_6_11.setOpaque(false);
		sixString_6_11.setContentAreaFilled(false);
		sixString_6_11.setBorderPainted(false);
		sixString_6_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 11;
				selectedString = 5;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_6_11.setBounds(1061, 188, 64, 23);
		gamePanel.add(sixString_6_11);
		
		sixString_6_12 = new JButton("");
		sixString_6_12.setOpaque(false);
		sixString_6_12.setContentAreaFilled(false);
		sixString_6_12.setBorderPainted(false);
		sixString_6_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 12;
				selectedString = 5;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_6_12.setBounds(1135, 188, 61, 23);
		gamePanel.add(sixString_6_12);
		
		sixString_6_13 = new JButton("");
		sixString_6_13.setOpaque(false);
		sixString_6_13.setContentAreaFilled(false);
		sixString_6_13.setBorderPainted(false);
		sixString_6_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 13;
				selectedString = 5;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_6_13.setBounds(1206, 188, 57, 23);
		gamePanel.add(sixString_6_13);
		
		sixString_6_14 = new JButton("");
		sixString_6_14.setOpaque(false);
		sixString_6_14.setContentAreaFilled(false);
		sixString_6_14.setBorderPainted(false);
		sixString_6_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				selectedIndex = 14;
				selectedString = 5;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
				
			}
		});
		sixString_6_14.setBounds(1273, 188, 53, 23);
		gamePanel.add(sixString_6_14);
		
		sixString_6_15 = new JButton("");
		sixString_6_15.setOpaque(false);
		sixString_6_15.setContentAreaFilled(false);
		sixString_6_15.setBorderPainted(false);
		sixString_6_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				selectedIndex = 15;
				selectedString = 5;
				
				int result = myGame.checkAnswer(selectedIndex, selectedString, answerIndex, answerString);		
				updateScore(result);
				if(result!=-1 && timeLimit > 0)
					updateGame();
			}
		});
		sixString_6_15.setBounds(1335, 188, 50, 23);
		gamePanel.add(sixString_6_15);
		
		
		/*END OF BUTTON MAPPING CODE *****************************************************************************************************************************************************
		 */
		
		//Timer label creation
		timeLabel = new JLabel("Remaining Time: ");
		timeLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		timeLabel.setBounds(250, 0, 233, 34);
		gamePanel.add(timeLabel);
		
		//This label will prompt the user for the note to find
		locateNoteLabel = new JLabel("Note: ");
		locateNoteLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		locateNoteLabel.setBounds(624, 0, 169, 34);
		gamePanel.add(locateNoteLabel);
		
		
		//this is the underlying image of the guitar neck
		JLabel fretboardLabel = new JLabel("");
		fretboardLabel.setIcon(new ImageIcon(guitarGui.class.getResource("/Images/guitarneck.png")));
		fretboardLabel.setBounds(0, 0, 1820, 261);
		gamePanel.add(fretboardLabel);
		
		
		tuningNameLabel.setBounds(886, 237, 100, 14);
		
		gamePanel.add(tuningNameLabel);
		
		
		
		/*
		 * 
		 * This section of code creates the labels that inform the user of the tuning of each specific string within the given guitar tuning
		 */
		stringOneNameLabel = new JLabel("String 1:");
		
		
		stringOneNameLabel.setBounds(1061, 237, 64, 14);
		gamePanel.add(stringOneNameLabel);
		
		stringTwoNameLabel = new JLabel("String 2:");
		stringTwoNameLabel.setText(myDB.getNoteName(stringTwoTuning));
		stringTwoNameLabel.setBounds(1061, 261, 64, 14);
		gamePanel.add(stringTwoNameLabel);
		
		stringThreeNameLabel = new JLabel("String 3: ");
		stringOneNameLabel.setText(myDB.getNoteName(stringOneTuning));
		stringThreeNameLabel.setBounds(1061, 286, 64, 14);
		gamePanel.add(stringThreeNameLabel);
		
		stringFourNameLabel = new JLabel("String 4: ");
		stringFourNameLabel.setBounds(1168, 237, 64, 14);
		gamePanel.add(stringFourNameLabel);
		
		stringFiveNameLabel = new JLabel("String 5:");
		stringFiveNameLabel.setBounds(1168, 261, 64, 14);
		gamePanel.add(stringFiveNameLabel);
		
		stringSixNameLabel = new JLabel("String 6:");
		stringSixNameLabel.setBounds(1168, 286, 64, 14);
		gamePanel.add(stringSixNameLabel);
		
		//END OF SECTION *************************************************************************************************************
		
		
		//this button allows users to adjust the difficulty of the game
		JButton difficultyButton = new JButton("Difficulty");
		difficultyButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)  {
				
				//we only allow this if a game instance is not running
				if(timeLimit <= 0) {
					DifficultyWindow window = new DifficultyWindow();
					//open difficulty window
					window.start();
					
					
				}
				
			
				
			}
			
			
		});
		
		
		difficultyButton.setBounds(44, 257, 89, 23);
		gamePanel.add(difficultyButton);
		
		//difficulty label; by default the values are set to normal
		difficultyNameLabel = new JLabel("Difficulty: Normal ");
		difficultyNameLabel.setBounds(183, 261, 137, 14);
		gamePanel.add(difficultyNameLabel);
		
		
		//this is the the text box that users type their username into
		//
		userNameBox = new JTextField();
		userNameBox.setBounds(293, 55, 86, 20);
		LoginPanel.add(userNameBox);
		userNameBox.setColumns(10);
		
		//the text box users type their password into
		passBox = new JPasswordField();
		passBox.setBounds(293, 122, 86, 20);
		LoginPanel.add(passBox);
		
		//labels for username box
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		usernameLabel.setBounds(293, 30, 86, 14);
		LoginPanel.add(usernameLabel);
		
		//label for password box
		JLabel passLabel = new JLabel("Password");
		passLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passLabel.setBounds(293, 97, 86, 14);
		LoginPanel.add(passLabel);
		
		//login button
		accountLogButton = new JButton("Login");
		accountLogButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//we check if the login was successful
				int result = myDB.login(userNameBox.getText(),passBox.getText());
				/*possible values of result: 1, 0 , -1
				
				1 = successful login
				0 = incorrect login credentials
				-1 = database error
				*/
				
				//if login is successful
				//we go to the title page and update the session name to reflect the current user
				//as well as update a label on the title page to display the username
				if(result > 0)
				{
					
					sessionName = userNameBox.getText();
					titleNameLabel.setText(sessionName);
					cl.show(cards, "title");
				}
				else if(result ==0)
				{
					JOptionPane.showMessageDialog(frame, "Incorrect Login Credentials");
				}
				
			}
		});
		accountLogButton.setBounds(234, 167, 201, 23);
		LoginPanel.add(accountLogButton);
		
		//button to create a new account
		createAccountButton = new JButton("Create Account");
		createAccountButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*possible values of result:  1, 0 , -1
				
				 * 1 = successful login
				 * 0 = username is taken
				 *-1 = database error
				 */
				int result = myDB.createAccount(userNameBox.getText(), passBox.getText());
				//if the account was created succesfully we create a dialog box to inform the user
				if(result ==1)
					JOptionPane.showMessageDialog(frame, "Account successfully created!");
				else if(result == 0)
					//if the account name is taken we create a dialog box to inform the user
					JOptionPane.showMessageDialog(frame, "Desired username is taken");
				//System.out.println(result);
			}
		});
		createAccountButton.setBounds(234, 215, 201, 23);
		LoginPanel.add(createAccountButton);
		
	
		
		
	 
		
		
	}
	/*
	 * 
	 * This method updates the score of the game while it is running
	 * and then calls for the correct note audio to play
	 * 
	 */
	static void updateScore(int result)
	{
		//if the answer is right and the game is still going
		if(result == 1 && timeLimit > 0)
		{
			
			//DBase myDB = new DBase(null,null);
			
			//we create a new Note instance
			Note myNote = new Note();
			//increase the score
			score++; 
			int tuning = 0;
			
			
			//we find which string our user clicked on and save that information
		    switch(answerString)
		    {
		    case 0:
		    	tuning = stringOneTuning;
		    	
		    	
		    	break;
		    case 1:
		    	tuning = stringTwoTuning;
		    	
		    	break;
		    case 2:
		    	tuning = stringThreeTuning;
		    	
		    	
		    	break;
		    case 3:
		    	tuning = stringFourTuning;
		    
		    	
		    	break;
		    case 4:
		    	tuning = stringFiveTuning;
		 
		    	
		    	break;
		    case 5:
		    	tuning = stringSixTuning;
		 
		    	
		    	break;
		    }
		    //we then focus in on the specific note that the user clicked
		    //given the fretboard location and tuning of the guitar
		   int noteIndex = myNote.getNote(tuning, answerIndex); 
			
		   //we then get the filepathing to that desired note
		   String notePath = myDB.getNotePath(noteIndex);
			
			
			
			
			
			
			
			
			
			//we then play the note
			playNote(notePath);
			//update the score label
			scoreLabel.setText("Score: "+ score );
			
		}
		//if the answer is wrong, and we are on normal difficulty, users lose one point
		else if(result == 0 && difficulty == 1 && timeLimit > 0)
		{
			score--;
			scoreLabel.setText("Score: "+ score );
		}
		//if the answer is wrong and the game is on hard, the game ends
		else if(result == 0 && difficulty == 2 && timeLimit > 0)
		{
			timeLimit = 0;
		}
		
		
	}
	static void updateGame()
	{
		Game myGame = new Game();
		Note myNote = new Note();
		//DBase myDB = new DBase(null,null);
		int tuning = 0;
		//generate new fret index to quiz users on
		answerIndex = myGame.getGuitarFret();
		//generate new string to quiz users on
	    answerString = myGame.getGuitarString();
	   
	    //based on the generated answerString
	    //we set our tuning to the tuning of that string
	    switch(answerString)
	    {
	    case 0:
	    	tuning = stringOneTuning;
	    	selectedLineLabel.setBounds(10, -137, 1375, 394);
	    	
	    	break;
	    case 1:
	    	tuning = stringTwoTuning;
	    	selectedLineLabel.setBounds(10, -109, 1375, 394);
	    
	    	break;
	    case 2:
	    	tuning = stringThreeTuning;
	    	selectedLineLabel.setBounds(10, -82, 1375, 394);
	    	
	    	break;
	    case 3:
	    	tuning = stringFourTuning;
	    	selectedLineLabel.setBounds(10, -54, 1375, 394);
	    	
	    	break;
	    case 4:
	    	tuning = stringFiveTuning;
	    	selectedLineLabel.setBounds(10, -26, 1375, 394); 
	    	
	    	break;
	    case 5:
	    	tuning = stringSixTuning;
	    	selectedLineLabel.setBounds(10, 2, 1375, 394);
	    	
	    	break;
	    }
	    
	    //our note is the # of frets up from that tuning
	    //and we get that value from getNote
	   int noteIndex = myNote.getNote(tuning, answerIndex); 
	   //we then name the note we want the user to find
	   locateNoteLabel.setText("Find: " + myDB.getNoteName(noteIndex));
	}
	//plays audio of the note 
	//clicked in a correct answer
	static void playNote(String path){
	    File myNote = new File(path);
	    

	    try{
	        Clip noteAudio = AudioSystem.getClip();
	        noteAudio.open(AudioSystem.getAudioInputStream(myNote));
	        noteAudio.start();
	    } catch (Exception e){
	        e.printStackTrace();
	    }
	}
	
}
