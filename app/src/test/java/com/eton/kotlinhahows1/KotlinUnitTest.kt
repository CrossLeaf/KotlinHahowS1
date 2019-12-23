package com.eton.kotlinhahows1

import org.junit.Test

class KotlinUnitTest {
    @Test
    fun helloWorld() {
//     println("Hello world")
        val h = Human()
        h.hello()
        val age = 19
        var nickname = "Eton"
        val name :String
        name = "menghan"
        println(name)

        val bmi = Person(72f, 1.7f).bmi()
        println("bmi = "+bmi)
    }
}

class Human {
    fun hello() {
        println("Hello world1")
    }
}