package com.github.freewind.lostlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Lists {

    public static <T> ArrayList<T> emptyArrayList() {
        return new ArrayList<T>();
    }

    public static <T> ArrayList<T> arrayList(T... items) {
        return new ArrayList<T>(Arrays.asList(items));
    }

    public static <T> ArrayList<T> arrayList(Collection<T> items) {
        return new ArrayList<T>(items);
    }

    public static <T> ArrayList<T> copy(ArrayList<T> list) {
        return new ArrayList<T>(list);
    }

    public static <T> List<T> copy(List<T> list) {
        return new ArrayList<T>(list);
    }

    public static <T> ArrayList<T> arrayListFilled(int size, T t) {
        if (size < 0) throw new IllegalArgumentException("size(" + size + ") should >= 0");

        ArrayList<T> list = new ArrayList<T>();
        for (int i = 0; i < size; i++) {
            list.add(t);
        }
        return list;
    }

}
