package menu;
import add.Add;
import delete.Delete;
import search.Search;
import update.Update;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 691);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel admin_l = new JLabel("");
		admin_l.setIcon(new ImageIcon("Resources\\AVATAR-2.png"));
		admin_l.setBounds(96, 11, 91, 91);
		contentPane.add(admin_l);
		
		JLabel lblWelcomeAdmin = new JLabel("Welcome Admin !!!");
		lblWelcomeAdmin.setBorder(null);
		lblWelcomeAdmin.setFont(new Font("Tahoma", Font.BOLD, 52));
		lblWelcomeAdmin.setForeground(Color.WHITE);
		lblWelcomeAdmin.setBounds(248, 11, 524, 91);
		contentPane.add(lblWelcomeAdmin);
		
		JLabel header = new JLabel("");
		header.setIcon(new ImageIcon("Resources\\BG-HEADER.jpg"));
		header.setBounds(0, 0, 802, 112);
		contentPane.add(header);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 102, 802, 584);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton Add = new JButton("");
		Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Add().setVisible(true);
				dispose();
				
				
			}
			
		});
		Add.setIcon(new ImageIcon("Resources\\ADD.png"));
		Add.setBounds(125, 35, 200, 200);
		panel.add(Add);
		
		JButton update = new JButton("");
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Update().setVisible(true);
				dispose();
			}
		});
		update.setIcon(new ImageIcon("Resources\\UPDATE.png"));
		update.setBounds(478, 35, 200, 200);
		panel.add(update);
		
		JButton display = new JButton("");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Search().setVisible(true);
				dispose();
			}
		});
		display.setIcon(new ImageIcon("Resources\\SEARCH.png"));
		display.setBounds(125, 265, 200, 200);
		panel.add(display);
		
		JButton delete = new JButton("");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Delete().setVisible(true);
				dispose();
			}
		});
		delete.setIcon(new ImageIcon("Resources\\DELETE.png"));
		delete.setBounds(478, 265, 200, 200);
		panel.add(delete);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
					
			}
		});
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogout.setBackground(new Color(51, 153, 255));
		btnLogout.setBounds(345, 488, 115, 41);
		panel.add(btnLogout);
	}
}
