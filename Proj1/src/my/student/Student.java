/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.student;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import newuser.NewUser;
import javax.swing.JViewport;
import javax.swing.JScrollPane;

/**
 *
 * @author Priya Rao
 */
public class Student extends javax.swing.JFrame {

    private static LinkedList<NewUser> Users = new LinkedList<NewUser>();
    /**
     * Creates new form Student
     */
    public Student() {
        // intiliazes the components required to populate the GUI
        initComponents();
        NewUser nu1 = new NewUser("Priya Rao","prao4@buffalo.edu","dummy123");
        NewUser nu2 = new NewUser("Jie Lyu","jielv@buffalo.edu","dummy123");
        NewUser nu3 = new NewUser("Siddarth Gaikwad","sgaikwad@buffalo.edu","dummy123");
        NewUser nu4 = new NewUser("Junyang Li","junyangl@buffalo.edu","dummy123");
        NewUser nu5 = new NewUser("Sai Shanthan Venreddy","saishant@buffalo.edu","dummy123");
        Users.add(nu1);
        Users.add(nu2);
        Users.add(nu3);
        Users.add(nu4);
        Users.add(nu5);
        Random rand = new Random();
        int rand_int1 = rand.nextInt(4);
        if (rand_int1 == 0){
            this.jLabel1.setVisible(true);
        }
        else{
            this.jLabel1.setVisible(false);
        }
        RemoveButton.setEnabled(false);
        PauseButton.setEnabled(false);
        UnpauseButton.setEnabled(false);
        DefaultTableModel model = (DefaultTableModel) QueueTable.getModel();
        for (int i = 0; i<rand_int1;i++){
            model.addRow(new Object[]{Users.get(i).getName(), Helper.decodeStatus(Users.get(i).getStatus())});
        }       
        int length = Users.size();
        for(int i=length-1;i>=rand_int1;i--){
            Users.remove(i);
        }
    }
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AddButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        PauseButton = new javax.swing.JButton();
        UnpauseButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        QueueTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        RemoveButton.setText("Remove");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        PauseButton.setText("Pause");
        PauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PauseButtonActionPerformed(evt);
            }
        });

        UnpauseButton.setText("Unpause");
        UnpauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnpauseButtonActionPerformed(evt);
            }
        });

        QueueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        QueueTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QueueTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(QueueTable);
        QueueTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabel1.setText("The queue is currently empty");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UnpauseButton)
                            .addComponent(AddButton)
                            .addComponent(RemoveButton)
                            .addComponent(PauseButton))
                        .addContainerGap(36, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(AddButton)
                        .addGap(40, 40, 40)
                        .addComponent(RemoveButton)
                        .addGap(40, 40, 40)
                        .addComponent(PauseButton)
                        .addGap(40, 40, 40)
                        .addComponent(UnpauseButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // adds values to the table model
    private void addValuesToQueue(NewUser user){
        Users.add(user);
        DefaultTableModel model = (DefaultTableModel) QueueTable.getModel();
        model.addRow(new Object[]{user.getName(), Helper.decodeStatus(user.getStatus())});
    }
    
    // removes users from the queue while maintaining the positions of the paused entries
    private void removeUsersFromQueue(int row){
        DefaultTableModel tableModel = (DefaultTableModel) QueueTable.getModel();
        int rowNumber = tableModel.getRowCount();
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            if (row == i) {
                tableModel.removeRow(i);
                Users.remove(i);

                for(int j=i; j<rowNumber-1; j++){
                    boolean state = Helper.encodeStatus((String)tableModel.getValueAt(j, 1));
                    if(!state) {
                        tableModel.insertRow(i, new Object[]{(String)tableModel.getValueAt(j, 0),(String)tableModel.getValueAt(j, 1)});
                        tableModel.removeRow(j+1);
                        Users.add(i, Users.get(j));
                        Users.remove(j+1);
                        break;
                    }
                }
            }
        }
    }    
    
    // Add button - allows a user to be added to the queue
    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(true);
        JTextField text0 = new JTextField(8);
        JTextField text1 = new JTextField(20);
        JPasswordField text2 = new JPasswordField(8);
        Object[] msg = {"Name:", text0, "Email:", text1, "Password:", text2};
        
        int result = JOptionPane.showConfirmDialog(null, msg, "Adding New User", JOptionPane.OK_CANCEL_OPTION);
        String username = text0.getText();
        String email = text1.getText();
        String password = new String(text2.getPassword());
        if ((result == JOptionPane.OK_OPTION) && !(username.equals("")) && !(email.equals(""))) {
            NewUser newuser = new NewUser(username, email, password);
            this.addValuesToQueue(newuser);
        }
        this.jLabel1.setVisible(false);
    }//GEN-LAST:event_AddButtonActionPerformed

    // Remove button - allows a user to be removed from the queue
    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
        // TODO add your handling code here:
        int row = QueueTable.getSelectedRow();
        String email = Users.get(row).getEmail();
        JPasswordField text0 = new JPasswordField(8);
        Object[] msg = {String.format("Confirm removal by entering password for " + email), text0};
        int result = JOptionPane.showConfirmDialog(null, msg , "Remove User?", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
                //Users.remove(row);
                this.removeUsersFromQueue(row);
                this.RemoveButton.setEnabled(false);
                this.PauseButton.setEnabled(false);
                this.UnpauseButton.setEnabled(false);
            }
        if (QueueTable.getRowCount() == 0){
            this.jLabel1.setVisible(true);
        }
    }//GEN-LAST:event_RemoveButtonActionPerformed

    // Pause button - allows a user to be paused in the queue
    private void PauseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PauseButtonActionPerformed
        // TODO add your handling code here:
        int row = QueueTable.getSelectedRow();
        DefaultTableModel tableModel = (DefaultTableModel) QueueTable.getModel();
        String status = (String)tableModel.getValueAt(row, 1);
        String email = Users.get(row).getEmail();
        JPasswordField text0 = new JPasswordField(8);
        Object[] msg = {String.format("Confirm removal by entering password for " + email), text0};
        int result = JOptionPane.showConfirmDialog(null, msg , "Pause User?", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            boolean val = Helper.encodeStatus(status);
            if(!val)
            {
                tableModel.setValueAt(Helper.decodeStatus(!val), row, 1);
                        Users.get(row).setStatus();
            }
            this.UnpauseButton.setEnabled(true);
            this.PauseButton.setEnabled(false);
        }   
    }//GEN-LAST:event_PauseButtonActionPerformed

    // Unpause button - allows a user to be unpaused in the queue
    private void UnpauseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnpauseButtonActionPerformed
        // TODO add your handling code here:
        int row = QueueTable.getSelectedRow();
        String email = Users.get(row).getEmail();
        DefaultTableModel tableModel = (DefaultTableModel) QueueTable.getModel();
        String status = (String)tableModel.getValueAt(row, 1);        
        JPasswordField text0 = new JPasswordField(8);
        Object[] msg = {String.format("Confirm unpause by entering password for " + email), text0};
        int result = JOptionPane.showConfirmDialog(null, msg , "Unpause user?", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            boolean val = Helper.encodeStatus(status);
            if(val)
            {
                tableModel.setValueAt(Helper.decodeStatus(!val), row, 1);
                        Users.get(row).setStatus();
            }
            this.UnpauseButton.setEnabled(false);
            this.PauseButton.setEnabled(true);
        }
    }//GEN-LAST:event_UnpauseButtonActionPerformed

    // Listener for QueueTable when rows are selected
    private void QueueTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QueueTableMouseClicked
        // TODO add your handling code here:
        JTable target = (JTable) evt.getSource();
        int row = target.getSelectedRow();
        String isPaused = (String)target.getValueAt(row, 1);
        RemoveButton.setEnabled(true);
        boolean status = Helper.encodeStatus(isPaused);
        if (status){
            this.PauseButton.setEnabled(false);
            this.UnpauseButton.setEnabled(true);
        }
        else{
            this.PauseButton.setEnabled(true);
            this.UnpauseButton.setEnabled(false);
        }
    }//GEN-LAST:event_QueueTableMouseClicked

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton PauseButton;
    private javax.swing.JTable QueueTable;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JButton UnpauseButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
