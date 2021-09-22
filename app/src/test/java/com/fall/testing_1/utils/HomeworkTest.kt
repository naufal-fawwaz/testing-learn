package com.fall.testing_1.utils

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeworkTest {

    // fibonacci test
    @Test
    fun `set value 0 should return 0`() {
        val result = Homework.fib(0)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `set value 1 should return 1`() {
        val result = Homework.fib(1)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `set more than 1 should return the total of fibonacci number`() {
        val result = Homework.fib(7)
        assertThat(result).isEqualTo(8)
    }

    // check braces test
    @Test
    fun `braces not valid returns false`() {
        val result = Homework.checkBraces("(hello))")
        assertThat(result).isFalse()
    }

    @Test
    fun `braces valid returns true`() {
        val result = Homework.checkBraces("(hello)")
        assertThat(result).isTrue()
    }
}