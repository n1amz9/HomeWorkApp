package lesson_8.Layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoxTest extends JFrame {
    public BoxTest() {
        setTitle("AppForm for Box Layout");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(700,700,640,480);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

        JButton[] buttons = new JButton[9];

        for (int i = 0; i < buttons.length; i++) {
            add(new JButton("#" + (i + 1)));
        }
        setVisible(true);
    }
}
