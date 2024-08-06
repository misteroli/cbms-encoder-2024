
package cbms.encoder.pkg2024;


/**
 *
 * @author CPDD - SPD PDIU
 */

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class FilterComboBox extends JComboBox {
    
    private List<String> array;
    private int currentCaretPosition=0;
    
    public FilterComboBox(List<String> array) { 
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
}
