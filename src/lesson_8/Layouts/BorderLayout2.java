package lesson_8.Layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderLayout2 extends JFrame {

    public static int a;

    public BorderLayout2() {
        setTitle("Привет, мир!");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500,300,300);
        setVisible(true);

        JButton[] buttons = new JButton[5];

        buttons[0] = new JButton("NONE");
        buttons[1] = new JButton(">");
        buttons[2] = new JButton("<");
        buttons[3] = new JButton("^");
        buttons[4] = new JButton("↓");

        add(buttons[0], BorderLayout.CENTER);
        add(buttons[1], BorderLayout.EAST);
        add(buttons[2], BorderLayout.WEST);
        add(buttons[3], BorderLayout.NORTH);
        add(buttons[4], BorderLayout.SOUTH);



    }
}
