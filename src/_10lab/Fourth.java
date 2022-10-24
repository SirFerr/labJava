package _10lab;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Fourth {
    List<String> arr = new ArrayList<String>();
    public void readFiles(File dir) {
        File[] files = dir.listFiles();
        for (File item : files) {
            if (item.isFile()) {;
                arr.add(item.getName());
            }
        }
        for(int i=0;i<arr.size() && i<5;i++) {
            System.out.println(arr.get(i));
        }
    }
}
