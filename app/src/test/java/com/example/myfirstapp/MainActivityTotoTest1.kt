package com.example.myfirstapp

import androidx.test.core.app.ActivityScenario
import org.junit.Test

class MainActivityTotoTest {
    @Test
    fun MainApparition(){
        ActivityScenario.launch(MainActivityToto::class.java)
    }
}
