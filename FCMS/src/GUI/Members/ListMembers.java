package GUI.Members;

import GUI.Home;
import GUI.Members.Members;
import entity.Member;

import javax.swing.*;

import Database.MemberSql;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class ListMembers extends JFrame {
    private JList<String> list;
    private DefaultListModel<String> listModel;
    private static List<Member> memberList;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	ListMembers frame = new ListMembers();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ListMembers() {
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

        listModel = new DefaultListModel<>();
        for (int i = 0; i < memberList.size(); i++) {
        	listModel.addElement(String.valueOf(memberList.get(i).getMemberId()) + " " + String.valueOf(memberList.get(i).getFirstName())+ " " + String.valueOf(memberList.get(i).getLastName()));
        }
        listModel.addElement("Morad");
        listModel.addElement("Sandra");
        listModel.addElement("Tiberiu");
        listModel.addElement("Vlad");
        listModel.addElement("Daryna");
        listModel.addElement("Michela");
        list = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setBounds(70, 120, 400, 400);
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        Panel.add(scrollPane);

        JLabel backArrow = new JLabel("");
        backArrow.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Members cframe = new Members();
                cframe.setVisible(true);
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

        JLabel title = new JLabel("All Members");
        title.setBounds(72, 31, 448, 77);
        title.setForeground(SystemColor.textHighlight);
        title.setFont(new Font("Segoe UI Light", Font.BOLD, 45));
        Panel.add(title);
    }
}
