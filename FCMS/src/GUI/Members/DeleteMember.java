package GUI.Members;

import java.awt.EventQueue;
import GUI.Home;
import GUI.Members.Members;
import entity.Member;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Database.MemberSql;

public class DeleteMember extends JFrame {

	private JPanel contentPane;
    private List<Member> memberList;
    private Choice memberSelector;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteMember frame = new DeleteMember();
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
	public DeleteMember() {
		memberList = MemberSql.getAllMembers();
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
		for (int i = 0; i < memberList.size(); i ++) {
			memberSelector.add(String.valueOf(memberList.get(i).getMemberId()));
		}
        Panel.add(memberSelector);

        JLabel lblClassSelector = new JLabel("Select Member:");
        lblClassSelector.setHorizontalAlignment(SwingConstants.LEFT);
        lblClassSelector.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
        lblClassSelector.setBounds(29, 300, 201, 20);
        Panel.add(lblClassSelector);

        JLabel backArrow = new JLabel("");
        backArrow.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Members sFrame = new Members();
                sFrame.setVisible(true);
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

        JButton btnConfirm = new JButton("Delete");
        btnConfirm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	if (JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this member", "Confirmation", JOptionPane.YES_NO_OPTION)== 0) {
            		//Need to delete member from database here
            		MemberSql.deleteMember(Integer.parseInt(memberSelector.getSelectedItem()));
                	Members member = new Members();
                	member.setVisible(true);
                    dispose();
                }
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
        btnCancel.setBounds(290, 560, 103, 35);
        Panel.add(btnCancel);

        JLabel title = new JLabel("Delete Member");
        title.setBounds(72, 31, 448, 77);
        title.setForeground(SystemColor.textHighlight);
        title.setFont(new Font("Segoe UI Light", Font.BOLD, 45));
        Panel.add(title);
	}

}
