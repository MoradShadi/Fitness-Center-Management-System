package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.MatteBorder;

import Database.AssessmentSql;
import Database.ClassSql;
import Database.DBConnection;
import Database.EnrollmentSql;
import Database.FitnessCenterSql;
import Database.MemberSql;
import Database.StaffSql;
import entity.Assessments;
import entity.Class;
import entity.ClassDescription;
import entity.ClassStaffing;
import entity.Enrollment;
import entity.Facility;
import entity.FitnessCenter;
import entity.Member;
import entity.Role;
import entity.Staff;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

public class LoginPage {

	private JFrame frame;
	private JPasswordField pwdField;
	private JTextField userNameField;
	JLabel errorMsg = new JLabel("Incorrect Username or Password");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
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
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 900, 625);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(SystemColor.textHighlight);
		mainPanel.setBounds(0, 0, 900, 625);
		frame.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(Color.WHITE);
		loginPanel.setBounds(308, 0, 592, 625);
		mainPanel.add(loginPanel);
		loginPanel.setLayout(null);
		
		pwdField = new JPasswordField();
		pwdField.setBounds(241, 350, 280, 50);
		loginPanel.add(pwdField);
		
		userNameField = new JTextField();
		userNameField.setBounds(241, 269, 280, 50);
		loginPanel.add(userNameField);
		userNameField.setColumns(10);
		
		JLabel userNameLabel = new JLabel("UserName:");
		userNameLabel.setBounds(110, 264, 103, 50);
		userNameLabel.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		loginPanel.add(userNameLabel);
		
		JLabel pwdLabel = new JLabel("Password:");
		pwdLabel.setBounds(110, 345, 103, 50);
		pwdLabel.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		loginPanel.add(pwdLabel);
		
		JButton LogInButton = new JButton("Log in");
		LogInButton.setBounds(325, 456, 103, 35);
		LogInButton.setForeground(SystemColor.desktop);
		LogInButton.setHorizontalTextPosition(SwingConstants.LEADING);
		LogInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DBConnection.getUserConnection(userNameField, pwdField);
					Home hframe = new Home();
					hframe.setVisible(true);
					frame.dispose();
				} catch (SQLException e1) {
					errorMsg.setVisible(true);
					e1.printStackTrace();
				}
			}
		});
		LogInButton.setBackground(SystemColor.textHighlight);
		LogInButton.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		loginPanel.add(LogInButton);
		
		JLabel exit = new JLabel("X");
		exit.setBounds(553, 11, 29, 35);
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirmation", JOptionPane.YES_NO_OPTION)== 0) {
					System.exit(0);
				}
				
			}
		});
		exit.setForeground(SystemColor.textHighlight);
		exit.setFont(new Font("Tahoma", Font.BOLD, 30));
		loginPanel.add(exit);
		
		JLabel loginTitle = new JLabel("Login");
		loginTitle.setBounds(110, 60, 142, 77);
		loginTitle.setForeground(SystemColor.textHighlight);
		loginTitle.setFont(new Font("Segoe UI Light", Font.BOLD, 50));
		loginPanel.add(loginTitle);
		
		
		errorMsg.setVisible(false);
		errorMsg.setHorizontalAlignment(SwingConstants.CENTER);
		errorMsg.setFont(new Font("Tahoma", Font.BOLD, 15));
		errorMsg.setForeground(new Color(255, 51, 0));
		errorMsg.setBounds(241, 419, 280, 14);
		loginPanel.add(errorMsg);
		
		JLabel Logo = new JLabel("");
		ImageIcon icon = new ImageIcon(LoginPage.class.getResource("/GUI/Images/fitness.png"));
		Image img = icon.getImage();
		Image imgScale = img.getScaledInstance(300, 300, 100);
		ImageIcon scaledIcon = new ImageIcon(imgScale);
		Logo.setIcon(scaledIcon);
		Logo.setBounds(0, 179, 310, 346);
		mainPanel.add(Logo);
	}
}
