package com.github.freewind.lostlist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.fest.assertions.api.Assertions.assertThat;

public class ListsSpec {

    @Test
    public void test_create_empty_array_list() {
        List<Object> list = Lists.emptyList();
        assertThat(list).isEmpty();
        assertThat(list).isInstanceOf(ArrayList.class);
    }

    @Test
    public void test_create_array_list_with_one_item() {
        List<String> list = Lists.newList("hello");
        assertThat(list).hasSize(1);
        assertThat(list).containsExactly("hello");
        assertThat(list).isInstanceOf(ArrayList.class);
    }

    @Test
    public void test_create_array_list_with_multi_items() {
        List<String> list = Lists.newList("hello", "world");
        assertThat(list).hasSize(2);
        assertThat(list).containsExactly("hello", "world");
        assertThat(list).isInstanceOf(ArrayList.class);
    }

    @Test
    public void test_create_array_list_with_array() {
        String[] items = {"hello", "world"};
        List<String> list = Lists.newList(items);
        assertThat(list).hasSize(2);
        assertThat(list).containsExactly("hello", "world");
        assertThat(list).isInstanceOf(ArrayList.class);
    }

    @Test
    public void test_create_array_list_with_another_list() {
        List<String> items = Lists.newList("hello", "world");
        List<String> list = Lists.newList(items);
        assertThat(list).hasSize(2);
        assertThat(list).containsExactly("hello", "world");
        assertThat(list).isInstanceOf(ArrayList.class);
    }

    @Test
    public void test_create_array_list_with_another_set() {
        Set<String> items = new HashSet<String>();
        items.add("hello");
        items.add("world");

        List<String> list = Lists.newList(items);
        assertThat(list).hasSize(2);
        assertThat(list).containsExactly("hello", "world");
        assertThat(list).isInstanceOf(ArrayList.class);
    }

}
