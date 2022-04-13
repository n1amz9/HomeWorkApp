package lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RandomNumber extends JFrame {

    public RandomNumber() {
        final int[] value = new int[1];
        int randomValue;


        setTitle("MegaRealisation");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(500,500,500,500);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        Random random = new Random(10);

        Font font = new Font("Arial", Font.BOLD, 32);

        JTextField textRandom = new JTextField();
        textRandom.setFont(font);
        textRandom.setHorizontalAlignment(SwingConstants.CENTER);


        JButton buttonGenerate = new JButton("Generate");
        JButton buttonRandom = new JButton("Random");
        buttonGenerate.setFont(font);

        buttonGenerate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value[0] = random.nextInt(32);
                System.out.println("[DEBUG] Random value is " + value[0]);
                textRandom.setText(String.valueOf(value[0]));
            }
        });


        add(textRandom,BorderLayout.CENTER);
        add(buttonGenerate,BorderLayout.SOUTH);







        setVisible(true);
    }
}
