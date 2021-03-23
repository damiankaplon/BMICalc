package app;

import javafx.scene.control.Slider;

import javax.swing.*;
import java.awt.*;

public class BmiCalc extends JFrame {
    public BmiCalc(){
        super("Bmi Calculator v1.0.1");
        setMinimumSize(new Dimension(800, 600));
        setMaximumSize(new Dimension(1280, 720));
        //setSize(new Dimension(700));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel contentPane = (JPanel) getContentPane();
        contentPane.setLayout(new GridLayout(2, 2));

        JTextField weight = new JTextField("Your weight: ");
        JTextField height = new JTextField("Your height: ");
        weight.setHorizontalAlignment(JTextField.RIGHT);
        height.setHorizontalAlignment(JTextField.RIGHT);

        contentPane.add();
        contentPane.add();

        JButton compute = new JButton("Calculate my BMI!");
        contentPane.add(compute);
    }

    public static void main(String[] args) {


    }
}
