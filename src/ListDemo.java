/**
 * Created by Roman on 05.05.2018.
 */
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class ListDemo implements ListSelectionListener {
    JList<String> jlst;
    JLabel jlab;
    JScrollPane jscrlp;

    String names[] = {"Sherry", "John", "Rachel", "Sasha", "Josselyn", "Randy",
                        "Tom", "Mary", "Ken", "Andrew", "Matt", "Todd"};

    ListDemo(){
        JFrame jfrm = new JFrame("List demo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(200,160);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlst = new JList<String>(names);
        jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        jscrlp = new JScrollPane(jlst);
        jscrlp.setPreferredSize(new Dimension(120,90));

        jlab = new JLabel("Please choose a name");
        jlst.addListSelectionListener(this);

        jfrm.add(jscrlp);
        jfrm.add(jlab);

        jfrm.setVisible(true);
    }

    public void valueChanged(ListSelectionEvent le){
        int idx = jlst.getSelectedIndex();
        if (idx != -1)
            jlab.setText("Current selection: " + names[idx]);
        else
            jlab.setText("Please choose a name");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListDemo();
            }
        });
    }
}
