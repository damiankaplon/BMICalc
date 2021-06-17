package app;

import calc.Calc;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BmiCalc extends JFrame implements ActionListener {
    private JButton calcYourBmi;
    private JTextField yourWeight, yourHeight, yourBmi;
    private JLabel heightLabel, weightLabel, bmiLabel;

    /* Constructor which mainly creates all the main window (actually the only one) of the app*/
    public BmiCalc(){
        super("Bmi Calculator v1.0.1");
        setSize(new Dimension(362,110));
        setLocationRelativeTo(null);
        setResizable(false);
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

        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.setLayout(new BorderLayout());
        initComponents();
        contentPane.add(createMainPanel(),BorderLayout.WEST);


    }

    //method that will create components for main windows. In this case we got 3 components. 2 text fields and 1 button
    private void initComponents(){
        this.yourWeight = new JTextField();
        this.yourHeight = new JTextField();
        this.yourBmi = new JTextField();
        this.heightLabel = new JLabel();
        this.weightLabel = new JLabel();
        this.bmiLabel = new JLabel();
        this.yourWeight.setHorizontalAlignment(JTextField.RIGHT);
        this.yourHeight.setHorizontalAlignment(JTextField.RIGHT);
        this.calcYourBmi = new JButton("Calculate my BMI!");
        //Adding aciton listener to make program start listening if something happens with button
        calcYourBmi.addActionListener(this);
        this.bmiLabel.setText("Your BMI");
        this.heightLabel.setText("Height:");
        this.weightLabel.setText("Weight:");
    }

    private JPanel createMainPanel(){
        JPanel mainPanel = new JPanel();
         FormLayout formLayout = new FormLayout(
                "40dlu, 40dlu, 40dlu, 40dlu, 40dlu",
               "20dlu, 20dlu");
         mainPanel.setLayout(formLayout);
         CellConstraints cc = new CellConstraints();
         mainPanel.add(this.yourHeight, cc.xy(2,1,CellConstraints.FILL,CellConstraints.FILL));
         mainPanel.add(this.yourWeight, cc.xy(4,1,CellConstraints.FILL,CellConstraints.FILL));
         mainPanel.add(this.calcYourBmi, cc.xyw(1,2,4,CellConstraints.FILL,CellConstraints.FILL));
         mainPanel.add(this.yourBmi, cc.xy(5,2, CellConstraints.FILL,CellConstraints.FILL));
         mainPanel.add(this.weightLabel, cc.xy(3, 1,CellConstraints.FILL, CellConstraints.FILL));
         mainPanel.add(this.heightLabel, cc.xy(1, 1,CellConstraints.FILL, CellConstraints.FILL));
         mainPanel.add(this.bmiLabel, cc.xy(5, 1,CellConstraints.CENTER, CellConstraints.CENTER));
        return  mainPanel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source == calcYourBmi) {

            Calc calc = new Calc();
            //Wounder if it will work
            try {
                float yourHeight = new Float(this.yourHeight.getText());
                float yourWeight = new Float(this.yourWeight.getText());
                calc.calcBmi(yourHeight, yourWeight);
                String bmi = new String(String.valueOf(calc.getBmi()));
                this.yourBmi.setText(bmi.substring(0, 4));
            }
            catch (NumberFormatException numberFormatException) {
                this.yourHeight.setText("Height in meters");
                this.yourWeight.setText("Weight in kilograms");
            }
        }
    }

    //Main method
    public static void main(String[] args) {
        BmiCalc bmiCalc = new BmiCalc();
        bmiCalc.setVisible(true);



    }
}
