package p3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;

public class Seat {

	public JFrame frames;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Seat window = new Seat();
					window.frames.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Seat() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frames = new JFrame();
		frames.getContentPane().setBackground(SystemColor.info);
		frames.getContentPane().setForeground(Color.GRAY);
		frames.setBounds(100, 100, 450, 300);
		frames.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frames.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(65, 41, 52, 23);
		frames.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("2");
		button.setBackground(Color.GRAY);
		button.setBounds(133, 41, 59, 23);
		frames.getContentPane().add(button);
		
		JButton button_1 = new JButton("3");
		button_1.setBackground(Color.GRAY);
		button_1.setForeground(Color.BLACK);
		button_1.setBounds(202, 41, 60, 23);
		frames.getContentPane().add(button_1);
		
		JButton btnNewButton_1 = new JButton("4");
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setBounds(272, 41, 66, 23);
		frames.getContentPane().add(btnNewButton_1);
		
		JButton button_2 = new JButton("5");
		button_2.setBackground(Color.GRAY);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_2.setBounds(65, 75, 54, 23);
		frames.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("6");
		button_3.setBackground(Color.GRAY);
		button_3.setBounds(133, 75, 59, 23);
		frames.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("7");
		button_4.setBackground(Color.GRAY);
		button_4.setBounds(202, 75, 60, 23);
		frames.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("8");
		button_5.setBackground(Color.GRAY);
		button_5.setBounds(272, 75, 66, 23);
		frames.getContentPane().add(button_5);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.setBackground(Color.GRAY);
		btnNewButton_2.setBounds(65, 109, 52, 23);
		frames.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("10");
		btnNewButton_3.setBackground(Color.GRAY);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_3.setBounds(133, 109, 59, 23);
		frames.getContentPane().add(btnNewButton_3);
		
		JButton button_6 = new JButton("11");
		button_6.setBackground(Color.GRAY);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_6.setBounds(202, 109, 60, 23);
		frames.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("12");
		button_7.setBackground(Color.GRAY);
		button_7.setBounds(272, 109, 66, 23);
		frames.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("13");
		button_8.setBackground(Color.GRAY);
		button_8.setBounds(65, 143, 52, 23);
		frames.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("14");
		button_9.setBackground(Color.GRAY);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_9.setBounds(133, 143, 59, 23);
		frames.getContentPane().add(button_9);
		
		JButton btnNewButton_4 = new JButton("15");
		btnNewButton_4.setBackground(Color.GRAY);
		btnNewButton_4.setBounds(202, 143, 60, 23);
		frames.getContentPane().add(btnNewButton_4);
		
		JButton button_10 = new JButton("16");
		button_10.setBackground(Color.GRAY);
		button_10.setBounds(272, 143, 66, 23);
		frames.getContentPane().add(button_10);
		
		JButton btnNewButton_5 = new JButton("17");
		btnNewButton_5.setBackground(Color.GRAY);
		btnNewButton_5.setBounds(65, 177, 52, 23);
		frames.getContentPane().add(btnNewButton_5);
		
		JButton button_11 = new JButton("18");
		button_11.setBackground(Color.GRAY);
		button_11.setBounds(133, 177, 59, 23);
		frames.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("19");
		button_12.setBackground(Color.GRAY);
		button_12.setBounds(203, 177, 59, 23);
		frames.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("20");
		button_13.setBackground(Color.GRAY);
		button_13.setBounds(272, 177, 66, 23);
		frames.getContentPane().add(button_13);
		
		JLabel lblScreenThisSide = new JLabel("       SCREEN THIS SIDE");
		lblScreenThisSide.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 17));
		lblScreenThisSide.setBounds(86, 222, 233, 14);
		frames.getContentPane().add(lblScreenThisSide);
		
		JButton btnSelected = new JButton("SELECTED");
		btnSelected.setBackground(Color.LIGHT_GRAY);
		btnSelected.setForeground(Color.BLACK);
		btnSelected.setFont(new Font("Verdana", Font.BOLD, 10));
		btnSelected.setBounds(294, 218, 89, 23);
		frames.getContentPane().add(btnSelected);
	}

}
