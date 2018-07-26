package com.github.freewind.lostlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Lists {

    public static <T> ArrayList<T> emptyList() {
        return new ArrayList<T>();
    }

    public static <T> ArrayList<T> newList(T... items) {
        return new ArrayList<T>(Arrays.asList(items));
    }

    public static <T> ArrayList<T> newList(Collection<? extends T> items) {
        return new ArrayList<T>(items);
    }

    public static <T> ArrayList<T> newListFilled(int size, T t) {
        if (size < 0) throw new IllegalArgumentException("size(" + size + ") should >= 0");

        ArrayList<T> list = new ArrayList<T>();
        for (int i = 0; i < size; i++) {
            list.add(t);
        }
        return list;
    }

}
