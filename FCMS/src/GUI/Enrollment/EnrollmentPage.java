package GUI.Enrollment;

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
import java.sql.Date;
import java.util.HashMap;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Database.ClassSql;
import Database.EnrollmentSql;
import Database.MemberSql;
import GUI.Home;
import GUI.Members.EditMembers;
import GUI.Members.MemberSignUp;
import GUI.Members.Members;
import GUI.Members.PreEditMember;
import entity.Member;
import entity.Class;
import entity.Enrollment;

public class EnrollmentPage extends JFrame {

	private JPanel contentPane;
    private List<Member> memberList;
    private List<Class> classList;
    private HashMap<Integer, Member> memberMap=new HashMap<Integer,Member>();
    private HashMap<String, Class> classMap=new HashMap<String,Class>();
    private Choice memberSelector;
    private Choice classSelector;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PreEditMember frame = new PreEditMember();
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
	public EnrollmentPage() {
		memberList = MemberSql.getAllMembers();
		for (Member i : memberList) {
			this.memberMap.put(i.getMemberId(),i); 
		}
		
		classList = ClassSql.getAllClasses();
		for (Class i : classList) {
			this.classMap.put(String.valueOf(i.getClassId() +" "+ i.getClassType()),i); 
		}
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

        memberSelector = new Choice();
        memberSelector.setBounds(200, 300, 350, 27);
        // Need to be retrieved from the database, these are just placeholders for now.
		for(int key : memberMap.keySet()){
			memberSelector.add(String.valueOf(memberMap.get(key).getMemberId()));
		}
        Panel.add(memberSelector);

        JLabel lblMemberSelector = new JLabel("Select Member:");
        lblMemberSelector.setHorizontalAlignment(SwingConstants.LEFT);
        lblMemberSelector.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
        lblMemberSelector.setBounds(29, 300, 165, 20);
        Panel.add(lblMemberSelector);

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

        JButton btnConfirm = new JButton("Enroll");
        btnConfirm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	System.out.println(classMap.get(String.valueOf(classSelector.getSelectedItem())).getClassId());
            	Enrollment newEnrollment = new Enrollment(memberMap.get(Integer.parseInt(memberSelector.getSelectedItem())).getMemberId(), classMap.get(String.valueOf(classSelector.getSelectedItem())).getClassId(),new Date(System.currentTimeMillis()));
            	EnrollmentSql.addEnrollment(newEnrollment);
            	Home hframe = new Home();
				hframe.setVisible(true);
				dispose();
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
                	Home hframe = new Home();
    				hframe.setVisible(true);
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

        JLabel title = new JLabel("Class Enrollment");
        title.setBounds(72, 31, 448, 77);
        title.setForeground(SystemColor.textHighlight);
        title.setFont(new Font("Segoe UI Light", Font.BOLD, 45));
        Panel.add(title);
        
        JLabel lblSelectClass = new JLabel("Select Class:");
        lblSelectClass.setHorizontalAlignment(SwingConstants.LEFT);
        lblSelectClass.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
        lblSelectClass.setBounds(29, 344, 165, 20);
        Panel.add(lblSelectClass);
        
        classSelector = new Choice();
        classSelector.setBounds(200, 344, 350, 20);
        for(String key : classMap.keySet()){
        	classSelector.add(key);
		}
        Panel.add(classSelector);
	}
}
