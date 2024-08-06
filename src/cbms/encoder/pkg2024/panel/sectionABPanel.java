
package cbms.encoder.pkg2024.panel;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSpinner;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

/**
 *
 * @author CPDD - SPD PDIU
 */

public class sectionABPanel extends javax.swing.JPanel {

    questionAB[] questionAB;
    JComboBox[] combo_entrep1;
    JComboBox[] combo_agri1;
    private List<JComponent> components;
    
    public sectionABPanel() {
        initComponents();
        components = new ArrayList<>();
        
    }

    public List<cbmsEntry> saveAB(JSpinner spinnerHH, List<cbmsEntry> entries) {
        entries = new ArrayList<>();
        int numRows = (int) spinnerHH.getValue();
        System.out.println(entries);
        if(numRows != 0) {
            for (int i = 0; i < numRows; i++) {
                String lineNo = questionAB[i].lbl_ln.getText();
                String sex = questionAB[i].combo_sex.getSelectedItem().toString();
                Date birthdate = questionAB[i].date_birth.getDate();
                String civilStatus = questionAB[i].combo_civilstatus.getSelectedItem().toString();
                
                boolean qcid = questionAB[i].chk_qcid.isSelected();
                boolean ofw = questionAB[i].chk_ofw.isSelected();

                entries.add(new cbmsEntry(lineNo,sex,birthdate,civilStatus,qcid,ofw));
            } 
        }
        return entries;
    }
    
