package _10lab;

import java.util.ArrayList;
import java.util.List;

public class Second <T>{
    List<T> arr = new ArrayList<T>();
    public void addAll(List<T> list){
        arr.addAll(list);
    }
    @Override
    public String toString() {
        return "Second{" +
                "arr=" + arr +
                '}';
    }

    public T getEl(int i){
        return arr.get(i);
    }
}
