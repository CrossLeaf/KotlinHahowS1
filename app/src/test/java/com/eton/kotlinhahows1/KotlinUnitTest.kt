package com.eton.kotlinhahows1

import org.junit.Test

class KotlinUnitTest {
    @Test
    fun helloWorld() {
//     println("Hello world")
        val h = Human()
        h.hello()
    }
}

class Human {
    fun hello() {
        println("Hello world1")
        fun xxx() {
            println("Hello world2")
        }
    }
}