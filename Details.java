package p3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Details {

	public JFrame framed;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	Connection mycon;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					Details window = new Details();
					window.framed.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Details() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		framed = new JFrame();
		framed.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 12));
		framed.setBounds(100, 100, 450, 300);
		framed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framed.getContentPane().setLayout(null);
		
		JLabel lblFName = new JLabel("Firstname  :");
		lblFName.setBounds(47, 42, 63, 14);
		framed.getContentPane().add(lblFName);
		
		JLabel lblLName = new JLabel("Lasttname  :");
		lblLName.setBounds(47, 81, 63, 14);
		framed.getContentPane().add(lblLName);
		
		
		JLabel lblEmail = new JLabel("E-MAIL  :");
		lblEmail.setBounds(47, 158, 63, 14);
		framed.getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("PASSWORD :");
		lblPassword.setBounds(38, 189, 77, 14);
		framed.getContentPane().add(lblPassword);
		
		JLabel lblMobile = new JLabel("MOBILE :");
		lblMobile.setBounds(47, 228, 63, 14);
		framed.getContentPane().add(lblMobile);
		
		textField = new JTextField();
		textField.setBounds(120, 39, 141, 20);
		framed.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 78, 141, 20);
		framed.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(120, 115, 141, 20);
		framed.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(120, 155, 141, 20);
		framed.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(120, 186, 141, 20);
		framed.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		
		textField_5 = new JTextField();
		textField_5.setBounds(120, 227, 141, 20);
		framed.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				//added jdbc for signup
				

				boolean b = false;
				try
				{

					Class.forName("com.mysql.jdbc.Driver");
					mycon = DriverManager.getConnection("jdbc:mysql://localhost:3306/sign_in","root","bce");
				}
				catch(Exception ev)
				{
					ev.printStackTrace();
				}
				PreparedStatement pst;
				  try
					{
						pst = mycon.prepareStatement("insert into t1 values(?,?,?,?,?,?)");
						pst.setString(1, textField.getText());	
						pst.setString(2, textField_1.getText());
						pst.setString(4, textField_2.getText());
						pst.setString(3, textField_3.getText());
						pst.setString(5, textField_4.getText());
						pst.setString(6, textField_5.getText());
						pst.executeUpdate();
						
					}
					
               catch(Exception e)
                       {}  ;
                       
                       if( ( (String)textField.getText() ).equals("") || ((String)textField_1.getText()).equals("") || ((String)textField_2.getText()).equals("") || ((String)textField_3.getText()).equals("") || ((String)textField_4.getText()).equals("") || ((String)textField_5.getText()).equals(""))
   					{   b=false;
                       JOptionPane.showMessageDialog(null, "Incorrect DETAILS");
                      }
				//added jdbc for signup
                       else
                       {
                    	   b=true;
				framed.dispose();
				 JOptionPane.showMessageDialog(null, "signup successfull");
				Login log=new Login();
				log.framel.setVisible(true);
			}}

			private void elseif(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnSignUp.setBounds(320, 227, 89, 23);
		framed.getContentPane().add(btnSignUp);
		
		JLabel lblFillUpThe = new JLabel("FILL UP THE DETAILS");
		lblFillUpThe.setBounds(80, 11, 208, 14);
		framed.getContentPane().add(lblFillUpThe);
		
		JLabel lblUsername = new JLabel("USERNAME :");
		lblUsername.setBounds(39, 118, 71, 14);
		framed.getContentPane().add(lblUsername);
		
		
	}

}
