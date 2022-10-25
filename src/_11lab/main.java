package _11lab;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Solution createList = new Solution<>();

        ArrayList<Integer> arrayList = createList.newArrayList();
        HashSet<Double> hashSet = createList.newHashSet();
        HashMap<Integer, String> hashMap = createList.newHashMap();

        arrayList.add(1);
        System.out.println(arrayList);

        hashSet.add(0.1);
        System.out.println(hashSet);

        hashMap.put(2, "Hello world");
        System.out.println(hashMap);
    }
}
