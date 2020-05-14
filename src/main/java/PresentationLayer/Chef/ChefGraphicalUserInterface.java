package PresentationLayer.Chef;

import BusinessLayer.MenuItem;
import BusinessLayer.Order;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ChefGraphicalUserInterface extends JFrame implements Observer {
    private JPanel contentPane;
    private JTextArea textArea;

    public ChefGraphicalUserInterface(){
        setTitle("CHEF");
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 602, 481);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        textArea = new JTextArea();
        textArea.setEditable(false);
        contentPane.add(textArea);
    }

    @Override
    public void update(HashMap<Order, ArrayList<MenuItem>> orders) {
        textArea.setText("");
        for (Map.Entry<Order, ArrayList<MenuItem>> entry : orders.entrySet()){
            Order o = entry.getKey();
            ArrayList<MenuItem> m = entry.getValue();
            textArea.append(o.toString() + "\n Products: ");
            textArea.append(m.toString());
            textArea.append("\n");
        }
    }
}
