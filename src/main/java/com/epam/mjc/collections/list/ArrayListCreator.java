package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> result = new ArrayList<>();
        Iterator<String> iterator = sourceList.listIterator();
        for (String s : sourceList) {
            if ((sourceList.indexOf(s) + 1) % 3 == 0) {
                result.add(s);
                result.add(s);
            }
        }
        return result;
    }
}
