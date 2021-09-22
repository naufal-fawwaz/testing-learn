package com.fall.testing_1.utils

import android.text.TextUtils
import android.util.Patterns

object Validator {
    fun validateInput(amount: Int, desc: String): Boolean {
        return !(amount <= 0 || desc.isEmpty())
    }

    fun isEmailCorrectEmail(email: String): Boolean {
        return (!TextUtils.isEmpty(email) and Patterns.EMAIL_ADDRESS.matcher(email).matches())
    }
}