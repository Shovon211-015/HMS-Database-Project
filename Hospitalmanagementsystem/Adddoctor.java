
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

public class Adddoctor extends javax.swing.JFrame {

    public Adddoctor() {
        initComponents();
    showDate();
    showTime();
    
    try{ Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/perarhospital","root","");
            String sql= "SELECT*, count(D_ID)+1 as did FROM doctor";
            pst=con.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)jTable2.getModel();
            tm.setRowCount(0);
            while(rs.next()){
                Object o[]={rs.getString("did")};
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
        jLabel1 = new javax.swing.JLabel();
        docname = new javax.swing.JLabel();
        dn = new javax.swing.JTextField();
        Patfathername = new javax.swing.JLabel();
        pstart = new javax.swing.JTextField();
        mobileno = new javax.swing.JLabel();
        PNO = new javax.swing.JTextField();
        illness = new javax.swing.JLabel();
        dpt = new javax.swing.JComboBox<>();
        dept = new javax.swing.JTextField();
        datelab = new javax.swing.JLabel();
        timelab = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Gender = new javax.swing.JLabel();
        AGE = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        qual = new javax.swing.JTextField();
        pend = new javax.swing.JTextField();
        di = new javax.swing.JLabel();
        did = new javax.swing.JTextField();
        as = new javax.swing.JLabel();
        achiv = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        as1 = new javax.swing.JLabel();
        sl = new javax.swing.JTextField();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        setForeground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("New Doctor Entry FORM");

        docname.setText("Doctor Name:");

        dn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dnActionPerformed(evt);
            }
        });

        Patfathername.setText("Patient Seeing Start Time ");

        mobileno.setText("Mobile Number:");

        illness.setText("Depertment");

        dpt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicine", "Surgical", "ENT", "Cardiology" }));
        dpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dptActionPerformed(evt);
            }
        });

        dept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptActionPerformed(evt);
            }
        });

        datelab.setText("Date:");

        timelab.setText("time");

        Add.setText("ADD");
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

        Gender.setText("Patient Seeing End Time");

        AGE.setText("Email");

        address.setText("Qualification");

        pend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendActionPerformed(evt);
            }
        });

        di.setText("Doctor ID");

        as.setText("Achivement");

        achiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                achivActionPerformed(evt);
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
                "Probable ID"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jButton1.setText("GET ID");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        as1.setText("Achivement");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mobileno)
                    .addComponent(Patfathername)
                    .addComponent(docname)
                    .addComponent(Gender)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(AGE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(illness, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(address, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(as, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(as1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(di))
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
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Add))
                            .addComponent(qual)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(dpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dept))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(did, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dn, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                    .addComponent(pstart, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PNO, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pend, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(achiv)
                            .addComponent(sl))
                        .addGap(237, 237, 237))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 187, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(135, 135, 135)
                        .addComponent(Back))
                    .addComponent(jButton1))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Back)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datelab)
                    .addComponent(timelab))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(di)
                    .addComponent(did, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(docname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Patfathername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pstart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AGE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(illness, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dpt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qual, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(achiv, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(as1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(Add)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    Connection con;
    PreparedStatement pst,pst1;
    
    public void connect(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/perarhospital","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Adddoctor.class.getName()).log(Level.SEVERE,null,ex);
        }catch (SQLException ex) {
            Logger.getLogger(Adddoctor.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        dept.setText(dpt.getSelectedItem().toString());
        connect();

            try{
                String sql = "insert into doctor values (?,?,?,?,?,?,?,?,?,?)";
            
                pst = con.prepareStatement(sql);
            
                //pst.setString(1, pno+1);
                pst.setString(1, did.getText());
                pst.setString(2, dn.getText());
                pst.setString(3, pstart.getText());
                pst.setString(4, pend.getText());
                pst.setString(5, qual.getText());
                pst.setString(6, achiv.getText());
                pst.setString(7, email.getText());
                pst.setString(8, PNO.getText());
                pst.setString(9, sl.getText());
                pst.setString(10, dept.getText());
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Data inserted successfully");
                
                setVisible(false);
                new Adddoctor().setVisible(true);
            }catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
                Logger.getLogger(Adddoctor.class.getName()).log(Level.SEVERE,null,ex);
            }
    }//GEN-LAST:event_AddActionPerformed

    private void dptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dptActionPerformed
    }//GEN-LAST:event_dptActionPerformed

    private void dnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dnActionPerformed
    }//GEN-LAST:event_dnActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Admin_Panel obj=new Admin_Panel();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void deptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deptActionPerformed

    private void pendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pendActionPerformed

    private void achivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_achivActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_achivActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int row=jTable2.getSelectedRow();
        did.setText(jTable2.getModel().getValueAt(row, 0).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{ Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/perarhospital","root","");
            String sql= "SELECT*, count(D_ID)+1 as did FROM doctor";
            pst=con.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)jTable2.getModel();
            tm.setRowCount(0);
            while(rs.next()){
                Object o[]={rs.getString("did")};
                tm.addRow(o);
            }
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
                Logger.getLogger(Module1.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adddoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Adddoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AGE;
    private javax.swing.JButton Add;
    private javax.swing.JButton Back;
    private javax.swing.JLabel Gender;
    private javax.swing.JTextField PNO;
    private javax.swing.JLabel Patfathername;
    private javax.swing.JTextField achiv;
    private javax.swing.JLabel address;
    private javax.swing.JLabel as;
    private javax.swing.JLabel as1;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel datelab;
    private javax.swing.JTextField dept;
    private javax.swing.JLabel di;
    private javax.swing.JTextField did;
    private javax.swing.JTextField dn;
    private javax.swing.JLabel docname;
    private javax.swing.JComboBox<String> dpt;
    private javax.swing.JTextField email;
    private javax.swing.JLabel illness;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel mobileno;
    private java.awt.Panel panel1;
    private javax.swing.JTextField pend;
    private javax.swing.JTextField pstart;
    private javax.swing.JTextField qual;
    private javax.swing.JTextField sl;
    private javax.swing.JLabel timelab;
    // End of variables declaration//GEN-END:variables
}
