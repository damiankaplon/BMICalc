package app;

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

    }

    public static void main(String[] args) {

	BmiCalc bmiCalc = new BmiCalc();
	bmiCalc.setVisible(true);

    }
}
