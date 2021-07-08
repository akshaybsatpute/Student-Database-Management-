package search;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import menu.Menu;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Search extends JFrame {

	private JPanel contentPane;
	private JTextField rollno;
	private JTextField name;
	private JTextField age;
	private JTextField branch;
	private JTextField gender;
	private JTextField mob;
	private JTextField year;
	private JTextField email;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search frame = new Search();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Search() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 854, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSearchPanel = new JLabel("SEARCH PANEL");
		lblSearchPanel.setForeground(new Color(0, 0, 153));
		lblSearchPanel.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblSearchPanel.setBounds(269, 11, 366, 60);
		contentPane.add(lblSearchPanel);
		
		JLabel lblEnterTheRoll = new JLabel("Enter the Roll No  :");
		lblEnterTheRoll.setForeground(new Color(0, 0, 153));
		lblEnterTheRoll.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblEnterTheRoll.setBounds(44, 97, 200, 31);
		contentPane.add(lblEnterTheRoll);
		
		rollno = new JTextField();
		rollno.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rollno.setColumns(10);
		rollno.setBounds(243, 94, 141, 36);
		contentPane.add(rollno);
		
		
		JLabel label = new JLabel("Name        :");
		label.setForeground(new Color(0, 0, 153));
		label.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label.setBounds(44, 170, 122, 31);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Age           :");
		label_1.setForeground(new Color(0, 0, 153));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label_1.setBounds(44, 225, 133, 31);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Branch      :");
		label_2.setForeground(new Color(0, 0, 153));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label_2.setBounds(44, 280, 133, 31);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Gender      :");
		label_3.setForeground(new Color(0, 0, 153));
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label_3.setBounds(44, 335, 151, 31);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Mobile No  :");
		label_4.setForeground(new Color(0, 0, 153));
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label_4.setBounds(44, 390, 133, 31);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Year          :");
		label_5.setForeground(new Color(0, 0, 153));
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label_5.setBounds(44, 445, 133, 31);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Email ID    :");
		label_6.setForeground(new Color(0, 0, 153));
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label_6.setBounds(44, 500, 133, 31);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("Address     :");
		label_7.setForeground(new Color(0, 0, 153));
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label_7.setBounds(44, 555, 151, 31);
		contentPane.add(label_7);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 16));
		name.setColumns(10);
		name.setBounds(181, 165, 306, 36);
		contentPane.add(name);
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.PLAIN, 16));
		age.setColumns(10);
		age.setBounds(181, 225, 306, 36);
		contentPane.add(age);
		
		branch = new JTextField();
		branch.setFont(new Font("Tahoma", Font.PLAIN, 16));
		branch.setColumns(10);
		branch.setBounds(181, 280, 306, 36);
		contentPane.add(branch);
		
		gender = new JTextField();
		gender.setFont(new Font("Tahoma", Font.PLAIN, 16));
		gender.setColumns(10);
		gender.setBounds(181, 335, 306, 36);
		contentPane.add(gender);
		
		mob = new JTextField();
		mob.setFont(new Font("Tahoma", Font.PLAIN, 16));
		mob.setColumns(10);
		mob.setBounds(181, 390, 306, 36);
		contentPane.add(mob);
		
		year = new JTextField();
		year.setFont(new Font("Tahoma", Font.PLAIN, 16));
		year.setColumns(10);
		year.setBounds(181, 445, 306, 36);
		contentPane.add(year);
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.PLAIN, 16));
		email.setColumns(10);
		email.setBounds(181, 500, 306, 36);
		contentPane.add(email);
		
		JTextArea address = new JTextArea();
		address.setFont(new Font("Monospaced", Font.PLAIN, 16));
		address.setBounds(181, 555, 306, 67);
		contentPane.add(address);
		
		JLabel im = new JLabel("");
		im.setBackground(Color.WHITE);
		im.setBorder(new LineBorder(new Color(0, 0, 153), 3, true));
		im.setBounds(568, 239, 200, 250);
		contentPane.add(im);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(568, 239, 200, 250);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblProfilePicture = new JLabel("Profile Picture ");
		lblProfilePicture.setForeground(new Color(0, 0, 153));
		lblProfilePicture.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblProfilePicture.setBounds(597, 197, 165, 31);
		contentPane.add(lblProfilePicture);
		
		JButton clear = new JButton("CLEAR");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText("");
				age.setText("");
				branch.setText("");
				gender.setText("");
				mob.setText("");
				year.setText("");
				email.setText("");
				address.setText("");
				im.setIcon(null);
			}
		});
		clear.setForeground(Color.WHITE);
		clear.setFont(new Font("Tahoma", Font.BOLD, 20));
		clear.setBackground(new Color(0, 0, 153));
		clear.setBounds(582, 95, 111, 36);
		contentPane.add(clear);
		

		JButton Search = new JButton("SEARCH");
		Search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/std_data","root","akshay");
					String sql="select * from data where Roll_No=?";
					PreparedStatement pstmt=conn.prepareStatement(sql);
					pstmt.setLong(1, Integer.parseInt(rollno.getText()));
					ResultSet rs =pstmt.executeQuery();
					if(rs.next())
					{
						name.setText(rs.getString(1));
						age.setText(rs.getString(3));
						branch.setText(rs.getString(4));
						gender.setText(rs.getString(5));
						mob.setText(rs.getString(6));
						year.setText(rs.getString(7));
						email.setText(rs.getString(8));
						address.setText(rs.getString(9));
						byte[] image=rs.getBytes(10);
						im.setIcon(new ImageIcon(image));
						
					}
					else
					{
						JOptionPane.showMessageDialog(null, "[	Record Not Found  ]");
					}
					conn.close();
					}
					catch(Exception E)
					{
						System.out.println(E);
					}
			}
		});
		Search.setForeground(Color.WHITE);
		Search.setFont(new Font("Tahoma", Font.BOLD, 20));
		Search.setBackground(new Color(0, 0, 153));
		Search.setBounds(436, 95, 122, 36);
		contentPane.add(Search);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu().setVisible(true);
				dispose();
				
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBackground(new Color(0, 0, 153));
		btnBack.setBounds(717, 95, 111, 36);
		contentPane.add(btnBack);
		
		JLabel BG = new JLabel("");
		BG.setIcon(new ImageIcon("Resources\\BG-SEARCH.jpg"));
		BG.setBounds(0, 0, 838, 641);
		contentPane.add(BG);
	}
}
