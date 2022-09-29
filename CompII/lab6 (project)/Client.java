import java.util.Scanner;

public class Client {

    // sum

    public static void main(String[] args) {

        // initialize values
        Scanner input = new Scanner(System.in);
        double[] values = new double[5];

        // get user input
        System.out.printf("Input five values: ");
        for(int i = 0; i < values.length; i++) { values[i] = input.nextDouble(); }

        // perform calcuations

        // mean
        double sum = 0;
        for(double i : values) { sum += i; }
        double mean = sum/values.length;

        // standard deviation

        double temp = 0;
        for(double i : values) {
            temp += (i-mean)*(i-mean);
        }
        double deviation = Math.sqrt(temp/values.length);

        // display output

        System.out.printf("mean:\t%d%ndeviation:\t%d%n",mean,deviation);

        input.close();
    }
    // mean
    // standard deviation
}