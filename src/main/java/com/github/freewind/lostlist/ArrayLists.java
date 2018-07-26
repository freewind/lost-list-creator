package com.github.freewind.lostlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayLists {

    public static <T> ArrayList<T> empty() {
        return new ArrayList<T>();
    }

    public static <T> ArrayList<T> create(T... items) {
        return new ArrayList<T>(Arrays.asList(items));
    }

    public static <T> ArrayList<T> create(Collection<? extends T> items) {
        return new ArrayList<T>(items);
    }
    
    public static <T> ArrayList<T> copy(List<? extends T> list) {
        return new ArrayList<T>(list);
    }

    public static <T> ArrayList<T> createFilled(int size, T t) {
        if (size < 0) throw new IllegalArgumentException("size(" + size + ") should >= 0");

        ArrayList<T> list = new ArrayList<T>();
        for (int i = 0; i < size; i++) {
            list.add(t);
        }
        return list;
    }

}
