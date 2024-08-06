/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cbms.encoder.pkg2024;

                                       /****Beginning of code****/
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class FilterComboBoxExample extends JComboBox {
    private List<String> array;
    private int currentCaretPosition=0;


    public FilterComboBoxExample(List<String> array) { 
        super(array.toArray());
        this.array = array;
        this.setEditable(true);
        final JTextField textfield = (JTextField) this.getEditor().getEditorComponent();
        textfield.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        currentCaretPosition=textfield.getCaretPosition();
                        if(textfield.getSelectedText()==null)
                        {
                        textfield.setCaretPosition(0);
                        comboFilter(textfield.getText());
                        textfield.setCaretPosition(currentCaretPosition);
                        }
                     }
                });
            }

        });
    }

    public void comboFilter(String enteredText) {
        List<String> filterArray= new ArrayList<String>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).toLowerCase().contains(enteredText.toLowerCase())) {
                filterArray.add(array.get(i));
            }


        }
        if (filterArray.size() > 0) {

            this.setModel(new DefaultComboBoxModel(filterArray.toArray()));
            this.setSelectedItem(enteredText);
            this.showPopup();
        }
        else {
            this.hidePopup();
        }
    }

    /* Testing Codes */
    public static List<String> populateArray() {
        List<String> test = new ArrayList<String>();
        test.add("");
        test.add("Mountain Flight");
        test.add("Mount Climbing");
        test.add("Trekking");
        test.add("Rafting");
        test.add("Jungle Safari");
        test.add("Bungie Jumping");
        test.add("Para Gliding");
        return test;
    }

    public static void makeUI() {
        JFrame frame = new JFrame("Adventure in Nepal - Combo Filter Test");
        FilterComboBoxExample acb = new FilterComboBoxExample(populateArray());
        frame.getContentPane().add(acb);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) throws Exception {

        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        makeUI();
    }
}
