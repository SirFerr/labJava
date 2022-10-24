package _10lab;

import java.io.File;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Integer[] arrInt = {1, 2, 3, 4, 5};
        List<String> arrStringList;
        String[] arrString={"a","b","c","d","e"};

        First<Integer> first = new First<Integer>();
        List<Integer> arrIntList = first.converter(arrInt);
        System.out.println(arrIntList);

        First<String> first1 = new First<String>();
        arrStringList=first1.converter(arrString);
        System.out.println(arrStringList);

        Second<Integer> second = new Second<Integer>();
        second.addAll(arrIntList);
        System.out.println(second.toString());
        System.out.println(second.getEl(3));
        Second<String> second1 = new Second<String>();
        second1.addAll(arrStringList);
        System.out.println(second1.toString());
        System.out.println(second1.getEl(3));

        Fourth fourth = new Fourth();
        fourth.readFiles(new File("src/_9lab"));
    }

}
