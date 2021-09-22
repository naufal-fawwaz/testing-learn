package com.fall.testing_1.utils

object RegistrationUtil {

    private val existingUsers = listOf("naufal", "andriawan")

    /**
     * the input is not valid if..
     * ... the username/password is empty
     * ... the username is already taken
     * ... the confirmed password not same with the real password
     * ... the password contains less than 2 digits
     */
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            return false
        }

        if (username in existingUsers) {
            return false
        }

        if (password != confirmedPassword) {
            return false
        }

        if (password.count { it.isDigit() } < 2) {
            return false
        }

        return true
    }
}