package GUI.Staff;

import GUI.Home;
import GUI.Members.Members;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StaffEdit extends JFrame {
    private JPanel contentPane;
    private JTextField firstName;
    private JTextField lastName;
    private JTextField position;
    private JTextField phoneNumber;
    private JSpinner dateTimeSpinner;
    private SpinnerDateModel dateModel;

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
    public StaffEdit() {
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

        Choice staffSelector = new Choice();
        staffSelector.setBounds(240, 144, 280, 27);
        // Need to be retrieved from the database, these are just placeholders for now.
        staffSelector.add("ID 1 (John Doe)");
        staffSelector.add("ID 2 (Jane Doe)");
        staffSelector.add("ID 3 (John Smith)");
        Panel.add(staffSelector);


        firstName = new JTextField();
        firstName.setColumns(10);
        firstName.setBounds(240, 191, 280, 35);
        Panel.add(firstName);

        lastName = new JTextField();
        lastName.setColumns(10);
        lastName.setBounds(240, 240, 280, 35);
        Panel.add(lastName);

        phoneNumber = new JTextField();
        phoneNumber.setColumns(10);
        phoneNumber.setBounds(240, 290, 280, 35);
        Panel.add(phoneNumber);

        dateModel = new SpinnerDateModel();
        dateTimeSpinner = new JSpinner(dateModel);
        dateTimeSpinner.setBounds(240, 340, 280, 27);
        Panel.add(dateTimeSpinner);

        Choice firstAidCertified = new Choice();
        firstAidCertified.setBounds(240, 390, 280, 20);
        firstAidCertified.add("True");
        firstAidCertified.add("False");
        Panel.add(firstAidCertified);

        Choice fitnessCenterSelector = new Choice();
        fitnessCenterSelector.setBounds(240, 430, 280, 27);
        // Need to be retrieved from the database, these are just placeholders for now.
        fitnessCenterSelector.add("Schwäbisch Hall");
        fitnessCenterSelector.add("Börsenplatz");
        fitnessCenterSelector.add("Blaubeuren");
        Panel.add(fitnessCenterSelector);

        position = new JTextField();
        position.setColumns(10);
        position.setBounds(240, 470, 280, 35);
        Panel.add(position);

        JLabel lblClassSelector = new JLabel("Select Staff:");
        lblClassSelector.setHorizontalAlignment(SwingConstants.LEFT);
        lblClassSelector.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
        lblClassSelector.setBounds(29, 144, 201, 20);
        Panel.add(lblClassSelector);

        JLabel lblFirstName = new JLabel("First Name:");
        lblFirstName.setHorizontalAlignment(SwingConstants.LEFT);
        lblFirstName.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
        lblFirstName.setBounds(29, 191, 170, 20);
        Panel.add(lblFirstName);

        JLabel lblLastName = new JLabel("Last Name:");
        lblLastName.setHorizontalAlignment(SwingConstants.LEFT);
        lblLastName.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
        lblLastName.setBounds(29, 240, 170, 20);
        Panel.add(lblLastName);

        JLabel lblPhoneNumber = new JLabel("Phone Number:");
        lblPhoneNumber.setHorizontalAlignment(SwingConstants.LEFT);
        lblPhoneNumber.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
        lblPhoneNumber.setBounds(29, 290, 170, 20);
        Panel.add(lblPhoneNumber);

        JLabel startDate = new JLabel("Start Date:");
        startDate.setHorizontalAlignment(SwingConstants.LEFT);
        startDate.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
        startDate.setBounds(29, 340, 170, 20);
        Panel.add(startDate);

        JLabel firstAidCertifiedLabel = new JLabel("First Aid Certified:");
        firstAidCertifiedLabel.setHorizontalAlignment(SwingConstants.LEFT);
        firstAidCertifiedLabel.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
        firstAidCertifiedLabel.setBounds(29, 390, 170, 20);
        Panel.add(firstAidCertifiedLabel);

        JLabel fitnessCenterLabel = new JLabel("Fitness Center:");
        fitnessCenterLabel.setHorizontalAlignment(SwingConstants.LEFT);
        fitnessCenterLabel.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
        fitnessCenterLabel.setBounds(29, 430, 170, 20);
        Panel.add(fitnessCenterLabel);

        JLabel roleLabel = new JLabel("Role:");
        roleLabel.setHorizontalAlignment(SwingConstants.LEFT);
        roleLabel.setFont(new Font("Segoe UI Light", Font.BOLD, 17));
        roleLabel.setBounds(29, 470, 170, 20);
        Panel.add(roleLabel);

        JLabel backArrow = new JLabel("");
        backArrow.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Staff sFrame = new Staff();
                sFrame.setVisible(true);
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

        JButton btnConfirm = new JButton("Update");
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
                System.out.println(staffSelector.getSelectedItem());
                System.out.println(firstName.getText());
                System.out.println(lastName.getText());
                System.out.println(phoneNumber.getText());
                System.out.println(dateModel.getDate());
                System.out.println(firstAidCertified.getSelectedItem());
                System.out.println(fitnessCenterSelector.getSelectedItem());
                System.out.println(position.getText());
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
                    Staff staff = new Staff();
                    staff.setVisible(true);
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

        JLabel title = new JLabel("Edit Staff Member");
        title.setBounds(72, 31, 448, 77);
        title.setForeground(SystemColor.textHighlight);
        title.setFont(new Font("Segoe UI Light", Font.BOLD, 45));
        Panel.add(title);

    }
}
