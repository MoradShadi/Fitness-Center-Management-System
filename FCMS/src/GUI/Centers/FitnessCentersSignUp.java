package GUI.Centers;

import GUI.Home;
import GUI.Members.Members;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FitnessCentersSignUp extends JFrame {

	private JPanel contentPane;
	private JTextField centerName;
	private JTextField staffSize;
	private JTextField address;
	private JTextField yearlyPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FitnessCentersSignUp frame = new FitnessCentersSignUp();
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
	public FitnessCentersSignUp() {
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
		
//		Choice fitnessCenterSelector = new Choice();
//		fitnessCenterSelector.setBounds(240, 144, 280, 27);
//		// Need to be retrieved from the database, these are just placeholders for now.
//		fitnessCenterSelector.add("Schwäbisch Hall");
//		fitnessCenterSelector.add("Börsenplatz");
//		fitnessCenterSelector.add("Blaubeuren");
//
//		Panel.add(fitnessCenterSelector);
		
		centerName = new JTextField();
		centerName.setBounds(240, 140, 280, 35);
		Panel.add(centerName);
		centerName.setColumns(10);
		
		staffSize = new JTextField();
		staffSize.setColumns(10);
		staffSize.setBounds(240, 200, 280, 35);
		Panel.add(staffSize);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(240, 320, 280, 35);
		Panel.add(address);
		
		yearlyPrice = new JTextField();
		yearlyPrice.setColumns(10);
		yearlyPrice.setBounds(240, 380, 280, 35);
		Panel.add(yearlyPrice);
		
		Choice saunaPresence = new Choice();
		saunaPresence.setBounds(240, 275, 280, 20);
		saunaPresence.add("True");
		saunaPresence.add("False");
		Panel.add(saunaPresence);

		Choice parkingPresence = new Choice();
		parkingPresence.setBounds(240, 450, 280, 20);
		parkingPresence.add("True");
		parkingPresence.add("False");
		Panel.add(parkingPresence);
		
		JLabel lblCenterName = new JLabel("Center Name:");
		lblCenterName.setHorizontalAlignment(SwingConstants.LEFT);
		lblCenterName.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblCenterName.setBounds(29, 144, 171, 20);
		Panel.add(lblCenterName);

		JLabel lblCenterSize = new JLabel("Staff Size:");
		lblCenterSize.setHorizontalAlignment(SwingConstants.LEFT);
		lblCenterSize.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblCenterSize.setBounds(29, 201, 170, 20);
		Panel.add(lblCenterSize);
		
		JLabel lblSauna = new JLabel("Sauna Presence:");
		lblSauna.setHorizontalAlignment(SwingConstants.LEFT);
		lblSauna.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblSauna.setBounds(29, 270, 170, 20);
		Panel.add(lblSauna);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setHorizontalAlignment(SwingConstants.LEFT);
		lblAddress.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblAddress.setBounds(29, 325, 170, 20);
		Panel.add(lblAddress);
		
		JLabel lblYearlyPrice = new JLabel("Yearly Price (€):");
		lblYearlyPrice.setHorizontalAlignment(SwingConstants.LEFT);
		lblYearlyPrice.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblYearlyPrice.setBounds(29, 387, 170, 20);
		Panel.add(lblYearlyPrice);
		
		JLabel lblParkinglblSauna = new JLabel("Parking Presence:");
		lblParkinglblSauna.setHorizontalAlignment(SwingConstants.LEFT);
		lblParkinglblSauna.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblParkinglblSauna.setBounds(29, 447, 170, 20);
		Panel.add(lblParkinglblSauna);
		
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
		ImageIcon backIcon = new ImageIcon(FitnessCentersSignUp.class.getResource("/GUI/Images/backarrow.png"));
		Image img7 = backIcon.getImage();
		Image imgScale7 = img7.getScaledInstance(80, 80, 100);
		ImageIcon scaledIcon7 = new ImageIcon(imgScale7);
		backArrow.setIcon(scaledIcon7);
		
		JLabel Logo = new JLabel("");
		ImageIcon icon1 = new ImageIcon(FitnessCentersSignUp.class.getResource("/GUI/Images/fitness.png"));
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
