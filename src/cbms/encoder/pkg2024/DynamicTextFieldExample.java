/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cbms.encoder.pkg2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DynamicTextFieldExample {
    private JFrame frame;
    private JPanel panel;
    private JSpinner spinner;
    private int rowCount = 1;
    private int fieldWidth = 100;
    private int fieldHeight = 25;
    private int spacing = 10;

    public DynamicTextFieldExample() {
        frame = new JFrame("Dynamic TextField Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        spinner = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
        spinner.addChangeListener(e -> createTextFields((Integer) spinner.getValue()));
        frame.add(spinner, BorderLayout.NORTH);

        panel = new JPanel();
        panel.setLayout(null);  // Using null layout
        frame.add(new JScrollPane(panel), BorderLayout.CENTER);

        createTextFields(rowCount);

        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    private void createTextFields(int rows) {
        rowCount = rows;
        panel.removeAll();

        for (int i = 0; i < rows; i++) {
            int yPosition = i * (fieldHeight + spacing);
            
            JTextField textFieldA = new JTextField();
            textFieldA.setBounds(10, yPosition, fieldWidth, fieldHeight);
            textFieldA.addKeyListener(new ArrowKeyListener(i, 0));
            panel.add(textFieldA);

            JTextField textFieldB = new JTextField();
            textFieldB.setBounds(10 + fieldWidth + spacing, yPosition, fieldWidth, fieldHeight);
            textFieldB.addKeyListener(new ArrowKeyListener(i, 1));
            panel.add(textFieldB);
        }

        panel.revalidate();
        panel.repaint();
    }

    private class ArrowKeyListener extends KeyAdapter {
        private int row, col;

        public ArrowKeyListener(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_LEFT:
                    moveFocus(row, col - 1);
                    break;
                case KeyEvent.VK_RIGHT:
                    moveFocus(row, col + 1);
                    break;
                case KeyEvent.VK_UP:
                    moveFocus(row - 1, col);
                    break;
                case KeyEvent.VK_DOWN:
                    moveFocus(row + 1, col);
                    break;
            }
        }

        private void moveFocus(int newRow, int newCol) {
            if (newRow >= 0 && newRow < rowCount && newCol >= 0 && newCol < 2) {
                int index = newRow * 2 + newCol;
                Component comp = panel.getComponent(index);
                if (comp instanceof JTextField) {
                    comp.requestFocus();
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DynamicTextFieldExample::new);
    }
}
