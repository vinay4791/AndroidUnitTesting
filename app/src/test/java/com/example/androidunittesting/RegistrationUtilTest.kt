package com.example.androidunittesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "asdf12",
            "asdf12"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty user name returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "asdf12",
            "asdf12"
        )
        assertThat(result).isFalse()
    }


    @Test
    fun `check empty username returns false` () {
        val result = RegistrationUtil.validateRegistrationInput("","password","password")
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password repeats true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Vinay",
            "asdf12",
            "asdf12"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `check whether valid username and correctly repeated password return true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "vinay", "password12","password12"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "asdf12",
            "asdf12"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `check whether username already exists return false`() {
        val result = RegistrationUtil.validateRegistrationInput("Peter","asdf12","asdf12")
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Vinay",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password containing less than one digit returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Vinay",
            "asdf3",
            "asdf3"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password repeated incorrectly returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Vinay",
            "asdf45",
            "asdf67"
        )
        assertThat(result).isFalse()
    }


}