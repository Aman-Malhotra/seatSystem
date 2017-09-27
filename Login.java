package p3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java. sql.*;
public class Login {

	public JFrame framel;
	private JTextField textField;
	private JTextField textField_1;
	Connection	con;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.framel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	 Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		framel = new JFrame();
		framel.getContentPane().setBackground(new Color(240, 230, 140));
		framel.getContentPane().setForeground(Color.RED);
		framel.getContentPane().setFont(new Font("Symbol", Font.BOLD, 14));
		framel.setBounds(100, 100, 450, 300);
		framel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framel.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("USERNAME :");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblUsername.setBounds(60, 49, 103, 14);
		framel.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("PASSWORD :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(60, 90, 117, 19);
		framel.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setToolTipText("enter text between 6-12 characters");
		textField.setBounds(187, 48, 86, 20);
		framel.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(187, 91, 86, 20);
		framel.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBackground(new Color(255, 228, 181));
		
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
					boolean b = false;
					try
					{

						Class.forName("com.mysql.jdbc.Driver");
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sign_in","root","bce");
					}
					catch(Exception ev)
					{
						ev.printStackTrace();
					}
					
					
					PreparedStatement pst;
					try {
						pst = con.prepareStatement("Select * from t1");
					 
				
						ResultSet rs = pst.executeQuery();
						
						while(rs.next())
						{
							
							if(  (rs.getString("username")).equals(  ((String)textField.getText()) ) && (rs.getString("password")).equals((String)textField_1.getText())  )
							{   
								b = true;
								framel.dispose();
								Seat wind = new Seat();
								wind.frames.setVisible(true);
//								JOptionPane.showMessageDialog(null, "SIGNED IN");
							}
							
						}
						
						if(b==false)
							JOptionPane.showMessageDialog(null, "Incorrect \"User ID\" OR \"Password\"");
						
						pst.close();
					
					}	
					catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
						
					
			
		
		}	
			
		});
		btnLogin.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnLogin.setBounds(60, 161, 89, 23);
		framel.getContentPane().add(btnLogin);
		
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.setBackground(new Color(255, 222, 173));
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
				framel.dispose();
				Details wind = new Details();
				wind.framed.setVisible(true);
			}
		});
		btnSignUp.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnSignUp.setBounds(173, 162, 89, 23);
		framel.getContentPane().add(btnSignUp);
	}
}
