import java.util.Scanner; // visibility of 

public class Client { // ( ⓛ ω ⓛ *) *MEOW* start of class!

    public static void main(String[] args) { // maybe name 'args' something different next time...

        System.out.println("*meow* program STARTED!\n");

        Scanner input = new Scanner(System.in); // initialize the scanner for user input! 

        double[] values = new double[5]; // create a new array! (the program specified five values...)

        System.out.printf("Input five values: "); // prompt the user for input (otherwise how will they know?)
        for(int i = 0; i < values.length; i++) { values[i] = input.nextDouble(); } // get the values from the user!

        double sum = 0; // initialize a new variable! (this one will hold the sum of all elements in the array)
        for(double i : values) { sum += i; } // calculate the sum of all values in the array!
        double mean = sum/values.length; // calculate the mean by dividing the sum by the amount of values

        double temp = 0; // this temporary variable is used to store the summation used in the deviation equation
        for(double i : values) { // for-each loop! these let you iterate through objects that implement a specific interface! (I forgot the name of it though)
            temp += (i-mean)*(i-mean); // equation used to calculate a portion of the deviation equation
        } // end of the for each loop! (I could splice it into one line but it looks nice over three lines...)
        double deviation = Math.sqrt(temp/values.length); // taking the square root using the Math library, also remainding part of the equation!

        System.out.printf("mean:\t\t%.2f%ndeviation:\t%.2f%n",mean,deviation); // display the values of the variables!

        input.close(); // don't forget to close the scanner! (doesn't really matter here though... since the program terminates next line!)
    }


    
} // ᓚᘏᗢ *meow* <end of class!>