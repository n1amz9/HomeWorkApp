package lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestCounter extends JFrame {
    private int counter;

    TestCounter() {
        setTitle("testCounter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(500,500,300,120);
        setVisible(true);

        Font font = new Font("Arial", Font.BOLD, 32);

        JButton buttonLeft = new JButton("<");
        JButton buttonRight = new JButton(">");
        JButton buttonIncrement = new JButton("+10");
        JButton buttonDecrement = new JButton("-10");
        JButton buttonRestart = new JButton("Restart");
        JTextField counterField = new JTextField(String.valueOf(counter));
        counterField.setFont(font);
        counterField.setHorizontalAlignment(SwingConstants.CENTER);


        buttonLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (counter <= 0) {
                    System.out.println("Куда уж меньше");
                }
                else {
                    counter--;
                    counterField.setText(String.valueOf(counter));
                }
            }
        });

        buttonRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (counter >= 100) {
                    System.out.println("Куда уж больше");
                }
                else {
                    counter++;
                    counterField.setText(String.valueOf(counter));
                }
            }
        });

        buttonRestart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter = 0;
                counterField.setText(String.valueOf(counter));
            }
        });

        add(buttonLeft, BorderLayout.WEST);
        add(buttonRight, BorderLayout.EAST);
        add(counterField, BorderLayout.CENTER);
        add(buttonRestart, BorderLayout.SOUTH);
        add(buttonIncrement, BorderLayout.EAST);
        add(buttonDecrement, BorderLayout.WEST);
    }
}
