package GUI.Classes;

import GUI.Home;
import GUI.Members.Members;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClassesSignUp extends JFrame {

	private JPanel contentPane;
	private JTextField maxParticipants;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClassesSignUp frame = new ClassesSignUp();
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
	public ClassesSignUp() {
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

		Choice classTypeSelector = new Choice();
		classTypeSelector.setBounds(240, 255, 280, 27);
		// Need to be retrieved from the database, these are just placeholders for now.
		classTypeSelector.add("Yoga");
		classTypeSelector.add("Abs & Core");
		classTypeSelector.add("Stretching");

		Panel.add(classTypeSelector);

		maxParticipants = new JTextField();
		maxParticipants.setColumns(10);
		maxParticipants.setBounds(240, 191, 280, 35);
		Panel.add(maxParticipants);

		Choice startTimeSelector = new Choice();
		startTimeSelector.setBounds(240, 310, 280, 27);
		for (int i = 9; i < 19; i++) {
			startTimeSelector.add(i + ":00");
		}
		Panel.add(startTimeSelector);

		Choice durationSelector = new Choice();
		durationSelector.setBounds(240, 360, 280, 27);
		for (int i = 1; i < 4; i++) {
			durationSelector.add(i + " hour(s)");
		}
		Panel.add(durationSelector);

		Choice instructorSelector = new Choice();
		instructorSelector.setBounds(240, 420, 280, 27);
		// Need to be retrieved from the database, these are just placeholders for now.
		instructorSelector.add("John Doe");
		instructorSelector.add("Jane Willow");
		instructorSelector.add("John Smith");
		instructorSelector.add("Jane Linda");
		Panel.add(instructorSelector);
		
		JLabel classesLabel = new JLabel("Classes:");
		classesLabel.setHorizontalAlignment(SwingConstants.LEFT);
		classesLabel.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		classesLabel.setBounds(29, 144, 171, 20);
		Panel.add(classesLabel);

		JLabel classTypeLabel = new JLabel("Class Type:");
		classTypeLabel.setHorizontalAlignment(SwingConstants.LEFT);
		classTypeLabel.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		classTypeLabel.setBounds(29, 255, 171, 20);
		Panel.add(classTypeLabel);

		JLabel startTimeLabel = new JLabel("Start Time:");
		startTimeLabel.setHorizontalAlignment(SwingConstants.LEFT);
		startTimeLabel.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		startTimeLabel.setBounds(29, 310, 171, 20);
		Panel.add(startTimeLabel);

		JLabel durationLabel = new JLabel("Duration:");
		durationLabel.setHorizontalAlignment(SwingConstants.LEFT);
		durationLabel.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		durationLabel.setBounds(29, 360, 171, 20);
		Panel.add(durationLabel);

		JLabel instructorLabel = new JLabel("Instructor:");
		instructorLabel.setHorizontalAlignment(SwingConstants.LEFT);
		instructorLabel.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		instructorLabel.setBounds(29, 420, 171, 20);
		Panel.add(instructorLabel);
		
		JLabel lblMaxParticipants = new JLabel("Max Participants:");
		lblMaxParticipants.setHorizontalAlignment(SwingConstants.LEFT);
		lblMaxParticipants.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblMaxParticipants.setBounds(29, 201, 170, 20);
		Panel.add(lblMaxParticipants);

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
		ImageIcon backIcon = new ImageIcon(ClassesSignUp.class.getResource("/GUI/Images/backarrow.png"));
		Image img7 = backIcon.getImage();
		Image imgScale7 = img7.getScaledInstance(80, 80, 100);
		ImageIcon scaledIcon7 = new ImageIcon(imgScale7);
		backArrow.setIcon(scaledIcon7);
		
		JLabel Logo = new JLabel("");
		ImageIcon icon1 = new ImageIcon(ClassesSignUp.class.getResource("/GUI/Images/fitness.png"));
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
		
		JLabel title = new JLabel("Class sign-up form");
		title.setBounds(72, 31, 448, 77);
		title.setForeground(SystemColor.textHighlight);
		title.setFont(new Font("Segoe UI Light", Font.BOLD, 45));
		Panel.add(title);
		
	}
}
