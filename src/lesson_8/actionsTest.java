package lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class actionsTest extends JFrame {
    public static int counter;
    actionsTest() {
        setTitle("actionTest Window");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(500,500,400,300);
        setLayout(new GridLayout(3,3));
        setVisible(true);

        JTextField textField = new JTextField("Enter me");
        add (textField);

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });

        JButton button = new JButton("Push me!");
        add (button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(counter++);
            }
        });
    }
}
