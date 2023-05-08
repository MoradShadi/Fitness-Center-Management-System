package GUI.Staff;

import GUI.Home;
import GUI.Members.AssessmentForm;
import GUI.Members.Members;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StaffSignUp extends JFrame {

	private JPanel contentPane;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField position;
	private JTextField phoneNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffSignUp frame = new StaffSignUp();
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
	public StaffSignUp() {
		setUndecorated(true);
		setBounds(0, 0, 900, 625);
		
		getContentPane().setBackground(new Color(0, 0, 0));
		setBounds(100, 100, 900, 625);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(SystemColor.textHighlight);
		mainPanel.setBounds(0, 0, 900, 625);
		getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		
		JPanel Panel = new JPanel();
		Panel.setBounds(308, 0, 592, 625);
		Panel.setBackground(Color.WHITE);
		mainPanel.add(Panel);
		Panel.setLayout(null);
		
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
		Panel.add(exit);
		exit.setForeground(SystemColor.textHighlight);
		exit.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		Choice fitnessCenterSelector = new Choice();
		fitnessCenterSelector.setBounds(240, 144, 280, 27);
		// Need to be retrieved from the database, these are just placeholders for now.
		fitnessCenterSelector.add("Schwäbisch Hall");
		fitnessCenterSelector.add("Börsenplatz");
		fitnessCenterSelector.add("Blaubeuren");
		
		Panel.add(fitnessCenterSelector);
		
		firstName = new JTextField();
		firstName.setBounds(240, 191, 280, 35);
		Panel.add(firstName);
		firstName.setColumns(10);
		
		lastName = new JTextField();
		lastName.setColumns(10);
		lastName.setBounds(240, 260, 280, 35);
		Panel.add(lastName);
		
		position = new JTextField();
		position.setColumns(10);
		position.setBounds(240, 377, 280, 35);
		Panel.add(position);
		
		phoneNumber = new JTextField();
		phoneNumber.setColumns(10);
		phoneNumber.setBounds(240, 443, 280, 35);
		Panel.add(phoneNumber);
		
		Choice gender = new Choice();
		gender.setBounds(240, 325, 280, 20);
		gender.add("Male");
		gender.add("Female");
		Panel.add(gender);
		
		JLabel fitnessCenterlabel = new JLabel("Fitness Center Branch:");
		fitnessCenterlabel.setHorizontalAlignment(SwingConstants.LEFT);
		fitnessCenterlabel.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		fitnessCenterlabel.setBounds(29, 144, 171, 20);
		Panel.add(fitnessCenterlabel);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setHorizontalAlignment(SwingConstants.LEFT);
		lblFirstName.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblFirstName.setBounds(29, 201, 170, 20);
		Panel.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setHorizontalAlignment(SwingConstants.LEFT);
		lblLastName.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblLastName.setBounds(29, 270, 170, 20);
		Panel.add(lblLastName);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setHorizontalAlignment(SwingConstants.LEFT);
		lblGender.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblGender.setBounds(29, 325, 170, 20);
		Panel.add(lblGender);
		
		JLabel lblAddress = new JLabel("Position:");
		lblAddress.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddress.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblAddress.setBounds(29, 387, 170, 20);
		Panel.add(lblAddress);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhoneNumber.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblPhoneNumber.setBounds(29, 447, 170, 20);
		Panel.add(lblPhoneNumber);
		
		JLabel backArrow = new JLabel("");
		backArrow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Home hframe = new Home();
				hframe.setVisible(true);
				dispose();
			}
		});
		backArrow.setHorizontalAlignment(SwingConstants.CENTER);
		backArrow.setBounds(10, 11, 89, 58);
		mainPanel.add(backArrow);
		ImageIcon backIcon = new ImageIcon(StaffSignUp.class.getResource("/GUI/Images/backarrow.png"));
		Image img7 = backIcon.getImage();
		Image imgScale7 = img7.getScaledInstance(80, 80, 100);
		ImageIcon scaledIcon7 = new ImageIcon(imgScale7);
		backArrow.setIcon(scaledIcon7);
		
		JLabel Logo = new JLabel("");
		ImageIcon icon1 = new ImageIcon(StaffSignUp.class.getResource("/GUI/Images/fitness.png"));
		Image img1 = icon1.getImage();
		Image imgScale1 = img1.getScaledInstance(300, 300, 100);
		ImageIcon scaledIcon1 = new ImageIcon(imgScale1);
		Logo.setIcon(scaledIcon1);
		Logo.setBounds(0, 179, 310, 346);
		mainPanel.add(Logo);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Add the new staff member to the database.
			}
		});
		btnConfirm.setBounds(417, 543, 103, 35);
		btnConfirm.setForeground(SystemColor.desktop);
		btnConfirm.setHorizontalTextPosition(SwingConstants.LEADING);
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfirm.setBackground(Color.ORANGE);
		btnConfirm.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		Panel.add(btnConfirm);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel this form?", "Confirmation", JOptionPane.YES_NO_OPTION)== 0) {
					Members member = new Members();
					member.setVisible(true);
					dispose();
				}
			}
		});
		btnCancel.setHorizontalTextPosition(SwingConstants.LEADING);
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		btnCancel.setBackground(Color.ORANGE);
		btnCancel.setBounds(290, 543, 103, 35);
		Panel.add(btnCancel);
		
		JLabel title = new JLabel("Staff sign-up form");
		title.setBounds(72, 31, 448, 77);
		title.setForeground(SystemColor.textHighlight);
		title.setFont(new Font("Segoe UI Light", Font.BOLD, 45));
		Panel.add(title);
		
	}
}
