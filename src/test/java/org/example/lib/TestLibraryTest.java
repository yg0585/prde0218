package org.example.lib;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLibraryTest {

    @Test
    void helloworld() {
        boolean flag = true;

        String s = TestLibrary.helloworld(flag);

        assertThat(s).isEqualTo("hello world!");
    }
}