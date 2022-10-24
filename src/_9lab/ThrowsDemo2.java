package _9lab;

import java.util.Scanner;

public class ThrowsDemo2 {
    ThrowsDemo2(){
        getKey();
    }
    public String getDetails(String key) {
        try {
            if(key.equals("0")) {
                throw new NullPointerException( "null key in getDetails" );
            }
            return "data for " + key;
        }
        catch (NullPointerException e ){
            return "key is null";
        }
    }
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        printDetails( key );
    }
    public void printDetails(String key) {
        try {  String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
}
