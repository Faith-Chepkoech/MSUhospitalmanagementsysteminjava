import java.sql.*;
import project.connectionprovider;
/*import java.sql.Connection;*/
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
//import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FAITH
 */
public class diagnosisinformation extends javax.swing.JFrame {
     public int flag=0;

    /**
     * Creates new form diagnosisinformation
     */
    public diagnosisinformation() {
        initComponents();
        
        type.setVisible(false);
         exist.setVisible(false);
          select.setVisible(false);
        
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
        exist = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        symptom = new javax.swing.JTextField();
        diagnosis = new javax.swing.JTextField();
        medicine = new javax.swing.JTextField();
        yes = new javax.swing.JCheckBox();
        select = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Patient ID");
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 30));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 77, 17));

        exist.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exist.setForeground(new java.awt.Color(255, 0, 0));
        exist.setText("Patient ID does not Exist!");
        getContentPane().add(exist, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 63, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Symptoms");
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 30));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 187, 77, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Diagnosis");
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 30));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 260, 68, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("medicine");
        jLabel5.setPreferredSize(new java.awt.Dimension(50, 30));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 328, 68, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Ward required?");
        jLabel6.setPreferredSize(new java.awt.Dimension(50, 30));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 187, 114, -1));

        type.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        type.setText("Type of Ward");
        type.setPreferredSize(new java.awt.Dimension(50, 30));
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 246, 100, -1));

        id.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 111, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search1.jpeg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 33, 70, 30));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
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
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable1ComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 88, -1, 55));

        symptom.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(symptom, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 194, 90, -1));

        diagnosis.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(diagnosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 262, 85, -1));

        medicine.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(medicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 335, 85, -1));

        yes.setText("Yes");
        yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesActionPerformed(evt);
            }
        });
        getContentPane().add(yes, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 185, -1, -1));

        select.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "general", "single" }));
        getContentPane().add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 246, 65, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save btn 4.jpeg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 306, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cls0.jpeg"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diagnisisbcg0.jpeg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesActionPerformed
        if(yes.isSelected())
      {
       type.setVisible(true);
       select.setVisible(true);
       
      }
      else 
      {
       type.setVisible(false);
       select.setVisible(false);
    }
  // TODO add your handling code here:
    }//GEN-LAST:event_yesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      //String patientID=id.getText();   
      int patientID=Integer.parseInt(id.getText());  
      
     try{
             Connection con=connectionprovider.getCon();
              Statement st=con.createStatement();
          //     ResultSet rs=st.executeQuery("select * FROM patient WHERE patientID = "+patientID+";");
            // ResultSet rs=st.executeQuery("SELECT*FROM patient WHERE patient ID = "+patientID+";");
            
             ResultSet rs=st.executeQuery("SELECT * FROM patient WHERE patientID = (54);");
               if(!rs.first())
                  exist.setVisible(true);
               else{
                 exist.setVisible(false);
                 id.setEditable(false);
                 flag=1;
                   
               }
     }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, e/*"connection error"*/);
             
         }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           if(flag==1);
           {
                int patientID=Integer.parseInt(id.getText());  
    
              // String patientID=id.getText();
               String Symptoms=symptom.getText();
               String Diagnosis=diagnosis.getText();
               String Medicine=medicine.getText();
               String wardreq;
               String typeward;
               if(yes.isSelected())
               {
                wardreq="Yes"; 
                typeward=(String)select.getSelectedItem();
               }
               else
               {
                   wardreq="No";
                   typeward="";
               }
               try{
                   Connection con=connectionprovider.getCon();
                    Statement st=con.createStatement();
                    st.executeUpdate("insert into report values("+patientID+",'"+Symptoms+"','"+Diagnosis+"','"+Medicine+"','"+wardreq+"','"+typeward+"')");
                   JOptionPane.showMessageDialog(null,"updated");
                   setVisible(false);
                   new diagnosisinformation().setVisible(true);
               }
               catch(Exception e)
               {
                    JOptionPane.showMessageDialog(this, e);
                   
               }
           }
          /* else
           JOptionPane.showMessageDialog(null, "please enter patient id");*/
                  
                   
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentShown
       // TODO add your handling code here:
    }//GEN-LAST:event_jTable1ComponentShown

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

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
            java.util.logging.Logger.getLogger(diagnosisinformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(diagnosisinformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(diagnosisinformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(diagnosisinformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new diagnosisinformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField diagnosis;
    private javax.swing.JLabel exist;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField medicine;
    private javax.swing.JComboBox<String> select;
    private javax.swing.JTextField symptom;
    private javax.swing.JLabel type;
    private javax.swing.JCheckBox yes;
    // End of variables declaration//GEN-END:variables
}
