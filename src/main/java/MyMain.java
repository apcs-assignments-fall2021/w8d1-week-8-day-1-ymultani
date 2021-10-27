import java.util.Scanner;

public class MyMain {

    // Generates a random number between 10 and 20, inclusive
    public static int randomTeen() {
        double rand_num =  Math.random() * 10 + 10;
        return (int) rand_num;
    }

    // Use your previous method to generate three random numbers between 10 and 20, inclusive.
    // Your program should print out the three numbers, as well as the largest and smallest
    // values of the three.
    // Example of running your code:
    // The three random numbers are 20, 14, and 10
    // The largest number is 20
    // The smallest number is 10
    public static void main(String[] args) {
        System.out.println(Mathey.mathmax(12,44));
        System.out.println(Mathey.doublemax(12.4, 3.9));
        System.out.println(Mathey.triple(65,78,99));
        System.out.println(Mathey.fourdouble(5.6,2.3,9.8,1.3));
        System.out.println(Mathey.random_range(3,7));
        System.out.println(Mathey.randomInteger(5));
        System.out.println(Mathey.power(2,3));
        System.out.println(Mathey.absolute_val(-3));
        System.out.println(Mathey.rounding(2.4));
        System.out.println(Mathey.floor(6.7));
        System.out.println(Mathey.ceiling(18.1));
        System.out.println(Mathey.pythagorean(5,12));

    }

}


