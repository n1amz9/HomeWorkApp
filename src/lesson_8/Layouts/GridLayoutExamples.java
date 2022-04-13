package lesson_8.Layouts;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExamples extends JFrame {

    GridLayoutExamples() {
        setTitle("Hi from GridLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(500,500,400,400);
        setBackground(Color.red);

        setLayout(new GridLayout(3,3));

        for (int i = 0; i < 9; i++) {
            add(new JButton("#" + String.valueOf(i + 1)));
        }


        setVisible(true);

    }


}
