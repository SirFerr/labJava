package _9lab;

import java.util.Scanner;

public class ThrowsDemo {
    ThrowsDemo(){
        printMessage("its right");
        printMessage(null);
    }
    public void printMessage(String key) {
        String message = getDetails(key); System.out.println( message );
    }
    public String getDetails(String key) {
        try {
            if(key == null) {
                throw new NullPointerException( "null key in getDetails" );
            }
            return "data for " + key;
        }
        catch (NullPointerException e ){
            return "key is null";
        }
    }
}
