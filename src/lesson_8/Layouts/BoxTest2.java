package lesson_8.Layouts;

import javax.swing.*;

public class BoxTest2 extends JFrame {

    public BoxTest2() {

        setTitle("AppForm for BoxLayout test");
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setBounds(400,400,640,480);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

        JButton[] buttons = new JButton[5];

        for (int i = 0; i < buttons.length; i++) {
            add(new JButton("Button #" + i));
        }

        setVisible(true);

    }

}
