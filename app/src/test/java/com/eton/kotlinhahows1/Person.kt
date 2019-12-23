package com.eton.kotlinhahows1

class Person(var weight: Float, var height: Float, var name: String = "") {
    init {
        if (!name.isBlank())
            println("name = $name")
    }

    // 次要建構子
//    constructor(weight: Float, height: Float, name: String) : this(weight, height)

    fun bmi(): Float {
        val bmi = weight / (height * height)
        return bmi
    }
}