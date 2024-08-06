
package cbms.encoder.pkg2024.panel;

import static cbms.encoder.pkg2024.panel.codeProfiles.sexArray;
import static cbms.encoder.pkg2024.panel.codeProfiles.relationshipArray;
import static cbms.encoder.pkg2024.panel.codeProfiles.civilStatusArray;
import static cbms.encoder.pkg2024.panel.codeProfiles.highestGrade;
import static cbms.encoder.pkg2024.panel.codeProfiles.suffixArray;
import java.awt.Component;

/**
 *
 * @author CPDD - SPD PDIU
 */
public class questionAB extends javax.swing.JPanel {

    public questionAB() {
        initComponents();
    }
    
    public roundedRectTextField.roundedRectTextField getTextField(int index) {
        if (index >= 0 && index < getComponentCount()) {
            Component comp = getComponent(index);
            if (comp instanceof roundedRectTextField.roundedRectTextField) {
                return (roundedRectTextField.roundedRectTextField) comp;
            }
        }
        return null;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_ln = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        date_birth = new com.toedter.calendar.JDateChooser();
        combo_sex = new roundedButton.FilterComboBox(sexArray());
        combo_civilstatus = new roundedButton.FilterComboBox(civilStatusArray());
        chk_qcid = new javax.swing.JCheckBox();
        chk_ofw = new javax.swing.JCheckBox();
        chk_ofw1 = new javax.swing.JCheckBox();
        chk_ofw2 = new javax.swing.JCheckBox();
        combo_grade = new roundedButton.FilterComboBox(highestGrade());
        chk_ofw3 = new javax.swing.JCheckBox();
        combo_civilstatus1 = new roundedButton.FilterComboBox(civilStatusArray());
        roundedRectTextField1 = new roundedRectTextField.roundedRectTextField();
        roundedRectTextField2 = new roundedRectTextField.roundedRectTextField();
        combo_civilstatus2 = new roundedButton.FilterComboBox(civilStatusArray());
        chk_ofw4 = new javax.swing.JCheckBox();

        setMaximumSize(new java.awt.Dimension(32767, 50));
        setMinimumSize(new java.awt.Dimension(3200, 50));
        setPreferredSize(new java.awt.Dimension(3200, 173));

        lbl_ln.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_ln.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ln.setText("1");

        separator.setMinimumSize(new java.awt.Dimension(50, 3));
        separator.setPreferredSize(new java.awt.Dimension(50, 3));

        date_birth.setDateFormatString("MMM");
        date_birth.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        combo_sex.setEditable(false);
        combo_sex.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        combo_civilstatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        chk_qcid.setText("YES");
        chk_qcid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chk_qcid.setMaximumSize(new java.awt.Dimension(98, 25));
        chk_qcid.setMinimumSize(new java.awt.Dimension(98, 25));
        chk_qcid.setPreferredSize(new java.awt.Dimension(98, 25));
        chk_qcid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_qcidActionPerformed(evt);
            }
        });

        chk_ofw.setText("YES");
        chk_ofw.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chk_ofw.setMaximumSize(new java.awt.Dimension(96, 25));
        chk_ofw.setMinimumSize(new java.awt.Dimension(96, 25));
        chk_ofw.setPreferredSize(new java.awt.Dimension(96, 25));

        chk_ofw1.setText("YES");
        chk_ofw1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chk_ofw1.setMaximumSize(new java.awt.Dimension(107, 25));
        chk_ofw1.setMinimumSize(new java.awt.Dimension(107, 25));
        chk_ofw1.setPreferredSize(new java.awt.Dimension(107, 25));

        chk_ofw2.setText("YES");
        chk_ofw2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chk_ofw2.setMaximumSize(new java.awt.Dimension(161, 25));
        chk_ofw2.setMinimumSize(new java.awt.Dimension(161, 25));
        chk_ofw2.setPreferredSize(new java.awt.Dimension(161, 25));

        combo_grade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        combo_grade.setMaximumSize(new java.awt.Dimension(400, 32767));
        combo_grade.setMinimumSize(new java.awt.Dimension(400, 26));
        combo_grade.setPreferredSize(new java.awt.Dimension(400, 26));

        chk_ofw3.setText("YES");
        chk_ofw3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chk_ofw3.setMaximumSize(new java.awt.Dimension(205, 25));
        chk_ofw3.setMinimumSize(new java.awt.Dimension(205, 25));
        chk_ofw3.setPreferredSize(new java.awt.Dimension(205, 25));

        combo_civilstatus1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        combo_civilstatus1.setMinimumSize(new java.awt.Dimension(181, 26));
        combo_civilstatus1.setPreferredSize(new java.awt.Dimension(181, 26));

        roundedRectTextField1.setText("");
        roundedRectTextField1.setMinimumSize(new java.awt.Dimension(300, 28));
        roundedRectTextField1.setPreferredSize(new java.awt.Dimension(300, 35));

        roundedRectTextField2.setText("");
        roundedRectTextField2.setMinimumSize(new java.awt.Dimension(300, 28));
        roundedRectTextField2.setPreferredSize(new java.awt.Dimension(300, 35));

        combo_civilstatus2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        combo_civilstatus2.setMinimumSize(new java.awt.Dimension(300, 26));
        combo_civilstatus2.setPreferredSize(new java.awt.Dimension(300, 26));

        chk_ofw4.setText("YES");
        chk_ofw4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chk_ofw4.setMaximumSize(new java.awt.Dimension(215, 25));
        chk_ofw4.setMinimumSize(new java.awt.Dimension(215, 25));
        chk_ofw4.setPreferredSize(new java.awt.Dimension(215, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_ln, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(combo_sex, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(date_birth, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(combo_civilstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(chk_qcid, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(chk_ofw, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(chk_ofw1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(chk_ofw2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(combo_grade, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(chk_ofw3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(combo_civilstatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(roundedRectTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(roundedRectTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(combo_civilstatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(chk_ofw4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 106, Short.MAX_VALUE))
            .addComponent(separator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_birth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_civilstatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk_qcid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk_ofw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk_ofw1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_ln, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_sex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_grade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk_ofw2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk_ofw3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combo_civilstatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(roundedRectTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(roundedRectTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_civilstatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chk_ofw4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chk_qcidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_qcidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_qcidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox chk_ofw;
    public javax.swing.JCheckBox chk_ofw1;
    public javax.swing.JCheckBox chk_ofw2;
    public javax.swing.JCheckBox chk_ofw3;
    public javax.swing.JCheckBox chk_ofw4;
    public javax.swing.JCheckBox chk_qcid;
    public roundedButton.FilterComboBox combo_civilstatus;
    public roundedButton.FilterComboBox combo_civilstatus1;
    public roundedButton.FilterComboBox combo_civilstatus2;
    public roundedButton.FilterComboBox combo_grade;
    public roundedButton.FilterComboBox combo_sex;
    public com.toedter.calendar.JDateChooser date_birth;
    public javax.swing.JLabel lbl_ln;
    private roundedRectTextField.roundedRectTextField roundedRectTextField1;
    private roundedRectTextField.roundedRectTextField roundedRectTextField2;
    private javax.swing.JSeparator separator;
    // End of variables declaration//GEN-END:variables
}
