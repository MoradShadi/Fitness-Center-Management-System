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
	private JSpinner dateTimeSpinner;
	private SpinnerDateModel dateModel;
	private JSpinner maxParticipantsSpinner;
	private JSpinner classSessionNumberSpinner;

	private JSpinner classCostSpinner;
	private JSpinner roomNumberSpinner;
	private JSpinner participantsNumberSpinner;
	private final int OFFSET = 10;




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
		fitnessCenterSelector.setBounds(240, 120, 280, 27);
		// Need to be retrieved from the database, these are just placeholders for now.
		fitnessCenterSelector.add("Schwäbisch Hall");
		fitnessCenterSelector.add("Börsenplatz");
		fitnessCenterSelector.add("Blaubeuren");
		Panel.add(fitnessCenterSelector);

		dateModel = new SpinnerDateModel();
		dateTimeSpinner = new JSpinner(dateModel);
		dateTimeSpinner.setBounds(240, 160, 280, 27);
		Panel.add(dateTimeSpinner);

		maxParticipantsSpinner = new JSpinner();
		maxParticipantsSpinner.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		maxParticipantsSpinner.setBounds(240, 200, 280, 35);
		Panel.add(maxParticipantsSpinner);

		classSessionNumberSpinner = new JSpinner();
		classSessionNumberSpinner.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		classSessionNumberSpinner.setBounds(240, 250, 280, 35);
		Panel.add(classSessionNumberSpinner);

		classCostSpinner = new JSpinner();
		classCostSpinner.setModel(new SpinnerNumberModel(0.0, 0.0, 1000.0, 0.5));
		classCostSpinner.setBounds(240, 300, 280, 35);
		Panel.add(classCostSpinner);

		Choice classType = new Choice();
		classType.setBounds(240, 360, 280, 27);
		// Need to be retrieved from the database, these are just placeholders for now.
		classType.add("Yoga");
		classType.add("Abs & Core");
		classType.add("Stretching");
		Panel.add(classType);

		roomNumberSpinner = new JSpinner();
		roomNumberSpinner.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		roomNumberSpinner.setBounds(240, 400, 280, 35);
		Panel.add(roomNumberSpinner);

		Choice genderRestriction = new Choice();
		genderRestriction.setBounds(240, 440, 280, 27);
		genderRestriction.add("m");
		genderRestriction.add("f");
		genderRestriction.add("both");
		Panel.add(genderRestriction);

		participantsNumberSpinner = new JSpinner();
		participantsNumberSpinner.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		participantsNumberSpinner.setBounds(240, 470, 280, 35);
		Panel.add(participantsNumberSpinner);

		Choice classInstructor = new Choice();
		classInstructor.setBounds(240, 510, 280, 27);
		// Need to be retrieved from the database, these are just placeholders for now.
		classInstructor.add("John Doe");
		classInstructor.add("Jane Doe");
		classInstructor.add("John Smith");
		Panel.add(classInstructor);

		JLabel classesLabel = new JLabel("Fitness Center:");
		classesLabel.setHorizontalAlignment(SwingConstants.LEFT);
		classesLabel.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		classesLabel.setBounds(29, 120, 171, 20);
		Panel.add(classesLabel);

		JLabel lblDate = new JLabel("Datetime:");
		lblDate.setHorizontalAlignment(SwingConstants.LEFT);
		lblDate.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblDate.setBounds(29, 160, 171, 20);
		Panel.add(lblDate);

		JLabel lblMaxParticipants = new JLabel("Max Participants:");
		lblMaxParticipants.setHorizontalAlignment(SwingConstants.LEFT);
		lblMaxParticipants.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblMaxParticipants.setBounds(29, 205, 171, 20);
		Panel.add(lblMaxParticipants);

		JLabel lblClassSessionNumber = new JLabel("Class Session Number:");
		lblClassSessionNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblClassSessionNumber.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblClassSessionNumber.setBounds(29, 255, 201, 20);
		Panel.add(lblClassSessionNumber);

		JLabel lblClassCost = new JLabel("Class Cost:");
		lblClassCost.setHorizontalAlignment(SwingConstants.LEFT);
		lblClassCost.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblClassCost.setBounds(29, 305, 171, 20);
		Panel.add(lblClassCost);

		JLabel lblClassType = new JLabel("Class Type:");
		lblClassType.setHorizontalAlignment(SwingConstants.LEFT);
		lblClassType.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblClassType.setBounds(29, 360, 171, 20);
		Panel.add(lblClassType);

		JLabel lblRoomNumber = new JLabel("Room Number:");
		lblRoomNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblRoomNumber.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblRoomNumber.setBounds(29, 405, 171, 20);
		Panel.add(lblRoomNumber);

		JLabel genederRestriction = new JLabel("Allowed Gender:");
		genederRestriction.setHorizontalAlignment(SwingConstants.LEFT);
		genederRestriction.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		genederRestriction.setBounds(29, 440, 171, 20);
		Panel.add(genederRestriction);

		JLabel lblParticipantsNumber = new JLabel("Participants Number:");
		lblParticipantsNumber.setHorizontalAlignment(SwingConstants.LEFT);
		lblParticipantsNumber.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblParticipantsNumber.setBounds(29, 475, 201, 20);
		Panel.add(lblParticipantsNumber);

		JLabel lblClassInstructor = new JLabel("Class Instructor:");
		lblClassInstructor.setHorizontalAlignment(SwingConstants.LEFT);
		lblClassInstructor.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblClassInstructor.setBounds(29, 510, 171, 20);
		Panel.add(lblClassInstructor);

		JLabel backArrow = new JLabel("");
		backArrow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Classes cframe = new Classes();
				cframe.setVisible(true);
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
		btnConfirm.setBounds(417, 560, 103, 35);
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
					Classes classes = new Classes();
					classes.setVisible(true);
					dispose();
				}
			}
		});
		btnCancel.setHorizontalTextPosition(SwingConstants.LEADING);
		btnCancel.setForeground(Color.BLACK);
		btnCancel.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		btnCancel.setBackground(Color.ORANGE);
		btnCancel.setBounds(290, 560, 103, 35);
		Panel.add(btnCancel);
		
		JLabel title = new JLabel("Class sign-up form");
		title.setBounds(72, 31, 448, 77);
		title.setForeground(SystemColor.textHighlight);
		title.setFont(new Font("Segoe UI Light", Font.BOLD, 45));
		Panel.add(title);
		
	}
}
