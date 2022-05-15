package at.fhj.msd;

public class Calculator {


    public double add(double number1, double number2) {

        double result = number1 + number2;
        return result;
    }

    public double minus(double number1, double number2) {

        double result = number1 - number2;
        return result;
    }

    public double multiply(double number1, double number2) {

        double result = number1 * number2;
        return result;
    }

    public double divide(double number1, double number2) {

        double result = number1 / number2;
        return result;
    }

    public double faculty(double number1) {
        double number = number1;
        while (number1 > 1) {
            number = number * (number1 - 1);
            number1 = number1 - 1;



        }if (number <= 0){
            return 0;
        }else {
            return number;
        }
        
    }
}
