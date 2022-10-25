package _11lab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Solution<T, K, V> {
    public ArrayList<T> newArrayList() {
        ArrayList<T> arrayList = new ArrayList<>();
        return arrayList;
    }

    public HashSet<T> newHashSet() {
        HashSet<T> hashSet = new HashSet<>();
        return hashSet;
    }
    public HashMap<K, V> newHashMap() {
        HashMap<K, V> hashMap = new HashMap<>();
        return hashMap;
    }
}