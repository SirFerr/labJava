package _12lab._1ex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // a b c
        String str = scanner.nextLine();
        String[] wordsArr = str.split("\\s*(\\s|,|!|\\.)\\s*");
        for (String word : wordsArr){
            System.out.println(word);
        }
    }
}
