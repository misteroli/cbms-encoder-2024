/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cbms.encoder.pkg2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class DynamicPanelExample {
    private JFrame frame;
    private JPanel panel;
    private JSpinner spinner;
    private JCheckBox checkBoxColumn1;
    private JCheckBox checkBoxColumn2;
    private JButton applyButton;

    private List<JTextField> textFieldsColumn1;
    private List<JComboBox<String>> comboBoxesColumn1;
    private List<JTextField> textFieldsColumn2;
    private List<JComboBox<String>> comboBoxesColumn2;

    public DynamicPanelExample() {
        frame = new JFrame("Dynamic Panel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        panel = new JPanel();
        panel.setLayout(new GridLayout(0, 4, 10, 10));  // 4 columns for two sets of JTextField and JComboBox

        spinner = new JSpinner(new SpinnerNumberModel(1, 1, 20, 1));
        checkBoxColumn1 = new JCheckBox("Apply Column 1 to all");
        checkBoxColumn2 = new JCheckBox("Apply Column 2 to all");
        applyButton = new JButton("Apply");

        textFieldsColumn1 = new ArrayList<>();
        comboBoxesColumn1 = new ArrayList<>();
        textFieldsColumn2 = new ArrayList<>();
        comboBoxesColumn2 = new ArrayList<>();

        JPanel controlPanel = new JPanel();
        controlPanel.add(new JLabel("Number of Rows:"));
        controlPanel.add(spinner);
        controlPanel.add(checkBoxColumn1);
        controlPanel.add(checkBoxColumn2);
        controlPanel.add(applyButton);

        frame.add(controlPanel, BorderLayout.NORTH);
        frame.add(new JScrollPane(panel), BorderLayout.CENTER);

        applyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createDynamicComponents((Integer) spinner.getValue());
            }
        });

        checkBoxColumn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBoxColumn1.isSelected()) {
                    applyToAll(textFieldsColumn1, comboBoxesColumn1);
                }
            }
        });

        checkBoxColumn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBoxColumn2.isSelected()) {
                    applyToAll(textFieldsColumn2, comboBoxesColumn2);
                }
            }
        });

        // Create popup menus
        JPopupMenu popupMenuColumn1 = createPopupMenu(checkBoxColumn1, textFieldsColumn1, comboBoxesColumn1);
        JPopupMenu popupMenuColumn2 = createPopupMenu(checkBoxColumn2, textFieldsColumn2, comboBoxesColumn2);

        // Add mouse listeners for right-click on checkboxes
        addPopupListener(checkBoxColumn1, popupMenuColumn1);
        addPopupListener(checkBoxColumn2, popupMenuColumn2);

        frame.setSize(800, 400);  // Adjusted width for more columns
        frame.setVisible(true);
    }

    private void createDynamicComponents(int numberOfRows) {
        panel.removeAll();
        textFieldsColumn1.clear();
        comboBoxesColumn1.clear();
        textFieldsColumn2.clear();
        comboBoxesColumn2.clear();

        for (int i = 0; i < numberOfRows; i++) {
            JTextField textField1 = new JTextField();
            JComboBox<String> comboBox1 = new JComboBox<>(new String[]{"Item 1", "Item 2", "Item 3"});
            JTextField textField2 = new JTextField();
            JComboBox<String> comboBox2 = new JComboBox<>(new String[]{"Option 1", "Option 2", "Option 3"});

            textFieldsColumn1.add(textField1);
            comboBoxesColumn1.add(comboBox1);
            textFieldsColumn2.add(textField2);
            comboBoxesColumn2.add(comboBox2);

            panel.add(textField1);
            panel.add(comboBox1);
            panel.add(textField2);
            panel.add(comboBox2);
        }
        panel.revalidate();
        panel.repaint();
    }

    private void applyToAll(List<JTextField> textFields, List<JComboBox<String>> comboBoxes) {
        if (!textFields.isEmpty() && !comboBoxes.isEmpty()) {
            String textValue = textFields.get(0).getText();
            String comboBoxValue = (String) comboBoxes.get(0).getSelectedItem();

            for (int i = 1; i < textFields.size(); i++) {
                textFields.get(i).setText(textValue);
                comboBoxes.get(i).setSelectedItem(comboBoxValue);
            }
        }
    }

    private JPopupMenu createPopupMenu(JCheckBox checkBox, List<JTextField> textFields, List<JComboBox<String>> comboBoxes) {
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem clearMenuItem = new JMenuItem("Clear Rows");

        clearMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                clearRows(textFields, comboBoxes);
            }
        });

        popupMenu.add(clearMenuItem);
        return popupMenu;
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

    private void clearRows(List<JTextField> textFields, List<JComboBox<String>> comboBoxes) {
        for (JTextField textField : textFields) {
            textField.setText("");
        }
        for (JComboBox<String> comboBox : comboBoxes) {
            comboBox.setSelectedItem(null);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DynamicPanelExample();
            }
        });
    }
}
