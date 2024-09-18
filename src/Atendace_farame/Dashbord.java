/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Atendace_farame;

import entity.Course;
import entity.Enrollment;
import entity.Section;
import entity.Student;
import entity.Teacher;
import entity.University;
import entity.WorkLoad;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ABDUL MOIZ
 */
public class Dashbord extends javax.swing.JFrame {

    private ArrayList<Section> sections;

    void setStudentList() {

        ArrayList<Student> obj = University.getStud();
        if (obj != null) {
            DefaultTableModel model = (DefaultTableModel) StdList.getModel();
            model.setRowCount(0);
            for (int i = 0; i < obj.size(); i++) {
                Object[] cols = new Object[6];
                cols[0] = obj.get(i).getS_Id();
                cols[1] = obj.get(i).getName();
                cols[2] = obj.get(i).getPsvd();
                cols[3] = obj.get(i).getEmail();
                model.addRow(cols);

            }
        }
    }

    void setTeacherListList() {

        ArrayList<Teacher> obj = University.getTechr();
        if (obj != null) {
            DefaultTableModel model = (DefaultTableModel) TechList.getModel();
            model.setRowCount(0);
            for (int i = 0; i < obj.size(); i++) {
                Object[] cols = new Object[6];
                cols[0] = obj.get(i).getT_id();
                cols[1] = obj.get(i).getName();
                cols[2] = obj.get(i).getPh_no();
                cols[3] = obj.get(i).getEmail();
                model.addRow(cols);
                  
            }
        }
    }
    void setitems(){
        techn.removeAllItems();
        for(int i=0;i<University.getTechr().size();i++){
        techn.addItem(University.getTechr().get(i).getName());
        }
    }
     void setstud(){
        stdn.removeAllItems();
        for(int i=0;i<University.stud.size();i++){
        stdn.addItem(University.getStud().get(i).getName());
        }
    }
    void setcourse(){

         for(int i=0;i<University.getCourses().size();i++){
        
        
             crstn.addItem(University.courses.get(i).getName());
        
        }
    }
    void setcoursestd(){
crsn.removeAllItems();
         for(int i=0;i<University.getCourses().size();i++){
        
        
             crsn.addItem(University.courses.get(i).getName());
        
        }
    }
   
    ArrayList<Enrollment> obj =  University.getEnrollments();

    void setStudentEnrollList() {

        if (obj != null) {
            DefaultTableModel model = (DefaultTableModel) StdEnrol.getModel();
            model.setRowCount(0);
            for (int i = 0; i < obj.size(); i++) {
                Object[] cols = new Object[6];
                cols[0] = obj.get(i).getStd().getName();
                cols[1] = obj.get(i).getCourse().getName();
                cols[2] = obj.get(i).getSec().getName();
                cols[3] = obj.get(i).getStatus();
                model.addRow(cols);

            }
        }
    }

