/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cbms.encoder.pkg2024.panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DynamicRowsApplication {
    private JFrame frame;
    private JPanel controlPanel;
    private JPanel tablePanel;
    private JLabel rowsLabel;
    private JSpinner rowSpinner;
    private JButton createTableButton;
    private JPanel headerPanel;
    private JPanel dataFieldsPanel;

    public DynamicRowsApplication() {
        frame = new JFrame("Dynamic Rows Application");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        controlPanel = new JPanel();
        rowsLabel = new JLabel("Number of Rows:");
        controlPanel.add(rowsLabel);

        rowSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
        controlPanel.add(rowSpinner);

        createTableButton = new JButton("Create Table");
        controlPanel.add(createTableButton);

        frame.add(controlPanel, BorderLayout.NORTH);

        createTableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createTable();
            }
        });

        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void createTable() {
        int numRows = (int) rowSpinner.getValue();

        if (tablePanel != null) {
            frame.remove(tablePanel);
        }

        tablePanel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5); // Insets to control spacing

        // Create header panel
        headerPanel = new JPanel(new GridLayout(1, 2)); // Adjust column count as per your needs
        tablePanel.add(headerPanel, gbc);

        // Add headers (questions)
        JLabel[] headers = new JLabel[numRows];
        JCheckBox[] applyCheckboxes = new JCheckBox[numRows];
        for (int i = 0; i < numRows; i++) {
            headers[i] = new JLabel("Question " + (i + 1), JLabel.CENTER);
            headerPanel.add(headers[i]);

            applyCheckboxes[i] = new JCheckBox("Apply to All");
            applyCheckboxes[i].setHorizontalAlignment(SwingConstants.CENTER);
            headerPanel.add(applyCheckboxes[i]);
        }

        gbc.gridy++; // Move to the next row

        // Add data fields (text fields or dropdowns)
        JPanel[] rows = new JPanel[numRows];
        JTextField[] textFields = new JTextField[numRows];
        JComboBox<String>[] dropdowns = new JComboBox[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0)); // Use FlowLayout to prevent resizing

            textFields[i] = new JTextField();
            textFields[i].setPreferredSize(new Dimension(200, 25)); // Fixed height and width
            rows[i].add(textFields[i]);

            dropdowns[i] = new JComboBox<>(new String[]{"Option 1", "Option 2", "Option 3"});
            dropdowns[i].setPreferredSize(new Dimension(200, 25)); // Fixed height and width
            rows[i].add(dropdowns[i]);

            gbc.gridy++;
            gbc.anchor = GridBagConstraints.NORTH; // Align components to the top
            tablePanel.add(rows[i], gbc);
        }

        // Add table panel to scroll pane and frame
        JScrollPane scrollPane = new JScrollPane(tablePanel);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Refresh frame to show changes
        frame.revalidate();
        frame.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DynamicRowsApplication();
            }
        });
    }
}


