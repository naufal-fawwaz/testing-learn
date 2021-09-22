package com.fall.testing_1.utils

object Homework {

    /**
     * Returns the n-th fibonacci number
     * they are defined like this:
     * fib(0) = 0
     * fib(1) = 1
     * fib(n) = fib(n-2) + fib(n-1)
     */
    fun fib(n: Int): Long {
        if (n == 0 || n == 1) {
            return n.toLong()
        }

        var a = 0L
        var b = 1L
        var c = 1L
        (1..n-2).forEach { _ ->
            c = a + b
            a = b
            b = c
        }

        return c
    }

    /**
     * Check if the braces are set correctly
     * e.g "(a + b))" should returns false
     */
    fun checkBraces(string: String): Boolean {
        return string.count{ it == '(' } == string.count{ it == ')' }
    }
}