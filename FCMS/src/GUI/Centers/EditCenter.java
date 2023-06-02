package GUI.Centers;

import java.awt.Choice;
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
import javax.swing.border.EmptyBorder;

import Database.FitnessCenterSql;
import GUI.Members.MemberSignUp;
import GUI.Members.Members;
import GUI.Members.PreEditMember;
import entity.FitnessCenter;
import entity.Member;

public class EditCenter extends JFrame {

	private JPanel contentPane;
	private JTextField centerName;
	private JTextField street;
	private JTextField post;
	private JTextField phone;
	private FitnessCenter center;
	private JTextField town;
	
	/**
	 * Create the frame.
	 * @param fitnessCenter 
	 */
	public EditCenter(FitnessCenter fitnessCenter) {
		center = fitnessCenter;
		
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

        centerName = new JTextField();
        centerName.setText(center.getCenterName());
		centerName.setBounds(240, 170, 280, 35);
		Panel.add(centerName);
		centerName.setColumns(10);
		
		street = new JTextField();
		street.setText(center.getCenterStreet());
		street.setColumns(10);
		street.setBounds(240, 230, 280, 35);
		Panel.add(street);
		
		post = new JTextField();
		post.setText(center.getCenterPost());
		post.setColumns(10);
		post.setBounds(240, 350, 280, 35);
		Panel.add(post);
		
		phone = new JTextField();
		phone.setText(center.getCenterPhoneNumber());
		phone.setColumns(10);
		phone.setBounds(240, 410, 280, 35);
		Panel.add(phone);
		
		JLabel lblCenterName = new JLabel("Center Name:");
		lblCenterName.setHorizontalAlignment(SwingConstants.LEFT);
		lblCenterName.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblCenterName.setBounds(29, 174, 171, 20);
		Panel.add(lblCenterName);

		JLabel lblStreet = new JLabel("Street:");
		lblStreet.setHorizontalAlignment(SwingConstants.LEFT);
		lblStreet.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblStreet.setBounds(29, 231, 170, 20);
		Panel.add(lblStreet);
		
		JLabel lblTown = new JLabel("Town:");
		lblTown.setHorizontalAlignment(SwingConstants.LEFT);
		lblTown.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblTown.setBounds(29, 300, 170, 20);
		Panel.add(lblTown);
		
		JLabel lblPost = new JLabel("Post:");
		lblPost.setHorizontalAlignment(SwingConstants.LEFT);
		lblPost.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblPost.setBounds(29, 355, 170, 20);
		Panel.add(lblPost);
		
		JLabel lblPhone = new JLabel("Phone Number:");
		lblPhone.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhone.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
		lblPhone.setBounds(29, 417, 170, 20);
		Panel.add(lblPhone);

        JLabel backArrow = new JLabel("");
        backArrow.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	PreEditMember mFrame = new PreEditMember();
                mFrame.setVisible(true);
                dispose();
            }
        });
        backArrow.setHorizontalAlignment(SwingConstants.CENTER);
        backArrow.setBounds(10, 11, 89, 58);
        mainPanel.add(backArrow);
        ImageIcon backIcon = new ImageIcon(MemberSignUp.class.getResource("/GUI/Images/backarrow.png"));
        Image img7 = backIcon.getImage();
        Image imgScale7 = img7.getScaledInstance(80, 80, 100);
        ImageIcon scaledIcon7 = new ImageIcon(imgScale7);
        backArrow.setIcon(scaledIcon7);

        JLabel Logo = new JLabel("");
        ImageIcon icon1 = new ImageIcon(MemberSignUp.class.getResource("/GUI/Images/fitness.png"));
        Image img1 = icon1.getImage();
        Image imgScale1 = img1.getScaledInstance(300, 300, 100);
        ImageIcon scaledIcon1 = new ImageIcon(imgScale1);
        Logo.setIcon(scaledIcon1);
        Logo.setBounds(0, 179, 310, 346);
        mainPanel.add(Logo);

        JButton btnConfirm = new JButton("Update");
        btnConfirm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	center.setCenterName(centerName.getText());
            	center.setCenterStreet(street.getText());
            	center.setCenterTown(town.getText());
            	center.setCenterPost(post.getText());
            	center.setCenterPhoneNumber(phone.getText());
            	FitnessCenterSql.UpdateCenter(center);
                FitnessCenters center = new FitnessCenters();
                center.setVisible(true);
                dispose();
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
                    PreEditCenter center = new PreEditCenter();
                    center.setVisible(true);
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

        JLabel title = new JLabel("Edit Center");
        title.setBounds(72, 31, 448, 77);
        title.setForeground(SystemColor.textHighlight);
        title.setFont(new Font("Segoe UI Light", Font.BOLD, 45));
        Panel.add(title);
        
        town = new JTextField();
        town.setText(center.getCenterTown());
        town.setColumns(10);
        town.setBounds(240, 285, 280, 35);
        Panel.add(town);

	}
}
