/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

import BackEnd.Validator;

/**
 *
 * @author sebastianh
 */
public class dvtUI extends javax.swing.JFrame {

    Validator back = new Validator();

    /**
     * Creates new form dvtUI
     */
    public dvtUI() {

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

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        paleontologistEntry = new javax.swing.JTextField();
        Species = new javax.swing.JComboBox<>();
        boneWheel = new javax.swing.JSpinner();
        contactNumInput = new javax.swing.JTextField();
        errorDinoName = new javax.swing.JLabel();
        errorBone = new javax.swing.JLabel();
        confirmLabel = new javax.swing.JLabel();
        errorPhone = new javax.swing.JLabel();
        errorPaleoName = new javax.swing.JLabel();
        habitatError = new javax.swing.JLabel();
        errorDate = new javax.swing.JLabel();
        errorDead = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        paleoLabel = new javax.swing.JLabel();
        speciesLabel = new javax.swing.JLabel();
        bonesLabel = new javax.swing.JLabel();
        dinosaurNameLabel = new javax.swing.JLabel();
        discoveryDateInput = new javax.swing.JTextField();
        discoveryDayLabel = new javax.swing.JLabel();
        DinoNameInput = new javax.swing.JTextField();
        titleLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        landCheck = new javax.swing.JCheckBox();
        waterCheck = new javax.swing.JCheckBox();
        airCheck = new javax.swing.JCheckBox();
        deadCheck = new javax.swing.JRadioButton();
        dietCheck = new javax.swing.JComboBox<>();
        dietHeader = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(60, 63, 65));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 74));

        paleontologistEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paleontologistEntryActionPerformed(evt);
            }
        });
        getContentPane().add(paleontologistEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 224, 45));

        Species.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sauropod", "Saurus", "Raptor", "Ceratops" }));
        Species.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpeciesActionPerformed(evt);
            }
        });
        getContentPane().add(Species, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));
        getContentPane().add(boneWheel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 70, 30));

        contactNumInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNumInputActionPerformed(evt);
            }
        });
        getContentPane().add(contactNumInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 224, 45));

        errorDinoName.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(errorDinoName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 350, 48));

        errorBone.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(errorBone, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 300, 20));

        confirmLabel.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(confirmLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 160, 50));

        errorPhone.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(errorPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 270, 50));

        errorPaleoName.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(errorPaleoName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 170, 50));

        habitatError.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(habitatError, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 220, 30));

        errorDate.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(errorDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 350, 40));

        errorDead.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(errorDead, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 370, 20));

        contactLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        contactLabel.setForeground(new java.awt.Color(255, 255, 255));
        contactLabel.setText("Contact Number");
        getContentPane().add(contactLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        paleoLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        paleoLabel.setForeground(new java.awt.Color(255, 255, 255));
        paleoLabel.setText("Paleontologist name");
        getContentPane().add(paleoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        speciesLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        speciesLabel.setForeground(new java.awt.Color(255, 255, 255));
        speciesLabel.setText("Species");
        getContentPane().add(speciesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 20));

        bonesLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        bonesLabel.setForeground(new java.awt.Color(255, 255, 255));
        bonesLabel.setText("Amount of bones");
        getContentPane().add(bonesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        dinosaurNameLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        dinosaurNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        dinosaurNameLabel.setText("Dinosaur name");
        getContentPane().add(dinosaurNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        discoveryDateInput.setText("YYYY/MM/DD");
        discoveryDateInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discoveryDateInputActionPerformed(evt);
            }
        });
        getContentPane().add(discoveryDateInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 224, 43));

        discoveryDayLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        discoveryDayLabel.setForeground(new java.awt.Color(255, 255, 255));
        discoveryDayLabel.setText("Date Of Discovery");
        getContentPane().add(discoveryDayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        DinoNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DinoNameInputActionPerformed(evt);
            }
        });
        getContentPane().add(DinoNameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 224, 48));

        titleLabel.setFont(new java.awt.Font("Wide Latin", 0, 24)); // NOI18N
        titleLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\user-pc\\Downloads\\DinoText2.png")); // NOI18N
        getContentPane().add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        registerButton.setText("REGISTER DINO");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 175, 60));

        landCheck.setForeground(new java.awt.Color(255, 255, 255));
        landCheck.setText("Land");
        getContentPane().add(landCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        waterCheck.setForeground(new java.awt.Color(255, 255, 255));
        waterCheck.setText("Water");
        getContentPane().add(waterCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        airCheck.setForeground(new java.awt.Color(255, 255, 255));
        airCheck.setText("Air");
        getContentPane().add(airCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, -1, -1));

        deadCheck.setForeground(new java.awt.Color(255, 255, 255));
        deadCheck.setText("Was it dead?");
        deadCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deadCheckActionPerformed(evt);
            }
        });
        getContentPane().add(deadCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        dietCheck.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carnivore", "Herbivore", "Omnivore", "Pesketarian", "Halaal", "Keto" }));
        getContentPane().add(dietCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        dietHeader.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        dietHeader.setForeground(new java.awt.Color(255, 255, 255));
        dietHeader.setText("Diet");
        getContentPane().add(dietHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        background.setForeground(new java.awt.Color(255, 0, 0));
        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\user-pc\\Downloads\\Dinosaur3.jpg")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 610, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paleontologistEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paleontologistEntryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paleontologistEntryActionPerformed

    private void SpeciesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpeciesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SpeciesActionPerformed

    private void contactNumInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNumInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNumInputActionPerformed

    private void DinoNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DinoNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DinoNameInputActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        String Name = DinoNameInput.getText();
        String SpeciesOf = (String) Species.getSelectedItem();
        back.validateDinoName(Name, SpeciesOf, errorDinoName);

        int boneNum = (int) boneWheel.getValue();
        back.numValidator(boneNum, errorBone);
        String phoneNum = contactNumInput.getText();
        back.validateRange(phoneNum, errorPhone);
        back.dateChecker((discoveryDateInput.getText()).toString(), errorDate);
        if (landCheck.isSelected() == false && waterCheck.isSelected() == false && airCheck.isSelected() == false) {
            habitatError.setText("Please select atleast one habitat");
        } else {
            habitatError.setText(" ");
        }
        if (paleontologistEntry.getText().isEmpty() == true ) {
            errorPaleoName.setText("Please enter a name");
        } else if (paleontologistEntry.getText().length() > 50){
            errorPaleoName.setText("Please enter a shorter name");
        }
            else {
            errorPaleoName.setText(" ");
        }
    
        
        if (back.numValidator(boneNum, errorBone) == true
                && back.validateRange(phoneNum, errorPhone) == true
                && back.validateRange(phoneNum, errorPhone) == true
                && back.dateChecker((discoveryDateInput.getText()).toString(), errorDate) == true
                && back.validateDinoName(Name, SpeciesOf, errorDinoName) == true
                && !(landCheck.isSelected() == false && waterCheck.isSelected() == false && airCheck.isSelected() == false)
                && paleontologistEntry.getText().isEmpty() == false) {
            confirmLabel.setText("REGISTERED DINO!");
            System.out.println("----------Dino Registry Entry----------\n"
                    + "Paleontologist name:" + paleontologistEntry.getText()
                    + "\nContact Number:" + phoneNum
                    + "\nDino name:" + DinoNameInput.getText()
                    + "\nDiscovery Date:" + discoveryDateInput.getText()
                    + "\nSpecies:" + SpeciesOf
                    + "\nNumber of Bones:" + boneWheel.getValue()
                    + "\nLives on Land:" + landCheck.isSelected()
                    + "\nLives on Water:" + waterCheck.isSelected()
                    + "\nLives on Air:" + airCheck.isSelected()
                    + "\nWas it Dead:" + deadCheck.isSelected()
                    + "\nDiet" + dietCheck.getSelectedItem()
                    + "\n----------Dino Registered----------\n"
                    + ". - ~ ~ ~ - .\n"
                    + "      ..     _      .-~               ~-.\n"
                    + "     //|     \\ `..~                      `.\n"
                    + "    || |      }  }              /       \\  \\\n"
                    + "(\\   \\\\ \\~^..'                 |         }  \\\n"
                    + " \\`.-~  o      /       }       |        /    \\\n"
                    + " (__          |       /        |       /      `.\n"
                    + "  `- - ~ ~ -._|      /_ - ~ ~ ^|      /- _      `.\n"
                    + "              |     /          |     /     ~-.     ~- _\n"
                    + "              |_____|          |_____|         ~ - . _ _~_-_");

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonActionPerformed

    private void discoveryDateInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discoveryDateInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discoveryDateInputActionPerformed

    private void deadCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deadCheckActionPerformed

            
        
        // TODO add your handling code here:
    }//GEN-LAST:event_deadCheckActionPerformed

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
            java.util.logging.Logger.getLogger(dvtUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dvtUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dvtUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dvtUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dvtUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DinoNameInput;
    private javax.swing.JComboBox<String> Species;
    private javax.swing.JCheckBox airCheck;
    private javax.swing.JLabel background;
    private javax.swing.JSpinner boneWheel;
    private javax.swing.JLabel bonesLabel;
    private javax.swing.JLabel confirmLabel;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JTextField contactNumInput;
    private javax.swing.JRadioButton deadCheck;
    private javax.swing.JComboBox<String> dietCheck;
    private javax.swing.JLabel dietHeader;
    private javax.swing.JLabel dinosaurNameLabel;
    private javax.swing.JTextField discoveryDateInput;
    private javax.swing.JLabel discoveryDayLabel;
    private javax.swing.JLabel errorBone;
    private javax.swing.JLabel errorDate;
    private javax.swing.JLabel errorDead;
    private javax.swing.JLabel errorDinoName;
    private javax.swing.JLabel errorPaleoName;
    private javax.swing.JLabel errorPhone;
    private javax.swing.JLabel habitatError;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox landCheck;
    private javax.swing.JLabel paleoLabel;
    private javax.swing.JTextField paleontologistEntry;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel speciesLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JCheckBox waterCheck;
    // End of variables declaration//GEN-END:variables
}