    public Dashbord() {
        initComponents();
        sections = new ArrayList();
        this.setTitle("Admin Portal");
       setStudentList();
        setTeacherListList();
        setStudentEnrollList();
        studno.setText(University.getStud().size()+"+");
        crsnno.setText(University.getCourses().size()+"+");
        techno.setText(University.techr.size()+"+");
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        profile = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        profilebtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        course = new javax.swing.JLabel();
        ad = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        studno = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        crsnno = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        techno = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        course_name = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        course_code = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        dellet = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sectionL = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        pswd2 = new javax.swing.JPasswordField();
        user = new javax.swing.JComboBox<>();
        pswd = new javax.swing.JPasswordField();
        name = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        TechList = new javax.swing.JTable();
        jLabel46 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        techn = new javax.swing.JComboBox<>();
        crstn = new javax.swing.JComboBox<>();
        secttn = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        loadList = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        StdEnrol = new javax.swing.JTable();
        box = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        StdList = new javax.swing.JTable();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        stdn = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        EnrolList = new javax.swing.JTable();
        crsn = new javax.swing.JComboBox<>();
        sect = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        profiletop = new javax.swing.JMenu();
        profileLogOut = new javax.swing.JMenuItem();
        ProfileOpenbar1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 40, 0, 0));
        setLocation(new java.awt.Point(100, 40));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profile.setBackground(new java.awt.Color(26, 54, 54));
        profile.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("bilal9110");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Profile type");

        jLabel4.setBackground(new java.awt.Color(25, 34, 47));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Admin");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("9110");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        logout.setText("login_out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profileLayout = new javax.swing.GroupLayout(profile);
        profile.setLayout(profileLayout);
        profileLayout.setHorizontalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileLayout.createSequentialGroup()
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profileLayout.createSequentialGroup()
                        .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profileLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(profileLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(logout)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileLayout.createSequentialGroup()
                        .addGap(0, 26, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        profileLayout.setVerticalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, -1, -1));
        profile.setVisible(false);

        jPanel1.setBackground(new java.awt.Color(25, 34, 47));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("University of Mangment");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));

        profilebtn.setBackground(new java.awt.Color(102, 102, 102));
        profilebtn.setForeground(new java.awt.Color(255, 255, 255));
        profilebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/assit/user_1.png"))); // NOI18N
        profilebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilebtnActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Profile");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(profilebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addComponent(profilebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 0, 930, -1));

        jPanel3.setBackground(new java.awt.Color(25, 34, 47));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        home.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user.png"))); // NOI18N
        home.setText("Home");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
        });

        course.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        course.setForeground(new java.awt.Color(255, 255, 255));
        course.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/course_icon.png"))); // NOI18N
        course.setText("Course");
        course.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                courseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                courseMouseExited(evt);
            }
        });

        ad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ad.setForeground(new java.awt.Color(255, 255, 255));
        ad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/list.png"))); // NOI18N
        ad.setText("Add User");
        ad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adMouseExited(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/setting_1.png"))); // NOI18N
        jLabel13.setText("Setting");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logout.png"))); // NOI18N
        jLabel14.setText("logout");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/student_1.png"))); // NOI18N
        jLabel31.setText("Students");
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel31MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel31MouseExited(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/teacher_1.png"))); // NOI18N
        jLabel32.setText("Teachers");
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel32MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3))
                            .addComponent(jLabel10)
                            .addComponent(home)
                            .addComponent(ad)))
                    .addComponent(course)
                    .addComponent(jLabel32)
                    .addComponent(jLabel13))
                .addGap(71, 71, 71))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(home)
                .addGap(31, 31, 31)
                .addComponent(course)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(ad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addGap(26, 26, 26)
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(26, 26, 26)
                .addComponent(jLabel14)
                .addGap(98, 98, 98))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 550));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(25, 34, 47));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Student");

        studno.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        studno.setForeground(new java.awt.Color(255, 255, 255));
        studno.setText("500+");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(studno, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studno)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 53, -1, 127));

        jPanel9.setBackground(new java.awt.Color(25, 34, 47));

        jLabel19.setBackground(new java.awt.Color(25, 34, 47));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Course");

        crsnno.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        crsnno.setForeground(new java.awt.Color(255, 255, 255));
        crsnno.setText("500+");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(crsnno, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crsnno)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 53, -1, -1));

        jPanel10.setBackground(new java.awt.Color(25, 34, 47));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Teacher");

        techno.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        techno.setForeground(new java.awt.Color(255, 255, 255));
        techno.setText("500+");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(techno, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(219, 219, 219))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(techno)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 218, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/assit/wp2508260.jpg"))); // NOI18N
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 930, 490));

        jTabbedPane2.addTab("Welcome", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Course");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 18, -1, -1));

        course_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_nameActionPerformed(evt);
            }
        });
        jPanel5.add(course_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 49, 201, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Course code");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 18, 107, -1));

        course_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_codeActionPerformed(evt);
            }
        });
        jPanel5.add(course_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 49, 195, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add.png"))); // NOI18N
        jLabel23.setText("Section");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel23MouseExited(evt);
            }
        });
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 89, -1, -1));

        dellet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dellet.setForeground(new java.awt.Color(255, 255, 255));
        dellet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete.png"))); // NOI18N
        dellet.setText("Section");
        dellet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delletMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delletMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delletMouseExited(evt);
            }
        });
        jPanel5.add(dellet, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 89, -1, 31));

        sectionL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Section Name", "Days", "Time"
            }
        ));
        sectionL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sectionLMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sectionL);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 528, 218));

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add1_2.png"))); // NOI18N
        jButton1.setText("Add");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 90, 30));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/assit/wp2508260.jpg"))); // NOI18N
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 460));

        jTabbedPane2.addTab("Course ", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(25, 34, 47));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADD USER", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Confirm Password");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Name");

        pswd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswd2ActionPerformed(evt);
            }
        });

        user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Teacher" }));
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        pswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswdActionPerformed(evt);
            }
        });

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("User");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Password");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pswd2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel26)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pswd, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel27)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jButton2)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addGap(2, 2, 2)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton2)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 360, 370));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/assit/wp2508260.jpg"))); // NOI18N
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 460));

        jTabbedPane2.addTab("Add User", jPanel6);

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane3MouseClicked(evt);
            }
        });

        jPanel16.setBackground(new java.awt.Color(25, 34, 47));

        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });

        TechList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Teacher", "phno", "email"
            }
        ));
        jScrollPane5.setViewportView(TechList);

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Search");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Teacher List", jPanel16);

        jPanel17.setBackground(new java.awt.Color(25, 34, 47));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Teacher Name");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Course");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Section");

        techn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Teacher--" }));
        techn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                technActionPerformed(evt);
            }
        });

        crstn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--sellect--" }));
        crstn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                crstnItemStateChanged(evt);
            }
        });
        crstn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crstnActionPerformed(evt);
            }
        });
        crstn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                crstnPropertyChange(evt);
            }
        });
        crstn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                crstnKeyPressed(evt);
            }
        });

        secttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secttnActionPerformed(evt);
            }
        });

        loadList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Course", "Section"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(loadList);

        jButton5.setBackground(new java.awt.Color(0, 102, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add_1.png"))); // NOI18N
        jButton5.setText("Assgin");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(techn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crstn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(secttn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addGap(25, 25, 25))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(techn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crstn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secttn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Teacher Course", jPanel17);

        jPanel15.setBackground(new java.awt.Color(25, 34, 47));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Search");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });

        StdEnrol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NAME", "COURSE", "SECTION", "Status"
            }
        ));
        jScrollPane4.setViewportView(StdEnrol);
        if (StdEnrol.getColumnModel().getColumnCount() > 0) {
            StdEnrol.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(box));
        }

        box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--", "Pending", "Canceil", "Aproved" }));
        box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 102, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/upload_2.png"))); // NOI18N
        jButton4.setText("Resolve");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Student portal", jPanel15);

        jPanel12.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 6, -1, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/assit/wp2508260.jpg"))); // NOI18N
        jPanel12.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 460));

        jTabbedPane2.addTab("Teacher", jPanel12);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });
        jPanel13.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 37, 460, -1));

        StdList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "s_id", "name", "pasword", "Email"
            }
        ));
        jScrollPane2.setViewportView(StdList);

        jPanel13.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 500, 250));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Search Student");
        jPanel13.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 6, -1, -1));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/assit/wp2508260.jpg"))); // NOI18N
        jPanel13.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 380));

        jTabbedPane1.addTab("List", jPanel13);

        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stdn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Student--", "Ali Ahamad", "Junaid Sultan", "Aila Arshad", " " }));
        stdn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdnActionPerformed(evt);
            }
        });
        jPanel14.add(stdn, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 44, 164, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Student Name");
        jPanel14.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 16, -1, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/teacher_2.png"))); // NOI18N
        jLabel34.setText("Teacher");
        jPanel14.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 106, 122, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Section");
        jPanel14.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 16, -1, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Course");
        jPanel14.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 16, -1, -1));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Teacher Name");
        jPanel14.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 107, -1, -1));

        jButton3.setBackground(new java.awt.Color(51, 102, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/course_icon.png"))); // NOI18N
        jButton3.setText("Enroll");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 103, 92, -1));

        EnrolList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student", "course", "section", "status"
            }
        ));
        jScrollPane3.setViewportView(EnrolList);

        jPanel14.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 151, 504, 197));

        crsn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Course--", "Programming Fundamental", "Object Oriented Programming", "Mobile App Development", "Web App Development ", "Machine Learning" }));
        crsn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                crsnItemStateChanged(evt);
            }
        });
        crsn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crsnActionPerformed(evt);
            }
        });
        jPanel14.add(crsn, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 44, 163, -1));

        sect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Section--", "W1", "W2", "W3", "W4", "W5", "W6" }));
        sect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectActionPerformed(evt);
            }
        });
        jPanel14.add(sect, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 44, 134, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/assit/wp2508260.jpg"))); // NOI18N
        jPanel14.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 920, 380));

        jTabbedPane1.addTab("Enrol", jPanel14);

        jPanel7.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 9, 650, 400));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/assit/wp2508260.jpg"))); // NOI18N
        jPanel7.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 930, 500));

        jTabbedPane2.addTab("Student", jPanel7);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 920, 480));

        profiletop.setText("File");

        profileLogOut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        profileLogOut.setText("logout");
        profileLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileLogOutActionPerformed(evt);
            }
        });
        profiletop.add(profileLogOut);

        ProfileOpenbar1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ProfileOpenbar1.setText("Profile");
        ProfileOpenbar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileOpenbar1ActionPerformed(evt);
            }
        });
        profiletop.add(ProfileOpenbar1);

        jMenuBar1.add(profiletop);

        jMenu6.setText("Aboutus ");
        jMenuBar1.add(jMenu6);

        jMenu5.setText("Setting");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int i = 1;
    private void profilebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilebtnActionPerformed
        // TODO add your handling code here:

        if (i == 1) {
            profile.setVisible(true);
            i = 0;
        } else {
            profile.setVisible(false);
            i = 1;
        }


    }//GEN-LAST:event_profilebtnActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        new Dashbord1().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void profileLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileLogOutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        new Dashbord1().setVisible(true);

    }//GEN-LAST:event_profileLogOutActionPerformed

    private void ProfileOpenbar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileOpenbar1ActionPerformed
        // TODO add your handling code here:
        profile.setVisible(true);
    }//GEN-LAST:event_ProfileOpenbar1ActionPerformed

    private void course_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course_nameActionPerformed

    private void course_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course_codeActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked

        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(0);
           studno.setText(University.getStud().size()+"+");
        crsnno.setText(University.getCourses().size()+"+");
        techno.setText(University.techr.size()+"+");
    }//GEN-LAST:event_homeMouseClicked

    private void courseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseMouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_courseMouseClicked

    private void adMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adMouseClicked

        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_adMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked

// TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) sectionL.getModel();
        Object[] row = new Object[1];
        model.addRow(row);
        sectionL.setModel(model);

    }//GEN-LAST:event_jLabel23MouseClicked

    private void delletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delletMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) sectionL.getModel();
        if (model.getRowCount() > 0) {
            model.removeRow(model.getRowCount() - 1);
            sectionL.setModel(model);
        }
    }//GEN-LAST:event_delletMouseClicked

    private void sectionLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sectionLMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_sectionLMouseClicked

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here
        if(!name.getText().isEmpty()&&
               !new String( pswd.getPassword()).isEmpty()
                &&!new String(pswd2.getPassword()).isEmpty()){
            
            if(user.getSelectedItem().toString().equals("Student"))
            {
                if(new String( pswd.getPassword()).equals(new String(pswd2.getPassword())) )
                {               Student s1=new Student();
                s1.setName(name.getText());
                s1.setPsvd(new String( pswd.getPassword()));
                University.addstudent(s1);
            }
            }
            else{
                if(new String( pswd.getPassword()).equals(new String(pswd2.getPassword())))
                {              
                    Teacher s1=new Teacher();
                s1.setName(name.getText());
                s1.setTpswd(new String( pswd.getPassword()));
                University.addtecher(s1);
            }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(4);
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (!stdn.getSelectedItem().toString().equals("--Select Student--")
                && !crsn.getSelectedItem().toString().equals("--Select Course--")
                && !sect.getSelectedItem().toString().equals("--Select Section--")) {
            if(University.checkenrol(stdn.getSelectedItem().toString(), crsn.getSelectedItem().toString(), sect.getSelectedItem().toString() )){
            DefaultTableModel model = (DefaultTableModel) EnrolList.getModel();
            Object[] data = new Object[4];
            data[0] = stdn.getSelectedItem().toString();
            data[1] = crsn.getSelectedItem().toString();
            data[2] = sect.getSelectedItem().toString();
            data[3] = "Pennding";
            model.addRow(data);
            Enrollment stdEnrol = new Enrollment();
            stdEnrol.setStd(University.checkstdE(stdn.getSelectedItem().toString()));
            stdEnrol.setCourse(University.checkcourse(crsn.getSelectedItem().toString()));
           
            stdEnrol.setSec( stdEnrol.getCourse().checksection(sect.getSelectedItem().toString()));
            stdEnrol.setStatus("Pending");
            University.enrollments.add(stdEnrol);
            University.erorr("Added Succesfully");
        
        }
        else{
            University.erorr(stdn.getSelectedItem().toString()+" is already enrolled");
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    private void stdnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stdnActionPerformed

    private void crsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crsnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crsnActionPerformed

    private void sectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void technActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_technActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_technActionPerformed

    private void crstnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crstnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crstnActionPerformed

    private void secttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secttnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secttnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (!techn.getSelectedItem().toString().equals("--Select Student--")
                && !crstn.getSelectedItem().toString().equals("--Select Course--")
                && !secttn.getSelectedItem().toString().equals("--Select Section--")) {
         if(University.ceckworkload(techn.getSelectedItem().toString(),crstn.getSelectedItem().toString() , secttn.getSelectedItem().toString())){
            WorkLoad TecL = new WorkLoad();
            TecL.setCourse(University.checkcourse(crstn.getSelectedItem().toString()));
           TecL.setSec(TecL.getCourse().checksection(secttn.getSelectedItem().toString()));
            TecL.setTeacher(University.checkteacher(techn.getSelectedItem().toString()));
            University.workLoads.add(TecL);
            
            DefaultTableModel model = (DefaultTableModel) loadList.getModel();
            Object[] data = new Object[3];
            data[0] = techn.getSelectedItem().toString();
            data[1] = crstn.getSelectedItem().toString();
            data[2] = secttn.getSelectedItem().toString();

            model.addRow(data);

            
            University.erorr("AddedSuccesfully");
         }
         else{
             University.erorr(techn.getSelectedItem().toString()+" IS ALready enroll in this Section");
         }
        }
        

    }//GEN-LAST:event_jButton5ActionPerformed

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        // TODO add your handling code here:
        home.setBorder(new MatteBorder(0, 0, 2, 0, Color.WHITE));


    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        // TODO add your handling code here:
        home.setBorder(null);
    }//GEN-LAST:event_homeMouseExited

    private void courseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseMouseEntered
        // TODO add your handling code here:
        course.setBorder(new MatteBorder(0, 0, 2, 0, Color.WHITE));
    }//GEN-LAST:event_courseMouseEntered

    private void courseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseMouseExited
        // TODO add your handling code here:
        course.setBorder(null);
    }//GEN-LAST:event_courseMouseExited

    private void adMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adMouseEntered
        // TODO add your handling code here:
        ad.setBorder(new MatteBorder(0, 0, 2, 0, Color.WHITE));
    }//GEN-LAST:event_adMouseEntered

    private void adMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adMouseExited
        // TODO add your handling code here:
        ad.setBorder(null);
    }//GEN-LAST:event_adMouseExited

    private void jLabel31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseEntered
        // TODO add your handling code here:
        jLabel31.setBorder(new MatteBorder(0, 0, 2, 0, Color.white));
    }//GEN-LAST:event_jLabel31MouseEntered

    private void jLabel31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseExited
        // TODO add your handling code here
        jLabel31.setBorder(null);

    }//GEN-LAST:event_jLabel31MouseExited

    private void jLabel32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseEntered
        // TODO add your handling code here:
        jLabel32.setBorder(new MatteBorder(0, 0, 2, 0, Color.white));
    }//GEN-LAST:event_jLabel32MouseEntered

    private void jLabel32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseExited
        // TODO add your handling code here:
        jLabel32.setBorder(null);
    }//GEN-LAST:event_jLabel32MouseExited

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        // TODO add your handling code here:
        jLabel13.setBorder(new MatteBorder(0, 0, 2, 0, Color.white));
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        // TODO add your handling code here:
        jLabel13.setBorder(null);
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        new Dashbord1().setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        // TODO add your handling code here:
        jLabel14.setBorder(new MatteBorder(0, 0, 2, 0, Color.white));
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        // TODO add your handling code here:
        jLabel14.setBorder(null);
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseEntered
        // TODO add your handling code here:
        jLabel23.setBorder(new MatteBorder(0, 0, 2, 0, Color.white));
    }//GEN-LAST:event_jLabel23MouseEntered

    private void delletMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delletMouseEntered
        // TODO add your handling code here:
        dellet.setBorder(new MatteBorder(0, 0, 2, 0, Color.white));
    }//GEN-LAST:event_delletMouseEntered

    private void jLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseExited
        // TODO add your handling code here:
        jLabel23.setBorder(null);
    }//GEN-LAST:event_jLabel23MouseExited

    private void delletMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delletMouseExited
        // TODO add your handling code here:
        dellet.setBorder(null);
    }//GEN-LAST:event_delletMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (!course_name.getText().isEmpty()
                && !course_code.getText().isEmpty()) {
            Course c = new Course();
            c.setName(course_name.getText());
            c.setC_code(course_code.getText());
            DefaultTableModel model = (DefaultTableModel) sectionL.getModel();
            Section section = null;
            if (model.getRowCount() > 0 && model != null) {
                section = new Section();
                for (int i = 0; i < model.getRowCount(); i++) {//rows
                    for (int j = 0; j < model.getColumnCount(); j++) {//columns
                        section.setName(model.getValueAt(i, j).toString());
                        section.setClass_days(model.getValueAt(i, j).toString());
                        section.setClass_time_slot(model.getValueAt(i, j).toString());
                    }
                    sections.add(section);
                }
                c.setSections(sections);
                boolean dis = University.createCourse(c);
                String msg = (dis) ? "course create successfully" : "something went wrong";
                University.erorr(msg);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) StdEnrol.getModel();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!jTextField5.getText().isEmpty()) {
                Enrollment e = University.checkEnrol(jTextField5.getText());

                model.setRowCount(0);
                Object[] cols = new Object[4];
                cols[0] = e.getStd().getName();
                cols[1] = e.getCourse().getName();
                cols[2] = e.getSec().getName();
                cols[3] = e.getStatus();
                model.addRow(cols);

            } else {

                setStudentEnrollList();
            }

        }


    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_jTextField6MouseClicked

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) TechList.getModel();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!jTextField6.getText().isEmpty()) {
                Teacher T = University.checkteacher(jTextField6.getText());

                model.setRowCount(0);
                Object[] cols = new Object[4];
                cols[0] = T.getT_id();
                cols[1] = T.getName();
                cols[2] = T.getPh_no();
                cols[3] = T.getEmail();
                model.addRow(cols);

            } else {
                setTeacherListList();
            }
        }


    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) StdList.getModel();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!jTextField3.getText().isEmpty()) {
                Student T = University.checkstdE(jTextField3.getText());

                model.setRowCount(0);
                Object[] cols = new Object[4];
                cols[0] = T.getS_Id();
                cols[1] = T.getName();
                cols[2] = T.getPsvd();
                cols[3] = T.getEmail();
                model.addRow(cols);

            } else {
                setStudentEnrollList();
            }
        }

    }//GEN-LAST:event_jTextField3KeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel model = (DefaultTableModel) StdEnrol.getModel();

        for (int i = 0 ; i < obj.size(); i++) 
        {
            if (model.getValueAt(i, 3).toString().equals("Aproved")) 
            {
                 University.erorr(model.getValueAt(i, 3).toString());
                
                obj.get(i).setStatus(model.getValueAt(i, 3).toString());
                for (int j = 0; j < University.atend.size(); j++) 
                {
                    
                    
                    if (University.atend.get(j).getCourse().getName().equals(obj.get(i).getCourse().getName()) && University.atend.get(j).getSec().getName().equals(obj.get(i).getSec().getName()))
                    {
                        if (model.getValueAt(i, 3).toString().equals("Aproved")) 
            {
                        University.erorr(obj.get(i).getCourse().getName());
                        University.atend.get(j).setStd(obj.get(i).getStd());
                        obj.remove(i);
                        setStudentEnrollList();
            }
                    }
                }
            }
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        setStudentList();
        setstud();
        setcoursestd();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jTabbedPane3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane3MouseClicked
        // TODO add your handling code here:
           setitems();
            setTeacherListList();
      setStudentEnrollList();
      crstn.removeAllItems();      
      setcourse();
      
     
    }//GEN-LAST:event_jTabbedPane3MouseClicked

    private void crstnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_crstnItemStateChanged
        // TODO add your handling code here:
         secttn.removeAllItems();
        for(int j=0;j<University.courses.size();j++){
            if(crstn.getSelectedItem()!=null){
        if(crstn.getSelectedItem().toString().equals(University.courses.get(j).getName()))
        {
            
         for(int i = 0 ; i< University.courses.get(j).getSections().size();i++){
        secttn.addItem(University.courses.get(j).getSections().get(i).getName());
        }
        }
        }
        }
    }//GEN-LAST:event_crstnItemStateChanged

    private void crstnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_crstnKeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_crstnKeyPressed

    private void crstnPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_crstnPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_crstnPropertyChange

    private void crsnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_crsnItemStateChanged
        // TODO add your handling code here:
        
         sect.removeAllItems();
        for(int j=0;j<University.courses.size();j++){
            if(crsn.getSelectedItem()!=null){
        if(crsn.getSelectedItem().toString().equals(University.courses.get(j).getName()))
        {
            
         for(int i = 0 ; i< University.courses.get(j).getSections().size();i++){
        sect.addItem(University.courses.get(j).getSections().get(i).getName());
        }
        }
        }
        }
    }//GEN-LAST:event_crsnItemStateChanged

    private void pswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswdActionPerformed

    private void pswd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswd2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandufeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashbord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EnrolList;
    private javax.swing.JMenuItem ProfileOpenbar1;
    public javax.swing.JTable StdEnrol;
    private javax.swing.JTable StdList;
    private javax.swing.JTable TechList;
    private javax.swing.JLabel ad;
    private javax.swing.JComboBox<String> box;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel course;
    private javax.swing.JTextField course_code;
    private javax.swing.JTextField course_name;
    private javax.swing.JComboBox<String> crsn;
    private javax.swing.JLabel crsnno;
    private javax.swing.JComboBox<String> crstn;
    private javax.swing.JLabel dellet;
    private javax.swing.JLabel home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable loadList;
    private javax.swing.JButton logout;
    private javax.swing.JTextField name;
    public javax.swing.JPanel profile;
    private javax.swing.JMenuItem profileLogOut;
    private javax.swing.JButton profilebtn;
    private javax.swing.JMenu profiletop;
    private javax.swing.JPasswordField pswd;
    private javax.swing.JPasswordField pswd2;
    private javax.swing.JComboBox<String> sect;
    private javax.swing.JTable sectionL;
    private javax.swing.JComboBox<String> secttn;
    private javax.swing.JComboBox<String> stdn;
    private javax.swing.JLabel studno;
    private javax.swing.JComboBox<String> techn;
    private javax.swing.JLabel techno;
    private javax.swing.JComboBox<String> user;
    // End of variables declaration//GEN-END:variables
}
