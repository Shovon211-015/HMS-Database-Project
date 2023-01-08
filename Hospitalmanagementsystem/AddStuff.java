
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

public class AddStuff extends javax.swing.JFrame {

    public AddStuff() {
        initComponents();
    showDate();
    showTime();
    
    try{ Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/perarhospital","root","");
            String sql= "SELECT*, count(ID)+1 as sid FROM Stuff";
            pst=con.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)jTable2.getModel();
            tm.setRowCount(0);
            while(rs.next()){
                Object o[]={rs.getString("sid")};
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
        sname = new javax.swing.JLabel();
        sn = new javax.swing.JTextField();
        Patfathername = new javax.swing.JLabel();
        sage = new javax.swing.JTextField();
        mobileno = new javax.swing.JLabel();
        SPNO = new javax.swing.JTextField();
        illness = new javax.swing.JLabel();
        work = new javax.swing.JComboBox<>();
        wt = new javax.swing.JTextField();
        datelab = new javax.swing.JLabel();
        timelab = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Gender = new javax.swing.JLabel();
        AGE = new javax.swing.JLabel();
        sdate = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        saddress = new javax.swing.JTextField();
        sgen = new javax.swing.JTextField();
        si = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        as = new javax.swing.JLabel();
        salary = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        get = new javax.swing.JButton();
        sg = new javax.swing.JComboBox<>();

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
        jLabel1.setText("New Stuff Entry FORM");

        sname.setText("Stuff Name:");

        sn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snActionPerformed(evt);
            }
        });

        Patfathername.setText("AGE");

        mobileno.setText("Mobile Number:");

        illness.setText("Work Type");

        work.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Account Manager", "Receptionist", "OT specialist", "Pharmacist", "Car_Reception", "Med_Reception", "Ent_Reception", "Sur_Reception", "Security", "Nurse", "Cleaner" }));
        work.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workActionPerformed(evt);
            }
        });

        wt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wtActionPerformed(evt);
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

        Gender.setText("Gender");

        AGE.setText("Work Starting Date");

        address.setText("Address");

        sgen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sgenActionPerformed(evt);
            }
        });

        si.setText("Stuff ID");

        as.setText("Salary");

        salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryActionPerformed(evt);
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

        get.setText("GET ID");
        get.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getActionPerformed(evt);
            }
        });

        sg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(get))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mobileno)
                            .addComponent(Patfathername)
                            .addComponent(sname)
                            .addComponent(Gender)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(AGE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(illness, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(address, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(as, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(si))
                        .addGap(203, 203, 203)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(datelab)
                                .addGap(100, 100, 100))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(salary, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(work, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(wt))
                                    .addComponent(sid, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sn, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                    .addComponent(sage, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SPNO, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sdate, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(saddress)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sg, 0, 101, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(sgen, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timelab)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(135, 135, 135)
                        .addComponent(Back)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Add)
                        .addGap(251, 251, 251))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(si)
                            .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Patfathername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(get)
                    .addComponent(sg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SPNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saddress, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(illness, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(work, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AGE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(salary))
                    .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(Add)
                .addGap(42, 42, 42))
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
            Logger.getLogger(AddStuff.class.getName()).log(Level.SEVERE,null,ex);
        }catch (SQLException ex) {
            Logger.getLogger(AddStuff.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        wt.setText(work.getSelectedItem().toString());
        sgen.setText(sg.getSelectedItem().toString());
        connect();

            try{
                String sql = "insert into Stuff values (?,?,?,?,?,?,?,?,?)";
            
                pst = con.prepareStatement(sql);
                
                pst.setString(1, sid.getText());
                pst.setString(2, sn.getText());
                pst.setString(3, sage.getText());
                pst.setString(4, sgen.getText());
                pst.setString(5, saddress.getText());
                pst.setString(6, SPNO.getText());
                pst.setString(7, wt.getText());
                pst.setString(8, sdate.getText());
                pst.setString(9, salary.getText());
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Data inserted successfully");
                
                setVisible(false);
                new AddStuff().setVisible(true);
            }catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
                Logger.getLogger(AddStuff.class.getName()).log(Level.SEVERE,null,ex);
            }
    }//GEN-LAST:event_AddActionPerformed

    private void workActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workActionPerformed
    }//GEN-LAST:event_workActionPerformed

    private void snActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snActionPerformed
    }//GEN-LAST:event_snActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Admin_Panel obj=new Admin_Panel();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void wtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wtActionPerformed

    private void sgenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sgenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sgenActionPerformed

    private void salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int row=jTable2.getSelectedRow();
        sid.setText(jTable2.getModel().getValueAt(row, 0).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void getActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getActionPerformed
        try{ Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/perarhospital","root","");
            String sql= "SELECT*, count(ID)+1 as sid FROM Stuff";
            pst=con.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)jTable2.getModel();
            tm.setRowCount(0);
            while(rs.next()){
                Object o[]={rs.getString("sid")};
                tm.addRow(o);
            }
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
                Logger.getLogger(Module1.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_getActionPerformed
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStuff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddStuff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AGE;
    private javax.swing.JButton Add;
    private javax.swing.JButton Back;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Patfathername;
    private javax.swing.JTextField SPNO;
    private javax.swing.JLabel address;
    private javax.swing.JLabel as;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel datelab;
    private javax.swing.JButton get;
    private javax.swing.JLabel illness;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel mobileno;
    private java.awt.Panel panel1;
    private javax.swing.JTextField saddress;
    private javax.swing.JTextField sage;
    private javax.swing.JTextField salary;
    private javax.swing.JTextField sdate;
    private javax.swing.JComboBox<String> sg;
    private javax.swing.JTextField sgen;
    private javax.swing.JLabel si;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField sn;
    private javax.swing.JLabel sname;
    private javax.swing.JLabel timelab;
    private javax.swing.JComboBox<String> work;
    private javax.swing.JTextField wt;
    // End of variables declaration//GEN-END:variables
}
