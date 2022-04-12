//Julian Matthews & Christopher Florance
//2/25/2022
//APCS Project 1
//Runtime Class
import java.util.Scanner;

public class Runtime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean x;
        int y;
        System.out.println("""
                If three hymns are to be randomly selected, what is the likelihood that\s
                only those hymn numbers will be represented in an array of random integers \s
                that has the same length of the number of digits from the initial three hymns""");

        System.out.println("This program was made to answer that question!");
        System.out.println("""
                To calculate this, we will run a simulation that creates an array of three hymns,\s
                creates an array of of random integers, and that sorts and compares the two arrays to \s
                if the hymn numbers are represented in the random array. \s
                When the two arrays match I will print them in the terminal. \s
                We will also run another simulation to check our percent error from our initial simulation""");
        System.out.println("""
                You can run the simulation one million times, five million times, or ten million times\s
                Press 1 to run the simulation one million times\s
                press 2 to run the simulation five million times\s
                press 3 to run the simulation ten million times\s
                """);
        x = scanner.hasNextInt();
        if (x) {
            y = scanner.nextInt();
        } else {
            return;
        }
        if (y != 1 && y != 2 && y != 3) {
            System.out.println("Invalid input");
            return;
        }

        runProgram(y);

    }
    public static void runProgram (int y) {
        Calculator calc = new Calculator(y);
        System.out.println("there is a " + calc.getNum() + "% chance that the digits from three random hymns will match the" +
                " digits of a random array.");
        System.out.println("The probability produced from the simulation has a " + calc.produceAccuracy()
         + "% error.");
    }
}

