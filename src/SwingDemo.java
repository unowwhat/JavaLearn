/**
 * Created by Roman on 01.05.2018.
 */
import javax.swing.*;


public class SwingDemo {

    SwingDemo() {
        //новый контейнер JFrame
        JFrame jfrm = new JFrame("A simple Swing app");
        //размер
        jfrm.setSize(275, 100);
        //обработка закрытия программы
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //текстовая метка
        JLabel jlab = new JLabel("Swing defines smh GUI.");
        //просто добавить метку в контейнер
        jfrm.add(jlab);
        //отобразить
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }

}
