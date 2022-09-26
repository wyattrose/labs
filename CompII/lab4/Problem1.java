package labs.CompII.lab4;

public class Problem1 {
    public static void main(String[] args) {

        char[] arr = {'9','3','4','5'};
        System.out.println(MyInteger.parseInt(arr));
    }
}

class MyInteger {
    private int value;

    public MyInteger(int value) { this.value = value; }

    public int getValue() { return this.value; }

    public boolean isEven() { return value % 2 == 0; }
    public static boolean isEven(int value) { return value % 2 == 0; }
    public static boolean isEven(MyInteger value) { return value.getValue() % 2 == 0; }

    public static boolean isOdd(int value) { return value % 2 == 1; }
    public boolean isOdd() { return value % 2 == 1; }
    public static boolean isOdd(MyInteger value) { return value.getValue() % 2 == 1; }

    public boolean isPrime() {

        if( value <= 1) { return false; }
        else if(value == 2) { return true; }
        else if(isEven(value)) { return false; }
        
        // alright if we made it this far then just check some of the odds that could be less than the number
        // this can cause problems if the number is too big but that doesn't really matter for this assignment
        for(int i = 3; i <= Math.sqrt(value); i += 2) {
            if(value % i == 0) { return false; }
        }

        return true; // alright so it's prime then lmao
    } // figure this one out
    
    public static boolean isPrime(int value) {
 
        if( value <= 1) { return false; }
        else if(value == 2) { return true; }
        else if(isEven(value)) { return false; }
        
        // alright if we made it this far then just check some of the odds that could be less than the number
        // this can cause problems if the number is too big but that doesn't really matter for this assignment
        for(int i = 3; i <= Math.sqrt(value); i += 2) {
            if(value % i == 0) { return false; }
        }

        return true; // alright so it's prime then lmao       return false;
    } // I said that I WOULD FIGURE IT OUT!

    public static boolean isPrime(MyInteger value) {
     
        if( value.getValue() <= 1) { return false; }
        else if(value.getValue() == 2) { return true; }
        else if(isEven(value.getValue())) { return false; }
        
        // alright if we made it this far then just check some of the odds that could be less than the number
        // this can cause problems if the number is too big but that doesn't really matter for this assignment
        for(int i = 3; i <= Math.sqrt(value.getValue()); i += 2) {
            if(value.getValue() % i == 0) { return false; }
        }

        return true; // alright so it's prime then lmao   return false;
    } // omg just give me a second... christ!

    public boolean equals(int value) { return this.value == value; }
    public boolean equals(MyInteger value) { return this.value == value.value; }
    public static int parseInt(char[] arr) {

        int number = 0;

        for(int i = arr.length-1; i >= 0; i--) {
            number += Integer.parseInt((""+arr[i]))*Math.pow(10,i);
        }

        return number;
    } // figure this one out as well

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    } // figure it out dawgggg
}
