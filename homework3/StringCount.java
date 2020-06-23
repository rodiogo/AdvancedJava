package Homework.hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StringCount {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, args);
        Iterator iterator  = list.iterator();
        while (iterator.hasNext()) {
            String str = (String) iterator.next();
            System.out.println(str + ": " + Collections.frequency(list, str));
            list.removeAll(Collections.singleton(str));
            iterator = list.iterator();

        }
    }
}


