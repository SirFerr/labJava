package _1lab;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //v4
        Random random=new Random();
        int n=10;
        int []array = new int[n];
        for (int i=0;i<n;i++){
            array[i]=random.nextInt(101);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        Arrays.sort(array);
        for (int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}