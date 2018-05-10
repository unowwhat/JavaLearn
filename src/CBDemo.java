/**
 * Created by Roman on 05.05.2018.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CBDemo implements ItemListener {
    JLabel jlabSelected;
    JLabel jlabChanged;
    JCheckBox jcbAlpha;
    JCheckBox jcbBeta;
    JCheckBox jcbGamma;

    CBDemo(){
        JFrame jfrm = new JFrame("Check box demo");
        jfrm.setSize(280, 120);
        jfrm.setLayout(new FlowLayout());
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlabSelected = new JLabel("");
        jlabChanged = new JLabel("");

        jcbAlpha = new JCheckBox("Alpha");
        jcbBeta = new JCheckBox("Beta");
        jcbGamma = new JCheckBox("Gamma");

        jcbAlpha.addItemListener(this);
        jcbBeta.addItemListener(this);
        jcbGamma.addItemListener(this);

        jfrm.add(jcbAlpha);
        jfrm.add(jcbBeta);
        jfrm.add(jcbGamma);
        jfrm.add(jlabSelected);
        jfrm.add(jlabChanged);

        jfrm.setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie){
        String str = "";
        JCheckBox cb = (JCheckBox) ie.getItem();

        if (cb.isSelected())
            jlabChanged.setText(cb.getText() + " was just selected");
        else
            jlabChanged.setText(cb.getText() + " was just cleared");

        if (jcbAlpha.isSelected()) str += "Alpha ";
        if (jcbBeta.isSelected()) str += "Beta ";
        if (jcbGamma.isSelected()) str += "Gamma";

        jlabSelected.setText("Selected checkboxes: " + str);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CBDemo();
            }
        });
    }
}
