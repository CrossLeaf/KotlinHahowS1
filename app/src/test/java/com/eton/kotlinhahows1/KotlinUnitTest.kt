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
        val name: String
        name = "menghan"
        println(name)
        val pp = Person(60f, 1.8f)
        val bmi = Person(72f, 1.7f).bmi()
        println("bmi = " + bmi)
        val eton = Person(65f, 180f, "Eton")
        println("bmi = " + eton.bmi())

        var score = 88
        println(score > 60)
    }
}

class Human {
    fun hello() {
        println("Hello world1")
    }
}