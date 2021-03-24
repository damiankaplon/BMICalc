package app;

import javafx.scene.control.Slider;

import javax.swing.*;
import java.awt.*;

public class BmiCalc extends JFrame {
    private JButton calcYourBmi;
    private JTextField yourWeight, yourHeight;

    /* Constructor which mainly creates all the main window (actually the only one) of the app*/
    public BmiCalc(){
        super("Bmi Calculator v1.0.1");
        setMinimumSize(new Dimension(800, 600));
        setMaximumSize(new Dimension(1280, 720));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*Creating a main "Window". Main Frame of application
        A container has several layers in it. You can think of a layer as a transparent film that overlays the
        container. In Java Swing, the layer that is used to hold objects is called the content pane.
        Objects are added to the content pane layer of the container.
        The getContentPane() method retrieves the content pane layer so that you can add an object to it.
        The content pane is an object created by the Java run time environment. You do not have to know the name of the
        content pane to use it.
        getContentPane() returns a container to hold objects. You can add objects on the returned container instead of
        adding objects directly to the JFrame or JDialog. */

        JPanel contentPane = (JPanel) getContentPane();
        contentPane.setLayout(new BorderLayout());
        initComponents();

    }

    //method that will create components for main windows. In this case we got 3 components. 2 text fields and 1 button
    private void initComponents(){
        JTextField weight = new JTextField("Your weight: ");
        JTextField height = new JTextField("Your height: ");
        weight.setHorizontalAlignment(JTextField.RIGHT);
        height.setHorizontalAlignment(JTextField.RIGHT);
        JButton compute = new JButton("Calculate my BMI!");
    }

    public static void main(String[] args) {
        BmiCalc bmiCalc = new BmiCalc();
        bmiCalc.setVisible(true);

    }
}
