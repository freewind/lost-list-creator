package com.github.freewind.lostlist;

import java.util.*;

public class Lists {

    public static <T> List<T> of(T... items) {
        return arrayList(items);
    }
    
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

    public static <T> ArrayList<T> arrayListFilled(int size, T t) {
        if (size < 0) throw new IllegalArgumentException("size(" + size + ") should >= 0");

        ArrayList<T> list = new ArrayList<T>();
        for (int i = 0; i < size; i++) {
            list.add(t);
        }
        return list;
    }

    // LinkedList

    public static <T> LinkedList<T> emptyLinkedList() {
        return new LinkedList<T>();
    }

    public static <T> LinkedList<T> linkedList(T... items) {
        return new LinkedList<T>(Arrays.asList(items));
    }

    public static <T> LinkedList<T> linkedList(Collection<T> items) {
        return new LinkedList<T>(items);
    }

    public static <T> LinkedList<T> copy(LinkedList<T> list) {
        return new LinkedList<T>(list);
    }

    public static <T> LinkedList<T> linkedListFilled(int size, T t) {
        if (size < 0) throw new IllegalArgumentException("size(" + size + ") should >= 0");

        LinkedList<T> list = new LinkedList<T>();
        for (int i = 0; i < size; i++) {
            list.add(t);
        }
        return list;
    }

}
