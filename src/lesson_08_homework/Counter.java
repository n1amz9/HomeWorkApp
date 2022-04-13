package lesson_08_homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame {
    static int value;
    public Counter() {
        setTitle("Counter for homework");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(500,500,700,500);
        setLayout(new GridLayout(2,5));

        Font font = new Font("Arial", Font.BOLD, 32);
        JButton decreaseButton = new JButton("<");
        JButton increaseButton = new JButton(">");
        JButton increaseButtonPlus = new JButton("+10");
        JButton decreaseButtonPlus = new JButton("-10");
        JButton resetButton = new JButton("RESET");
        JTextField counterText = new JTextField(String.valueOf(value));
        counterText.setFont(font);
        counterText.setHorizontalAlignment(SwingConstants.CENTER);

        increaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counterText.setText(String.valueOf(value++));
            }
        });

        decreaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (value < 0) {
                    System.out.println("Куда уж меньше то?");

                }
                else {
                    counterText.setText(String.valueOf(value--));
                }
            }
        });

        decreaseButtonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (value < 0 || value - 10 < 0) {
                    System.out.println("Куда уж меньше то?");
                }
                else {
                    value -= 10;
                    counterText.setText(String.valueOf(value));
                }
            }
        });

        increaseButtonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    value += 10;
                    counterText.setText(String.valueOf(value));
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = 0;
                counterText.setText(String.valueOf(value));
            }
        });

        add(decreaseButton,0);
        add(decreaseButtonPlus,1);
        add(counterText,2);
        add(increaseButton,3);
        add(increaseButtonPlus,4);
        add(resetButton,5);

        /*add(counterText, BorderLayout.CENTER);
        add(increaseButton, BorderLayout.EAST);
        add(increaseButtonPlus, BorderLayout.EAST);
        add(decreaseButton, BorderLayout.WEST);
        add(decreaseButtonPlus, BorderLayout.WEST);
        add(resetButton, BorderLayout.SOUTH);*/


        setVisible(true);
    }
}
