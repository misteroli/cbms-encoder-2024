
package cbms.encoder.pkg2024.panel;

import static cbms.encoder.pkg2024.panel.codeProfiles.sexArray;
import static cbms.encoder.pkg2024.panel.codeProfiles.relationshipArray;
import static cbms.encoder.pkg2024.panel.codeProfiles.civilStatusArray;
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

        setMaximumSize(new java.awt.Dimension(32767, 50));
        setMinimumSize(new java.awt.Dimension(2005, 50));

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

        chk_qcid.setText("With QCID");

        chk_ofw.setText("OFW");

        chk_ofw1.setText("SOLO PARENT");

        chk_ofw2.setText("WITH SENIOR CITIZEN ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbl_ln, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_sex, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date_birth, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_civilstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chk_qcid, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chk_ofw)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chk_ofw1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chk_ofw2)
                .addContainerGap(937, Short.MAX_VALUE))
            .addComponent(separator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_ln, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(date_birth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_sex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_civilstatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk_qcid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk_ofw, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk_ofw2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk_ofw1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox chk_ofw;
    public javax.swing.JCheckBox chk_ofw1;
    public javax.swing.JCheckBox chk_ofw2;
    public javax.swing.JCheckBox chk_qcid;
    public roundedButton.FilterComboBox combo_civilstatus;
    public roundedButton.FilterComboBox combo_sex;
    public com.toedter.calendar.JDateChooser date_birth;
    public javax.swing.JLabel lbl_ln;
    private javax.swing.JSeparator separator;
    // End of variables declaration//GEN-END:variables
}
