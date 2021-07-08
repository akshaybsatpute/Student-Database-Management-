package update;

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
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import menu.Menu;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class Update extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField age;
	private JTextField mob;
	private JTextField email;
	private JTextField rollno;
	byte[] photo=null;
	private JLabel BG;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update frame = new Update();
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
	public Update() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 653);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Name        :");
		label.setForeground(new Color(0, 0, 153));
		label.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label.setBounds(41, 163, 122, 31);
		contentPane.add(label);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 16));
		name.setColumns(10);
		name.setBounds(173, 163, 339, 36);
		contentPane.add(name);
		
		JLabel label_1 = new JLabel("Age           :");
		label_1.setForeground(new Color(0, 0, 153));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label_1.setBounds(41, 218, 133, 31);
		contentPane.add(label_1);
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.PLAIN, 16));
		age.setColumns(10);
		age.setBounds(173, 218, 339, 36);
		contentPane.add(age);
		
		JLabel label_2 = new JLabel("Branch      :");
		label_2.setForeground(new Color(0, 0, 153));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label_2.setBounds(41, 273, 133, 31);
		contentPane.add(label_2);
		
		JRadioButton CS = new JRadioButton("CS");
		CS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		CS.setBounds(180, 273, 53, 31);
		contentPane.add(CS);
		
		JRadioButton IT = new JRadioButton("IT");
		IT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		IT.setBounds(293, 273, 53, 31);
		contentPane.add(IT);
		
		JRadioButton ETC = new JRadioButton("E & TC");
		ETC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ETC.setBounds(400, 273, 111, 31);
		contentPane.add(ETC);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setForeground(new Color(0, 0, 153));
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblGender.setBounds(578, 456, 151, 31);
		contentPane.add(lblGender);
		
		JComboBox<String> gender = new JComboBox<String>();
		gender.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		gender.addItem("MALE");
		gender.addItem("FEMALE");
		gender.addItem("TRANSGENEDER");
		gender.setBounds(673, 456, 142, 35);
		contentPane.add(gender);
		
		JLabel label_4 = new JLabel("Mobile No  :");
		label_4.setForeground(new Color(0, 0, 153));
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label_4.setBounds(41, 326, 133, 31);
		contentPane.add(label_4);
		
		mob = new JTextField();
		mob.setFont(new Font("Tahoma", Font.PLAIN, 16));
		mob.setColumns(10);
		mob.setBounds(173, 324, 339, 36);
		contentPane.add(mob);
		
		JLabel lblYear = new JLabel("Year     :");
		lblYear.setForeground(new Color(0, 0, 153));
		lblYear.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblYear.setBounds(578, 498, 133, 31);
		contentPane.add(lblYear);
		
		JComboBox<String> year = new JComboBox<String>();
		year.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		year.addItem("1st Year");
		year.addItem("2nd Year");
		year.addItem("3rd Year");
		year.addItem("4th Year");
		year.setBounds(673, 498, 142, 35);
		contentPane.add(year);
		
		JLabel label_6 = new JLabel("Email ID    :");
		label_6.setForeground(new Color(0, 0, 153));
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label_6.setBounds(41, 386, 133, 31);
		contentPane.add(label_6);
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.PLAIN, 16));
		email.setColumns(10);
		email.setBounds(173, 384, 339, 36);
		contentPane.add(email);
		
		JLabel label_7 = new JLabel("Address     :");
		label_7.setForeground(new Color(0, 0, 153));
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label_7.setBounds(41, 441, 151, 31);
		contentPane.add(label_7);
		
		JTextArea address = new JTextArea();
		address.setFont(new Font("Monospaced", Font.PLAIN, 16));
		address.setBounds(173, 441, 339, 88);
		contentPane.add(address);
		
		JLabel IMAGE = new JLabel("");
		IMAGE.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		IMAGE.setBounds(597, 106, 200, 250);
		contentPane.add(IMAGE);
		
		JButton button = new JButton("Upload Photo");
		button.addActionListener(new ActionListener() {
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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(597, 106, 200, 250);
		contentPane.add(panel);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button.setBackground(new Color(0, 0, 204));
		button.setBounds(632, 384, 133, 31);
		contentPane.add(button);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/std_data","root","akshay");
					String sql="update data set Name = ?,Age=?,Branch =?,Gender=?,Mobile_No=?,Year=?,Email_ID=?,Address=?,Image=? where Roll_No = ?";
					PreparedStatement pstmt=conn.prepareStatement(sql);
					pstmt.setString(1,name.getText());
					pstmt.setLong(10, Integer.parseInt(rollno.getText()));
					pstmt.setLong(2, Integer.parseInt(age.getText()));
					String Dept = null;
					if(CS.isSelected())
						Dept=CS.getText();
					if(IT.isSelected())
						Dept=IT.getText();
					if(ETC.isSelected())
						Dept=ETC.getText();
					pstmt.setString(3,Dept);
					String gen;
					gen=gender.getSelectedItem().toString();
					pstmt.setString(4,gen);
					pstmt.setString(5,mob.getText());
					String y;
					y=year.getSelectedItem().toString();
					pstmt.setString(6, y);
					pstmt.setString(7,email.getText());
					pstmt.setString(8,address.getText());
					pstmt.setBytes(9,photo);
					pstmt.executeUpdate();
					JOptionPane.showMessageDialog(null, "[	Data successfully Updated  ]");
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
		btnUpdate.setForeground(Color.WHITE);
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUpdate.setBackground(new Color(0, 0, 153));
		btnUpdate.setBounds(364, 560, 148, 45);
		contentPane.add(btnUpdate);
		
		JButton button_2 = new JButton("BACK");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu().setVisible(true);
				dispose();
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_2.setBackground(new Color(0, 0, 153));
		button_2.setBounds(45, 565, 91, 36);
		contentPane.add(button_2);
		
		JLabel lblUpdate = new JLabel("UPDATE ");
		lblUpdate.setForeground(new Color(0, 0, 153));
		lblUpdate.setFont(new Font("Tahoma", Font.BOLD, 43));
		lblUpdate.setBounds(325, 11, 187, 60);
		contentPane.add(lblUpdate);
		
		JLabel label_3 = new JLabel("Enter the Roll No  :");
		label_3.setForeground(new Color(0, 0, 153));
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label_3.setBounds(102, 106, 200, 31);
		contentPane.add(label_3);
		
		rollno = new JTextField();
		rollno.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rollno.setColumns(10);
		rollno.setBounds(301, 103, 141, 36);
		contentPane.add(rollno);
		
		BG = new JLabel("");
		BG.setIcon(new ImageIcon("Resources\\BG-UPDATE.jpg"));
		BG.setBounds(0, 0, 859, 614);
		contentPane.add(BG);
	}
}
