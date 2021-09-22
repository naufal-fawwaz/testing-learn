package com.fall.testing_1.utils

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ValidatorTest {

    @Test
    fun `when input is valid`() {
        val amount = 120
        val desc = "Example of description"
        val result = Validator.validateInput(amount, desc)
        assertTrue(result)
    }

    @Test
    fun `when input is invalid`() {
        val amount = 0
        val desc = ""
        val result = Validator.validateInput(amount, desc)
        assertFalse(result)
    }

    @Test
    fun `input correct email`() {
        val email = "fawaznaufal23@gmail.com"
        val result = Validator.isEmailCorrectEmail(email)
        assertTrue(result)
    }
}