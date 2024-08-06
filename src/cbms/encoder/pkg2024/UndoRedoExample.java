/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cbms.encoder.pkg2024;

import javax.swing.*;
import javax.swing.undo.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;


public class UndoRedoExample extends JFrame {
    private Map<JComponent, UndoManager> undoManagerMap = new HashMap<>();
    private JComponent currentComponent;

    public UndoRedoExample() {
        setTitle("Multi-Component Undo Redo Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Create panels for different components
        JPanel textPanel = new JPanel(new GridLayout(1, 2));
        JPanel comboPanel = new JPanel(new GridLayout(1, 2));

        // Create and add text areas
        JTextArea textArea1 = createTextArea();
        JTextArea textArea2 = createTextArea();
        textPanel.add(new JScrollPane(textArea1));
        textPanel.add(new JScrollPane(textArea2));

        // Create and add combo boxes
        JComboBox<String> comboBox1 = createComboBox();
        JComboBox<String> comboBox2 = createComboBox();
        comboPanel.add(comboBox1);
        comboPanel.add(comboBox2);

        // Add panels to frame
        add(textPanel, BorderLayout.CENTER);
        add(comboPanel, BorderLayout.SOUTH);

        // Create buttons for undo and redo
        JButton undoButton = new JButton("Undo");
        JButton redoButton = new JButton("Redo");

        // Add undo and redo actions
        undoButton.addActionListener(e -> undo());
        redoButton.addActionListener(e -> redo());

        // Create a panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(undoButton);
        buttonPanel.add(redoButton);

        // Add button panel to frame
        add(buttonPanel, BorderLayout.NORTH);

        // Add focus listeners to components
        addFocusListeners(textArea1, textArea2, comboBox1, comboBox2);

        // Set visible
        setVisible(true);
    }

    private JTextArea createTextArea() {
        JTextArea textArea = new JTextArea();
        UndoManager undoManager = new UndoManager();
        textArea.getDocument().addUndoableEditListener(undoManager);
        undoManagerMap.put(textArea, undoManager);
        return textArea;
    }

    private JComboBox<String> createComboBox() {
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Item 1", "Item 2", "Item 3"});
        UndoManager undoManager = new UndoManager();
        comboBox.addActionListener(e -> {
            if (comboBox.getSelectedIndex() != -1) {
                undoManager.addEdit(new AbstractUndoableEdit() {
                    private final Object oldValue = comboBox.getSelectedItem();

                    @Override
                    public void undo() {
                        super.undo();
                        comboBox.setSelectedItem(oldValue);
                    }

                    @Override
                    public void redo() {
                        super.redo();
                        comboBox.setSelectedItem(comboBox.getSelectedItem());
                    }
                });
            }
        });
        undoManagerMap.put(comboBox, undoManager);
        return comboBox;
    }

    private void addFocusListeners(JComponent... components) {
        for (JComponent component : components) {
            component.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    currentComponent = component;
                }
            });
        }
    }

    private void undo() {
        if (currentComponent != null) {
            UndoManager undoManager = undoManagerMap.get(currentComponent);
            if (undoManager != null && undoManager.canUndo()) {
                undoManager.undo();
            }
        }
    }

    private void redo() {
        if (currentComponent != null) {
            UndoManager undoManager = undoManagerMap.get(currentComponent);
            if (undoManager != null && undoManager.canRedo()) {
                undoManager.redo();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new UndoRedoExample());
    }
}
