package GUI.Classes;

import GUI.Home;
import GUI.LoginPage;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Classes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Classes frame = new Classes();
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
	public Classes() {
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
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBounds(0, 0, 900, 107);
		loginPanel.setBackground(Color.WHITE);
		mainPanel.add(loginPanel);
		
		JLabel logout = new JLabel("");
		logout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Confirmation", JOptionPane.YES_NO_OPTION)== 0) {
					LoginPage.main(null);
					dispose();
				}
				
			}
		});
		logout.setHorizontalAlignment(SwingConstants.CENTER);
		logout.setBounds(822, 526, 68, 88);
		mainPanel.add(logout);
		ImageIcon icon = new ImageIcon(Classes.class.getResource("/GUI/Images/exit.png"));
		Image img = icon.getImage();
		Image imgScale = img.getScaledInstance(80, 80, 100);
		ImageIcon scaledIcon = new ImageIcon(imgScale);
		logout.setIcon(scaledIcon);
		
		JLabel exit = new JLabel("X");
		exit.setBounds(861, 11, 29, 35);
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirmation", JOptionPane.YES_NO_OPTION)== 0) {
					System.exit(0);
				}
				
			}
		});
		loginPanel.setLayout(null);
		exit.setForeground(SystemColor.textHighlight);
		exit.setFont(new Font("Tahoma", Font.BOLD, 30));
		loginPanel.add(exit);
		
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
		backArrow.setBounds(33, 128, 89, 58);
		mainPanel.add(backArrow);
		ImageIcon backIcon = new ImageIcon(Classes.class.getResource("/GUI/Images/backarrow.png"));
		Image img7 = backIcon.getImage();
		Image imgScale7 = img7.getScaledInstance(80, 80, 100);
		ImageIcon scaledIcon7 = new ImageIcon(imgScale7);
		backArrow.setIcon(scaledIcon7);
		
		
		JLabel userNameLbl = new JLabel("userName");
		userNameLbl.setForeground(SystemColor.textHighlight);
		userNameLbl.setFont(new Font("Segoe UI Light", Font.BOLD, 25));
		userNameLbl.setBounds(106, 29, 180, 49);
		loginPanel.add(userNameLbl);
		
		JLabel profile = new JLabel("");
		profile.setHorizontalAlignment(SwingConstants.CENTER);
		profile.setBounds(10, 11, 86, 93);
		loginPanel.add(profile);
		ImageIcon profileIcon = new ImageIcon(Classes.class.getResource("/GUI/Images/profile.png"));
		Image img2 = profileIcon.getImage();
		Image imgScale2 = img2.getScaledInstance(90, 90, 100);
		ImageIcon scaledIcon2 = new ImageIcon(imgScale2);
		profile.setIcon(scaledIcon2);
		loginPanel.add(profile);
		
		JLabel lblMembers_1 = new JLabel("Classes");
		lblMembers_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMembers_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMembers_1.setForeground(SystemColor.textHighlight);
		lblMembers_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblMembers_1.setBounds(363, 29, 151, 49);
		loginPanel.add(lblMembers_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 139)));
		panel.setBackground(SystemColor.menu);
		panel.setBounds(206, 178, 199, 150);
		mainPanel.add(panel);
		
		JLabel lblMembers = new JLabel("Add Class");
		lblMembers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ClassesSignUp classesSignUp = new ClassesSignUp();
				classesSignUp.setVisible(true);
				dispose();
			}
		});
		lblMembers.setIconTextGap(3);
		lblMembers.setVerticalAlignment(SwingConstants.BOTTOM);
		lblMembers.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblMembers.setHorizontalAlignment(SwingConstants.CENTER);
		lblMembers.setForeground(SystemColor.textHighlight);
		lblMembers.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMembers.setHorizontalTextPosition(SwingConstants.CENTER);
		lblMembers.setBounds(10, 11, 179, 128);
		ImageIcon membersIcon = new ImageIcon(Classes.class.getResource("/GUI/Images/add.png"));
		Image img3 = membersIcon.getImage();
		Image imgScale3 = img3.getScaledInstance(100, 100, 100);
		ImageIcon scaledIcon3 = new ImageIcon(imgScale3);
		panel.setLayout(null);
		lblMembers.setIcon(scaledIcon3);
		panel.add(lblMembers);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 139)));
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBounds(483, 178, 199, 150);
		mainPanel.add(panel_1);
		
		JLabel lblClasses = new JLabel("Delete Class");
		lblClasses.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ClassesDelete classesDelete = new ClassesDelete();
				classesDelete.setVisible(true);
				dispose();
			}
		});
		lblClasses.setForeground(SystemColor.textHighlight);
		lblClasses.setHorizontalTextPosition(SwingConstants.CENTER);
		lblClasses.setHorizontalAlignment(SwingConstants.CENTER);
		lblClasses.setVerticalAlignment(SwingConstants.BOTTOM);
		lblClasses.setBounds(10, 7, 179, 132);
		lblClasses.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblClasses.setFont(new Font("Tahoma", Font.BOLD, 20));
		ImageIcon classesIcon = new ImageIcon(Classes.class.getResource("/GUI/Images/delete.png"));
		Image img4 = classesIcon.getImage();
		Image imgScale4 = img4.getScaledInstance(100, 100, 100);
		ImageIcon scaledIcon4 = new ImageIcon(imgScale4);
		panel.setLayout(null);
		panel_1.setLayout(null);
		lblClasses.setIcon(scaledIcon4);
		panel_1.add(lblClasses);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 139)));
		panel_2.setBackground(SystemColor.menu);
		panel_2.setBounds(206, 365, 199, 150);
		mainPanel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCenters = new JLabel("Edit Class");
		lblCenters.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PreEditClasses preEditClasses = new PreEditClasses();
				preEditClasses.setVisible(true);
				dispose();
			}
		});
		lblCenters.setIconTextGap(0);
		lblCenters.setForeground(SystemColor.textHighlight);
		lblCenters.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCenters.setHorizontalTextPosition(SwingConstants.CENTER);
		lblCenters.setHorizontalAlignment(SwingConstants.CENTER);
		lblCenters.setVerticalAlignment(SwingConstants.BOTTOM);
		lblCenters.setVerticalTextPosition(SwingConstants.BOTTOM);
		ImageIcon centerIcon = new ImageIcon(Classes.class.getResource("/GUI/Images/edit.png"));
		Image img5 = centerIcon.getImage();
		Image imgScale5 = img5.getScaledInstance(120, 110, 100);
		ImageIcon scaledIcon5 = new ImageIcon(imgScale5);
		panel.setLayout(null);
		panel_1.setLayout(null);
		lblCenters.setIcon(scaledIcon5);
		lblCenters.setBounds(10, 7, 179, 132);
		panel_2.add(lblCenters);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 139)));
		panel_3.setBackground(SystemColor.menu);
		panel_3.setBounds(483, 365, 199, 150);
		mainPanel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblStaff = new JLabel("List Classes");
		lblStaff.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ClassesList classesList = new ClassesList();
				classesList.setVisible(true);
				dispose();
			}
		});
		lblStaff.setBackground(SystemColor.menu);
		lblStaff.setIconTextGap(10);
		lblStaff.setHorizontalTextPosition(SwingConstants.CENTER);
		lblStaff.setHorizontalAlignment(SwingConstants.CENTER);
		lblStaff.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblStaff.setVerticalAlignment(SwingConstants.BOTTOM);
		lblStaff.setForeground(SystemColor.textHighlight);
		lblStaff.setFont(new Font("Tahoma", Font.BOLD, 20));
		ImageIcon staffIcon = new ImageIcon(Classes.class.getResource("/GUI/Images/list-items.png"));
		Image img6 = staffIcon.getImage();
		Image imgScale6 = img6.getScaledInstance(100, 90, 100);
		ImageIcon scaledIcon6 = new ImageIcon(imgScale6);
		panel.setLayout(null);
		panel_1.setLayout(null);
		lblStaff.setIcon(scaledIcon6);
		lblStaff.setBounds(10, 7, 179, 132);
		panel_3.add(lblStaff);
	}

}
