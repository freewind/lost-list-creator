package com.github.freewind.lostlist;

import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ListsSpec {

    @Test
    public void test_create_empty_array_list() {
        assertThat(Lists.emptyArrayList())
                .isEmpty();
    }

    @Test
    public void test_create_array_list_with_one_item() {
        assertThat(Lists.arrayList("hello"))
                .hasSize(1)
                .containsExactly("hello");
    }

    @Test
    public void test_create_array_list_with_multi_items() {
        assertThat(Lists.arrayList("hello", "world"))
                .hasSize(2)
                .containsExactly("hello", "world");
    }

    @Test
    public void test_create_array_list_with_array() {
        String[] items = {"hello", "world"};
        assertThat(Lists.arrayList(items))
                .hasSize(2)
                .containsExactly("hello", "world");
    }

    @Test
    public void test_create_array_list_with_another_list() {
        List<String> items = Lists.arrayList("hello", "world");
        assertThat(Lists.arrayList(items))
                .hasSize(2)
                .containsExactly("hello", "world");
    }

    @Test
    public void test_copy_array_list_from_another_array_list() {
        ArrayList<String> list = Lists.arrayList("hello", "world");
        assertThat(Lists.copy(list))
                .hasSize(2)
                .containsExactly("hello", "world");
    }

    @Test
    public void test_copy_list_from_another_list() {
        List<String> list = new LinkedList<>();
        list.add("hello");
        list.add("world");

        assertThat(Lists.copy(list))
                .hasSize(2)
                .containsExactly("hello", "world");
    }

    @Test
    public void test_create_array_list_with_another_set() {
        Set<String> items = new HashSet<String>();
        items.add("hello");
        items.add("world");

        assertThat(Lists.arrayList(items))
                .hasSize(2)
                .contains("hello", "world");
    }

    @Test
    public void test_create_array_list_filled_with_specified_item() {
        assertThat(Lists.arrayListFilled(3, "a"))
                .hasSize(3)
                .containsExactly("a", "a", "a");
    }

    @Test
    public void test_create_array_list_filled_with_size_0_returns_empty_list() {
        assertThat(Lists.arrayListFilled(0, "a"))
                .isEmpty();
    }

    @Test
    public void test_create_array_list_filled_throws_exception_is_size_is_negative() {
        assertThatThrownBy(() -> Lists.arrayListFilled(-1, "a"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("size(-1) should >= 0");
    }

}
