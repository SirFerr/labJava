package _7lab;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        Random random = new Random();
        for(int i=0;i<10;i++){
            arrayList.add(random.nextInt(100));
        }
        System.out.println(arrayList);

        arrayList.remove(arrayList.size()-1);
        System.out.println(arrayList);

        arrayList.set(2,1000);
        System.out.println(arrayList);

        System.out.println(arrayList.get(2));

        arrayList.clear();
        System.out.println(arrayList);

    }
}