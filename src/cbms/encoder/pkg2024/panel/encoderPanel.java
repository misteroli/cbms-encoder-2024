
package cbms.encoder.pkg2024.panel;

/**
 *
 * @author CPDD - SPD PDIU
 */

//import cbms.encoder.pkg2024.dbCon;
import javax.swing.JFrame;
import static cbms.encoder.pkg2024.panel.codeProfiles.brgyArray;
import static cbms.encoder.pkg2024.panel.codeProfiles.suffixArray;
import java.util.ArrayList;
import java.util.List;
import cbms.encoder.pkg2024.saveHousehold;

public class encoderPanel extends javax.swing.JPanel { 

    sectionABPanel sectionAB = new sectionABPanel();
    
    public encoderPanel(JFrame mainFrame) {
        initComponents();
        panelAB.add(sectionAB);
        btn_save.setButtonType("Rounded Rectangle");
        //dbCon.conn = dbCon.ConnectDB();
        sectionAB.addSectionAB(spinnerHH);
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        geoPanel = new javax.swing.JPanel();
        geoAPanel = new javax.swing.JPanel();
        txt_brgyCode = new roundedRectTextField.roundedRectTextField();
        txt_ea = new roundedRectTextField.roundedRectTextField();
        txt_bsn = new roundedRectTextField.roundedRectTextField();
        txt_husn = new roundedRectTextField.roundedRectTextField();
        txt_hsn = new roundedRectTextField.roundedRectTextField();
        lbl_brgy = new javax.swing.JLabel();
        lbl_brgyCode = new javax.swing.JLabel();
        lbl_ea = new javax.swing.JLabel();
        lbl_bsn = new javax.swing.JLabel();
        lbl_husn = new javax.swing.JLabel();
        lbl_hsn = new javax.swing.JLabel();
        combo_brgy = new roundedButton.FilterComboBox(brgyArray());
        geoBPanel = new javax.swing.JPanel();
        txt_houseNo = new roundedRectTextField.roundedRectTextField();
        txt_lotNo = new roundedRectTextField.roundedRectTextField();
        txt_blkNo = new roundedRectTextField.roundedRectTextField();
        txt_unitNo = new roundedRectTextField.roundedRectTextField();
        txt_flrNo = new roundedRectTextField.roundedRectTextField();
        txt_bldNo = new roundedRectTextField.roundedRectTextField();
        txt_streetName = new roundedRectTextField.roundedRectTextField();
        txt_village = new roundedRectTextField.roundedRectTextField();
        lbl_houseNo = new javax.swing.JLabel();
        lbl_lotNo = new javax.swing.JLabel();
        lbl_blkNo = new javax.swing.JLabel();
        lbl_unitNo = new javax.swing.JLabel();
        lbl_flrNo = new javax.swing.JLabel();
        lbl_bldgNo = new javax.swing.JLabel();
        lbl_streetName = new javax.swing.JLabel();
        lbl_village = new javax.swing.JLabel();
        spinnerHH = new javax.swing.JSpinner();
        btn_save = new roundedButton.StandardButton();
        lbl_hh = new javax.swing.JLabel();
        combo_data_source = new javax.swing.JComboBox<>();
        lbl_blkNo1 = new javax.swing.JLabel();
        tabbedPane = new javax.swing.JTabbedPane();
        scrollAB = new javax.swing.JScrollPane();
        panelAB = new javax.swing.JPanel();
        footerPanel = new javax.swing.JPanel();
        chkRefused = new javax.swing.JCheckBox();
        btn_save1 = new roundedButton.StandardButton();
        jPanel1 = new javax.swing.JPanel();
        txt_houseNo1 = new roundedRectTextField.roundedRectTextField();
        lbl_houseNo1 = new javax.swing.JLabel();
        lbl_houseNo2 = new javax.swing.JLabel();
        txt_houseNo2 = new roundedRectTextField.roundedRectTextField();
        lbl_houseNo3 = new javax.swing.JLabel();
        txt_houseNo3 = new roundedRectTextField.roundedRectTextField();
        combo_suffix = new roundedButton.FilterComboBox(suffixArray());
        lbl_houseNo4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1434, 400));
        setPreferredSize(new java.awt.Dimension(1451, 400));

        geoPanel.setBackground(new java.awt.Color(255, 255, 255));
        geoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Geographic Identification", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        geoAPanel.setOpaque(false);

        txt_brgyCode.setEditable(false);
        txt_brgyCode.setText("");

        txt_ea.setText("");

        txt_bsn.setText("");

        txt_husn.setText("");

        txt_hsn.setText("");

        lbl_brgy.setText("Barangay");

        lbl_brgyCode.setText("Barangay Code");

        lbl_ea.setText("Enumeration Area No. (EA)");

        lbl_bsn.setText("Bldg. Serial No. (BSN)");

        lbl_husn.setText("Housing Unit Serial No. (HUSN)");

        lbl_hsn.setText("Housing Serial No. (HSN)");

        combo_brgy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout geoAPanelLayout = new javax.swing.GroupLayout(geoAPanel);
        geoAPanel.setLayout(geoAPanelLayout);
        geoAPanelLayout.setHorizontalGroup(
            geoAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(geoAPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(geoAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combo_brgy, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(lbl_brgy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(geoAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(geoAPanelLayout.createSequentialGroup()
                        .addComponent(lbl_brgyCode, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addGap(50, 50, 50))
                    .addComponent(txt_brgyCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(geoAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(geoAPanelLayout.createSequentialGroup()
                        .addComponent(lbl_ea, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(geoAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(geoAPanelLayout.createSequentialGroup()
                        .addComponent(lbl_bsn, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                        .addGap(59, 59, 59)
                        .addComponent(lbl_husn, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                    .addGroup(geoAPanelLayout.createSequentialGroup()
                        .addComponent(txt_bsn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_husn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(geoAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_hsn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(geoAPanelLayout.createSequentialGroup()
                        .addComponent(lbl_hsn, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                        .addGap(33, 33, 33)))
                .addGap(354, 354, 354))
        );
        geoAPanelLayout.setVerticalGroup(
            geoAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(geoAPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(geoAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(geoAPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(geoAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_brgy)
                            .addComponent(lbl_brgyCode))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(geoAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_brgyCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_bsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_husn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_hsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_brgy, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(geoAPanelLayout.createSequentialGroup()
                        .addGroup(geoAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_ea)
                            .addComponent(lbl_bsn)
                            .addComponent(lbl_husn)
                            .addComponent(lbl_hsn))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        geoBPanel.setOpaque(false);

        txt_houseNo.setText("");

        txt_lotNo.setText("");

        txt_blkNo.setText("");

        txt_unitNo.setText("");

        txt_flrNo.setText("");

        txt_bldNo.setText("");

        txt_streetName.setText("");

        txt_village.setText("");

        lbl_houseNo.setText("House No.");

        lbl_lotNo.setText("Lot No.");

        lbl_blkNo.setText("Blk. No");

        lbl_unitNo.setText("Unit No.");

        lbl_flrNo.setText("Floor No.");

        lbl_bldgNo.setText("Building No.");

        lbl_streetName.setText("Street Name");

        lbl_village.setText("Village (Subdivision/Village/Purok/Sitio)");

        spinnerHH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spinnerHH.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        btn_save.setLabel("SAVE");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        lbl_hh.setText("Number of Household Members");

        combo_data_source.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "10-PAGE", "38-PAGE" }));

        lbl_blkNo1.setText("Data Source");

        javax.swing.GroupLayout geoBPanelLayout = new javax.swing.GroupLayout(geoBPanel);
        geoBPanel.setLayout(geoBPanelLayout);
        geoBPanelLayout.setHorizontalGroup(
            geoBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(geoBPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(geoBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_houseNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(txt_houseNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(geoBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_lotNo, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(txt_lotNo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(geoBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_blkNo, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(txt_blkNo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(geoBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_unitNo, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(txt_unitNo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(geoBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_flrNo, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(txt_flrNo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(geoBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_bldgNo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(txt_bldNo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(geoBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(geoBPanelLayout.createSequentialGroup()
                        .addComponent(lbl_streetName, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                        .addGap(165, 165, 165))
                    .addComponent(txt_streetName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(geoBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(geoBPanelLayout.createSequentialGroup()
                        .addComponent(lbl_village, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addComponent(txt_village, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(geoBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_blkNo1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(combo_data_source, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(geoBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(geoBPanelLayout.createSequentialGroup()
                        .addComponent(spinnerHH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(lbl_hh, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
                .addContainerGap())
        );
        geoBPanelLayout.setVerticalGroup(
            geoBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(geoBPanelLayout.createSequentialGroup()
                .addGroup(geoBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, geoBPanelLayout.createSequentialGroup()
                        .addGroup(geoBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_houseNo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_lotNo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_blkNo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_unitNo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_flrNo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_bldgNo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_streetName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_village, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(txt_village, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(geoBPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(geoBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_houseNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_lotNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_blkNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_unitNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_flrNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_bldNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_streetName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, geoBPanelLayout.createSequentialGroup()
                        .addGroup(geoBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_hh)
                            .addComponent(lbl_blkNo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(geoBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(geoBPanelLayout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addGroup(geoBPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spinnerHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(combo_data_source))))
                .addContainerGap())
        );

        javax.swing.GroupLayout geoPanelLayout = new javax.swing.GroupLayout(geoPanel);
        geoPanel.setLayout(geoPanelLayout);
        geoPanelLayout.setHorizontalGroup(
            geoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(geoBPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(geoAPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        geoPanelLayout.setVerticalGroup(
            geoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(geoPanelLayout.createSequentialGroup()
                .addComponent(geoAPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(geoBPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        tabbedPane.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        scrollAB.setBackground(new java.awt.Color(255, 255, 255));
        scrollAB.setBorder(null);
        scrollAB.setToolTipText("");

        panelAB.setBackground(new java.awt.Color(255, 255, 255));
        panelAB.setLayout(new java.awt.CardLayout());
        scrollAB.setViewportView(panelAB);

        tabbedPane.addTab("Section A-B", scrollAB);

        footerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        footerPanel.setMinimumSize(new java.awt.Dimension(100, 50));
        footerPanel.setOpaque(false);
        footerPanel.setPreferredSize(new java.awt.Dimension(0, 50));

        chkRefused.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chkRefused.setText("RESPONDENT REFUSED?");
        chkRefused.setOpaque(false);
        chkRefused.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRefusedActionPerformed(evt);
            }
        });

        btn_save1.setText("SAVE HOUSEHOLD");
        btn_save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_save1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout footerPanelLayout = new javax.swing.GroupLayout(footerPanel);
        footerPanel.setLayout(footerPanelLayout);
        footerPanelLayout.setHorizontalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkRefused)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_save1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        footerPanelLayout.setVerticalGroup(
            footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerPanelLayout.createSequentialGroup()
                .addGroup(footerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkRefused, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(btn_save1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Household Head Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.setOpaque(false);

        txt_houseNo1.setText("");
        txt_houseNo1.setMaximumSize(new java.awt.Dimension(130, 2147483647));
        txt_houseNo1.setMinimumSize(new java.awt.Dimension(130, 28));

        lbl_houseNo1.setText("First Name");

        lbl_houseNo2.setText("Middle Name");

        txt_houseNo2.setText("");
        txt_houseNo2.setMaximumSize(new java.awt.Dimension(130, 2147483647));
        txt_houseNo2.setMinimumSize(new java.awt.Dimension(130, 28));

        lbl_houseNo3.setText("Last Name");

        txt_houseNo3.setText("");
        txt_houseNo3.setMaximumSize(new java.awt.Dimension(130, 2147483647));
        txt_houseNo3.setMinimumSize(new java.awt.Dimension(130, 28));

        combo_suffix.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbl_houseNo4.setText("Suffix");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl_houseNo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_houseNo1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl_houseNo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_houseNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl_houseNo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_houseNo3, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combo_suffix, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_houseNo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_houseNo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_houseNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_houseNo3)
                        .addComponent(lbl_houseNo4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_houseNo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combo_suffix, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(lbl_houseNo2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txt_houseNo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(footerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1451, Short.MAX_VALUE)
            .addComponent(geoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(geoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(footerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabbedPane.getAccessibleContext().setAccessibleName("SECTION A-B");
    }// </editor-fold>//GEN-END:initComponents

    private void chkRefusedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRefusedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkRefusedActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        sectionAB.addSectionAB(spinnerHH);
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_save1ActionPerformed
        cbmsEntry.setBrgy(combo_brgy.getSelectedItem().toString());
        cbmsEntry.setBrgyCode(txt_brgyCode.getText());
        cbmsEntry.setEa(txt_ea.getText());
        cbmsEntry.setBsn(txt_bsn.getText());
        cbmsEntry.setHusn(txt_husn.getText());
        cbmsEntry.setHsn(txt_hsn.getText());
        cbmsEntry.setHouseNo(txt_houseNo.getText());
        cbmsEntry.setLotNo(txt_lotNo.getText());
        cbmsEntry.setBlkNo(txt_blkNo.getText());
        cbmsEntry.setUnitNo(txt_unitNo.getText());
        cbmsEntry.setFloorNo(txt_flrNo.getText());
        cbmsEntry.setBldgNo(txt_bldNo.getText());
        cbmsEntry.setStreetName(txt_streetName.getText());
        cbmsEntry.setVillage(txt_village.getText());
        cbmsEntry.setDataSource(combo_data_source.getSelectedItem().toString());
        cbmsEntry.setNoHH((int) spinnerHH.getValue());
        cbmsEntry.setRefused(chkRefused.isSelected());
        
        //List<cbmsEntry> entries = new ArrayList<>();
        //saveHousehold.savePage1(statementProfiles.insertPage1);
        
    }//GEN-LAST:event_btn_save1ActionPerformed
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private roundedButton.StandardButton btn_save;
    private roundedButton.StandardButton btn_save1;
    private javax.swing.JCheckBox chkRefused;
    private roundedButton.FilterComboBox combo_brgy;
    private javax.swing.JComboBox<String> combo_data_source;
    public roundedButton.FilterComboBox combo_suffix;
    private javax.swing.JPanel footerPanel;
    private javax.swing.JPanel geoAPanel;
    private javax.swing.JPanel geoBPanel;
    private javax.swing.JPanel geoPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_bldgNo;
    private javax.swing.JLabel lbl_blkNo;
    private javax.swing.JLabel lbl_blkNo1;
    private javax.swing.JLabel lbl_brgy;
    private javax.swing.JLabel lbl_brgyCode;
    private javax.swing.JLabel lbl_bsn;
    private javax.swing.JLabel lbl_ea;
    private javax.swing.JLabel lbl_flrNo;
    private javax.swing.JLabel lbl_hh;
    private javax.swing.JLabel lbl_houseNo;
    private javax.swing.JLabel lbl_houseNo1;
    private javax.swing.JLabel lbl_houseNo2;
    private javax.swing.JLabel lbl_houseNo3;
    private javax.swing.JLabel lbl_houseNo4;
    private javax.swing.JLabel lbl_hsn;
    private javax.swing.JLabel lbl_husn;
    private javax.swing.JLabel lbl_lotNo;
    private javax.swing.JLabel lbl_streetName;
    private javax.swing.JLabel lbl_unitNo;
    private javax.swing.JLabel lbl_village;
    private javax.swing.JPanel panelAB;
    private javax.swing.JScrollPane scrollAB;
    private javax.swing.JSpinner spinnerHH;
    private javax.swing.JTabbedPane tabbedPane;
    private roundedRectTextField.roundedRectTextField txt_bldNo;
    private roundedRectTextField.roundedRectTextField txt_blkNo;
    private roundedRectTextField.roundedRectTextField txt_brgyCode;
    private roundedRectTextField.roundedRectTextField txt_bsn;
    private roundedRectTextField.roundedRectTextField txt_ea;
    private roundedRectTextField.roundedRectTextField txt_flrNo;
    private roundedRectTextField.roundedRectTextField txt_houseNo;
    private roundedRectTextField.roundedRectTextField txt_houseNo1;
    private roundedRectTextField.roundedRectTextField txt_houseNo2;
    private roundedRectTextField.roundedRectTextField txt_houseNo3;
    private roundedRectTextField.roundedRectTextField txt_hsn;
    private roundedRectTextField.roundedRectTextField txt_husn;
    private roundedRectTextField.roundedRectTextField txt_lotNo;
    private roundedRectTextField.roundedRectTextField txt_streetName;
    private roundedRectTextField.roundedRectTextField txt_unitNo;
    private roundedRectTextField.roundedRectTextField txt_village;
    // End of variables declaration//GEN-END:variables

}