    private void addKeyBindings(JComponent component, int numberOfComponents) {
        // Up key binding
        // Change number 4 depending to the number of components in one row.
        component.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0), "moveUp");
        component.getActionMap().put("moveUp", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveFocus(component, -numberOfComponents); // Move to the previous panel (previous pair of components)
            }
        });

        // Down key binding
        component.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0), "moveDown");
        component.getActionMap().put("moveDown", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveFocus(component, numberOfComponents); // Move to the next panel (next pair of components)
            }
        });

        // Left key binding
        component.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0), "moveLeft");
        component.getActionMap().put("moveLeft", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveFocus(component, -1); // Move to the previous component
            }
        });

        // Right key binding
        component.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0), "moveRight");
        component.getActionMap().put("moveRight", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveFocus(component, 1); // Move to the next component
            }
        });
    }

    private void moveFocus(JComponent component, int direction) {
        int currentIndex = components.indexOf(component);
        if (currentIndex != -1) {
            int newIndex = currentIndex + direction;
            if (newIndex >= 0 && newIndex < components.size()) {
                components.get(newIndex).requestFocus();
            }
        }
    }
    
    
    public void addSectionAB(JSpinner spinnerHH) {
        int numRows = (int) spinnerHH.getValue();
        dynamicPanel.removeAll();
        questionAB = new questionAB[numRows];
        components.clear();
        
        Dimension minSize = new Dimension(WIDTH, (numRows * 50));
        dynamicPanel.setSize(WIDTH, (numRows * 25));
        dynamicPanel.setMinimumSize(minSize);
        
        int ln;
        for (int i = 0; i < numRows; i++) {
            ln = i + 1;
            questionAB[i] = new questionAB();
            questionAB[i].lbl_ln.setText(""+ln);
            
            dynamicPanel.add(questionAB[i]);
            
        }
        
        checkBoxSelected(numRows,questionAB);
        
        JPopupMenu menu_sex = createPopupMenu(lbl_sex,questionAB, numRows, "sex");
        JPopupMenu menu_bdate = createPopupMenu(lbl_bdate,questionAB, numRows, "bdate");
        JPopupMenu menu_civilstatus = createPopupMenu(lbl_civilstatus,questionAB, numRows, "civilstatus");
        JPopupMenu menu_qcid = createPopupMenu(lbl_qcid,questionAB, numRows, "qcid");
        JPopupMenu menu_ofw = createPopupMenu(lbl_ofw,questionAB, numRows, "ofw");
        
        addPopupListener(lbl_sex,menu_sex);
        addPopupListener(lbl_bdate,menu_bdate);
        addPopupListener(lbl_civilstatus,menu_civilstatus);
        addPopupListener(lbl_qcid,menu_qcid);
        addPopupListener(lbl_ofw,menu_ofw);
        
        dynamicPanel.revalidate();
        dynamicPanel.repaint();
    }
    
    public void addComboToPanel(JPanel panel, JComboBox[] combo, JSpinner spinner) {
        int numRows = (int) spinner.getValue();
        panel.removeAll();
        combo = new JComboBox[numRows];
        //components.clear();
        
        Dimension minSize = new Dimension(WIDTH, (numRows * 30));
        Dimension comboSize = new Dimension(panel.getWidth(), 25);
        
        if(dynamicPanel2.getHeight() < (numRows * 30)) {
            dynamicPanel2.setSize(WIDTH, (numRows * 30));
            dynamicPanel2.setMinimumSize(minSize);
            panel.setSize(WIDTH, (numRows * 30));
            panel.setMinimumSize(minSize);
        }
        
        for (int i = 0; i < numRows; i++) {
            combo[i] = new JComboBox();
            combo[i].setMaximumSize(comboSize);
            combo[i].setSize(comboSize);
            panel.add(combo[i]);
            
            //Adding 5 Pixels Space
            panel.add(Box.createRigidArea(new Dimension(0, 5)));

        }
        panel.revalidate();
        panel.repaint();
        dynamicPanel2.revalidate();
        dynamicPanel2.repaint();
    }
    
    private void addPopupListener(JCheckBox checkBox, JPopupMenu popupMenu) {
        checkBox.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showPopupMenu(e);
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showPopupMenu(e);
                }
            }

            private void showPopupMenu(MouseEvent e) {
                popupMenu.show(e.getComponent(), e.getX(), e.getY());
            }
        });
    }
    
    private JPopupMenu createPopupMenu(JCheckBox checkBox, questionAB[] questionAB, int numRows, String selectedChk) {
        JPopupMenu popupMenuAB = new JPopupMenu();
        JMenuItem clearMenuItemAB = new JMenuItem("Clear Rows");

        clearMenuItemAB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                clearRows(checkBox, questionAB, numRows, selectedChk);
            }
        });

        popupMenuAB.add(clearMenuItemAB);
        return popupMenuAB;
    }
    
    private void clearRows(JCheckBox checkBox, questionAB[] questionAB, int numRows, String selectedChk) {
        checkBox.setSelected(false);
        for (int i = 0; i < numRows; i += 1) {
            if (null != selectedChk) switch (selectedChk) {
//                case "fname" -> questionAB[i].txt_fname.setText(null);
//                case "mname" -> questionAB[i].txt_mname.setText(null);
//                case "lname" -> questionAB[i].txt_lname.setText(null);
//                case "suffix" -> questionAB[i].combo_suffix.setSelectedIndex(-1);
//                case "relationship" -> questionAB[i].combo_relationship.setSelectedIndex(-1);
                case "sex" -> questionAB[i].combo_sex.setSelectedIndex(-1);
                case "bdate" -> questionAB[i].date_birth.setDate(null);
                case "civilstatus" -> questionAB[i].combo_civilstatus.setSelectedIndex(-1);
                case "qcid" -> questionAB[i].chk_qcid.setSelected(false);
                case "ofw" -> questionAB[i].chk_ofw.setSelected(false);
                default -> {
                }
            }
        }
    }
    
    public void checkBoxSelected(int numRows, questionAB[] questionAB) {
    
        //Sex
        lbl_sex.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lbl_sex.isSelected()) {
                    for (int i = 1; i < numRows; i += 1) {
                        questionAB[i].combo_sex.setSelectedItem(questionAB[0].combo_sex.getSelectedItem());
                    }
                }
                else {
                    for (int i = 1; i < numRows; i += 1) {
                        questionAB[i].combo_sex.setSelectedIndex(0);
                    }
                }
            }
        });
        
        //Birthdate
        lbl_bdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lbl_bdate.isSelected()) {
                    for (int i = 1; i < numRows; i += 1) {
                        questionAB[i].date_birth.setDate(questionAB[0].date_birth.getDate());
                    }
                }
                else {
                    for (int i = 1; i < numRows; i += 1) {
                        questionAB[i].date_birth.setDate(null);
                    }
                }
            }
        });
        
        //Civil Status
        lbl_civilstatus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lbl_civilstatus.isSelected()) {
                    for (int i = 1; i < numRows; i += 1) {
                        questionAB[i].combo_civilstatus.setSelectedItem(questionAB[0].combo_civilstatus.getSelectedItem());
                    }
                }
                else {
                    for (int i = 1; i < numRows; i += 1) {
                        questionAB[i].combo_civilstatus.setSelectedIndex(0);
                    }
                }
            }
        });
        
        //QC ID
        lbl_qcid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lbl_qcid.isSelected()) {
                    for (int i = 1; i < numRows; i += 1) {
                        questionAB[i].chk_qcid.setSelected(questionAB[0].chk_qcid.isSelected());
                    }
                }
                else {
                    for (int i = 1; i < numRows; i += 1) {
                        questionAB[i].chk_qcid.setSelected(false);
                    }
                }
            }
        });
        
        //OFW
        lbl_ofw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (lbl_ofw.isSelected()) {
                    for (int i = 1; i < numRows; i += 1) {
                        questionAB[i].chk_ofw.setSelected(questionAB[0].chk_ofw.isSelected());
                    }
                }
                else {
                    for (int i = 1; i < numRows; i += 1) {
                        questionAB[i].chk_ofw.setSelected(false);
                    }
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combo_entrep = new javax.swing.JComboBox<>();
        combo_agri = new javax.swing.JComboBox<>();
        headerTitle = new javax.swing.JPanel();
        lbl_ln = new javax.swing.JLabel();
        lbl_qcid = new javax.swing.JCheckBox();
        lbl_civilstatus = new javax.swing.JCheckBox();
        lbl_ofw = new javax.swing.JCheckBox();
        lbl_sex = new javax.swing.JCheckBox();
        lbl_bdate = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_ofw1 = new javax.swing.JCheckBox();
        lbl_ofw2 = new javax.swing.JCheckBox();
        lbl_ofw6 = new javax.swing.JCheckBox();
        lbl_ofw7 = new javax.swing.JCheckBox();
        lbl_ofw8 = new javax.swing.JCheckBox();
        lbl_ofw9 = new javax.swing.JCheckBox();
        lbl_ofw10 = new javax.swing.JCheckBox();
        lbl_ofw11 = new javax.swing.JCheckBox();
        lbl_ofw12 = new javax.swing.JCheckBox();
        lbl_ofw13 = new javax.swing.JCheckBox();
        dynamicPanel = new javax.swing.JPanel();
        headerTitle1 = new javax.swing.JPanel();
        lbl_entrep = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lbl_online = new javax.swing.JLabel();
        lbl_agri = new javax.swing.JLabel();
        lbl_income_emp = new javax.swing.JLabel();
        lbl_income_entrep = new javax.swing.JLabel();
        lbl_income_others = new javax.swing.JLabel();
        lbl_total_income = new javax.swing.JLabel();
        lbl_expense = new javax.swing.JLabel();
        lbl_financial_account = new javax.swing.JLabel();
        spinner_entrep = new javax.swing.JSpinner();
        spinner_agri = new javax.swing.JSpinner();
        dynamicPanel2 = new javax.swing.JPanel();
        panel_entrep = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        panel_agri = new javax.swing.JPanel();
        roundedRectTextField1 = new roundedRectTextField.roundedRectTextField();
        roundedRectTextField2 = new roundedRectTextField.roundedRectTextField();
        roundedRectTextField3 = new roundedRectTextField.roundedRectTextField();
        roundedRectTextField4 = new roundedRectTextField.roundedRectTextField();
        roundedRectTextField5 = new roundedRectTextField.roundedRectTextField();
        jComboBox2 = new javax.swing.JComboBox<>();

        combo_entrep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_entrep.setMinimumSize(new java.awt.Dimension(61, 25));
        combo_entrep.setPreferredSize(new java.awt.Dimension(61, 25));

        combo_agri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_agri.setMinimumSize(new java.awt.Dimension(61, 25));
        combo_agri.setPreferredSize(new java.awt.Dimension(61, 25));

        setMinimumSize(new java.awt.Dimension(3200, 200));
        setPreferredSize(new java.awt.Dimension(3200, 200));

        lbl_ln.setBackground(new java.awt.Color(2, 83, 115));
        lbl_ln.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ln.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ln.setText("Line No");
        lbl_ln.setOpaque(true);

        lbl_qcid.setBackground(new java.awt.Color(2, 83, 115));
        lbl_qcid.setForeground(new java.awt.Color(255, 255, 255));
        lbl_qcid.setText("WITH QC ID?");
        lbl_qcid.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_qcid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_qcidActionPerformed(evt);
            }
        });

        lbl_civilstatus.setBackground(new java.awt.Color(2, 83, 115));
        lbl_civilstatus.setForeground(new java.awt.Color(255, 255, 255));
        lbl_civilstatus.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_civilstatus.setText("CIVIL STATUS");
        lbl_civilstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_civilstatusActionPerformed(evt);
            }
        });

        lbl_ofw.setBackground(new java.awt.Color(2, 83, 115));
        lbl_ofw.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ofw.setText("OFW?");
        lbl_ofw.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_ofw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_ofwActionPerformed(evt);
            }
        });

        lbl_sex.setBackground(new java.awt.Color(2, 83, 115));
        lbl_sex.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sex.setText("SEX");
        lbl_sex.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_sexActionPerformed(evt);
            }
        });

        lbl_bdate.setBackground(new java.awt.Color(2, 83, 115));
        lbl_bdate.setForeground(new java.awt.Color(255, 255, 255));
        lbl_bdate.setText("BIRTHDATE");
        lbl_bdate.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_bdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_bdateActionPerformed(evt);
            }
        });

        lbl_ofw1.setBackground(new java.awt.Color(2, 83, 115));
        lbl_ofw1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ofw1.setText("SOLO PARENT?");
        lbl_ofw.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_ofw1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_ofw1ActionPerformed(evt);
            }
        });

        lbl_ofw2.setBackground(new java.awt.Color(2, 83, 115));
        lbl_ofw2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ofw2.setText("WITH SENIOR CITIZEN ID?");
        lbl_ofw.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_ofw2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_ofw2ActionPerformed(evt);
            }
        });

        lbl_ofw6.setBackground(new java.awt.Color(2, 83, 115));
        lbl_ofw6.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ofw6.setText("HIGHEST GRADE COMPLETED");
        lbl_ofw.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_ofw6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_ofw6ActionPerformed(evt);
            }
        });

        lbl_ofw7.setBackground(new java.awt.Color(2, 83, 115));
        lbl_ofw7.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ofw7.setText("CURRENTLY ATTENDING SCHOOL");
        lbl_ofw.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_ofw7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_ofw7ActionPerformed(evt);
            }
        });

        lbl_ofw8.setBackground(new java.awt.Color(2, 83, 115));
        lbl_ofw8.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ofw8.setText("PUBLIC OR PRIVATE SCHOOL");
        lbl_ofw.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_ofw8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_ofw8ActionPerformed(evt);
            }
        });

        lbl_ofw9.setBackground(new java.awt.Color(2, 83, 115));
        lbl_ofw9.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ofw9.setText("PUBLIC OR PRIVATE SCHOOL");
        lbl_ofw.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_ofw9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_ofw9ActionPerformed(evt);
            }
        });

        lbl_ofw10.setBackground(new java.awt.Color(2, 83, 115));
        lbl_ofw10.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ofw10.setText("REASON FOR NOT ATTENDING SCHOOL");
        lbl_ofw.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_ofw10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_ofw10ActionPerformed(evt);
            }
        });

        lbl_ofw11.setBackground(new java.awt.Color(2, 83, 115));
        lbl_ofw11.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ofw11.setText("WORKING BY MAIN JOB");
        lbl_ofw.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_ofw11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_ofw11ActionPerformed(evt);
            }
        });

        lbl_ofw12.setBackground(new java.awt.Color(2, 83, 115));
        lbl_ofw12.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ofw12.setText("NATURE OF EMPLOYMENT");
        lbl_ofw.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_ofw12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_ofw12ActionPerformed(evt);
            }
        });

        lbl_ofw13.setBackground(new java.awt.Color(2, 83, 115));
        lbl_ofw13.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ofw13.setText("LOOKING FOR ADDITIONAL WORK?");
        lbl_ofw.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_ofw13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_ofw13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerTitleLayout = new javax.swing.GroupLayout(headerTitle);
        headerTitle.setLayout(headerTitleLayout);
        headerTitleLayout.setHorizontalGroup(
            headerTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerTitleLayout.createSequentialGroup()
                .addComponent(lbl_ln, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_sex, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lbl_bdate, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lbl_civilstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lbl_qcid, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lbl_ofw, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_ofw1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_ofw2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_ofw6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_ofw7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_ofw8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_ofw9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_ofw10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_ofw11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_ofw12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_ofw13)
                .addContainerGap(322, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        headerTitleLayout.setVerticalGroup(
            headerTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerTitleLayout.createSequentialGroup()
                .addGroup(headerTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_ln, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_civilstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headerTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_qcid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_ofw, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_ofw1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_ofw2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_ofw6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_ofw7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_ofw8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_ofw9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_ofw10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_ofw11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_ofw12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_ofw13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(headerTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_sex, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_bdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        dynamicPanel.setMinimumSize(new java.awt.Dimension(0, 25));
        dynamicPanel.setPreferredSize(new java.awt.Dimension(0, 25));
        dynamicPanel.setLayout(new javax.swing.BoxLayout(dynamicPanel, javax.swing.BoxLayout.Y_AXIS));

        lbl_entrep.setBackground(new java.awt.Color(2, 83, 115));
        lbl_entrep.setForeground(new java.awt.Color(255, 255, 255));
        lbl_entrep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_entrep.setText("ENTREPRENEURIAL ACTIVITY");
        lbl_entrep.setOpaque(true);

        lbl_online.setBackground(new java.awt.Color(2, 83, 115));
        lbl_online.setForeground(new java.awt.Color(255, 255, 255));
        lbl_online.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_online.setText("USES ONLINE PLATFORM?");
        lbl_online.setOpaque(true);

        lbl_agri.setBackground(new java.awt.Color(2, 83, 115));
        lbl_agri.setForeground(new java.awt.Color(255, 255, 255));
        lbl_agri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_agri.setText("AGRICULTURAL & FISHERY ACTIVITIES");
        lbl_agri.setOpaque(true);

        lbl_income_emp.setBackground(new java.awt.Color(2, 83, 115));
        lbl_income_emp.setForeground(new java.awt.Color(255, 255, 255));
        lbl_income_emp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_income_emp.setText("TOTAL ANNUAL HOUSEHOLD INCOME FROM EMPLOYMENT");
        lbl_income_emp.setOpaque(true);

        lbl_income_entrep.setBackground(new java.awt.Color(2, 83, 115));
        lbl_income_entrep.setForeground(new java.awt.Color(255, 255, 255));
        lbl_income_entrep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_income_entrep.setText("TOTAL ANNUAL HOUSEHOLD INCOME FROM ENTREPRENEURIAL ACTIVITIES");
        lbl_income_entrep.setOpaque(true);

        lbl_income_others.setBackground(new java.awt.Color(2, 83, 115));
        lbl_income_others.setForeground(new java.awt.Color(255, 255, 255));
        lbl_income_others.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_income_others.setText("TOTAL ANNUAL HOUSEHOLD INCOME FROM OTHER SOURCES");
        lbl_income_others.setOpaque(true);

        lbl_total_income.setBackground(new java.awt.Color(2, 83, 115));
        lbl_total_income.setForeground(new java.awt.Color(255, 255, 255));
        lbl_total_income.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_total_income.setText("OVERALL TOTAL ANNUAL HOUSEHOLD INCOME");
        lbl_total_income.setOpaque(true);

        lbl_expense.setBackground(new java.awt.Color(2, 83, 115));
        lbl_expense.setForeground(new java.awt.Color(255, 255, 255));
        lbl_expense.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_expense.setText(" TOTAL ANNUAL FOOD CONSUMPTION EXPENSE");
        lbl_expense.setOpaque(true);

        lbl_financial_account.setBackground(new java.awt.Color(2, 83, 115));
        lbl_financial_account.setForeground(new java.awt.Color(255, 255, 255));
        lbl_financial_account.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_financial_account.setText("HAVE FORMAL FINANCIAL ACCOUNT?");
        lbl_financial_account.setOpaque(true);

        spinner_entrep.setModel(new javax.swing.SpinnerNumberModel(0, 0, 22, 1));
        spinner_entrep.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinner_entrepStateChanged(evt);
            }
        });

        spinner_agri.setModel(new javax.swing.SpinnerNumberModel(0, 0, 22, 1));
        spinner_agri.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinner_agriStateChanged(evt);
            }
        });

        javax.swing.GroupLayout headerTitle1Layout = new javax.swing.GroupLayout(headerTitle1);
        headerTitle1.setLayout(headerTitle1Layout);
        headerTitle1Layout.setHorizontalGroup(
            headerTitle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(headerTitle1Layout.createSequentialGroup()
                .addGroup(headerTitle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spinner_entrep)
                    .addComponent(lbl_entrep, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_online, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(headerTitle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spinner_agri)
                    .addComponent(lbl_agri, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_income_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_income_entrep, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_income_others, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_total_income, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_expense, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_financial_account, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        headerTitle1Layout.setVerticalGroup(
            headerTitle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerTitle1Layout.createSequentialGroup()
                .addGroup(headerTitle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_entrep, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_online, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_agri, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_income_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_income_entrep, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_income_others, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_total_income, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_expense, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_financial_account, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(headerTitle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinner_entrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinner_agri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        dynamicPanel2.setMinimumSize(new java.awt.Dimension(0, 25));
        dynamicPanel2.setPreferredSize(new java.awt.Dimension(1147, 25));

        panel_entrep.setBackground(new java.awt.Color(255, 255, 255));
        panel_entrep.setLayout(new javax.swing.BoxLayout(panel_entrep, javax.swing.BoxLayout.Y_AXIS));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        panel_agri.setBackground(new java.awt.Color(255, 255, 255));
        panel_agri.setLayout(new javax.swing.BoxLayout(panel_agri, javax.swing.BoxLayout.Y_AXIS));

        roundedRectTextField1.setText("");

        roundedRectTextField2.setText("");

        roundedRectTextField3.setText("");

        roundedRectTextField4.setText("");

        roundedRectTextField5.setText("");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout dynamicPanel2Layout = new javax.swing.GroupLayout(dynamicPanel2);
        dynamicPanel2.setLayout(dynamicPanel2Layout);
        dynamicPanel2Layout.setHorizontalGroup(
            dynamicPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dynamicPanel2Layout.createSequentialGroup()
                .addComponent(panel_entrep, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_agri, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundedRectTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundedRectTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundedRectTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundedRectTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundedRectTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dynamicPanel2Layout.setVerticalGroup(
            dynamicPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_entrep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_agri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dynamicPanel2Layout.createSequentialGroup()
                .addGroup(dynamicPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dynamicPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(roundedRectTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(roundedRectTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(roundedRectTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundedRectTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundedRectTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dynamicPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 3200, Short.MAX_VALUE)
            .addComponent(headerTitle1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(headerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 195, Short.MAX_VALUE))
            .addComponent(dynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dynamicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(headerTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dynamicPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(3, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_qcidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_qcidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_qcidActionPerformed

    private void lbl_civilstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_civilstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_civilstatusActionPerformed

    private void lbl_ofwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_ofwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_ofwActionPerformed

    private void lbl_sexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_sexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_sexActionPerformed

    private void lbl_bdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_bdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_bdateActionPerformed

    private void lbl_ofw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_ofw1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_ofw1ActionPerformed

    private void lbl_ofw2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_ofw2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_ofw2ActionPerformed

    private void lbl_ofw6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_ofw6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_ofw6ActionPerformed

    private void lbl_ofw7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_ofw7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_ofw7ActionPerformed

    private void lbl_ofw8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_ofw8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_ofw8ActionPerformed

    private void lbl_ofw9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_ofw9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_ofw9ActionPerformed

    private void lbl_ofw10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_ofw10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_ofw10ActionPerformed

    private void lbl_ofw11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_ofw11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_ofw11ActionPerformed

    private void lbl_ofw12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_ofw12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_ofw12ActionPerformed

    private void lbl_ofw13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_ofw13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_ofw13ActionPerformed

    private void spinner_entrepStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinner_entrepStateChanged
        addComboToPanel(panel_entrep,combo_entrep1,spinner_entrep);
    }//GEN-LAST:event_spinner_entrepStateChanged

    private void spinner_agriStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinner_agriStateChanged
        addComboToPanel(panel_agri,combo_agri1,spinner_agri);
    }//GEN-LAST:event_spinner_agriStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_agri;
    private javax.swing.JComboBox<String> combo_entrep;
    public javax.swing.JPanel dynamicPanel;
    private javax.swing.JPanel dynamicPanel2;
    private javax.swing.JPanel headerTitle;
    private javax.swing.JPanel headerTitle1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_agri;
    public javax.swing.JCheckBox lbl_bdate;
    public javax.swing.JCheckBox lbl_civilstatus;
    private javax.swing.JLabel lbl_entrep;
    private javax.swing.JLabel lbl_expense;
    private javax.swing.JLabel lbl_financial_account;
    private javax.swing.JLabel lbl_income_emp;
    private javax.swing.JLabel lbl_income_entrep;
    private javax.swing.JLabel lbl_income_others;
    private javax.swing.JLabel lbl_ln;
    public javax.swing.JCheckBox lbl_ofw;
    public javax.swing.JCheckBox lbl_ofw1;
    public javax.swing.JCheckBox lbl_ofw10;
    public javax.swing.JCheckBox lbl_ofw11;
    public javax.swing.JCheckBox lbl_ofw12;
    public javax.swing.JCheckBox lbl_ofw13;
    public javax.swing.JCheckBox lbl_ofw2;
    public javax.swing.JCheckBox lbl_ofw6;
    public javax.swing.JCheckBox lbl_ofw7;
    public javax.swing.JCheckBox lbl_ofw8;
    public javax.swing.JCheckBox lbl_ofw9;
    private javax.swing.JLabel lbl_online;
    public javax.swing.JCheckBox lbl_qcid;
    public javax.swing.JCheckBox lbl_sex;
    private javax.swing.JLabel lbl_total_income;
    private javax.swing.JPanel panel_agri;
    private javax.swing.JPanel panel_entrep;
    private roundedRectTextField.roundedRectTextField roundedRectTextField1;
    private roundedRectTextField.roundedRectTextField roundedRectTextField2;
    private roundedRectTextField.roundedRectTextField roundedRectTextField3;
    private roundedRectTextField.roundedRectTextField roundedRectTextField4;
    private roundedRectTextField.roundedRectTextField roundedRectTextField5;
    private javax.swing.JSpinner spinner_agri;
    private javax.swing.JSpinner spinner_entrep;
    // End of variables declaration//GEN-END:variables
}
