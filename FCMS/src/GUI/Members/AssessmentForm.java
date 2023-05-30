package GUI.Members;

import GUI.Home;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AssessmentForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtAge;
	private JTextField txtBMI;
	private JTextField txtFatMass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AssessmentForm frame = new AssessmentForm();
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
	public AssessmentForm() {
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
		
		JTextField txtHeight = new JTextField();
		txtHeight.setBounds(240, 176, 280, 35);
		Panel.add(txtHeight);
		txtHeight.setColumns(10);
		
		JTextField txtWeight = new JTextField();
		txtWeight.setColumns(10);
		txtWeight.setBounds(240, 240, 280, 35);
		Panel.add(txtWeight);
		
		JTextField txtBoneMass = new JTextField();
		txtBoneMass.setColumns(10);
		txtBoneMass.setBounds(240, 369, 280, 35);
		Panel.add(txtBoneMass);
		
		JTextField txtMuscleMass = new JTextField();
		txtMuscleMass.setColumns(10);
		txtMuscleMass.setBounds(240, 432, 280, 35);
		Panel.add(txtMuscleMass);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setHorizontalAlignment(SwingConstants.LEFT);
		lblAge.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblAge.setBounds(29, 113, 171, 20);
		Panel.add(lblAge);
		
		JLabel lblHeight = new JLabel("Height:");
		lblHeight.setHorizontalAlignment(SwingConstants.LEFT);
		lblHeight.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblHeight.setBounds(30, 180, 170, 20);
		Panel.add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight:");
		lblWeight.setHorizontalAlignment(SwingConstants.LEFT);
		lblWeight.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblWeight.setBounds(30, 244, 170, 20);
		Panel.add(lblWeight);
		
		JLabel lblBMI = new JLabel("BMI:");
		lblBMI.setHorizontalAlignment(SwingConstants.LEFT);
		lblBMI.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblBMI.setBounds(29, 306, 170, 20);
		Panel.add(lblBMI);
		
		JLabel lblBoneMass = new JLabel("Bone Mass:");
		lblBoneMass.setHorizontalAlignment(SwingConstants.LEFT);
		lblBoneMass.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblBoneMass.setBounds(30, 373, 170, 20);
		Panel.add(lblBoneMass);
		
		JLabel lblMuscleMass = new JLabel("Muscle Mass:");
		lblMuscleMass.setHorizontalAlignment(SwingConstants.LEFT);
		lblMuscleMass.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblMuscleMass.setBounds(29, 436, 170, 20);
		Panel.add(lblMuscleMass);
		
		JLabel lblFatMass = new JLabel("Fat Mass:");
		lblFatMass.setHorizontalAlignment(SwingConstants.LEFT);
		lblFatMass.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblFatMass.setBounds(29, 497, 170, 20);
		Panel.add(lblFatMass);
		
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
		ImageIcon backIcon = new ImageIcon(AssessmentForm.class.getResource("/GUI/Images/backarrow.png"));
		Image img7 = backIcon.getImage();
		Image imgScale7 = img7.getScaledInstance(80, 80, 100);
		ImageIcon scaledIcon7 = new ImageIcon(imgScale7);
		backArrow.setIcon(scaledIcon7);
		
		JLabel Logo = new JLabel("");
		ImageIcon icon1 = new ImageIcon(AssessmentForm.class.getResource("/GUI/Images/fitness.png"));
		Image img1 = icon1.getImage();
		Image imgScale1 = img1.getScaledInstance(300, 300, 100);
		ImageIcon scaledIcon1 = new ImageIcon(imgScale1);
		Logo.setIcon(scaledIcon1);
		Logo.setBounds(0, 179, 310, 346);
		mainPanel.add(Logo);
		
		JButton btnNext = new JButton("Submit");
		btnNext.setBounds(417, 543, 103, 35);
		btnNext.setForeground(SystemColor.desktop);
		btnNext.setHorizontalTextPosition(SwingConstants.LEADING);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNext.setBackground(Color.ORANGE);
		btnNext.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		Panel.add(btnNext);
		
		JButton btnCancel = new JButton("Skip");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to skip this form?", "Confirmation", JOptionPane.YES_NO_OPTION)== 0) {
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
		btnCancel.setBounds(296, 543, 103, 35);
		Panel.add(btnCancel);
		
		JLabel title = new JLabel("Assessment form");
		title.setBounds(108, 11, 377, 77);
		title.setForeground(SystemColor.textHighlight);
		title.setFont(new Font("Segoe UI Light", Font.BOLD, 45));
		Panel.add(title);
		
		txtAge = new JTextField();
		txtAge.setColumns(10);
		txtAge.setBounds(240, 109, 280, 35);
		Panel.add(txtAge);
		
		txtBMI = new JTextField();
		txtBMI.setColumns(10);
		txtBMI.setBounds(240, 302, 280, 35);
		Panel.add(txtBMI);
		
		txtFatMass = new JTextField();
		txtFatMass.setColumns(10);
		txtFatMass.setBounds(240, 493, 280, 35);
		Panel.add(txtFatMass);
		
	}

}
