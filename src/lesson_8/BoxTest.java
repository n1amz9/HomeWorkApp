package lesson_8;

import javax.swing.*;
import java.awt.*;

public class BoxTest extends JFrame {
    public BoxTest() {
        setTitle("AppForm2");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(700,700,640,480);
        setVisible(true);

        JButton button = new JButton("Mega button");
        button.add(button, BorderLayout.PAGE_START);

    }

}
