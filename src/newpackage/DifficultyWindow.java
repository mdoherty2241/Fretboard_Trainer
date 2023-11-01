/*
 * 
 * This class allows the user to set the difficulty of the fretboard training game
 * 
 * 
 * 
 */
package newpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Choice;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DifficultyWindow {

	protected static int difficultyValue = -1;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					DifficultyWindow window = new DifficultyWindow();
					
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
	public DifficultyWindow() {
		//we set a window lock so that the difficulty cannot be updated midgame
		guitarGui.windowLock = true;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	
		//adds an escape button to close the window
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				frame.dispose();
			}
		});
		cancelButton.setBounds(57, 200, 89, 23);
		frame.getContentPane().add(cancelButton);
		
		//adds the box for users to select difficulty choices
		Choice difficultyChoice = new Choice();
		difficultyChoice.setBounds(153, 30, 99, 20);
		
		difficultyChoice.add("Easy");
		difficultyChoice.add("Normal");
		difficultyChoice.add("Hard");
		frame.getContentPane().add(difficultyChoice);
		
		//if confirm is clicked, we update the difficulty value for the game and close the window
		JButton confirmButton = new JButton("Confirm");
		confirmButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switch(difficultyChoice.getSelectedItem())
				{
				case "Easy":
					difficultyValue = 3;
					guitarGui.difficulty = difficultyValue;
					guitarGui.difficultyNameLabel.setText("Difficulty: " + difficultyChoice.getSelectedItem());
					guitarGui.windowLock = false;
					frame.dispose();
					return;
				case "Normal":
					difficultyValue = 1;
					guitarGui.difficulty = difficultyValue;
					guitarGui.difficultyNameLabel.setText("Difficulty: " + difficultyChoice.getSelectedItem());
					guitarGui.windowLock = false;
					frame.dispose();
					return;
				case "Hard":
					difficultyValue = 2;
					guitarGui.difficulty = difficultyValue;
					guitarGui.difficultyNameLabel.setText("Difficulty: " + difficultyChoice.getSelectedItem());
					guitarGui.windowLock = false;
					frame.dispose();
					return;
				default:
					JOptionPane.showMessageDialog(frame, "Please select a type of difficulty before proceeding");
				}
				
				
				
			}
		});
		confirmButton.setBounds(245, 200, 89, 23);
		frame.getContentPane().add(confirmButton);
		
		
		JLabel lblNewLabel = new JLabel("Select Difficulty");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(153, 10, 99, 14);
		frame.getContentPane().add(lblNewLabel);
		
		//description labels *****************************************
		JLabel easyDescriptionLabel = new JLabel("Easy: Users are not penalized for incorrect answers");
		easyDescriptionLabel.setBounds(35, 68, 318, 23);
		frame.getContentPane().add(easyDescriptionLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Normal: Users lose a point for incorrect answers");
		lblNewLabel_1.setBounds(35, 102, 280, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Hard: The game ends if the User gets an answer wrong");
		lblNewLabel_2.setBounds(35, 133, 318, 14);
		frame.getContentPane().add(lblNewLabel_2);
	}
	
}
