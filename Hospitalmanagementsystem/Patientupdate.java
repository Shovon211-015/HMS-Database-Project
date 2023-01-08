
package Hospitalmanagementsystem;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Patientupdate extends javax.swing.JFrame {

    public Patientupdate() {
        initComponents();
        
        try{ Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/perarhospital","root","");
            String sql= "select * from module1";
            pst = con.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)Table.getModel();
            tm.setRowCount(0);
            while(rs.next()){
                Object o[]={rs.getString("P_ID"),rs.getString("NAME"),rs.getString("FATHER NAME"),rs.getString("MOBILE"),rs.getString("AGE"),rs.getString("Gender"),rs.getString("BLOOD GROUP"),rs.getString("ADDRESS"),rs.getString("ILLNESS"),rs.getString("ASTATUS"),rs.getString("DDATE"),rs.getString("ADATE")};
                tm.addRow(o);
            }
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    Connection con;
    PreparedStatement pst,pst1;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        Back = new javax.swing.JToggleButton();
        update = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jdisd = new javax.swing.JTextField();
        blg = new javax.swing.JTextField();
        jpid = new javax.swing.JTextField();
        jpname = new javax.swing.JTextField();
        jmno = new javax.swing.JTextField();
        jage = new javax.swing.JTextField();
        jg = new javax.swing.JTextField();
        jas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jad = new javax.swing.JTextField();
        as = new javax.swing.JComboBox<>();
        Blood = new javax.swing.JComboBox<>();
        gen = new javax.swing.JComboBox<>();
        father = new javax.swing.JLabel();
        jfn = new javax.swing.JTextField();
        jill = new javax.swing.JLabel();
        jdis = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setLocation(new java.awt.Point(100, 50));

        Table.setBackground(new java.awt.Color(204, 255, 255));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient's ID", "Patient Name", "Father name", "Mobile No", "Age", "Gender", "Blood Group", "Address", "ILLNESS", "Status", "discharge date", "Last Admit date"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Patient Update");

        search.setBackground(new java.awt.Color(0, 51, 102));
        search.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        Back.setText("GO BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(0, 153, 153));
        update.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(51, 51, 51));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel2.setText("Patient ID");

        jLabel3.setText("NAME");

        jLabel4.setText("Mobile No");

        jLabel5.setText("AGE");

        jLabel6.setText("Gender");

        jLabel7.setText("Blood Group");

        jLabel8.setText("Discharge Date");

        jLabel9.setText("Admit Status");

        jdisd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdisdActionPerformed(evt);
            }
        });

        blg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blgActionPerformed(evt);
            }
        });

        jg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jgActionPerformed(evt);
            }
        });

        jas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jasActionPerformed(evt);
            }
        });

        jLabel10.setText("Admit Date");

        as.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOT Admited", "Admited" }));

        Blood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));

        gen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        father.setText("Father Name");

        jill.setText("Disease");

        jdis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addGap(502, 502, 502)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back)
                .addGap(114, 114, 114))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(father))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(gen, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jg, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Blood, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(blg, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jage, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jmno, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(415, 415, 415))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jpid, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                                .addComponent(jpname))
                                            .addComponent(jfn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(216, 216, 216)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel10)
                                            .addComponent(jill))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jdis, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jdisd, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                                .addComponent(jad))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jas, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jdisd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(father)
                            .addComponent(jfn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jill)
                            .addComponent(jdis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4))
                    .addComponent(jmno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(gen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Blood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(as, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        jg.setText(gen.getSelectedItem().toString());
        blg.setText(Blood.getSelectedItem().toString());
        jas.setText(as.getSelectedItem().toString());
        
        String id=jpid.getText();
        String name=jpname.getText();
        String phone=jmno.getText();
        String age=jage.getText();
        String gend=jg.getText();
        String bg=blg.getText();
        String admit=jas.getText();
        String dis=jdisd.getText();
        String add=jad.getText();
        
        
        try{ Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/perarhospital","root","");
            String sql= "SELECT* FROM `module1` WHERE `P_ID`="+id+" AND `NAME`='"+name+"' AND `MOBILE`='"+phone+"' AND `BLOOD GROUP`='"+bg+"' AND `GENDER`='"+gend+"' AND `AGE`="+age+" AND `ASTATUS`='"+admit+"'";
            pst = con.prepareStatement(sql);
            ResultSet rs= pst.executeQuery();
            DefaultTableModel tm=(DefaultTableModel)Table.getModel();
            tm.setRowCount(0);
            while(rs.next()){
                Object o[]={rs.getString("P_ID"),rs.getString("NAME"),rs.getString("FATHER NAME"),rs.getString("MOBILE"),rs.getString("AGE"),rs.getString("Gender"),rs.getString("BLOOD GROUP"),rs.getString("ADDRESS"),rs.getString("ILLNESS"),rs.getString("ASTATUS"),rs.getString("DDATE"),rs.getString("ADATE")};
                tm.addRow(o);
            }
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        MenuPage obj=new MenuPage();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        jas.setText(as.getSelectedItem().toString());
        String pid=jpid.getText();
        String pn=jpname.getText();
        String fn=jfn.getText();
        String mo=jmno.getText();
        String age=jage.getText();
        String blood=blg.getText();
        String ast=jas.getText();
        String dis=jad.getText();
        String add=jdisd.getText();
        String disease=jdis.getText();
        
        try{ Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/perarhospital","root","");
            String sql= "UPDATE `module1` SET `NAME`='"+pn+"',`FATHER NAME`='"+fn+"',`MOBILE`='"+mo+"',`ILLNESS`='"+disease+"',`BLOOD GROUP`='"+blood+"',`AGE`='"+age+"',`ASTATUS`='"+ast+"',`DDATE`='"+dis+"',`Adate`='"+add+"' WHERE `P_ID`="+pid;
            pst = con.prepareStatement(sql);
            pst.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "data inserted successfully");
                
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
        
        Patientupdate ob=new Patientupdate();
        ob.setVisible(true);
        dispose();
    }//GEN-LAST:event_updateActionPerformed

    private void jasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jasActionPerformed

    private void jgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jgActionPerformed

    private void jdisdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdisdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdisdActionPerformed

    private void blgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blgActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        int row=Table.getSelectedRow();
        
        jpid.setText(Table.getModel().getValueAt(row, 0).toString());
        jpname.setText(Table.getModel().getValueAt(row, 1).toString());
        jfn.setText(Table.getModel().getValueAt(row, 2).toString());
        jmno.setText(Table.getModel().getValueAt(row, 3).toString());
        jage.setText(Table.getModel().getValueAt(row, 4).toString());
        jg.setText(Table.getModel().getValueAt(row, 5).toString());
        blg.setText(Table.getModel().getValueAt(row, 6).toString());
        jdis.setText(Table.getModel().getValueAt(row, 8).toString());
        jas.setText(Table.getModel().getValueAt(row, 9).toString());
        jdisd.setText(Table.getModel().getValueAt(row, 10).toString());
        jad.setText(Table.getModel().getValueAt(row, 11).toString());
    }//GEN-LAST:event_TableMouseClicked

    private void jdisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jdisActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patientupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new Patientupdate().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Back;
    private javax.swing.JComboBox<String> Blood;
    private javax.swing.JTable Table;
    private javax.swing.JComboBox<String> as;
    private javax.swing.JTextField blg;
    private javax.swing.JLabel father;
    private javax.swing.JComboBox<String> gen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jad;
    private javax.swing.JTextField jage;
    private javax.swing.JTextField jas;
    private javax.swing.JTextField jdis;
    private javax.swing.JTextField jdisd;
    private javax.swing.JTextField jfn;
    private javax.swing.JTextField jg;
    private javax.swing.JLabel jill;
    private javax.swing.JTextField jmno;
    private javax.swing.JTextField jpid;
    private javax.swing.JTextField jpname;
    private javax.swing.JButton search;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
