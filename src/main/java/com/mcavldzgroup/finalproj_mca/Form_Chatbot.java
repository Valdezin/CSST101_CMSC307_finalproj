/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mcavldzgroup.finalproj_mca;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
public class Form_Chatbot extends javax.swing.JFrame {

    /**
     * Creates new form Form_Quiz
     */
    public Form_Chatbot() {
        initComponents();
       setExtendedState(JFrame.MAXIMIZED_BOTH);
       setLocationRelativeTo(null);
        
        jButton1.addActionListener((ActionEvent e) -> {
            String userInput = txtfield_send.getText().trim(); // Get user input from text field
            if (!userInput.isEmpty()) {
                txtarea_convo.append("Timothy: " + userInput + "\n"); // Append user input to the conversation
                txtfield_send.setText(""); // Clear the input field
                String botResponse = generateBotResponse(userInput); // Generate bot response
                if (!botResponse.isEmpty()) { // Only append non-empty responses
                    txtarea_convo.append("Quila: " + botResponse + "\n"); // Append bot response
                }
            }
        });
    }

     private String generateBotResponse(String userInput) {
        if (userInput.isEmpty()) {
            return "Pakisagot ang tanong";
        } else if (userInput.matches("(?i)hello|hi|good day")) {
            return "Kamusta! Paano kita matutulungan sa aming department store?";
        } else if (userInput.matches("(?i)(store hours|anong oras ang bukas)")) {
            return "Ang aming department store ay bukas mula 9:00 AM hanggang 9:00 PM.";
        } else if (userInput.matches("(?i)(products|anong available na produkto)")) {
            return "Meron kaming iba't ibang produkto kabilang ang damit, appliances, at accessories. Ano ang hinahanap mo?";
        } else if (userInput.matches("(?i)(sale|mga promo)")) {
            return "Meron kaming mga espesyal na promo at diskwento sa mga piling produkto. Hinihintay ka sa aming sales area!";
        } else if (userInput.matches("(?i)(return policy|paano ang refund)")) {
            return "Pwede kang mag-apply ng refund sa loob ng 30 araw mula sa petsa ng pagbili, basta may resibo.";
        } else if (userInput.matches("(?i)(payment options|paano magbayad)")) {
            return "Tumatanggap kami ng cash, credit/debit card, at electronic payments.";
        } else if (userInput.matches("(?i)(where are the fitting rooms|saan ang fitting room)")) {
            return "Ang fitting rooms ay matatagpuan sa bawat palapag ng store. Makikita mo ito sa tabi ng kasuotan.";
        } else if (userInput.matches("(?i)(customer service|saan ang help desk)")) {
            return "Ang aming customer service desk ay nasa entrance, malapit sa info counter.";
        } else if (userInput.matches("(?i)(store location|saan ang store)")) {
            return "Narito kami sa Center Mall, sa 123 Main Street.";
        } else if (userInput.matches("(?i)(how can I get to you|paano makakarating dito)")) {
            return "Madali kang makakarating sa amin gamit ang MRT Line 1 at pagbaba sa Center Mall station.";
        } else if (userInput.matches("(?i)(where can I find clothes|saan makakahanap ng damit)")) {
            return "Ang mga damit ay nasa ikalawang palapag ng aming store.";
        } else if (userInput.matches("(?i)(returning an item|paano magbalik ng item)")) {
            return "Pwede kang bumalik sa counter ng mga cashier para sa return at refund.";
        } else {
            return "Hindi ko sigurado kung nauunawaan ko iyon. Pakiklaro mo pa ba?";
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtarea_convo = new javax.swing.JTextArea();
        btn_return = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtfield_send = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QuilaBot");

        txtarea_convo.setColumns(20);
        txtarea_convo.setRows(5);
        txtarea_convo.setEditable(false);
        jScrollPane2.setViewportView(txtarea_convo);

        btn_return.setBackground(new java.awt.Color(255, 153, 153));
        btn_return.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_return.setForeground(new java.awt.Color(51, 51, 51));
        btn_return.setText("Return");
        btn_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtfield_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfield_sendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtfield_send)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_return, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(526, 526, 526))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(446, 446, 446))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_return, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(txtfield_send)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtfield_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfield_sendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfield_sendActionPerformed

    private void btn_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnActionPerformed
        this.dispose(); // Close the current form
        Form_MainMenu mainMenu = new Form_MainMenu(null); // Create an instance of Form_MainMenu
         mainMenu.show(); // Show the main menu form
    }//GEN-LAST:event_btn_returnActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Chatbot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Chatbot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Chatbot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Chatbot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Chatbot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_return;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtarea_convo;
    private javax.swing.JTextField txtfield_send;
    // End of variables declaration//GEN-END:variables
}
