package com.example.androidunittesting

object RegistrationUtil {

    private val existingUsers = listOf("Peter", "Carl")

    /**
     * the input is not valid if the userName/password is empty
     * the userName is already taken
     * the confirmPassword is not equal to password
     * the password contains less than two digits
     *
     */

    fun validateRegistrationInput(
        userName: String,
        password: String,
        confirmPassword: String
    ): Boolean {

        if(userName.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            return false
        }

        if(password != confirmPassword){
            return false
        }

        if(userName in existingUsers){
            return false
        }

        if(password.count {it.isDigit()} < 2) {
            return false
        }

       return true
    }

}