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

        JSlider inputHeight = new JSlider(100, 280, 180);
        JSlider inputWeight = new JSlider(30, 200, 50);
        contentPane.add(inputHeight);
        contentPane.add(inputWeight);

        JButton compute = new JButton();
        contentPane.add(compute);
    }

    public static void main(String[] args) {

	BmiCalc bmiCalc = new BmiCalc();
	bmiCalc.setVisible(true);

    }
}
