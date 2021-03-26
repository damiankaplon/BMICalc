package calc;

public class Calc {
    private float weight;
    private float height;
    private float bmi;

    public float getBmi() {

        return bmi;
    }

    public void setWeight(float weight) {

        this.weight = weight;
    }

    public void setHeight(float height) {

        this.height = height;
    }

    public void calcBmi(float weight, float height ) {
        this.bmi = weight / (height * height) ;
    }


/*
    public static void main(String[] args) {

        Calc calc = new Calc();
        Scanner in = new Scanner(System.in);
        System.out.println("Your weight: ");
        float weight = in.nextFloat();
        calc.setWeight(weight);

        System.out.println("Your height: ");
        float height = in.nextFloat();
        calc.setHeight(height);
        calc.calcBmi();

        System.out.println(calc.getBmi());
*/
    }


