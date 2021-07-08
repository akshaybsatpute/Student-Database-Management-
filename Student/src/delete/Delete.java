package delete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import menu.Menu;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Delete extends JFrame {

	private JPanel contentPane;
	private JTextField rollno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete frame = new Delete();
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
	public Delete() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 298);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDelete = new JLabel("DELETE");
		lblDelete.setForeground(new Color(0, 0, 153));
		lblDelete.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblDelete.setBounds(142, 21, 185, 60);
		contentPane.add(lblDelete);
		
		JLabel label = new JLabel("Enter the Roll No  :");
		label.setForeground(new Color(0, 0, 153));
		label.setFont(new Font("Tahoma", Font.PLAIN, 23));
		label.setBounds(53, 110, 200, 31);
		contentPane.add(label);
		
		rollno = new JTextField();
		rollno.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rollno.setColumns(10);
		rollno.setBounds(252, 107, 141, 36);
		contentPane.add(rollno);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/std_data","root","akshay");
					String sql="delete from data where Roll_No=?";
					PreparedStatement pstmt=conn.prepareStatement(sql);
					pstmt.setLong(1, Integer.parseInt(rollno.getText()));
					pstmt.executeUpdate();
					JOptionPane.showMessageDialog(null, "[	Record Deleted Succesfully  ]");
					conn.close();
					}
					catch(Exception E)
					{
						System.out.println(E);
					}
			}
		});
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setBackground(new Color(0, 0, 153));
		btnDelete.setBounds(252, 184, 124, 36);
		contentPane.add(btnDelete);
		
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
		btnBack.setBounds(94, 184, 111, 36);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Resources\\BG-DELETE.jpg"));
		lblNewLabel.setBounds(0, 0, 466, 259);
		contentPane.add(lblNewLabel);
	}

}
