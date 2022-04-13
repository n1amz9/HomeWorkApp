package lesson_8.Layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderTest extends JFrame {
    public BorderTest() {
        setTitle("Test Window");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(500,500,640,480);


        JButton[] buttons = new JButton[5];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("TestButton #" + i);

            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Hello from " + ((JButton)e.getSource()).getText());
                }
            });

            }
        add(buttons[0], BorderLayout.EAST);
        add(buttons[1], BorderLayout.WEST);
        add(buttons[2], BorderLayout.SOUTH);
        add(buttons[3], BorderLayout.NORTH);
        add(buttons[4], BorderLayout.CENTER);

        setVisible(true);
    }
}
