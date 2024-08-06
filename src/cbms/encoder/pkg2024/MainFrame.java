/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cbms.encoder.pkg2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame {
    private JPanel mainPanel;
    private List<JComponent> components;
    private JSpinner panelCountSpinner;

    public MainFrame() {
        setTitle("Main Frame");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialize components list
        components = new ArrayList<>();

        // Create a main panel with BoxLayout
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Create and add the spinner for dynamic panel count
        panelCountSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 10, 1));
        panelCountSpinner.addChangeListener(e -> updatePanels());
        mainPanel.add(panelCountSpinner);

        // Add initial panels
        updatePanels();

        // Add the main panel to the frame
        add(new JScrollPane(mainPanel));
        setVisible(true);
    }

    private void updatePanels() {
        mainPanel.removeAll();
        components.clear();
        mainPanel.add(panelCountSpinner); // Re-add the spinner to the main panel

        int panelCount = (int) panelCountSpinner.getValue();

        for (int i = 0; i < panelCount; i++) {
            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());

            JTextField textField = new JTextField(10);
            JComboBox<String> comboBox = new JComboBox<>(new String[]{"Option 1", "Option 2"});
            panel.add(new JLabel("Panel " + (i + 1) + ":"));
            panel.add(textField);
            panel.add(comboBox);

            components.add(textField);
            components.add(comboBox);

            addKeyBindings(textField);
            addKeyBindings(comboBox);

            mainPanel.add(panel);
        }

        mainPanel.revalidate();
        mainPanel.repaint();
    }

    private void addKeyBindings(JComponent component) {
        // Up key binding
        component.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0), "moveUp");
        component.getActionMap().put("moveUp", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveFocus(component, -2); // Move to the previous panel (previous pair of components)
            }
        });

        // Down key binding
        component.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0), "moveDown");
        component.getActionMap().put("moveDown", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveFocus(component, 2); // Move to the next panel (next pair of components)
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

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainFrame::new);
    }
}
