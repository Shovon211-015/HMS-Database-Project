
package Hospitalmanagementsystem;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Module1 extends javax.swing.JFrame {

    public Module1() {
        initComponents();
        
        showDate();
        showTime();
        
        try{ Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/perarhospital","root","");
            String sql= "SELECT*, count(P_ID)+1 as Pid FROM module1";
            pst=con.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)jTable2.getModel();
            tm.setRowCount(0);
            while(rs.next()){
                Object o[]={rs.getString("Pid")};
                tm.addRow(o);
            }
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
                Logger.getLogger(Module1.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        
    }
    
    void showDate(){
    Date d=new Date();
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
        datelab.setText(s.format(d));
    }
    
    void showTime(){
    new Timer(0,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Date d=new Date();
            SimpleDateFormat s=new SimpleDateFormat("hh:mm:ss a");
            timelab.setText(s.format(d));
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }).start();
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        canvas1 = new java.awt.Canvas();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Patientname = new javax.swing.JLabel();
        pn = new javax.swing.JTextField();
        Patfathername = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        mobileno = new javax.swing.JLabel();
        PNO = new javax.swing.JTextField();
        illness = new javax.swing.JLabel();
        ill = new javax.swing.JComboBox<>();
        PI = new javax.swing.JTextField();
        DocChoose = new javax.swing.JLabel();
        Blood = new javax.swing.JComboBox<>();
        datelab = new javax.swing.JLabel();
        timelab = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Show = new javax.swing.JButton();
        Gender = new javax.swing.JLabel();
        gender1 = new javax.swing.JComboBox<>();
        AGE = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        address1 = new javax.swing.JTextField();
        blg = new javax.swing.JTextField();
        gend = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        as = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        astate = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        setForeground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("PATIENT FORM");

        jLabel2.setText("Enter you details");

        Patientname.setText("Patient Name:");

        pn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnActionPerformed(evt);
            }
        });

        Patfathername.setText("Father name:");

        mobileno.setText("Mobile Number:");

        illness.setText("Patient Illness:");

        ill.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fever", "Asthma", "Ear", "Nose", "Troat", "Heart", "Bloodpressure", "Cancer", "Bone Break" }));
        ill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                illActionPerformed(evt);
            }
        });

        PI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PIActionPerformed(evt);
            }
        });

        DocChoose.setText("Blood Group");

        Blood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        Blood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodActionPerformed(evt);
            }
        });

        datelab.setText("Date:");

        timelab.setText("time");

        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hospitalmanagementsystem/PIC/save-icon--1.png"))); // NOI18N
        Add.setText("Save");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Back.setText("GO BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Show.setText("View Doctor");
        Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });

        Gender.setText("Gender");

        gender1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHER" }));
        gender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gender1ActionPerformed(evt);
            }
        });

        AGE.setText("AGE");

        address.setText("ADDRESS");

        blg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blgActionPerformed(evt);
            }
        });

        gend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gendActionPerformed(evt);
            }
        });

        jLabel3.setText("Patient ID");

        as.setText("ADMIT Status");

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOT Admited", "Admited" }));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        astate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                astateActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Probably PID"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jButton3.setText("Get ID");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DocChoose)
                            .addComponent(mobileno)
                            .addComponent(Patfathername)
                            .addComponent(Patientname)
                            .addComponent(Gender)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(AGE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(illness, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(address, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(as, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel2)))
                .addGap(203, 203, 203)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(datelab)
                        .addGap(100, 100, 100)
                        .addComponent(timelab)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(address1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(gender1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ill, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PI, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(gend, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(pid, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pn, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                    .addComponent(fn, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PNO, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(age, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Blood, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(astate, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Add)
                                    .addComponent(blg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(Show)))
                        .addGap(33, 33, 33))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(174, 174, 174)
                .addComponent(Back)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(Back)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(datelab)
                            .addComponent(timelab))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Patientname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Patfathername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mobileno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AGE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DocChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Blood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(illness, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(astate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add)
                    .addComponent(Show))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    Connection con;
    PreparedStatement pst;
    
    public void connect(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/perarhospital","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Module1.class.getName()).log(Level.SEVERE,null,ex);
        }catch (SQLException ex) {
            Logger.getLogger(Module1.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        PI.setText(ill.getSelectedItem().toString());
        blg.setText(Blood.getSelectedItem().toString());
        gend.setText(gender1.getSelectedItem().toString());
        astate.setText(status.getSelectedItem().toString());

        int row=jTable2.getSelectedRow();
        pid.setText(jTable2.getModel().getValueAt(row, 0).toString());
        
        connect();
            try{
                String sql = "insert into `module1` values (?,?,?,?,?,?,?,?,?,?,?,?)";
            
                pst = con.prepareStatement(sql);
                
                pst.setString(1, pid.getText());
                pst.setString(2, pn.getText());
                pst.setString(3, fn.getText());
                pst.setString(4, PNO.getText());
                pst.setString(5, PI.getText());
                pst.setString(6, blg.getText());
                pst.setString(7, address1.getText());
                pst.setString(8, gend.getText());
                pst.setString(9, age.getText());
                pst.setString(10, astate.getText());
                pst.setString(11, null);
                pst.setString(12, null);
                pst.executeUpdate();
            
                JOptionPane.showMessageDialog(null, "data inserted successfully");
                
                setVisible(false);
                new Module1().setVisible(true);
            }catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
                Logger.getLogger(Module1.class.getName()).log(Level.SEVERE,null,ex);
            }
            
    }//GEN-LAST:event_AddActionPerformed

    private void illActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_illActionPerformed
    }//GEN-LAST:event_illActionPerformed

    private void pnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnActionPerformed
    }//GEN-LAST:event_pnActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        MenuPage obj=new MenuPage();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void BloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodActionPerformed
    }//GEN-LAST:event_BloodActionPerformed

    private void PIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PIActionPerformed

    private void gender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gender1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gender1ActionPerformed

    private void blgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blgActionPerformed

    private void gendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gendActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void astateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_astateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_astateActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int row=jTable2.getSelectedRow();
        pid.setText(jTable2.getModel().getValueAt(row, 0).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{ Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/perarhospital","root","");
            String sql= "SELECT*, count(P_ID)+1 as Pid FROM module1";
            pst=con.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)jTable2.getModel();
            tm.setRowCount(0);
            while(rs.next()){
                Object o[]={rs.getString("Pid")};
                tm.addRow(o);
            }
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
                Logger.getLogger(Module1.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed
        Showdoctor pi = new Showdoctor();
        pi.setVisible(true);
        dispose();
    }//GEN-LAST:event_ShowActionPerformed
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Module1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Module1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AGE;
    private javax.swing.JButton Add;
    private javax.swing.JButton Back;
    private javax.swing.JComboBox<String> Blood;
    private javax.swing.JLabel DocChoose;
    private javax.swing.JLabel Gender;
    private javax.swing.JTextField PI;
    private javax.swing.JTextField PNO;
    private javax.swing.JLabel Patfathername;
    private javax.swing.JLabel Patientname;
    private javax.swing.JButton Show;
    private javax.swing.JLabel address;
    private javax.swing.JTextField address1;
    private javax.swing.JTextField age;
    private javax.swing.JLabel as;
    private javax.swing.JTextField astate;
    private javax.swing.JTextField blg;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel datelab;
    private javax.swing.JTextField fn;
    private javax.swing.JTextField gend;
    private javax.swing.JComboBox<String> gender1;
    private javax.swing.JComboBox<String> ill;
    private javax.swing.JLabel illness;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel mobileno;
    private java.awt.Panel panel1;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pn;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JLabel timelab;
    // End of variables declaration//GEN-END:variables
}
