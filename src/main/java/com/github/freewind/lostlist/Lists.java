package com.github.freewind.lostlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Lists {

    public static <T> List<T> emptyList() {
        return new ArrayList<T>();
    }

    public static <T> List<T> newList(T... items) {
        return new ArrayList<T>(Arrays.asList(items));
    }

    public static <T> List<T> newList(Collection<? extends T> items) {
        return new ArrayList<T>(items);
    }

}
