package _9lab;

import java.io.IOException;
import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo(){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            try {
                String intString = scanner.next();
                int i = Integer.parseInt(intString);
                try {
                    System.out.println(2 / i);
                } catch (ArithmeticException e) {
                    System.out.println("Can't divide 2 by " + i);
                }
            } catch (NumberFormatException e) {
                System.out.println("Entered not an integer");
            }

        } catch (Exception e) {
            System.out.println("ERR");
        }
        finally {
            System.out.println("Its a finally");
        }
    }
}
