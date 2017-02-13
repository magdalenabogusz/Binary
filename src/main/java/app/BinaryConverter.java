package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BinaryConverter {

    public static void main(String[] args) {
        int number = 0;
        try {
            Scanner input = new Scanner(System.in);
            number = input.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("You have entered wrong data");
            System.exit(0);
        }
            BinaryConverter converter = new BinaryConverter();
            String a = converter.binaryConverter(number);// stwarzam nowy objekt
            System.out.println(" Binary is: " + a); // tylko wyprintuje
        }

    String binaryConverter(int number) {
        return Integer.toBinaryString(number); // to co jest idea programu, co mam zrobic
    }

    //String s = "Enter your number: ";
    // System.out.println(s);
    //
    //System.out.println("You have entered wrong data");


}






