/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keygenerator;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jeff
 */
public class Main extends javax.swing.JFrame {
    List<String> keys;
    GenerateKeys generator;
    Working dia;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.NumKeysText.setText(Integer.toString(GenerateKeys.DEFAULT_NUMBER_OF_KEYS));
        this.KeyLengthText.setText(Integer.toString(GenerateKeys.DEFAULT_KEY_LENGTH));
        updateSeperatorOptions();
        this.uniqueCheck();
        keys = new ArrayList<>();
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
        jPanel1 = new javax.swing.JPanel();
        UppercaseCheckBox = new javax.swing.JCheckBox();
        LowercaseCheckbox = new javax.swing.JCheckBox();
        NumberCheckBox = new javax.swing.JCheckBox();
        SymbolCheckBox = new javax.swing.JCheckBox();
        ExcludeAmbiguousCheckbox = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        UseableCharsText = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        KeysTable = new javax.swing.JTable();
        SaveButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NumKeysText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        KeyLengthText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SeperatorSymbolDropdown = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        SeperatorCharsDropDown = new javax.swing.JComboBox();
        UnqiueLabel = new javax.swing.JLabel();
        generateButton = new javax.swing.JButton();

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Key Character Options"));

        UppercaseCheckBox.setText("Uppercase");
        UppercaseCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUseableChars(evt);
            }
        });

        LowercaseCheckbox.setLabel("Lowercase");
        LowercaseCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUseableChars(evt);
            }
        });

        NumberCheckBox.setLabel("Numbers");
        NumberCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUseableChars(evt);
            }
        });

        SymbolCheckBox.setLabel("Symbol");
        SymbolCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUseableChars(evt);
            }
        });

        ExcludeAmbiguousCheckbox.setLabel("Exclude Ambiguous (0,o,I,L)");
        ExcludeAmbiguousCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUseableChars(evt);
            }
        });

        jLabel3.setText("Useable Characters");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UseableCharsText))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExcludeAmbiguousCheckbox)
                            .addComponent(UppercaseCheckBox)
                            .addComponent(LowercaseCheckbox)
                            .addComponent(NumberCheckBox)
                            .addComponent(SymbolCheckBox))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UppercaseCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LowercaseCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SymbolCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumberCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExcludeAmbiguousCheckbox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(UseableCharsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        KeysTable.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        KeysTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Key"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        KeysTable.setToolTipText("");
        jScrollPane2.setViewportView(KeysTable);

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Number of Keys");

        NumKeysText.setText("0");
        NumKeysText.setToolTipText("");
        NumKeysText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NumKeysTextKeyReleased(evt);
            }
        });

        jLabel2.setText("Key Length");

        KeyLengthText.setText("0");
        KeyLengthText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                KeyLengthTextKeyReleased(evt);
            }
        });

        jLabel4.setText("Seperator Symbol");

        SeperatorSymbolDropdown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "space", "dash", "underscore" }));

        jLabel5.setText("Seperator After");

        SeperatorCharsDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0" }));

        UnqiueLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        UnqiueLabel.setForeground(new java.awt.Color(0, 155, 0));
        UnqiueLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UnqiueLabel.setText("Can Be Unique");

        generateButton.setText("Generate Keys");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NumKeysText)
                                .addComponent(KeyLengthText)
                                .addComponent(SeperatorSymbolDropdown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SeperatorCharsDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(UnqiueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(NumKeysText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(KeyLengthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SeperatorSymbolDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(SeperatorCharsDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UnqiueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(generateButton)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(61, 61, 61)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SaveButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SaveButton)
                .addGap(45, 45, 45))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Key Character Options");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        int numKeys = 0, keyLength = 0;
        String keyChars = "";
        String error = "";
        if(isNumeric(this.NumKeysText.getText())) {
            numKeys = this.getNumber(this.NumKeysText.getText());
        }
        else {
            error += "Number of Keys must be a number!"+System.lineSeparator();
        }
        if(isNumeric(this.KeyLengthText.getText())) {
            keyLength = this.getNumber(this.KeyLengthText.getText());
        }
        else {
            error += "Key Length Must be a number!"+System.lineSeparator();
        }
        if(numKeys < 1) {
            error += "Number of Keys must be greater then 0!"+System.lineSeparator();
        }
        if(keyLength < 1) {
           error += "Key Length must be greater then 0!"+System.lineSeparator();
        }
        keyChars = this.getKeyChars();
        if(keyChars.equals("")) {
            error += "You have not selected any characters to use!"+System.lineSeparator();
        }
        this.UseableCharsText.setText(keyChars);
        if(!error.equals("")) {
            JOptionPane.showMessageDialog(null,error,"Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.generator = new GenerateKeys(this,numKeys, keyLength, keyChars);
        dia = new Working(this,true);
        dia.setVisible(true);
        
        
    }//GEN-LAST:event_generateButtonActionPerformed

    private void updateUseableChars(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUseableChars
        this.UseableCharsText.setText(this.getKeyChars());
        this.uniqueCheck();
    }//GEN-LAST:event_updateUseableChars

    private void KeyLengthTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_KeyLengthTextKeyReleased
        if(this.isNumeric(this.KeyLengthText.getText())) {
            if(this.getNumber(this.KeyLengthText.getText()) > 100) {
                this.KeyLengthText.setText(String.format("%,d",100));
            }
        }
        this.updateSeperatorOptions();
        this.uniqueCheck();
    }//GEN-LAST:event_KeyLengthTextKeyReleased

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed

        if(this.keys.size() < 1) {
            JOptionPane.showMessageDialog(null,"You must generate some keys first","Oops!",JOptionPane.WARNING_MESSAGE);
            return;
        }
        JFrame parentFrame = new JFrame();

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Specify a file to save");   

        int userSelection = fileChooser.showSaveDialog(parentFrame);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File keyFile = fileChooser.getSelectedFile();
            try{
                PrintWriter writer = new PrintWriter(keyFile);
                writer.println(this.keys.stream().collect(Collectors.joining(System.lineSeparator())));
                writer.flush();
                writer.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null,"File was not saved!","ERROR",JOptionPane.ERROR_MESSAGE);

            }
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void NumKeysTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumKeysTextKeyReleased
        if(this.isNumeric(this.NumKeysText.getText())) {
            if(this.getNumber(this.NumKeysText.getText()) > 1000000) {
                this.NumKeysText.setText(String.format("%,d",1000000));
            }
        }
        this.uniqueCheck();
    }//GEN-LAST:event_NumKeysTextKeyReleased

    private String getKeyChars() {
        String keyChars = "";
        String useableLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String useableNumbers = "1234567890";
        if(this.ExcludeAmbiguousCheckbox.isSelected()) {
            useableLetters = "ABCDEFGHJKMNPQRSTUVWXYZ";
            useableNumbers = "23456789";
        }
        if(this.UppercaseCheckBox.isSelected()) {
            keyChars += useableLetters;
        }
        if(this.LowercaseCheckbox.isSelected()) {
            keyChars += useableLetters.toLowerCase();
        }
        if(this.NumberCheckBox.isSelected()) {
            keyChars += useableNumbers;
        }
        if(this.SymbolCheckBox.isSelected()) {
            keyChars += "!@#$%^&*()_-+=:;?><,.~|";
        }
        return keyChars;
    }
    
    private void updateSeperatorOptions() {
        this.SeperatorCharsDropDown.removeAllItems();
         if(isNumeric(this.KeyLengthText.getText())) {
            for(int a = 0;a <= this.getNumber(this.KeyLengthText.getText());a++) {
                this.SeperatorCharsDropDown.addItem(a);
            }
        }
         else {
             this.SeperatorCharsDropDown.addItem(0);
         }
    }
    
    private void uniqueCheck() {
        if(
                !this.isNumeric(this.NumKeysText.getText()) || 
                !this.isNumeric(this.KeyLengthText.getText()) || 
                this.getKeyChars().length() < 1) {
            this.UnqiueLabel.setText("Unable to Determine");
            this.UnqiueLabel.setForeground(Color.orange);
            return;
        }
       
        int numKeys = this.getNumber(this.NumKeysText.getText());
        int keyLength = this.getNumber(this.KeyLengthText.getText());
        int options = this.getKeyChars().length();
        if(keyLength > 10000) {
            this.UnqiueLabel.setText("Unable to Determine");
            this.UnqiueLabel.setForeground(Color.orange);
            return;
        }

        if(numKeys <= (Math.pow(options,keyLength))) {
            this.UnqiueLabel.setText("All Keys Can Be Unique");
            this.UnqiueLabel.setForeground(Color.green);
        }
        else {
            this.UnqiueLabel.setText("Keys Will Duplicate");
            this.UnqiueLabel.setForeground(Color.red);
        }
        
    }
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
   public static boolean isNumeric(String str) {  
        try {  
          double d = Double.parseDouble(str.replace(",",""));  
        }  
        catch(NumberFormatException nfe) {  
          return false;  
        }  
        return true;  
   }
   
   public static int getNumber(String str) {
       return Integer.parseInt(str.replace(",",""));
   }
   
   public void populateKeys() {
        String seperator = "";
        if(SeperatorSymbolDropdown.getSelectedItem().toString().equals("space")) {
            seperator = " ";
        }
        else if(SeperatorSymbolDropdown.getSelectedItem().toString().equals("dash")) {
            seperator = "-";
        }
        else {
             seperator = "_";   
        }
        if(this.isNumeric(SeperatorCharsDropDown.getSelectedItem().toString()) && Integer.parseInt(SeperatorCharsDropDown.getSelectedItem().toString()) > 0) {
            this.keys = generator.getKeys(seperator, Integer.parseInt(SeperatorCharsDropDown.getSelectedItem().toString()));
        }
        else {
            this.keys = generator.getKeys();
        }
        DefaultTableModel model = (DefaultTableModel) this.KeysTable.getModel();
        model.setNumRows(0);
        for(String key : this.keys) {
            model.addRow(new Object[]{key});
        }
        dia.dispose();
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ExcludeAmbiguousCheckbox;
    private javax.swing.JTextField KeyLengthText;
    private javax.swing.JTable KeysTable;
    private javax.swing.JCheckBox LowercaseCheckbox;
    private javax.swing.JTextField NumKeysText;
    private javax.swing.JCheckBox NumberCheckBox;
    private javax.swing.JButton SaveButton;
    private javax.swing.JComboBox SeperatorCharsDropDown;
    private javax.swing.JComboBox SeperatorSymbolDropdown;
    private javax.swing.JCheckBox SymbolCheckBox;
    private javax.swing.JLabel UnqiueLabel;
    private javax.swing.JCheckBox UppercaseCheckBox;
    private javax.swing.JTextField UseableCharsText;
    private javax.swing.JButton generateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
