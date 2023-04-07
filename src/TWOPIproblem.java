
public class TWOPIproblem {

    public static double gX(double x) {
        return Math.pow(Math.cosh(x),3)* Math.sin(x);
    }

    public static void main(String[] args) {

        int NUMBER_OF_TIMES = 10000; //  random points

        double sum = 0.0;
        double lowerLimit = Math.PI; // Lower limit of integration
        double upperLimit = 2*Math.PI; // Upper limit of integration : 6.283185307179586


        for (int i = 1; i <= NUMBER_OF_TIMES; i++) {
            double X_value =  Math.PI + Math.random()*(4*Math.PI- 2*Math.PI); // Random x value
            double Y_value = gX(X_value);
            sum += Y_value; // Add the weighted function value to the sum
        }

        double average = sum/NUMBER_OF_TIMES;
        double integral = average*(upperLimit-lowerLimit);

        System.out.println("The estimate of the integral is: " + integral);
    }
}

