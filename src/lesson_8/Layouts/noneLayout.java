package lesson_8.Layouts;

import javax.swing.*;
import java.awt.*;

public class noneLayout extends JFrame {

    noneLayout() {
    setTitle("Hi from GridLayout");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setBounds(500,500,400,400);
    setBackground(Color.red);
    setVisible(true);

    setLayout(null);

    JTextField field = new JTextField("Hi, Mark");
    field.setBounds(100,100,200,50);
    add(field);

    JButton button = new JButton("Тык?");
    button.setBounds(100,200, 200, 50);
    add(button);
    }
}
