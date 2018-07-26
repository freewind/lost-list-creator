package com.github.freewind.lostlist;

import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LinkedListSpec {

    @Test
    public void test_create_empty_linked_list() {
        assertThat(Lists.emptyLinkedList())
                .isExactlyInstanceOf(LinkedList.class)
                .isEmpty();
    }

    @Test
    public void test_create_linked_list_with_one_item() {
        assertThat(Lists.linkedList("hello"))
                .isExactlyInstanceOf(LinkedList.class)
                .hasSize(1)
                .containsExactly("hello");
    }

    @Test
    public void test_create_linked_list_with_multi_items() {
        assertThat(Lists.linkedList("hello", "world"))
                .isExactlyInstanceOf(LinkedList.class)
                .hasSize(2)
                .containsExactly("hello", "world");
    }

    @Test
    public void test_create_linked_list_with_array() {
        String[] items = {"hello", "world"};
        assertThat(Lists.linkedList(items))
                .isExactlyInstanceOf(LinkedList.class)
                .hasSize(2)
                .containsExactly("hello", "world");
    }

    @Test
    public void test_create_linked_list_with_another_list() {
        List<String> items = Lists.linkedList("hello", "world");
        assertThat(Lists.linkedList(items))
                .isExactlyInstanceOf(LinkedList.class)
                .hasSize(2)
                .containsExactly("hello", "world");
    }

    @Test
    public void test_copy_linked_list_from_another_linked_list() {
        LinkedList<String> list = Lists.linkedList("hello", "world");
        assertThat(Lists.copy(list))
                .isExactlyInstanceOf(LinkedList.class)
                .hasSize(2)
                .containsExactly("hello", "world");
    }

    @Test
    public void test_create_linked_list_with_another_set() {
        Set<String> items = new HashSet<String>();
        items.add("hello");
        items.add("world");

        assertThat(Lists.linkedList(items))
                .isExactlyInstanceOf(LinkedList.class)
                .hasSize(2)
                .contains("hello", "world");
    }

    @Test
    public void test_create_linked_list_filled_with_specified_item() {
        assertThat(Lists.linkedListFilled(3, "a"))
                .isExactlyInstanceOf(LinkedList.class)
                .hasSize(3)
                .containsExactly("a", "a", "a");
    }

    @Test
    public void test_create_linked_list_filled_with_size_0_returns_empty_list() {
        assertThat(Lists.linkedListFilled(0, "a"))
                .isExactlyInstanceOf(LinkedList.class)
                .isEmpty();
    }

    @Test
    public void test_create_linked_list_filled_throws_exception_is_size_is_negative() {
        assertThatThrownBy(() -> Lists.linkedListFilled(-1, "a"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("size(-1) should >= 0");
    }

}
