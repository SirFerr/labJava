package _8lab;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       Scanner scanner = new Scanner(System.in);
       FileWriter dir1 = new FileWriter("src/_8lab/test.txt");
       dir1.write(scanner.nextLine());
       dir1.close();
       scanner.close();
    }
}
