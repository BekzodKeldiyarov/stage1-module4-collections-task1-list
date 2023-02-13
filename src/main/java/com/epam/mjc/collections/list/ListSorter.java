package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
        System.out.println(sourceList);
    }


}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        if (calculateFunctionValue(x) > calculateFunctionValue(y)) {
            return 1;
        } else if (calculateFunctionValue(x) < calculateFunctionValue(y)) {
            return -1;
        } else {
            return Integer.compare(x, y);
        }
    }

    public int calculateFunctionValue(Integer x) {
        return 5 * (x * x) + 3;
    }
}
