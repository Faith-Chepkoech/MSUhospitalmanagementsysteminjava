import javax.swing.JOptionPane;
import project.connectionprovider;
import java.sql.*;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FAITH
 */
public class addpatientrecord extends javax.swing.JFrame {

    /**
     * Creates new form addpatientrecord
     */
    public addpatientrecord() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        kin = new javax.swing.JTextField();
        major = new javax.swing.JTextField();
        residence = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(700, 150));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Patient ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("Contact");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("Age");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, 38));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 255));
        jLabel9.setText("Next of kin");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, 33));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 255));
        jLabel7.setText("Any major disease suffered before");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, 28));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 204));
        jLabel13.setText("Residence");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, -1, -1));

        id.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        id.setMaximumSize(new java.awt.Dimension(8, 5));
        id.setMinimumSize(new java.awt.Dimension(8, 5));
        id.setPreferredSize(new java.awt.Dimension(50, 20));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 170, -1));

        name.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        name.setMaximumSize(new java.awt.Dimension(8, 5));
        name.setMinimumSize(new java.awt.Dimension(8, 5));
        name.setPreferredSize(new java.awt.Dimension(50, 20));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 180, -1));

        contact.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contact.setMaximumSize(new java.awt.Dimension(8, 5));
        contact.setMinimumSize(new java.awt.Dimension(8, 5));
        contact.setPreferredSize(new java.awt.Dimension(50, 20));
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 190, -1));

        age.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        age.setMaximumSize(new java.awt.Dimension(8, 5));
        age.setMinimumSize(new java.awt.Dimension(8, 5));
        age.setPreferredSize(new java.awt.Dimension(50, 20));
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 180, -1));

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male ", "female" }));
        gender.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gender.setMaximumSize(new java.awt.Dimension(8, 5));
        gender.setMinimumSize(new java.awt.Dimension(8, 5));
        gender.setPreferredSize(new java.awt.Dimension(50, 20));
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 140, 30));

        kin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kin.setMaximumSize(new java.awt.Dimension(8, 5));
        kin.setMinimumSize(new java.awt.Dimension(8, 5));
        kin.setPreferredSize(new java.awt.Dimension(50, 20));
        getContentPane().add(kin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 180, -1));

        major.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        major.setPreferredSize(new java.awt.Dimension(50, 20));
        getContentPane().add(major, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 280, -1));

        residence.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        residence.setMaximumSize(new java.awt.Dimension(8, 5));
        residence.setMinimumSize(new java.awt.Dimension(8, 5));
        residence.setPreferredSize(new java.awt.Dimension(50, 20));
        getContentPane().add(residence, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 180, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save btn 4.jpeg"))); // NOI18N
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cls0.jpeg"))); // NOI18N
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rcdbcg1.jpeg"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 5));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rcdbcg1.jpeg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     int patientID=Integer.parseInt(id.getText());  
     String Name=name.getText();
     String Contact=contact.getText();
     String Age=age.getText();
     String Gender=(String)gender.getSelectedItem();
     String  nextofkin=kin.getText();
     String disease=major.getText();
     String Residence=residence.getText();
  
    try{
         Connection con=connectionprovider.getCon();
         //Class.forName("com.mysql.jdbc.Driver");
         //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","Test","Test123");
         Statement st=con.createStatement();
        JOptionPane.showMessageDialog(null,"correct data");
        //String sql="SELECT * FROM patient";
        //st.executeQuery(sql);
         st.executeUpdate("insert into patient values("+patientID+",'"+Name+"','"+Contact+"','"+Age+"','"+Gender+"','"+nextofkin+"','"+disease+"','"+Residence+"');");       //st.executeUpdate("insert into patient values(35,'fa','07','6','m','fhh','dis','hhjk');");
         JOptionPane.showMessageDialog(null,"succesfully updated");
         setVisible(false);
         new addpatientrecord().setVisible(true);
         
     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null,e);
         
         
     }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addpatientrecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addpatientrecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addpatientrecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addpatientrecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addpatientrecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JTextField contact;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField kin;
    private javax.swing.JTextField major;
    private javax.swing.JTextField name;
    private javax.swing.JTextField residence;
    // End of variables declaration//GEN-END:variables
}