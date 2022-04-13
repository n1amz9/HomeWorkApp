package lesson_8.Layouts;

import javax.swing.*;
import java.awt.*;

public class FlowLayout_example extends JFrame {

    FlowLayout_example() {
        setTitle("test Windows");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300,300,100,300);

        setLayout(new FlowLayout());

        for (int i = 0; i < 5; i++) {
            add(new JButton(String.valueOf(i + 1)));
        }

        setVisible(true);
    }

}
