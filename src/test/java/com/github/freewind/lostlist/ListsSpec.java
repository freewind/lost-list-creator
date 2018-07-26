package com.github.freewind.lostlist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.fest.assertions.api.Assertions.assertThat;

public class ListsSpec {

    @Test
    public void test_create_empty_array_list() {
        ArrayList<Object> list = Lists.emptyList();
        assertThat(list).isEmpty();
    }

    @Test
    public void test_create_array_list_with_one_item() {
        ArrayList<String> list = Lists.newList("hello");
        assertThat(list).hasSize(1);
        assertThat(list).containsExactly("hello");
    }

    @Test
    public void test_create_array_list_with_multi_items() {
        ArrayList<String> list = Lists.newList("hello", "world");
        assertThat(list).hasSize(2);
        assertThat(list).containsExactly("hello", "world");
    }

    @Test
    public void test_create_array_list_with_array() {
        String[] items = {"hello", "world"};
        ArrayList<String> list = Lists.newList(items);
        assertThat(list).hasSize(2);
        assertThat(list).containsExactly("hello", "world");
    }

    @Test
    public void test_create_array_list_with_another_list() {
        List<String> items = Lists.newList("hello", "world");
        ArrayList<String> list = Lists.newList(items);
        assertThat(list).hasSize(2);
        assertThat(list).containsExactly("hello", "world");
    }

    @Test
    public void test_create_array_list_with_another_set() {
        Set<String> items = new HashSet<String>();
        items.add("hello");
        items.add("world");

        ArrayList<String> list = Lists.newList(items);
        assertThat(list).hasSize(2);
        assertThat(list).contains("hello", "world");
    }

    @Test
    public void test_create_array_list_filled_with_specified_item() {
        ArrayList<String> list = Lists.newListFilled(3, "a");
        assertThat(list).hasSize(3);
        assertThat(list).containsExactly("a", "a", "a");
    }

    @Test
    public void test_create_array_list_filled_with_size_0_returns_empty_list() {
        ArrayList<String> list = Lists.newListFilled(0, "a");
        assertThat(list).isEmpty();
    }

    @Test
    public void test_create_array_list_filled_throws_exception_is_size_is_negative() {
        assertThatThrownBy(() -> Lists.newListFilled(-1, "a"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("size(-1) should >= 0");
    }

}
