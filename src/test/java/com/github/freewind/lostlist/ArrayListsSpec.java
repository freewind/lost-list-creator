package com.github.freewind.lostlist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ArrayListsSpec {

    @Test
    public void test_create_empty_array_list() {
        assertThat(ArrayLists.empty())
                .isEmpty();
    }

    @Test
    public void test_create_array_list_with_one_item() {
        assertThat(ArrayLists.create("hello"))
                .hasSize(1)
                .containsExactly("hello");
    }

    @Test
    public void test_create_array_list_with_multi_items() {
        assertThat(ArrayLists.create("hello", "world"))
                .hasSize(2)
                .containsExactly("hello", "world");
    }

    @Test
    public void test_create_array_list_with_array() {
        String[] items = {"hello", "world"};
        assertThat(ArrayLists.create(items))
                .hasSize(2)
                .containsExactly("hello", "world");
    }

    @Test
    public void test_create_array_list_with_another_list() {
        List<String> items = ArrayLists.create("hello", "world");
        assertThat(ArrayLists.create(items))
                .hasSize(2)
                .containsExactly("hello", "world");
    }

    @Test
    public void test_copy_array_list_from_another_list() {
        List<String> list = ArrayLists.create("hello", "world");
        assertThat(ArrayLists.copy(list))
                .hasSize(2)
                .containsExactly("hello", "world");
    }

    @Test
    public void test_create_array_list_with_another_set() {
        Set<String> items = new HashSet<String>();
        items.add("hello");
        items.add("world");

        assertThat(ArrayLists.create(items))
                .hasSize(2)
                .contains("hello", "world");
    }

    @Test
    public void test_create_array_list_filled_with_specified_item() {
        assertThat(ArrayLists.createFilled(3, "a"))
                .hasSize(3)
                .containsExactly("a", "a", "a");
    }

    @Test
    public void test_create_array_list_filled_with_size_0_returns_empty_list() {
        assertThat(ArrayLists.createFilled(0, "a"))
                .isEmpty();
    }

    @Test
    public void test_create_array_list_filled_throws_exception_is_size_is_negative() {
        assertThatThrownBy(() -> ArrayLists.createFilled(-1, "a"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("size(-1) should >= 0");
    }

}
