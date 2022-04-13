package lesson_8.Layouts;

import javax.swing.*;
import java.awt.*;

public class FlowLayout2 extends JFrame {

    FlowLayout2() {
        setTitle("Flow Layout test");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300,100,300,100);

       setLayout(new FlowLayout());

        for (int i = 0; i < 4; i++) {
            add(new JButton("#" + i));
        }

        setVisible(true);
    }
}
