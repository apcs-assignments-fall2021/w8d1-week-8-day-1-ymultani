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
        Mathey.triple(12,10,13);
        Mathey.doublemax(12.2,13.4);
        Mathey.fourdouble(12.3,3.4,17.38,4.2);
        Mathey.random_range(1,12);
        Mathey.randomInteger(12);
        Mathey.powah(2,5);







//         // Uncomment this code later!
//         System.out.println("Mathey.max tests");
//         System.out.println(Mathey.max(1, 2)); // 2
//         System.out.println(Mathey.max(2, 1)); // 2
    }

}


