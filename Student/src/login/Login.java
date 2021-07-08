package login;

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JTextField;

import menu.Menu;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JTextField user;
	private JPasswordField pass;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Login() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 637, 497);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN PANEL");
		lblNewLabel.setForeground(new Color(0, 51, 153));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBounds(208, 164, 205, 67);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username  :");
		lblUsername.setForeground(new Color(0, 0, 51));
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblUsername.setBounds(129, 242, 144, 32);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password   :");
		lblPassword.setForeground(new Color(0, 0, 51));
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblPassword.setBounds(129, 310, 144, 32);
		frame.getContentPane().add(lblPassword);
		
		user = new JTextField();
		user.setFont(new Font("Tahoma", Font.PLAIN, 16));
		user.setBounds(268, 242, 227, 32);
		frame.getContentPane().add(user);
		user.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","akshay");
					Statement stmt=conn.createStatement();
					String sql="Select * from id where userName='"+user.getText()+"'and password ='"+pass.getText()+"'";
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next())
					{
					
					JOptionPane.showMessageDialog(null,"[    Login sucessfully    ]");
					new Menu().setVisible(true);
					frame.dispose();
					}
					else
					JOptionPane.showMessageDialog(null,"[    FAILED    ]");
					
					}
					catch(Exception E)
					{
						System.out.println(E);
					}
				
				
				
				
				
			}
		});
		btnLogin.setBackground(new Color(51, 102, 255));
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLogin.setBounds(255, 379, 108, 37);
		frame.getContentPane().add(btnLogin);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Extra\\PROJECT\\Student Database Management\\Student\\Resources\\Avatar.png"));
		lblNewLabel_2.setBounds(243, 35, 130, 130);
		frame.getContentPane().add(lblNewLabel_2);
		
		pass = new JPasswordField();
		pass.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pass.setBounds(268, 310, 227, 32);
		frame.getContentPane().add(pass);
		
		JLabel bgl = new JLabel("");
		bgl.setIcon(new ImageIcon("D:\\Extra\\PROJECT\\Student Database Management\\Student\\Resources\\BG-LOGIN.jpg"));
		bgl.setBounds(0, 0, 621, 458);
		frame.getContentPane().add(bgl);
	}
}
