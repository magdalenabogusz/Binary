import java.util.InputMismatchException;
import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {
        

        String s = "Enter your number: ";
        System.out.println(s);
        try {
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            System.out.println("Binary is " + Integer.toBinaryString(number));
        } catch (InputMismatchException ex) {
            System.out.println("You have entered wrong data");


        }


    }
}



