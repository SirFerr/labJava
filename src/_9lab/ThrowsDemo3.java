package _9lab;

import java.util.Scanner;

public class ThrowsDemo3 {
        public void getKey() {
            Scanner myScanner = new Scanner( System.in );
            while (true){
                try {
                    System.out.print("Enter Key ");
                    String key = myScanner.next();
                    printDetails( key );
                    break;
                }
                catch (Exception e){
                    System.out.println("ERR");
                    continue;
                }
            }

        }
        public void printDetails(String key) throws Exception {
            String message = getDetails(key);
            System.out.println( message ); }
        private String getDetails(String key) throws Exception {
            if(key.equals("0")) {
                throw new Exception( "Key set to empty string" );
            }
            return "data for " + key;
        }

}