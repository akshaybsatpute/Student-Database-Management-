package add;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

import menu.Menu;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import java.awt.Dimension;

public class Add extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField age;
	private JTextField mob;
	private JTextField email;
	private JTextField rollno;
	byte[] photo=null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add frame = new Add();
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
	public Add() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 891, 690);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu().setVisible(true);
				dispose();
			}
		});
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setMinimumSize(new Dimension(200, 250));
		desktopPane.setMaximumSize(new Dimension(200, 250));
		desktopPane.setBackground(Color.WHITE);
		desktopPane.setBounds(606, 106, 200, 250);
		contentPane.add(desktopPane);
		
		JLabel IMAGE = new JLabel("");
		IMAGE.setBounds(0, 0, 200, 250);
		desktopPane.add(IMAGE);
		IMAGE.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBack.setBackground(new Color(0, 0, 153));
		btnBack.setBounds(32, 599, 91, 36);
		contentPane.add(btnBack);
		
		rollno = new JTextField();
		rollno.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rollno.setColumns(10);
		rollno.setBounds(639, 502, 133, 36);
		contentPane.add(rollno);
		
		JLabel lblRollNo = new JLabel("Roll No :-");
		lblRollNo.setForeground(new Color(0, 0, 153));
		lblRollNo.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblRollNo.setBounds(651, 460, 111, 31);
		contentPane.add(lblRollNo);
		
		JLabel lblRegistrationPanel = new JLabel("REGISTRATION PANEL");
		lblRegistrationPanel.setForeground(new Color(0, 0, 153));
		lblRegistrationPanel.setFont(new Font("Tahoma", Font.BOLD, 43));
		lblRegistrationPanel.setBounds(192, 11, 545, 60);
		contentPane.add(lblRegistrationPanel);
		
		JLabel lblName = new JLabel("Name        :");
		lblName.setForeground(new Color(0, 0, 153));
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblName.setBounds(33, 105, 122, 31);
		contentPane.add(lblName);
		
		JLabel lblAge = new JLabel("Age           :");
		lblAge.setForeground(new Color(0, 0, 153));
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblAge.setBounds(33, 160, 133, 31);
		contentPane.add(lblAge);
		
		JLabel lblBranch = new JLabel("Branch      :");
		lblBranch.setForeground(new Color(0, 0, 153));
		lblBranch.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblBranch.setBounds(33, 215, 133, 31);
		contentPane.add(lblBranch);
		
		JLabel lblMobileNo = new JLabel("Gender      :");
		lblMobileNo.setForeground(new Color(0, 0, 153));
		lblMobileNo.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblMobileNo.setBounds(33, 270, 151, 31);
		contentPane.add(lblMobileNo);
		
		JLabel lblAddress = new JLabel("Address     :");
		lblAddress.setForeground(new Color(0, 0, 153));
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblAddress.setBounds(33, 490, 151, 31);
		contentPane.add(lblAddress);
		
		JLabel lblEmailId = new JLabel("Mobile No  :");
		lblEmailId.setForeground(new Color(0, 0, 153));
		lblEmailId.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblEmailId.setBounds(33, 325, 133, 31);
		contentPane.add(lblEmailId);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 16));
		name.setBounds(165, 105, 364, 36);
		contentPane.add(name);
		name.setColumns(10);
		
		JTextArea address = new JTextArea();
		address.setFont(new Font("Monospaced", Font.PLAIN, 16));
		address.setBounds(165, 490, 364, 88);
		contentPane.add(address);
		
		JRadioButton CS = new JRadioButton("CS");
		buttonGroup.add(CS);
		CS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		CS.setBounds(172, 215, 53, 31);
		contentPane.add(CS);
		
		JRadioButton IT = new JRadioButton("IT");
		buttonGroup.add(IT);
		IT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		IT.setBounds(285, 215, 53, 31);
		contentPane.add(IT);
		
		JRadioButton ETC = new JRadioButton("E & TC");
		buttonGroup.add(ETC);
		ETC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ETC.setBounds(392, 215, 111, 31);
		contentPane.add(ETC);
		
	
		
		JButton btnNewButton = new JButton("Upload Photo");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 0, 204));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser cho =new JFileChooser();
				cho.showOpenDialog(null);
				File f=cho.getSelectedFile();
				IMAGE.setIcon(new ImageIcon(f.toString()));
				String filename=f.getAbsolutePath();
				
				try
				{
					File image=new File(filename);
					FileInputStream fis=new FileInputStream(image);
					ByteArrayOutputStream b=new ByteArrayOutputStream();
					byte[] buf=new byte[1024];
					for(int readNum;(readNum=fis.read(buf))!=-1;)
						b.write(buf,0,readNum);
					 photo=b.toByteArray();
					
				}
				catch(Exception E)
				{
					JOptionPane.showMessageDialog(null, E);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(639, 383, 133, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblYear = new JLabel("Year          :");
		lblYear.setForeground(new Color(0, 0, 153));
		lblYear.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblYear.setBounds(33, 380, 133, 31);
		contentPane.add(lblYear);
		
		JComboBox<String> gender = new JComboBox<String>();
		gender.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		gender.addItem("MALE");
		gender.addItem("FEMALE");
		gender.addItem("TRANSGENEDER");
		gender.setBounds(165, 270, 171, 35);
		contentPane.add(gender);
		
		JLabel label_1 = new JLabel("Email ID    :");
		label_1.setForeground(new Color(0, 0, 153));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label_1.setBounds(33, 435, 133, 31);
		contentPane.add(label_1);
		
		JComboBox<String> year = new JComboBox<String>();
		year.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		year.addItem("1st Year");
		year.addItem("2nd Year");
		year.addItem("3rd Year");
		year.addItem("4th Year");
		year.setBounds(165, 380, 171, 35);
		contentPane.add(year);
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.PLAIN, 16));
		age.setColumns(10);
		age.setBounds(165, 160, 364, 36);
		contentPane.add(age);
		
		mob = new JTextField();
		mob.setFont(new Font("Tahoma", Font.PLAIN, 16));
		mob.setColumns(10);
		mob.setBounds(165, 320, 364, 36);
		contentPane.add(mob);
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.PLAIN, 16));
		email.setColumns(10);
		email.setBounds(165, 433, 364, 36);
		contentPane.add(email);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/std_data","root","akshay");
					String sql="insert into data values(?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement pstmt=conn.prepareStatement(sql);
					pstmt.setString(1,name.getText());
					pstmt.setLong(2, Integer.parseInt(rollno.getText()));
					pstmt.setLong(3, Integer.parseInt(age.getText()));
					String Dept = null;
					if(CS.isSelected())
						Dept=CS.getText();
					if(IT.isSelected())
						Dept=IT.getText();
					if(ETC.isSelected())
						Dept=ETC.getText();
					pstmt.setString(4,Dept);
					String gen;
					gen=gender.getSelectedItem().toString();
					pstmt.setString(5,gen);
					pstmt.setString(6,mob.getText());
					String y;
					y=year.getSelectedItem().toString();
					pstmt.setString(7, y);
					pstmt.setString(8,email.getText());
					pstmt.setString(9,address.getText());
					pstmt.setBytes(10,photo);
					pstmt.executeUpdate();
					JOptionPane.showMessageDialog(null, "Data successfully Submitted");
					name.setText("");
					age.setText("");
					mob.setText("");
					email.setText("");
					address.setText("");
					IMAGE.setIcon(null);
					conn.close();
					}
					catch(Exception E)
					{
						System.out.println(E);
					}
				
			}
		});
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setBackground(new Color(0, 0, 153));
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSubmit.setBounds(392, 594, 148, 45);
		contentPane.add(btnSubmit);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon("Resources\\BG-ADD.jpg"));
		bg.setBounds(0, 0, 875, 668);
		contentPane.add(bg);
	}
}
