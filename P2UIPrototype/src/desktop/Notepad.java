/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktop;

/**
 *
 * @author haris
 */
public class Notepad extends javax.swing.JInternalFrame {

    /**
     * Creates new form Notepad
     */
    public Notepad() {
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

        notepadPanel = new javax.swing.JPanel();
        notepadButtonsPanel = new javax.swing.JPanel();
        pasteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        recallButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        notepadText = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Notepad");

        notepadPanel.setBackground(new java.awt.Color(255, 255, 255));

        notepadButtonsPanel.setBackground(new java.awt.Color(255, 255, 255));

        pasteButton.setText("Paste");
        pasteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        recallButton.setText("Paste & Recall");
        recallButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recallButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout notepadButtonsPanelLayout = new javax.swing.GroupLayout(notepadButtonsPanel);
        notepadButtonsPanel.setLayout(notepadButtonsPanelLayout);
        notepadButtonsPanelLayout.setHorizontalGroup(
            notepadButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notepadButtonsPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(pasteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(recallButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        notepadButtonsPanelLayout.setVerticalGroup(
            notepadButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, notepadButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(notepadButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pasteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recallButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        notepadText.setColumns(20);
        notepadText.setRows(5);
        jScrollPane1.setViewportView(notepadText);

        javax.swing.GroupLayout notepadPanelLayout = new javax.swing.GroupLayout(notepadPanel);
        notepadPanel.setLayout(notepadPanelLayout);
        notepadPanelLayout.setHorizontalGroup(
            notepadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notepadButtonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        notepadPanelLayout.setVerticalGroup(
            notepadPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, notepadPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notepadButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notepadPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notepadPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pasteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteButtonActionPerformed
        // TODO add your handling code here:
        Main.recall = false;
        
        if (Main.pdf1TextCopied == true) {
            notepadText.setText(notepadText.getText() + PDF1.pdf1Text);
        } else if (Main.pdf2TextCopied == true) {
            notepadText.setText(notepadText.getText() + PDF2.pdf2Text);
        } else if (Main.pdf3TextCopied == true) {
            notepadText.setText(notepadText.getText() + PDF3.pdf3Text);
        }
        
        //recallButton.setVisible(true);
    }//GEN-LAST:event_pasteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        notepadText.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void recallButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recallButtonActionPerformed
        // TODO add your handling code here:
        pasteButtonActionPerformed(evt);
        
        Main.recall = true;
        Main.makeRepeatVisible(evt);
    }//GEN-LAST:event_recallButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel notepadButtonsPanel;
    private javax.swing.JPanel notepadPanel;
    public javax.swing.JTextArea notepadText;
    private javax.swing.JButton pasteButton;
    private javax.swing.JButton recallButton;
    // End of variables declaration//GEN-END:variables
}
