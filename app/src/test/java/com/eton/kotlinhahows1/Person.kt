package com.eton.kotlinhahows1

class Person(var weight: Float, var height: Float) {
    fun bmi(): Float {
        val bmi = weight / (height * height)
        return bmi
    }
}