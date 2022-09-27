package labs.CompII.lab5;

import java.util.*;

public class Problem2 {

    /*
     * Write a test program that prompts the user to enter unlimited number of
     * integers to a list (end with a character 'q' to finish the input) and
     * displays the distinct itnegers separated by exactly one space.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<Integer>();

        System.out.printf("Enter integers (separated by spaces, end with character q): ");

        while(true) {
            String input = in.next();

            if(input.equals("q")) { break; } // if q is input

            arr.add(Integer.parseInt(input)); // add value to the array
        }
        
        removeIdenticalNumbers(arr);

        System.out.printf("Modfied array: ");
        for(int i : arr) {
            System.out.printf(" %s",i);
        }

        in.close();
    }

    /*
     * Assume the user can input a list of numbers. Please write a method that
     * removes the duplicate elements from an array list of integers.
     */

    public static void removeIdenticalNumbers(ArrayList<Integer> list) {

        // who cares about optimization! this is a small program a linear search is fine
        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.size(); j++) {
                if((list.get(i) == list.get(j)) && j != i) {
                    list.remove(j);
                }
            }
        }
    }
}
