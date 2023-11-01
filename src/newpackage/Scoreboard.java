package newpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Scoreboard {

	private JFrame frame;
	static String scoreNames;
	static String highScores;
	/**
	 * Launch the application.
	 */
	public static void start(String names, String scores) {
		scoreNames = names;
		highScores = scores;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scoreboard window = new Scoreboard(names, scores);
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
	public Scoreboard(String names, String scores) {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		/*
		 * This class essentially creates a window with labels, and assigns the queried data from the scoreboard query search
		 * to the labels
		 * 
		 */
		
		
		frame = new JFrame();
		
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		frame.getContentPane().setLayout(null);
		
		JLabel DescriptionScoreLabel = new JLabel("Leadeboard");
		DescriptionScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		DescriptionScoreLabel.setBounds(147, 11, 93, 29);
		frame.getContentPane().add(DescriptionScoreLabel);
		
		//displays the names of the users with the highest scores
		JLabel nameLabel = new JLabel("names");
		nameLabel.setVerticalAlignment(SwingConstants.TOP);
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nameLabel.setBounds(100, 65, 93, 170);
		nameLabel.setText(scoreNames);
		frame.getContentPane().add(nameLabel);
		//displays the highest scores
		JLabel scoreLabel = new JLabel("Scores");
		scoreLabel.setVerticalAlignment(SwingConstants.TOP);
		scoreLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		scoreLabel.setBounds(203, 65, 93, 170);
		scoreLabel.setText(highScores);
		frame.getContentPane().add(scoreLabel);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(115, 37, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Score");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(220, 40, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
