package _9lab;

import java.util.Scanner;

public class Excepion1 {
    public void exceptionDemo(){

            try {
                System.out.println(2/0);
            }
            catch (ArithmeticException e){
                System.out.println("Can't divide 2 by 0");
            }



    }
}
