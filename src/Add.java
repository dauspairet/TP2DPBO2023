// Saya Muhamad Firdaus [2101995] mengerjakan
// soal TP 2 dalam mata kuliah DPBO
// untuk keberkahanNya maka saya tidak melakukan kecurangan 
// seperti yang telah dispesifikasikan. Aamiin.

import com.mysql.jdbc.Connection;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.ByteArrayInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Firdaus
 */
public class Add extends javax.swing.JFrame {
    // Attributes
    String filename = null;
    byte[] image_criminal= null;
    
    /**
     * Creates new form Picture
     */
    public Add() {
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

        lbl_img = new javax.swing.JLabel();
        btnImage = new javax.swing.JButton();
        label_idCriminal = new javax.swing.JLabel();
        label_name = new javax.swing.JLabel();
        txtidCriminal = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        btnsubmit = new javax.swing.JButton();
        lbl_cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtrewards = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnImage.setText("Upload");
        btnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageActionPerformed(evt);
            }
        });

        label_idCriminal.setText("Criminal ID");

        label_name.setText("Name");

        txtidCriminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidCriminalActionPerformed(evt);
            }
        });

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        lbl_cancel.setText("Cancel");
        lbl_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_cancelActionPerformed(evt);
            }
        });

        jLabel1.setText("Rewards");

        txtrewards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrewardsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(lbl_img, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_name)
                            .addComponent(label_idCriminal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnsubmit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(btnImage))
                            .addComponent(txtidCriminal, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtrewards, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_cancel)
                .addGap(196, 196, 196))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl_img, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_idCriminal)
                    .addComponent(txtidCriminal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_name))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtrewards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsubmit)
                    .addComponent(btnImage))
                .addGap(7, 7, 7)
                .addComponent(lbl_cancel)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageActionPerformed
        
        // Choose image
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_SMOOTH));
        lbl_img.setIcon(imageIcon);
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum;(readNum=fis.read(buf)) != -1;){
                bos.write(buf, 0, readNum);
            }
            image_criminal=bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnImageActionPerformed

    private void txtidCriminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidCriminalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidCriminalActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed
        // TODO add your handling code here:
        
        // Store input text field
        String criminalId = txtidCriminal.getText();
        String name = txtname.getText();
        String rewards = txtrewards.getText();
                
        // Check if all data is filled
        if (criminalId.isEmpty() || name.isEmpty() || rewards.isEmpty() || image_criminal == null){
            JOptionPane.showMessageDialog(this, "Please fill ID, name, rewards, and upload an image");
            return;
        }
        
        // Check if id and rewards is a digit
        if (!criminalId.matches("\\d+") || !rewards.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "ID and rewards can only be a number.");
            return;
        }
        
        try {
            
             // Check if theres the same id
            String query = "SELECT * FROM images WHERE id_criminal=?";
            PreparedStatement statement = DbConnection.configDB().prepareStatement(query);
            statement.setString(1, criminalId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                JOptionPane.showMessageDialog(this, "ID already exists.");
                return;
            }
            
            // Query to insert data account to table images
            String sql = "INSERT INTO images VALUES(?, ?, ?, ?)";

            // Connect to database
            java.sql.Connection conn=(Connection)DbConnection.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);

            // Set values for PreparedStatement
            pst.setString(1, criminalId);
            pst.setString(2, name);
            pst.setString(3, rewards);
            pst.setBlob(4, new ByteArrayInputStream(image_criminal));

            // Execute query
            pst.executeUpdate();
            
            // Close the current form
            String idAccount = UserAccount.accountId;
            this.setVisible(false);
            
            // Go back to previous form
            JPanelCard panelCard = new JPanelCard();
            panelCard.setAccountId(idAccount);
            panelCard.setVisible(true);
            
            // Message data is submitted
            JOptionPane.showMessageDialog(null, "Data Submitted");
        } catch(Exception e) {
            // Error message
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void lbl_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_cancelActionPerformed
        // TODO add your handling code here:
        
        // Close the current form
        String idAccount = UserAccount.accountId;
        this.setVisible(false);
        
        // Go back to previous form
        JPanelCard panelCard = new JPanelCard();
        panelCard.setAccountId(idAccount);
        panelCard.setVisible(true);
    }//GEN-LAST:event_lbl_cancelActionPerformed

    private void txtrewardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrewardsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrewardsActionPerformed

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
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImage;
    private javax.swing.JButton btnsubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_idCriminal;
    private javax.swing.JLabel label_name;
    private javax.swing.JButton lbl_cancel;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JTextField txtidCriminal;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtrewards;
    // End of variables declaration//GEN-END:variables
}
