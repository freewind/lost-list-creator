package com.github.freewind.lostlist;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ListSpec {

    @Test
    public void test_create_list_of_items() {
        List<String> list = Lists.of("hello", "list");
        assertThat(list).isNotEmpty()
                .containsExactly("hello", "list");
    }

}
