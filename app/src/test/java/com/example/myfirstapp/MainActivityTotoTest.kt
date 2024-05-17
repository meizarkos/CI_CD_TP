package com.example.myfirstapp

import junit.framework.TestCase.assertTrue
import org.junit.Test

class MainActivityTotoTest{

    @Test
    fun `Check Valid Password`(){
        val password = "Pass!"
        val errors = verifyPassword(password)
        assertTrue(errors.isEmpty())
    }

    @Test
    fun `Check Password Length`(){
        val password = "Passw"
        val errors = verifyPassword(password)
        assertTrue(errors.contains("Le mot de passe doit contenir au moins 6 caractères."))
    }

    @Test
    fun `Check Password Uppercase`(){
        val password = "passw0rd123!"
        val errors = verifyPassword(password)
        assertTrue(errors.contains("Le mot de passe doit contenir au moins une lettre majuscule."))
    }

    @Test
    fun `Check Password Lowercase`(){
        val password = "PASSW0RD123!"
        val errors = verifyPassword(password)
        assertTrue(errors.contains("Le mot de passe doit contenir au moins une lettre minuscule."))
    }

    @Test
    fun `Check Password Digit`(){
        val password = "PasswOrd!"
        val errors = verifyPassword(password)
        assertTrue(errors.contains("Le mot de passe doit contenir au moins un chiffre."))
    }

    @Test
    fun `Check Password Special Character`() {
        val caracteresSpeciaux = "~`!@#\\$%\\^&*\\(\\)-_+=<>?/\\[]\\{}|"
        val password = "Passw0rd123"
        val errors = verifyPassword(password)
        assertTrue(errors.contains("Le mot de passe doit contenir au moins un caractère spécial parmi $caracteresSpeciaux."))
    }
}